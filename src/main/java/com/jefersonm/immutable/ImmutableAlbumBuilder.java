package com.jefersonm.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * When a class have too many attributes, it's more interesting using a Builder to build the object.
 */
public final class ImmutableAlbumBuilder {

    private final String name;
    private final String artist;
    private final String year;
    private final String producer;
    private final String genres;
    private final List<ImmutableSong> songs;

    private ImmutableAlbumBuilder(Builder builder) {
        this.name = builder.name;
        this.artist = builder.artist;
        this.year = builder.year;
        this.producer = builder.producer;
        this.genres = builder.genres;
        this.songs = builder.songs;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getYear() {
        return year;
    }

    public String getProducer() {
        return producer;
    }

    public String getGenres() {
        return genres;
    }

    //Return a new list instead of the reference the list of previous object
    public List<ImmutableSong> getSongs() {
        return new ArrayList<>(songs);
    }

    public ImmutableAlbumBuilder changeName(String name) {
        return new Builder()
                .withName(name)
                .withArtist(this.artist)
                .withYear(this.year)
                .withProducer(this.producer)
                .withGenres(this.genres)
                .withSongs(this.songs)
                .build();
    }

    public ImmutableAlbumBuilder changeSongs(List<ImmutableSong> songs) {
        return new Builder()
                .withSongs(songs)
                .withName(this.name)
                .withArtist(this.artist)
                .withYear(this.year)
                .withProducer(this.producer)
                .withGenres(this.genres)
                .build();
    }

    public static final class Builder {
        private String name;
        private String artist;
        private String year;
        private String producer;
        private String genres;
        private List<ImmutableSong> songs;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder withYear(String year) {
            this.year = year;
            return this;
        }

        public Builder withProducer(String producer) {
            this.producer = producer;
            return this;
        }

        public Builder withGenres(String genres) {
            this.genres = genres;
            return this;
        }

        public Builder withSongs(List<ImmutableSong> songs) {
            this.songs = songs;
            return this;
        }

        public ImmutableAlbumBuilder build() {
            //Validation
            Objects.requireNonNull(name);
            Objects.requireNonNull(artist);
            Objects.requireNonNull(year);
            Objects.requireNonNull(producer);
            Objects.requireNonNull(genres);
            Objects.requireNonNull(songs);

            return new ImmutableAlbumBuilder(this);
        }
    }

}
