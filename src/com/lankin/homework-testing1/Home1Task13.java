import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.*/
public class Home1Task13 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество суток и нажмите Enter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String days = reader.readLine();
        int d = Integer.parseInt(days);
        int h = d * 24;
        int m = h * 60;
        int s = m * 60;
        System.out.println("В " + d + " сутках - " + h + " часов, " + m +  " минут, " + s + " секунд!");
    }
}
