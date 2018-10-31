package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the views that shows weekly top 10 category
        TextView weekly = (TextView) findViewById(R.id.weeklyTop10);

        //Set a click listener for numbers
        weekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weeklyIntent = new Intent(MainActivity.this,
                        WeeklyTop10Activity.class);
                startActivity(weeklyIntent);
            }
        });

        //find the views that shows today top 10 category
        TextView today = (TextView) findViewById(R.id.todayTop10);

        //Set a click listener for numbers
        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent todayIntent = new Intent(MainActivity.this,
                        TodayTop10Activity.class);
                startActivity(todayIntent);
            }
        });

        //find the views that shows global top 10 category
        TextView global = (TextView) findViewById(R.id.globalTop10);

        //Set a click listener for numbers
        global.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent globalIntent = new Intent(MainActivity.this,
                        GlobalTop10Activity.class);
                startActivity(globalIntent);
            }
        });

        //find the views that shows numbers category
        TextView trending = (TextView) findViewById(R.id.trendingIndia);

        //Set a click listener for numbers
        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trendingIntent = new Intent(MainActivity.this,
                        TrendingInIndiaActivity.class);
                startActivity(trendingIntent);
            }
        });

        //find the views that shows US top 10 category
        TextView usTop = (TextView) findViewById(R.id.UStop10);

        //Set a click listener for numbers
        usTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent usIntent = new Intent(MainActivity.this,
                        USTop10Activity.class);
                startActivity(usIntent);
            }
        });
    }
}
