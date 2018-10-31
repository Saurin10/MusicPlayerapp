package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TodayTop10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        //Create an array list of Weekly Top 10
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Kamariya", "Mitron",
                R.drawable.play_button));
        songs.add(new Songs("Urvashi", "Urvashi",
                R.drawable.play_button));
        songs.add(new Songs("Dilbar", "Styameva Jayate",
                R.drawable.play_button));
        songs.add(new Songs("Chogada", "Raatri",
                R.drawable.play_button));
        songs.add(new Songs("Akh Lad Jave", "Loveyatri",
                R.drawable.play_button));
        songs.add(new Songs("Gazab ka hai Din", "Dil Juunglee",
                R.drawable.play_button));
        songs.add(new Songs("O Saathi", "Baaghi 2",
                R.drawable.play_button));
        songs.add(new Songs("Subah Hone na De (Remix)", "Dishoom",
                R.drawable.play_button));
        songs.add(new Songs("Love me Like You Do", "Fifty Shades of Grey",
                R.drawable.play_button));
        songs.add(new Songs("Halka Halka", "Fanney Khan",
                R.drawable.play_button));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(songsAdapter);
    }
}
