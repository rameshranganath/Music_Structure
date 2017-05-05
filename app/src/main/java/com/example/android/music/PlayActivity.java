package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ImageView clickButton = (ImageView) findViewById(R.id.playButton);
        clickButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
                startActivity(musicIntent);
            }
        });
    }
}