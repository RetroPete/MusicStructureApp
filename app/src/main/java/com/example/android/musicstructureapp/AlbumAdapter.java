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

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> album) {
        super(context, 0, album);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list, parent, false);
        }

        // Get the {@link Category} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the category_list.xml layout with the ID category
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albumText);
        // Get the category from the current object and
        // set this text on the name TextView
        assert currentAlbum != null;
        albumTextView.setText(currentAlbum.getNameAlbum());


        //Find ImageView in the category_list.xml layout with the ID version_name
        ImageView imageAlbum = (ImageView) listItemView.findViewById(R.id.albumImage);

        // Check if an image is provided for this category or not
        if (currentAlbum.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageAlbum.setImageResource(currentAlbum.getImageResourceId());
            // Make sure the view is visible
            imageAlbum.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageAlbum.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing ! TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
