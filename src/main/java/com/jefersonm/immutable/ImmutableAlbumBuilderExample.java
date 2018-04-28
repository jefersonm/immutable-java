package com.jefersonm.immutable;

import java.util.Arrays;
import java.util.List;

public class ImmutableAlbumBuilderExample {

    public static void main(String... args) {
        //Construct an album
        List<ImmutableSong> songs = Arrays.asList(new ImmutableSong("I Miss You"), new ImmutableSong("Feeling This"));
        ImmutableAlbumBuilder album = new ImmutableAlbumBuilder.Builder()
                .withName("I Miss You")
                .withArtist("Blink 182")
                .withProducer("Jerry Finn")
                .withYear("2003")
                .withGenres("Punk rock, Pop punk, Alternative rock")
                .withSongs(songs)
                .build();

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
