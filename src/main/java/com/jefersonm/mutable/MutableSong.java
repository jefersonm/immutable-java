package com.jefersonm.mutable;

public final class MutableSong {

    private String name;

    public MutableSong(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
