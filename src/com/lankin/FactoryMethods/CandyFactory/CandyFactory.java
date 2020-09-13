package com.lankin.FactoryMethods.CandyFactory;

public class CandyFactory {
    public Candy getCandy (CandyType type){
         Candy toReturn = null;
         switch (type) {
             case CANDYAPPLE:
                 toReturn = new CandyApple();
                 break;
             case CANDYCHOCOLATE:
                 toReturn = new CandyChocolate();
                 break;
             case CANDYNOSUGAR:
                 toReturn = new CandyNosugar();
                 break;
             default:
                 System.out.println("what?");

         }
         return toReturn;
    }
}

