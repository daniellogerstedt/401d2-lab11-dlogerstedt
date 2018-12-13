package com.daniellogerstedt.Lab11Application;


import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageURL;

    @OneToMany
    public List<Song> songs;

    public Album () {}

    public Album (String title, String artist, int songs, int length, String url) {
        this.title = title;
        this.artist = artist;
        this.songCount = songs;
        this.length = length;
        this.imageURL = url;
    }

    public String toString(){
        return "Title: " + this.title + ", Artist: " + this.artist + ", Number of Songs: " + this.songCount;
    }


}
