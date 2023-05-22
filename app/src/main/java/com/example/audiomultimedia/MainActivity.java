package com.example.audiomultimedia;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.IOException;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Añadir aqui la cancion deseada
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.songtoplay);

        //Botones para la interfaz
        btnPlay = (Button) findViewById(R.id.buttonPlay);
        btnPause = (Button) findViewById(R.id.buttonStop);
        btnStop = (Button) findViewById(R.id.buttonStop);

        //asignar controlador de eventos
        btnPlay.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonPlay:
                mediaplayer.start();
                break;
            case R.id.buttonPause:
                mediaplayer.pause();
                break;
            case R.id.buttonStop:
                try{
                    mediaplayer.stop();
                    mediaplayer.prepare();
                    mediaplayer.seekTo(0);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
