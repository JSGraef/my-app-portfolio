package com.joshgraef.nanodegreeportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //----------------------------------------------------------------------------------------------
    public void onBtnClick(View view) {
        Context context = getApplicationContext();

        switch (view.getId()) {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(context, "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(context, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(context, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLibraryApp:
                Toast.makeText(context, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnScoresApp:
                Toast.makeText(context, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnXYZReader:
                Toast.makeText(context, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
