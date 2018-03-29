package com.example.android.musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class EnglandActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        //create ArrayList for Tracks

        ArrayList<Track> Tracks = new ArrayList<Track>();
        Tracks.add(new Track("Ode for St. Cecilia's Day", "George Frideric Handel"));
        Tracks.add(new Track("Water Music", "George Frideric Handel"));
        Tracks.add(new Track("Tamerlano", "George Frideric Handel"));
        Tracks.add(new Track("Roast Beef of Old England", "Traditional"));
        Tracks.add(new Track("The Cuckold comes out of the Amery", "Traditional"));
        Tracks.add(new Track("Leave Her, Johnny", "Traditional"));
        Tracks.add(new Track("Sallie Mae", "Traditional"));
        Tracks.add(new Track("South Australia", "Traditional"));
        Tracks.add(new Track("Haul Away Joe", "Traditional"));
        Tracks.add(new Track("Go To Sea No More", "Traditional"));
        Tracks.add(new Track("Greenland Whale Fisheries", "Traditional"));

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
