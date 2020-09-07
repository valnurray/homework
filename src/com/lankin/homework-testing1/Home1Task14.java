/*Напишите метод переводящий гривны в доллары по заданному курсу.
В качестве аргументов передайте кол-во гривен и курс.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home1Task14 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите текущий курс доллара и нажмите Enter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rate = reader.readLine();
        float r = Float.parseFloat(rate);
        System.out.println("Введите количество гривен к обмену и нажмите Enter");
        String grn = reader.readLine();
        float g = Float.parseFloat(grn);
        float exchange = g / r;
        System.out.println(g + " гривен к обмену, - это всего-лишь " + exchange + " долларов!");


    }
}
