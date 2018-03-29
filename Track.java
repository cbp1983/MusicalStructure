package com.example.android.musicstructure;

/**
 * Created by christoffer on 2018-03-20.
 */

public class Track {

    /** Name of the piece */
    private String trackName;

    /** Composer of the piece */
    private String trackArtist;

    /**
     * Create a new Track object.
     *
     * @param name is the Track name
     * @param artist is the artist of the Track
     */

    public Track(String name, String artist) {
        trackName = name;
        trackArtist = artist;
    }

    /**
     * Get the name of the Track.
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * Get the artist of the Track.
     */

    public String getTrackArtist() {
        return trackArtist;
    }
}