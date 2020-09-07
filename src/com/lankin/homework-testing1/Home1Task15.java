/*Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.*/
public class Home1Task15 {
    public static void main(String[] args) {
        double katet1 = 3;
        double katet2 = 5;
        double gipotenuza = Math.sqrt((katet1*katet1)+(katet2*katet2));
        System.out.println("Длина гипотенузы равна " + gipotenuza);
        double s = (katet1*katet2)/2;
        System.out.println("Площадь треугольника равна" + s);
        double p = katet1 + katet2 + gipotenuza;
        System.out.println("Периметр треугольника равен " +p);
    }
}
