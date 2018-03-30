package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        ImageView playlist = (ImageView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(PlaylistActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        ImageView album = (ImageView) findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        ArrayList<Playlist> playlistList = new ArrayList<>();

        playlistList.add(new Playlist(getString(R.string.title_1), getString(R.string.artist_1), getString(R.string.album_1), R.drawable.album_1));
        playlistList.add(new Playlist(getString(R.string.title_2), getString(R.string.artist_2), getString(R.string.album_2), R.drawable.album_2));
        playlistList.add(new Playlist(getString(R.string.title_3), getString(R.string.artist_3), getString(R.string.album_3), R.drawable.album_3));
        playlistList.add(new Playlist(getString(R.string.title_4), getString(R.string.artist_4), getString(R.string.album_4), R.drawable.album_4));
        playlistList.add(new Playlist(getString(R.string.title_5), getString(R.string.artist_5), getString(R.string.album_5), R.drawable.album_5));

        PlaylistAdapter adapter = new PlaylistAdapter(this, playlistList);

        ListView listView = findViewById(R.id.playlistLayout);

        assert listView != null;

        listView.setAdapter(adapter);

    }
}
