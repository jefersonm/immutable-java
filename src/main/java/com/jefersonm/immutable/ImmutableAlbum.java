package com.jefersonm.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableAlbum {

    private final String name;
    private final String artist;
    private final List<ImmutableSong> songs;

    private ImmutableAlbum(Builder builder) {
        this.name = builder.name;
        this.artist = builder.artist;
        this.songs = builder.songs;
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
        return new Builder()
                .withName(name)
                .withArtist(this.artist)
                .withSongs(this.songs)
                .build();
    }

    public ImmutableAlbum changeSongs(List<ImmutableSong> songs) {
        return new Builder()
                .withSongs(songs)
                .withName(this.name)
                .withArtist(this.artist)
                .build();
    }

    public static final class Builder {
        private String name;
        private String artist;
        private List<ImmutableSong> songs;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder withSongs(List<ImmutableSong> songs) {
            this.songs = songs;
            return this;
        }

        public ImmutableAlbum build() {
            //Validation
            Objects.requireNonNull(name);
            Objects.requireNonNull(artist);
            Objects.requireNonNull(songs);

            return new ImmutableAlbum(this);
        }
    }

}
