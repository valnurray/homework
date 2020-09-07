import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.StandardSocketOptions;

/*Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.*/
public class Home1Task16 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите температуру в градусах цельсия и нажмите Enter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cels = reader.readLine();
        float c = Float.parseFloat(cels);
        float f = (c * (4/5))+32;
        System.out.println("В Фаренгейтах это - " + f);
    }
}
