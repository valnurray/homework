package com.lankin.FactoryMethods.TranslateAgency;

public class TranslateFactory {
    public Translate MakeTranslate(TranslateType type){
        Translate translate = null;
        switch (type){
            case CHINESE:
                translate = new Chinese();
                break;
            case ENGLISH:
                translate = new English();
                break;
            case FRENCH:
                translate = new French();
                break;
            case SPANISH:
                translate = new Spanish();

        }
return null;
    }
}
