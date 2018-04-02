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
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list, parent, false);
        }

        Album currentAlbum = getItem(position);

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albumText);
        assert currentAlbum != null;
        albumTextView.setText(currentAlbum.getNameAlbum());

        ImageView imageAlbum = (ImageView) listItemView.findViewById(R.id.albumImage);

        if (currentAlbum.hasImage()) {
            imageAlbum.setImageResource(currentAlbum.getImageResourceId());
            imageAlbum.setVisibility(View.VISIBLE);
        } else {
            imageAlbum.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
