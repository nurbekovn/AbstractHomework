package com.company;

public class Main {

    public static void main(String[] args) {

        Sheep sheep1 = new Sheep("Koy1",45,"Kozu1");
        Sheep sheep2 = new Sheep("Koy2",46,"Kozu2");
        Sheep sheep3 = new Sheep("Koy3",47,"Kozu3");
        Sheep sheep4 = new Sheep("Koy4",48,"Kozu4");


        Sheep[] sheeparray1 = new Sheep[]{sheep1,sheep2,sheep3};
        Sheep[] sheeparray2 = new Sheep[]{sheep4};


        Cow cow1 = new Cow("Koy1",100,"koy");
        Cow cow2 = new Cow("Koy2",110,"koy2");
        Cow cow3 = new Cow("Koy3",120,"koy3");
        Cow cow4 = new Cow("Koy4",130,"koy4");
        Cow cow5 = new Cow("Koy5",140,"koy5");
        Cow cow6 = new Cow("Koy6",150,"koy6");


        Cow[] cows = new Cow[]{cow1,cow2,cow3,cow4,cow5};
        Cow [] cows1 = new Cow[]{cow6};
        Horse horse1 = new Horse("Jylky",150,"byshty","black");
        Horse horse2 = new Horse("Kok jal",150,"byshty","white");
        Horse horse3 = new Horse("Kok jal",150,"byshty","white");

        Horse [] horsearray = new Horse[]{horse1,horse2};
        Horse [] horsearrya2 = new Horse[]{horse3};

        System.out.println();

        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~Farm1~~~~~~~~~~~~~~~~~~~~");
        Farm farm = new Farm("Nurbekov","Bishkek",cows,sheeparray1,horsearray);
        System.out.println(farm);
        System.out.println("~~~~~~~~~~~~~~~`Farm2~~~~~~~~~~~~~~~~~");
        Farm farm2 = new Farm("Nurbekov","Osh",cows1,sheeparray2,horsearrya2);
        System.out.println(farm2);

    }
}