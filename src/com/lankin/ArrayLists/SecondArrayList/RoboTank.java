package com.lankin.ArrayLists.SecondArrayList;

public class RoboTank extends Robots implements Rools {
    private String name;
    private int level;

    public RoboTank(){

    }
    public RoboTank(String name){
        this.name = name;
    }
    public RoboTank(String name, int level){
        this.name = name;
        this.level = level;

    }


    @Override
    public void helpPeople() {

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void FirstRoolOfRobots() {

    }

    @Override
    public void SecondRoolOfRobots() {

    }

    @Override
    public void ThirdRoolOfRobots() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
