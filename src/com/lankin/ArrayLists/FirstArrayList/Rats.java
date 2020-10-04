package com.lankin.ArrayLists.FirstArrayList;

public class Rats extends Pets implements Vakcine {
    private String name;

    @Override
    public void beFriendly() {

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void doVakcine() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
