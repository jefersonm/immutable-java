package com.jefersonm.mutable;

import java.util.Arrays;
import java.util.List;

public class MutableAlbumConstructorExample {

    public static void main(String... args) {
        List<MutableSong> songs = Arrays.asList(new MutableSong("I Miss You"), new MutableSong("Feeling This"));
        MutableAlbumConstructor album = new MutableAlbumConstructor("I Miss You 2003", "Blink 182", songs);

        System.out.println(String.format("Album name: %s", album.getName()));

        // Change the album name
        // The same album object will be change. If there is a concurrent scenario,
        // there is a possibility of different threads changing the same object.
        album.setName("I Miss You - Deluxe version");

        System.out.println(String.format("Album name: %s", album.getName()));

        System.out.println("Album songs");
        for(MutableSong song: album.getSongs())
            System.out.println(String.format("Song name: %s", song.getName()));
    }

}
