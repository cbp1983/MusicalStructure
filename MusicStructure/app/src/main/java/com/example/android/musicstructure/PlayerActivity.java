package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //use the play_item.xml file for layout

        setContentView(R.layout.play_item);

        //get the data from the putExtra command in the TrackAdapter

        Bundle bundle = getIntent().getExtras();

        String playTrackName = bundle.getString("playTrackName");
        String playArtistName = bundle.getString("playArtistName");

        //find the TextViews where the data will be displayed

        TextView nameView = (TextView) findViewById(R.id.name2_text_view);

        TextView artistView = (TextView) findViewById(R.id.artist2_text_view);

        //insert the data to be displayed into the TextViews

        nameView.setText(getString(R.string.name) + " " + playTrackName);
        artistView.setText(getString(R.string.artist) + " " + playArtistName);

    }
}