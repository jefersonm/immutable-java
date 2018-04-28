package com.jefersonm.immutable;

import java.util.Arrays;
import java.util.List;

public class ImmutableAlbumConstructorExample {

    public static void main(String... args) {
        List<ImmutableSong> songs = Arrays.asList(new ImmutableSong("I Miss You"), new ImmutableSong("Feeling This"));
        ImmutableAlbumConstructor album = new ImmutableAlbumConstructor("I Miss You 2003", "Blink 182", songs);

        System.out.println(String.format("Album name: %s", album.getName()));

        //Change the album name
        //When changing the album name, a new object is created, keeping it thread safe on concurrent applications.
        album = album.changeName("I Miss You - Deluxe version");

        System.out.println(String.format("Album name: %s", album.getName()));

        System.out.println("Album songs");
        for(ImmutableSong song: album.getSongs())
            System.out.println(String.format("Song name: %s", song.getName()));
    }

}
