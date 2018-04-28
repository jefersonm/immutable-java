package com.jefersonm.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableAlbumConstructor {

    private final String name;
    private final String artist;
    private final List<ImmutableSong> songs;

    public ImmutableAlbumConstructor(String name, String artist, List<ImmutableSong> songs) {
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

    public ImmutableAlbumConstructor changeName(String name) {
        return new ImmutableAlbumConstructor(name, this.artist, this.songs);
    }

    public ImmutableAlbumConstructor changeSongs(List<ImmutableSong> songs) {
        return new ImmutableAlbumConstructor(this.name, this.artist, songs);
    }

}
