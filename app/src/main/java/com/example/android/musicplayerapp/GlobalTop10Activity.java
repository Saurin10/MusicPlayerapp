package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GlobalTop10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        //Create an array list of Weekly Top 10
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("shape of You", "Ed Shreen",
                R.drawable.play_button));
        songs.add(new Songs("Ruin my Life", "Ruin my Life",
                R.drawable.play_button));
        songs.add(new Songs("Fingers", "Fingers",
                R.drawable.play_button));
        songs.add(new Songs("Latency", "Latency",
                R.drawable.play_button));
        songs.add(new Songs("The Distance", "The Distance",
                R.drawable.play_button));
        songs.add(new Songs("Kiss and Wake Up", "Dua Lipa",
                R.drawable.play_button));
        songs.add(new Songs("O Saathi", "Baaghi 2",
                R.drawable.play_button));
        songs.add(new Songs("Under Pressure", "Under Pressure",
                R.drawable.play_button));
        songs.add(new Songs("Love me Like You Do", "Fifty Shades of Grey",
                R.drawable.play_button));
        songs.add(new Songs("Summer of '69", "MTV Unplugged",
                R.drawable.play_button));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(songsAdapter);
    }
}
