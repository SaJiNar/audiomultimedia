package com.example.audiomultimedia;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.loqueponga);
        mediaPlayer.start();
    }
}
