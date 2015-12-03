package org.mansa.hcir.adapter;

/**
 * Created by mansa on 12/3/15.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.mansa.hcir.R;
import org.mansa.hcir.model.WorldBillionaires;
import org.mansa.hcir.main.AppController;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<WorldBillionaires> billionairesItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<WorldBillionaires> billionairesItems) {
        this.activity = activity;
        this.billionairesItems = billionairesItems;
    }

    @Override
    public int getCount() {
        return billionairesItems.size();
    }

    @Override
    public Object getItem(int location) {
        return billionairesItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView imgBillionaire = (NetworkImageView) convertView
                .findViewById(R.id.thumbnail);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView worth = (TextView) convertView.findViewById(R.id.worth);
        TextView source = (TextView) convertView.findViewById(R.id.source);
        TextView year = (TextView) convertView.findViewById(R.id.inYear);

// getting billionaires data for the row
        WorldBillionaires m = billionairesItems.get(position);

// Billionaire image
        imgBillionaire.setImageUrl(m.getBillionairesImgUrl(), imageLoader);

// name
        name.setText(m.getBillionairesname());

// Wealth Source
        source.setText("Wealth Source: " + String.valueOf(m.getSource()));
        worth.setText(String.valueOf(m.getWorth()));

// release year
        year.setText(String.valueOf(m.getYear()));

        return convertView;
    }

}
