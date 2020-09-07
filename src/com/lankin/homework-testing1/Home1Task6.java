/*Напишите метод, который будет увеличивать заданный элемент массива на 10%.*/

public class Home1Task6 {
    public static void main(String args[]) {

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++ ){

            numbers[i] = i + 1;

            System.out.println("Было = "+ numbers[i]);

            System.out.println("Стало = " + numbers[i] * 1.1); // вариант как в коментах ниже мне почему-то нравится больше

        }

        /*ЕЩЕ ТАК КАК НИЖЕ*/

    /* for (int i = 0; i < numbers.length; i++){

          numbers[i] = i * 1.1;

          System.out.println("Стало = "+ numbers[i]);


}*/

    }


}
