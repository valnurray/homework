package com.lankin.ArrayLists.SecondArrayList;

public class RoboBoss extends Robots implements Rools {
   private String name;
   private int level;

   public RoboBoss(){

   }
    public RoboBoss(String name){
     this.name = name;
    }
    public RoboBoss(String name, int level){
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
