package com.jefersonm.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableAlbum {

    private final String name;
    private final String artist;
    private final List<ImmutableSong> songs;

    public ImmutableAlbum(String name, String artist, List<ImmutableSong> songs) {
        this.name = name;
        this.artist = artist;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    //Return a new list instead of the reference the list of previous object
    public List<ImmutableSong> getSongs() {
        return new ArrayList<>(songs);
    }

    public ImmutableAlbum changeName(String name) {
        return new ImmutableAlbum(name, this.artist, this.songs);
    }

    public ImmutableAlbum changeSongs(List<ImmutableSong> songs) {
        return new ImmutableAlbum(this.name, this.artist, songs);
    }

}
