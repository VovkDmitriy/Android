package com.gmail.dimavovk688.lessonone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarActivity extends AppCompatActivity {

    TextView cText;
    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        init();
        addListener();
    }

    private void init(){
        cText = findViewById(R.id.calendar_text);
        calendar = findViewById(R.id.calendar);
        //calendar.setDate(new Date().getTime());
    }

    private void addListener(){
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                cText.setText(year + "." + (month + 1) + "." + dayOfMonth);
            }
        });
    }
}