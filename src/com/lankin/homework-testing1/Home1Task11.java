/* Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры. */
import java.io.*;

public class Home1Task11 {

        public static void main(String args[]) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите цифру в диапазоне от 1 до 10 включительно");
            String number = reader.readLine();
            int x = Integer.parseInt(number);


            switch (x) {
                case 1 :
             /*System.out.println ("1 × 1 = 1");
             System.out.println ("1 × 2 = 2");
             System.out.println ("1 × 3 = 3");
             System.out.println ("1 × 4 = 4");
             System.out.println ("1 × 5 = 5");
             System.out.println ("1 × 6 = 6");
             System.out.println ("2 × 7 = 7");
             System.out.println ("2 × 8 = 8");
             System.out.println ("2 × 9 = 9");
             System.out.println ("2 × 10 = 10");// ну нахер, дальше надо учить экранирование*/

                    System.out.println("1 × 1 = 1\n" + "1 × 2 = 2\n" + "1 × 3 = 3\n" + "1 × 4 = 4\n" + "1 × 5 = 5\n" + "1 × 6 = 6\n" + "1 × 7 = 7\n" + "1 × 8 = 8\n" + "1 × 9 = 9\n" + "1 × 10 = 10");
                    break;

                case 2 :
                    System.out.println("2 × 1 = 2\n" + "2 × 2 = 4\n" + "2 × 3 = 6\n" + "2 × 4 = 8\n" + "2 × 5 = 10\n" + "2 × 6 = 12\n" + "2 × 7 = 14\n" + "2 × 8 = 16\n" + "2 × 9 = 18\n" + "2 × 10 = 20");
                    break;
                case 3 :
                    System.out.println("3 × 1 = 3\n" + "3 × 2 = 6\n" + "3 × 3 = 9\n" + "3 × 4 = 12\n" + "3 × 5 = 15\n" + "3 × 6 = 18\n" + "3 × 7 = 21\n" + "3 × 8 = 24\n" + "3 × 9 = 27\n" + "3 × 10 = 30");
                    break;
                case 4 :
                    System.out.println("4 × 1 = 4\n" + "4 × 2 = 8\n" + "4 × 3 = 12\n" + "4 × 4 = 16\n" + "4 × 5 = 20\n" + "4 × 6 = 24\n" + "4 × 7 = 28\n" + "4 × 8 = 32\n" + "4 × 9 = 36\n" + "4 × 10 = 40");
                    break;
                case 5 :
                    System.out.println("5 × 1 = 5\n" + "5 × 2 = 10\n" + "5 × 3 = 15\n" + "5 × 4 = 20\n" + "5 × 5 = 25\n" + "5 × 6 = 30\n" + "5 × 7 = 35\n" + "5 × 8 = 40\n" + "5 × 9 = 45\n" + "5 × 10 = 50");
                    break;
                case 6 :
                    System.out.println("6 × 1 = 6\n" + "6 × 2 = 12\n" + "6 × 3 = 18\n" + "6 × 4 = 24\n" + "6 × 5 = 30\n" + "6 × 6 = 36\n" + "6 × 7 = 42\n" + "6 × 8 = 48\n" + "6 × 9 = 54\n" + "6 × 10 = 60");
                    break;
                case 7 :
                    System.out.println("7 × 1 = 7\n" + "7 × 2 = 14\n" + "7 × 3 = 21\n" + "7 × 4 = 28\n" + "7 × 5 = 35\n" + "7 × 6 = 42\n" + "7 × 7 = 49\n" + "7 × 8 = 56\n" + "7 × 9 = 63\n" + "7 × 10 = 70");
                    break;
                case 8 :
                    System.out.println("8 × 1 = 8\n" + "8 × 2 = 16\n" + "8 × 3 = 24\n" + "8 × 4 = 32\n" + "8 × 5 = 40\n" + "8 × 6 = 48\n" + "8 × 7 = 56\n" + "8 × 8 = 64\n" + "8 × 9 = 72\n" + "8 × 10 = 80");
                    break;
                case 9 :
                    System.out.println("9 × 1 = 9\n" + "9 × 2 = 18\n" + "9 × 3 = 27\n" + "9 × 4 = 36\n" + "9 × 5 = 45\n" + "9 × 6 = 54\n" + "9 × 7 = 63\n" + "9 × 8 = 72\n" + "9 × 9 = 81\n" + "9 × 10 = 90\n");
                    break;
                case 10 :
                    System.out.println("10 × 1 = 10\n" + "10 × 2 = 20\n" + "10 × 3 = 30\n" + "10 × 4 = 40\n" + "10 × 5 = 50\n" + "10 × 6 = 60\n" + "10 × 7 = 70\n" + "10 × 8 = 80" + "10 × 9 = 90\n" + "10 × 10 = 100");
                    break;
                default:
                    System.out.println("Вы ввели число за пределами диапазона, ай-яй-яй");






            }

        }

    }



