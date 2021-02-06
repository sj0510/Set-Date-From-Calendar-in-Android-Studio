package com.sj.calender;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    CalendarView calender;
    TextView dateTV;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calender = findViewById(R.id.calender);
        dateTV = findViewById(R.id.date_view);

        // Add Listener in calendar
        calender.setOnDateChangeListener((view, year, month, dayOfMonth) -> {

            // Add 1 in month because month index is start with 0
            String Date
                    = dayOfMonth + "-"
                    + (month +1) + "-" + year;


            dateTV.setText(Date);  // set this date in TextView for Display
        });




    }
}