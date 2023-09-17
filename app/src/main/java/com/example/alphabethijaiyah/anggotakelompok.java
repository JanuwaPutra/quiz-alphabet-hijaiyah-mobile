package com.example.alphabethijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class anggotakelompok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggotakelompok);
    }
    @Override
    public void onBackPressed() {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        super.onBackPressed();
        return;
    }
}