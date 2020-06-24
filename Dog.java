package ru.innopolis.university.mingaleev.homework_3_6;

public class Dog extends Animal {

    private String name;
    private int age;

    Dog (String name, int age){
        this.name = name;
        this.age=age;
    }

    void sayGav() {
        System.out.println("Gav");
    }

    void jump() {
        System.out.println("Jump");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
