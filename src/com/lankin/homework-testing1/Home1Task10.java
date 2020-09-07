/* Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.(*) */
import java.io.*;
public class Home1Task10 {

        public static void main(String args[]) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Давайте знакомиться, введите Ваше имя и нажмите Enter");

            String name = reader.readLine();

            System.out.println("Привет " + name + ", рад знакомству!");



        }

}
