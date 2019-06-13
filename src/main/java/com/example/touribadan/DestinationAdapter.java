package com.example.touribadan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DestinationAdapter extends ArrayAdapter<Site> {

    public  DestinationAdapter(Activity context, ArrayList<Site> destination){
        super(context, 0, destination);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Site currentSite = getItem(position);

        TextView siteName = (TextView) listItemView.findViewById(R.id.site_name);
        siteName.setText(currentSite.getTouristSite());

        TextView workingHours = (TextView) listItemView.findViewById(R.id.working_hours);
        workingHours.setText(currentSite.getWorkingHours());



         return listItemView;

    }
}
