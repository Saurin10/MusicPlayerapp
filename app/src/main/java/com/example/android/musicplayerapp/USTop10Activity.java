package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class USTop10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Create an array list of Weekly Top 10
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Taki Taki", "Taki Taki",
                R.drawable.play_button));
        songs.add(new Songs("Girls Like You", "Maroon 5",
                R.drawable.play_button));
        songs.add(new Songs("MIA (feat. Drake)", "Bad Bunny",
                R.drawable.play_button));
        songs.add(new Songs("Impossible", "Luis Fonsi",
                R.drawable.play_button));
        songs.add(new Songs("Women Like Me", "Little Mix",
                R.drawable.play_button));
        songs.add(new Songs("SICKO MODE", "Travis Scott",
                R.drawable.play_button));
        songs.add(new Songs("O Saathi", "Baaghi 2",
                R.drawable.play_button));
        songs.add(new Songs("Lost in Japan", "Zedd",
                R.drawable.play_button));
        songs.add(new Songs("Love me Like You Do", "Fifty Shades of Grey",
                R.drawable.play_button));
        songs.add(new Songs("Venom", "Eminem",
                R.drawable.play_button));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songs_list);
        listView.setAdapter(songsAdapter);
    }
}
