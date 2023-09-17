package com.example.alphabethijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void hijaiyah(View view) {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(MainActivity.this,hurufhijaiyah.class);
        startActivity(intent);


    }

    public void kuiz(View view) {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(MainActivity.this,KuisActivity   .class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        if (kembali + 2000 > System.currentTimeMillis()) {
            MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
            mediaplayer.start();
            super.onBackPressed();
            return;
        } else {
            MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
            mediaplayer.start();
            Toast.makeText(getBaseContext(), "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show();
        }
        kembali = System.currentTimeMillis();
    }

    public void anggotakelompok(View view) {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(MainActivity.this,anggotakelompok   .class);
        startActivity(intent);
    }
}