package com.lankin.FactoryMethods.CandyFactory;

public class Main {
    public static void main(String[] args) {
        CandyFactory factory = new CandyFactory();

        Candy apple = factory.getCandy(CandyType.CANDYAPPLE);
        Candy chocolate = factory.getCandy(CandyType.CANDYCHOCOLATE);
        Candy noSugar = factory.getCandy(CandyType.CANDYNOSUGAR);

        apple.eat();
        chocolate.eat();
        noSugar.eat();
    }
}
