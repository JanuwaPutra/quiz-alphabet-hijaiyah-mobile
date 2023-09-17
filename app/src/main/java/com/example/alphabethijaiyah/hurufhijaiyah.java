package com.example.alphabethijaiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class hurufhijaiyah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurufhijaiyah);


        final MediaPlayer aliff = MediaPlayer.create(this, R.raw.alif);
        Button alif = (Button) this.findViewById(R.id.alif);
        alif.setOnClickListener((v) -> {aliff.start();});

        final MediaPlayer baa = MediaPlayer.create(this, R.raw.ba);
        Button ba = (Button) this.findViewById(R.id.ba);
        ba.setOnClickListener((v) -> {baa.start();});

        final MediaPlayer taa = MediaPlayer.create(this, R.raw.ta);
        Button ta = (Button) this.findViewById(R.id.ta);
        ta.setOnClickListener((v) -> {taa.start();});

        final MediaPlayer tsaa = MediaPlayer.create(this, R.raw.tsa);
        Button tsa = (Button) this.findViewById(R.id.tsa);
        tsa.setOnClickListener((v) -> {tsaa.start();});

        final MediaPlayer jimm = MediaPlayer.create(this, R.raw.jim);
        Button jim = (Button) this.findViewById(R.id.jim);
        jim.setOnClickListener((v) -> {jimm.start();});


        final MediaPlayer haa = MediaPlayer.create(this, R.raw.ha);
        Button ha = (Button) this.findViewById(R.id.ha);
        ha.setOnClickListener((v) -> {haa.start();});

        final MediaPlayer khoo = MediaPlayer.create(this, R.raw.kho);
        Button kho = (Button) this.findViewById(R.id.kho);
        kho.setOnClickListener((v) -> {khoo.start();});

        final MediaPlayer dall = MediaPlayer.create(this, R.raw.dal);
        Button dal = (Button) this.findViewById(R.id.dal);
        dal.setOnClickListener((v) -> {dall.start();});

        final MediaPlayer dzall = MediaPlayer.create(this, R.raw.dzal);
        Button dzal = (Button) this.findViewById(R.id.dzal);
        dzal.setOnClickListener((v) -> {dzall.start();});

        final MediaPlayer roo = MediaPlayer.create(this, R.raw.ro);
        Button ro = (Button) this.findViewById(R.id.ro);
        ro.setOnClickListener((v) -> {roo.start();});


        final MediaPlayer zall = MediaPlayer.create(this, R.raw.zal);
        Button zal = (Button) this.findViewById(R.id.zal);
        zal.setOnClickListener((v) -> {zall.start();});

        final MediaPlayer sinn = MediaPlayer.create(this, R.raw.sin);
        Button sin = (Button) this.findViewById(R.id.sin);
        sin.setOnClickListener((v) -> {sinn.start();});

        final MediaPlayer syinn = MediaPlayer.create(this, R.raw.syin);
        Button syin = (Button) this.findViewById(R.id.syin);
        syin.setOnClickListener((v) -> {syinn.start();});

        final MediaPlayer shadd = MediaPlayer.create(this, R.raw.shad);
        Button shad = (Button) this.findViewById(R.id.shad);
        shad.setOnClickListener((v) -> {shadd.start();});

        final MediaPlayer dhadd = MediaPlayer.create(this, R.raw.dhad);
        Button dhad = (Button) this.findViewById(R.id.dhad);
        dhad.setOnClickListener((v) -> {dhadd.start();});


        final MediaPlayer thaa = MediaPlayer.create(this, R.raw.tha);
        Button tha = (Button) this.findViewById(R.id.tha);
        tha.setOnClickListener((v) -> {thaa.start();});

        final MediaPlayer zhaa = MediaPlayer.create(this, R.raw.zha);
        Button zha = (Button) this.findViewById(R.id.zha);
        zha.setOnClickListener((v) -> {zhaa.start();});

        final MediaPlayer ainn = MediaPlayer.create(this, R.raw.ain);
        Button ain = (Button) this.findViewById(R.id.ain);
        ain.setOnClickListener((v) -> {ainn.start();});

        final MediaPlayer ghainn = MediaPlayer.create(this, R.raw.ghain);
        Button ghain = (Button) this.findViewById(R.id.ghain);
        ghain.setOnClickListener((v) -> {ghainn.start();});

        final MediaPlayer faa = MediaPlayer.create(this, R.raw.fa);
        Button fa = (Button) this.findViewById(R.id.fa);
        fa.setOnClickListener((v) -> {faa.start();});


        final MediaPlayer qaff = MediaPlayer.create(this, R.raw.qaf);
        Button qaf = (Button) this.findViewById(R.id.qaf);
        qaf.setOnClickListener((v) -> {qaff.start();});

        final MediaPlayer kaff = MediaPlayer.create(this, R.raw.kaf);
        Button kaf = (Button) this.findViewById(R.id.kaf);
        kaf.setOnClickListener((v) -> {kaff.start();});

        final MediaPlayer lamm = MediaPlayer.create(this, R.raw.lam);
        Button lam = (Button) this.findViewById(R.id.lam);
        lam.setOnClickListener((v) -> {lamm.start();});

        final MediaPlayer mimm = MediaPlayer.create(this, R.raw.mim);
        Button mim = (Button) this.findViewById(R.id.mim);
        mim.setOnClickListener((v) -> {mimm.start();});

        final MediaPlayer nunn = MediaPlayer.create(this, R.raw.nun);
        Button nun = (Button) this.findViewById(R.id.nun);
        nun.setOnClickListener((v) -> {nunn.start();});


        final MediaPlayer wauu = MediaPlayer.create(this, R.raw.wau);
        Button wau = (Button) this.findViewById(R.id.wau);
        wau.setOnClickListener((v) -> {wauu.start();});

        final MediaPlayer haaaa = MediaPlayer.create(this, R.raw.haa);
        Button haa1 = (Button) this.findViewById(R.id.haa);
        haa1.setOnClickListener((v) -> {haaaa.start();});

        final MediaPlayer yaa = MediaPlayer.create(this, R.raw.ya);
        Button ya = (Button) this.findViewById(R.id.ya);
        ya.setOnClickListener((v) -> {yaa.start();});

        Toast.makeText(hurufhijaiyah.this, "Cukup Tekan Tombol 1x  Saja", Toast.LENGTH_SHORT).show();
    }

    public void kembali(View view) {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(hurufhijaiyah.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.soundbuton);
        mediaplayer.start();
        Intent intent = new Intent(hurufhijaiyah.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        super.onBackPressed();
        return;
    }

}