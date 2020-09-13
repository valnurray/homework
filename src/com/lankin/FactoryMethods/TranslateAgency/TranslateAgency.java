package com.lankin.FactoryMethods.TranslateAgency;

public class TranslateAgency {

    private TranslateFactory translateFactory;
    public TranslateAgency(TranslateFactory translateFactory){
        this.translateFactory = translateFactory;
    }
    public Translate MakeTranslate(TranslateType type) {
        Translate translate = translateFactory.MakeTranslate(type);


        System.out.println("Translate");
        return translate;
    }
}

