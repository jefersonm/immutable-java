package com.jefersonm.immutable;

public final class ImmutableSong {

    private final String name;

    public ImmutableSong(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
