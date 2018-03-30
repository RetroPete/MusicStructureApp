package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(AlbumActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        ImageView playlist = (ImageView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(AlbumActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        ImageView album = (ImageView) findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        ArrayList<Album> albumList = new ArrayList<>();

        albumList.add(new Album(getString(R.string.album_1), R.drawable.album_1));
        albumList.add(new Album(getString(R.string.album_2), R.drawable.album_2));
        albumList.add(new Album(getString(R.string.album_3), R.drawable.album_3));
        albumList.add(new Album(getString(R.string.album_4), R.drawable.album_4));
        albumList.add(new Album(getString(R.string.album_5), R.drawable.album_5));

        AlbumAdapter adapter = new AlbumAdapter(this, albumList);

        ListView listView = findViewById(R.id.albumLayout);

        assert listView != null;

        listView.setAdapter(adapter);
    }
}
