Music Playlist with LinkedList Challenge
--

#### Problem statement:

Create a program that implements a **playlist** for songs.

Create a **Song** class having **Title** and **Duration** for a song as fields.

The program will have an **Album** class containing a **list of songs**. The **albums** will be stored in an **ArrayList**

Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
Once the songs have been added to the playlist, create a menu of options to:-
- **Quit**
- **Skip**
- **forward** to the next song
- **skip backwards** to a previous song.
- **Replay** the current song.
- **List** the songs in the playlist

A song must **exist** in an album before it can be added to the playlist (so you can only play songs that you own).

As an optional extra, provide an option to remove the current song from the playlist

#### Solution:
**Song.java**
```java
package com.learning.days061to080.days071;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (" + duration + " min)";
    }
}
```

**Album.java**
```java
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
```

**AlbumDriver.java**
```java
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
```

#### Explanation:

- Code is self explanatory.

#### Output
```
This album does not have song Speed King
This album does not have track 24

Now playing :: You can't do it right (6.23 min)

Available options are:
 0 - Quite
 1 - Play Next Song
 2 - Play Previous Song
 3 - Reply the Current Song
 4 - List Songs List in Playlist
 5 - Remove the song from List
 6 - Print Available Options
Enter option : 1

Now playing :: Holy man (4.3 min)
Enter option : 1

Now playing :: Soldiers of fortune (3.13 min)
Enter option : 1

Now playing :: Breaking the rules (5.32 min)
Enter option : 2

Now playing :: Soldiers of fortune (3.13 min)
Enter option : 2

Now playing :: Holy man (4.3 min)
Enter option : 2

Now playing :: You can't do it right (6.23 min)
Enter option : 2

We have reached the start of playlist.
Enter option : 3

Now playing :: You can't do it right (6.23 min)
Enter option : 6

Available options are:
 0 - Quite
 1 - Play Next Song
 2 - Play Previous Song
 3 - Reply the Current Song
 4 - List Songs List in Playlist
 5 - Remove the song from List
 6 - Print Available Options
Enter option : 5
Removed the songs from playlist.

Now playing :: Holy man (4.3 min)
Enter option : 4
=================================
Holy man (4.3 min)
Soldiers of fortune (3.13 min)
Breaking the rules (5.32 min)
Lets go (3.45 min)
I put the finger on you (3.25 min)
=================================
Enter option : 6

Available options are:
 0 - Quite
 1 - Play Next Song
 2 - Play Previous Song
 3 - Reply the Current Song
 4 - List Songs List in Playlist
 5 - Remove the song from List
 6 - Print Available Options
Enter option : 0

Playlist completed.
```