package com.example.alphabethijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Score Kamu: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("Score Tertinggi",0);
        if(highscore>= score)
            txtHighScore.setText("Score Tertinggi: "+highscore);
        else
        {
            txtHighScore.setText("Score Tertinggi: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("Score Tertinggi", score);
            editor.commit();
        }
    }
    public void onClick(View view) {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(HighestScoreActivity.this, KuisActivity.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(HighestScoreActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void onBackPressed() {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(HighestScoreActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        super.onBackPressed();
        return;
    }
}