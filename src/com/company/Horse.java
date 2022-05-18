package com.company;

public class Horse extends AbstractAnimal {
    private String color;

    public Horse() {
    }

    public Horse(String nickName, int weight, String gender, String color) {
        super(nickName, weight, gender);
        this.color=color;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Horse" +
                "color='\n" + color + '\'' +
                super.toString();
    }
}
