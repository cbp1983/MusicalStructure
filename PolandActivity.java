package com.example.android.musicstructure;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;
        import java.util.ArrayList;

public class PolandActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        //create ArrayList for Tracks

        ArrayList<Track> Tracks = new ArrayList<Track>();
        Tracks.add(new Track("Missa paschalis", "Grzegorz Gerwazy Gorczycki"));
        Tracks.add(new Track("Sepulto Domino", "Grzegorz Gerwazy Gorczycki"));
        Tracks.add(new Track("Dignare me laudare te", "Grzegorz Gerwazy Gorczycki"));
        Tracks.add(new Track("Litaniae de Providentia Divina", "Grzegorz Gerwazy Gorczycki"));
        Tracks.add(new Track("Revolutionary Étude (Op. 10, No. 12)", "Fryderyk Franciszek Chopin"));
        Tracks.add(new Track("Minute Waltz (Op. 64, No. 1)", "Fryderyk Franciszek Chopin"));
        Tracks.add(new Track("Cello Sonata in G minor", "Fryderyk Franciszek Chopin"));
        Tracks.add(new Track("17 Polish Songs (Op. 74)", "Fryderyk Franciszek Chopin"));
        Tracks.add(new Track("Concerto militaire, Op.21", "Karol Józef Lipiński"));
        Tracks.add(new Track("3 Polonaises, Op.9", "Karol Józef Lipiński"));
        Tracks.add(new Track("Variations sur la cavatine 'Ecco ridente il Cielo', Op.20", "Karol Józef Lipiński"));

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
