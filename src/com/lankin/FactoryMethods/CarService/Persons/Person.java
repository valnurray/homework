package com.lankin.FactoryMethods.CarService.Persons;

public abstract class Person {
    private String name;
    private int age;
    private String position;

    public abstract String doSomeThing();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}