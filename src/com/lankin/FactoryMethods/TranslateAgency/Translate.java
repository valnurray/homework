package com.lankin.FactoryMethods.TranslateAgency;

public abstract class Translate {
    public static void GiveMeTheText(){
        System.out.println("Что надо перевести?");
    }
    public static void TranslateTheText(){
        System.out.println("Перевожу");
    }
    public static void AlredyTranslate(){
        System.out.println("Держи перевод");
    }
}
