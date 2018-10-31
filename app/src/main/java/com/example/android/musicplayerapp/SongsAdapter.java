package com.example.android.musicplayerapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,
                    parent, false);
        }
        Songs currentSong = getItem(position);
        //Set value for Song Name
        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getmSongs());
        //Set value for Album
        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentSong.getmAlbum());
        //Set value for Image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.play_icon);
        iconView.setImageResource(currentSong.getmImageResourceId());
        //Return Current Item
        return listItemView;
    }
}
