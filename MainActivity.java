
package com.example.android.musicstructure;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the poland category
        TextView poland = (TextView) findViewById(R.id.poland);

        // Set a click listener on that View
        poland.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the poland category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link polandActivity}
                Intent polandIntent = new Intent(MainActivity.this, PolandActivity.class);

                // Start the new activity
                startActivity(polandIntent);
            }
        });

        // Find the View that shows the italy category
        TextView italy = (TextView) findViewById(R.id.italy);

        // Set a click listener on that View
        italy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the italy category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link italyActivity}
                Intent italyIntent = new Intent(MainActivity.this, ItalyActivity.class);

                // Start the new activity
                startActivity(italyIntent);
            }
        });

        // Find the View that shows the england category
        TextView england = (TextView) findViewById(R.id.england);

        // Set a click listener on that View
        england.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the england category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link englandActivity}
                Intent englandIntent = new Intent(MainActivity.this, EnglandActivity.class);

                // Start the new activity
                startActivity(englandIntent);
            }
        });

        // Find the View that shows the german category
        TextView german = (TextView) findViewById(R.id.german);

        // Set a click listener on that View
        german.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the german category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link germanActivity}
                Intent germanIntent = new Intent(MainActivity.this, GermanActivity.class);

                // Start the new activity
                startActivity(germanIntent);
            }
        });
    }
}

