package com.example.android.musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class ItalyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        //create ArrayList for Tracks

        ArrayList<Track> Tracks = new ArrayList<Track>();
        Tracks.add(new Track("Missa Papae Marcelli", "Palestrina"));
        Tracks.add(new Track("Missa Aeterna Christi Munera", "Palestrina"));
        Tracks.add(new Track("Stabat Mater", "Palestrina"));
        Tracks.add(new Track("Miserere", "Palestrina"));
        Tracks.add(new Track("La Boheme", "Giaocomo Puccini"));
        Tracks.add(new Track("Tosca", "Giaocomo Puccini"));
        Tracks.add(new Track("Turandot", "Giaocomo Puccini"));
        Tracks.add(new Track("Madame Butterfly", "Giaocomo Puccini"));
        Tracks.add(new Track("Fandango", "Luigi Boccherini"));
        Tracks.add(new Track("Musica notturna della strada di Madrid", "Luigi Boccherini"));

        // Create an {@link TrackAdapter}, whose data source is a list of {@link Track}s. The
        // adapter knows how to create list items for each item in the list.
        TrackAdapter adapter = new TrackAdapter(this, Tracks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Track_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TrackAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Track} in the list.
        listView.setAdapter(adapter);

    }
}
