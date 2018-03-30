package com.example.android.musicstructure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Toast;

import static android.content.ContentValues.TAG;
import static android.support.v4.content.ContextCompat.startActivity;
import static android.widget.Toast.makeText;

/**
 * Created by christoffer on 2018-03-20.
 */


public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Context context, ArrayList<Track> Tracks){
        super(context, 0, Tracks);
    }

    private static final String LOG_TAG = TrackAdapter.class.getSimpleName();

    private Context context;

    //Override getView
    @Override
    public View getView(final int position, View convertView, @NonNull ViewGroup parent) {



        //This looks for which view to display. If outside view, not shown

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Track} object located at this position in the list
        final Track currentTrack = getItem(position);

        // Find the TextView in the list_item.xml layout with the Track name
        TextView trackView = (TextView) listItemView.findViewById(R.id.name_text_view);

        // Get the version name from the current Track object and
        // set this text on the Track TextView
        trackView.setText(currentTrack.getTrackName());

        // Find the TextView in the list_item.xml layout with the artist name
        TextView artistView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        // Get the version number from the current Track object and
        // set this text on the artist TextView
        artistView.setText(currentTrack.getTrackArtist());

        this.context = context;

        listItemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Log.d(TAG, "onClick: ");
                Intent playerIntent = new Intent(getContext(), PlayerActivity.class);
                getContext().startActivity(playerIntent(currentTrack));
            }

        });

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;


        }

}