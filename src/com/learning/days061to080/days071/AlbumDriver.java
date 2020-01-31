package com.learning.days061to080.days071;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class AlbumDriver {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldiers of fortune", 3.13);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to success", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Injection the Venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlayList("You can't do it right", playlist);
        albums.get(0).addToPlayList("Holy man", playlist);
        albums.get(0).addToPlayList("Speed King", playlist);
        albums.get(0).addToPlayList(9, playlist);

        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(24, playlist); // --- There are no track at 24th position

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> itr = playlist.listIterator();

        boolean quite = false;
        boolean forward = true;

        if (playlist.size() == 0) {
            System.out.println("No songs in playlist.");
            return;
        }

        printNowPlaying(itr.next());
        printMenu();

        while (!quite) {
            System.out.print("Enter option : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("\nPlaylist completed.");
                    quite = true;
                    break;
                case 1:
                    // --- Play next song in the playlist
                    if (!forward) {
                        if (itr.hasNext()) {
                            itr.next();
                        }
                        forward = true;
                    }

                    if (itr.hasNext()) {
                        printNowPlaying(itr.next());
                    } else {
                        System.out.println("\nWe have reached the end of playlist.");
                    }
                    break;
                case 2:
                    // --- Play previous song in the playlist.
                    if (forward) {
                        if (itr.hasPrevious()) {
                            itr.previous();
                        }
                        forward = false;
                    }

                    if (itr.hasPrevious()) {
                        printNowPlaying(itr.previous());
                    } else {
                        System.out.println("\nWe have reached the start of playlist.");
                    }
                    break;
                case 3:
                    // --- Reply the current Song
                    if (forward) {
                        if (itr.hasPrevious()) {
                            printNowPlaying(itr.previous());
                            forward = false;
                        } else {
                            System.out.println("\nWe are at the start of the playlist.");
                        }
                    } else {
                        if (itr.hasNext()) {
                            printNowPlaying(itr.next());
                            forward = true;
                        } else {
                            System.out.println("\nWe are at the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    // --- Print all the songs available in the playlist
                    printList(playlist);
                    break;
                case 5:
                    // --- Remove the song from playlist
                    if (playlist.size() > 0) {
                        itr.remove();
                        System.out.println("Removed the songs from playlist.");
                        if (itr.hasNext()) {
                            printNowPlaying(itr.next());
                        } else if (itr.hasPrevious()) {
                            printNowPlaying(itr.previous());
                        }
                    } else {
                        System.out.println("No songs in playlist.\n");
                    }
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nAvailable options are:");
        System.out.println(" 0 - Quite");
        System.out.println(" 1 - Play Next Song");
        System.out.println(" 2 - Play Previous Song");
        System.out.println(" 3 - Reply the Current Song");
        System.out.println(" 4 - List Songs List in Playlist");
        System.out.println(" 5 - Remove the song from List");
        System.out.println(" 6 - Print Available Options");
    }

    private static void printList(LinkedList<Song> playlist) {
        ListIterator<Song> itr = playlist.listIterator();
        System.out.println("=================================");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("=================================");
    }

    private static void printNowPlaying(Song song) {
        System.out.println("\nNow playing :: " + song);
    }
}
