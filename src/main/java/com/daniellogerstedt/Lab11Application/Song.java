package com.daniellogerstedt.Lab11Application;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String songName;
    public int length;
    public int trackNumber;

    @ManyToOne
    public Album album;

    public Song() {}

    public Song(String songName, int length, int trackNumber) {
        this.songName = songName;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public String toString() {
        return "Track " + this.trackNumber + ": " + this.songName;
    }


}
