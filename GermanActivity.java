package com.example.android.musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class GermanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        //create ArrayList for Tracks

        ArrayList<Track> Tracks = new ArrayList<Track>();
        Tracks.add(new Track("Suite No. 2 in B Minor BWV 1067", "Johann Sebastian Bach"));
        Tracks.add(new Track("Concerto A-Dur BWV1055", "Johann Sebastian Bach"));
        Tracks.add(new Track("Concerto G-Moll BWV1056", "Johann Sebastian Bach"));
        Tracks.add(new Track("Magnificat in D Major", "Johann Sebastian Bach"));
        Tracks.add(new Track("Adagio BWV 564", "Johann Sebastian Bach"));
        Tracks.add(new Track("Sonata No. 21 in C Major, op. 53 - Waldstein", "Ludwig von Beethoven"));
        Tracks.add(new Track("Bagatelle in A Minor No. 59 - Fur Elise", "Ludwig von Beethoven"));
        Tracks.add(new Track("Moonlight Sonata op. 27/2 in C Sharp Minor", "Ludwig von Beethoven"));
        Tracks.add(new Track("Canon in D", "Johann Pachelbel"));

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
