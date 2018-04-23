package com.example.a16046512.sgholiday;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvevent;
    private TextView tvdate;
    private ImageView imageView;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.holidayrow, parent, false);

        // Get the TextView object
        tvevent = (TextView) rowView.findViewById(R.id.tvevent);
        tvdate = (TextView) rowView.findViewById(R.id.tvdate);
        // Get the ImageView object
        imageView = (ImageView) rowView.findViewById(R.id.imageView);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHoliday = holiday.get(position);
        // Set the TextView to show the food

        tvevent.setText(currentHoliday.getEvent());
        tvdate.setText(currentHoliday.getDate());


        imageView.setImageResource(currentHoliday.getRes());


        // Return the nicely done up View to the ListView
        return rowView;
    }
}
