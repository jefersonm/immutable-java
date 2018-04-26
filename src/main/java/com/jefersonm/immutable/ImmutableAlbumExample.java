package com.jefersonm.immutable;

import java.util.Arrays;
import java.util.List;

public class ImmutableAlbumExample {

    public static void main(String... args) {
        //Construct an album
        List<ImmutableSong> songs = Arrays.asList(new ImmutableSong("I Miss You"), new ImmutableSong("Feeling This"));
        ImmutableAlbum album = new ImmutableAlbum("I Miss You 2003", "Blink 182", songs);

        //Get the album name
        System.out.println(String.format("Album name: %s", album.getName()));

        //Change the album name
        album = album.changeName("I Miss You - Deluxe version");

        //Get the album name
        System.out.println(String.format("Album name: %s", album.getName()));

        System.out.println("Album songs");
        for(ImmutableSong song: album.getSongs())
            System.out.println(String.format("Song name: %s", song.getName()));
    }

}
