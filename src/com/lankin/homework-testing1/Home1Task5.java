/*Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.*/

import java.io.*;

public class Home1Task5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите Ваш вес и нажмите Enter");
        String YourWeight = reader.readLine();
        int weight = Integer.parseInt(YourWeight);



        System.out.println("Ваш вес на Луне = " + weight*0.17 + " !");

    }
}
