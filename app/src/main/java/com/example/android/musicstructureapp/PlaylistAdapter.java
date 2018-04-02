package com.example.android.musicstructureapp;

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

public class PlaylistAdapter extends ArrayAdapter<Playlist> {

    public PlaylistAdapter(Activity context, ArrayList<Playlist> playlist) {
        super(context, 0, playlist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.title_list, parent, false);
        }

        Playlist currentPlaylist = getItem(position);

        TextView playlistTextView = listItemView.findViewById(R.id.playlistTitle);
        assert currentPlaylist != null;
        playlistTextView.setText(currentPlaylist.getTitle());

        TextView currentWholeNameTextView = listItemView.findViewById(R.id.playlistArtist);

        String currentArtistText = currentPlaylist.getNameArtist();
        String currentAlbumText = currentPlaylist.getNameAlbum();

        String artistAlbum = "By " + currentArtistText + " - " + currentAlbumText;

        currentWholeNameTextView.setText(artistAlbum);

        ImageView imageAlbum = listItemView.findViewById(R.id.playlistImage);

        if (currentPlaylist.hasImage()) {
            imageAlbum.setImageResource(currentPlaylist.getImageResourceId());
            imageAlbum.setVisibility(View.VISIBLE);
        } else {
            imageAlbum.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
