package com.example.a16046512.sgholiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String cates = i.getStringExtra("cate");
        Log.i("ttt",""+cates);

        lv = (ListView) this.findViewById(R.id.holidaylist);

        // Create a few food objects in Food array
        holidays = new ArrayList<Holiday>();
        if(cates.equals("Secular")){
            holidays.add(new Holiday("New Year's Day","1 January 2018", R.drawable.newyear));
            holidays.add(new Holiday("Labour Day","1 May 2018", R.drawable.labourday));
            holidays.add(new Holiday("National Day","9 August 2018", R.drawable.nationalday));
        }else{
            holidays.add(new Holiday("Chinese New Year","16 Feburary 2018\n17 Febuary 2018", R.drawable.cny));
            holidays.add(new Holiday("Good Friday","30 March 2018", R.drawable.goodfriday));

            holidays.add(new Holiday("Vesak day","29 May 2018", R.drawable.vesakday));
            holidays.add(new Holiday("Hari Raya Puasa","15 June 2018", R.drawable.harirayapuasa));

            holidays.add(new Holiday("Hari Raya Haji","22 August 2018", R.drawable.harirayahaji));
            holidays.add(new Holiday("Deepavali","6 November 2018", R.drawable.deepavali));
            holidays.add(new Holiday("Christmas Day","25 December 2018", R.drawable.christmas));
        }



        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidayAdapter(this, R.layout.holidayrow, holidays);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday currentHoliday = holidays.get(position);

                Toast.makeText(getApplicationContext(),currentHoliday.getEvent()+ " : "+currentHoliday.getDate() , Toast.LENGTH_LONG).show();

            }
        });





    }
}
