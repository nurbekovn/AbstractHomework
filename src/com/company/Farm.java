package com.company;

import java.util.Arrays;

public class Farm  {
    private String OwnerName;
    private String address;
    private Cow [] cow;
    private Sheep [] sheep;
    private Horse [] horse;


    public Farm() {
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Farm" +
                "\n OwnerName='" + OwnerName + '\'' +
                ",\n address='" + address + '\'' +
                ",\n cow=" + Arrays.toString(cow) +
                ",\n sheep=" + Arrays.toString(sheep) +
                ",\n horse=" + Arrays.toString(horse);
    }

    public Farm(String ownerName, String address, Cow[] cow, Sheep[] sheep, Horse[] horse) {
        OwnerName = ownerName;
        this.address = address;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;

    }
}
