package ru.innopolis.university.mingaleev.homework_3_6;


public class Cat extends Animal {

    private String name;
    int age;

    Cat (String name, int age){
        this.name = name;
        this.age=age;
    }

    void sleep() {
        System.out.println("Кошка спит.");
    }

    void drink() {
        System.out.println("Кошка пьет.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

