package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    TextView nowPlayingTitle, nowPlayingArtistAlbum;
    ImageView nowPlayingButton, prevSongButton, nextSongButton;
    ImageView nowPlayingImage, shuffleButton, repeatButton;

    boolean nowPlayingSong = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        ImageView nowPlaying = (ImageView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(NowPlayingActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        ImageView playlist = (ImageView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(NowPlayingActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        ImageView album = (ImageView) findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(NowPlayingActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        nowPlayingButton = (ImageButton) findViewById(R.id.play);
        prevSongButton = (ImageButton) findViewById(R.id.previous);
        nextSongButton = (ImageButton) findViewById(R.id.next);
        shuffleButton = (ImageButton) findViewById(R.id.shuffle);
        repeatButton = (ImageButton) findViewById(R.id.repeat);

        // Define behaviour of "play/stop" button.
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when nowPlayingButton is clicked on.
            @Override
            public void onClick(View view) {
                if (nowPlayingSong) {
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.pause_music, Toast.LENGTH_SHORT);
                    toast.show();
                    nowPlayingButton.setImageDrawable(getDrawable(R.drawable.play_button));
                    nowPlayingSong = false;
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.play_music, Toast.LENGTH_SHORT);
                    toast.show();
                    nowPlayingButton.setImageDrawable(getDrawable(R.drawable.pause_button));
                    nowPlayingSong = true;
                }
            }
        });

        prevSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.previous_song, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        nextSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.next_song, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.shuffle_music, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.repeat_song, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
