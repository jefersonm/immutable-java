package com.jefersonm.mutable;

import java.util.List;

public final class MutableAlbumConstructor {

    private String name;
    private String artist;
    private List<MutableSong> songs;

    public MutableAlbumConstructor(String name, String artist, List<MutableSong> songs) {
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

    public List<MutableSong> getSongs() {
        return this.songs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongs(List<MutableSong> songs) {
        this.songs = songs;
    }

}
