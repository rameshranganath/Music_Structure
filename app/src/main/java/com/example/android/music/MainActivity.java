package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView onPlay = (TextView) findViewById(R.id.play);
        onPlay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent PlayIntent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(PlayIntent);
            }
        });
        TextView openAlbum = (TextView) findViewById(R.id.album);
        openAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });
        TextView onPay = (TextView) findViewById(R.id.buy);
        onPay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(MainActivity.this, BuyMusicActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
