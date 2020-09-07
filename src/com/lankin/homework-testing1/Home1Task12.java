import java.io.*;

/*Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T).
Вычислить скорость (км/ч), с которой нужно ехать.
 */
public class Home1Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите расстояние до места назначения (в километрах) и нажмите Enter");
        String distance = reader.readLine();
        int N = Integer.parseInt(distance);
        System.out.println("Введите время за которое необходимо доехать (в часах) и нажмите Enter");
        String time = reader.readLine();
        int T = Integer.parseInt(time);
        int V = N / T;
        System.out.println("Скорость с которой необходимо есть равна " + V + " км/час !");
        /*В идеале надо бы исключить возможность вносить отрицательные числа*/
    }

}
