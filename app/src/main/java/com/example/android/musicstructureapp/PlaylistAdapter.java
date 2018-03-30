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

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context     The current context. Used to inflate the layout file.
     * @param composition A List of composition, author and picture objects to display in a list
     */
    public PlaylistAdapter(Activity context, ArrayList<Playlist> playlist) {
        super(context, 0, playlist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.title_list, parent, false);
        }

        // Get the {@link Composition} object located at this position in the list
        Playlist currentPlaylist = getItem(position);

        // Find the TextView in the composition_list.xml layout with the ID version_name
        TextView playlistTextView = listItemView.findViewById(R.id.playlistTitle);
        // Get the version name from the current object and
        // set this text on the name TextView
        assert currentPlaylist != null;
        playlistTextView.setText(currentPlaylist.getTitle());

        // Find the TextView in the composition_list.xml layout with the ID version_number
        TextView currentWholeNameTextView = listItemView.findViewById(R.id.playlistArtist);
        // Get the version number from the current object and
        // set this text on the number TextView

        String currentArtistText = currentPlaylist.getNameArtist();
        String currentAlbumText = currentPlaylist.getNameAlbum();

        String artistAlbum = "By " + currentArtistText + " - " + currentAlbumText;

        currentWholeNameTextView.setText(artistAlbum);

        //Find ImageView in the composition_list.xml layout with the ID version_name
        ImageView imageAlbum = listItemView.findViewById(R.id.playlistImage);

        // Check if an image is provided for this composer or not
        if (currentPlaylist.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageAlbum.setImageResource(currentPlaylist.getImageResourceId());
            // Make sure the view is visible
            imageAlbum.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageAlbum.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
