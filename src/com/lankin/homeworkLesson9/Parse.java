package com.lankin.homeworkLesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parse {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите произвольный угол и нажмите Enter");
        String s = reader.readLine();
        double d = Double.parseDouble(s);
        double rad = Math.toRadians(d);
        double cosinus = Math.cos(rad);
        double sinus =Math.sin(rad);
        System.out.println(cosinus);
        System.out.println(sinus);


    }
}
