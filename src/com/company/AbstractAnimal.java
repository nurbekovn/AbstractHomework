package com.company;

public abstract class AbstractAnimal {
    private String nickName;
    private int weight;
    private String gender;

    public AbstractAnimal() {
    }

    public AbstractAnimal(String nickName, int weight, String gender) {
        this.nickName = nickName;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "" +
                "\n nickName='" + nickName + '\'' +
                ",\n weight=" + weight +
                ",\n gender='" + gender + '\'';
    }
}
