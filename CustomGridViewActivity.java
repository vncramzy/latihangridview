package vnc.belajaruts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomGridViewActivity extends BaseAdapter {
    private Context mContext;
    private final String[] gridViewString,gridViewButton;
    private final int[] gridViewImageId;
    public CustomGridViewActivity(Context context, String[] gridViewString, int[] gridViewImageId, String[] gridViewButton) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
        this.gridViewString = gridViewString;
        this.gridViewButton = gridViewButton;
    }
    @Override
    public int getCount() {
        return gridViewString.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.gridview_layout, null);
            TextView textViewAndroid = (TextView) gridViewAndroid.findViewById(R.id.android_gridview_text);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.android_gridview_image);
            Button buttonAndroid = (Button) gridViewAndroid.findViewById(R.id.android_gridview_button);
            textViewAndroid.setText(gridViewString[i]);
            imageViewAndroid.setImageResource(gridViewImageId[i]);
            buttonAndroid.setText(gridViewString[5]);

        } else {
            gridViewAndroid = (View) convertView;
        }
        return gridViewAndroid;
    }
}
