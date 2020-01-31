package com.learning.days061to080.days071;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {

        if (find(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int position = trackNumber - 1;

        if (position >=0 && position <= this.songs.size()) {
            playList.add(this.songs.get(position));
            return true;
        }

        System.out.println("This album does not have track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = find(title);
        if (song != null) {
            playList.add(song);
            return true;
        }

        System.out.println("This album does not have song " + title);
        return false;
    }

    private Song find(String title) {
        for (Song song: this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }

    public void print() {
        for (Song song: this.songs) {
            System.out.println(song);
        }
    }
}
