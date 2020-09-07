public class Home1Task4 {
    public static void main(String[] args) {
        int abc = 745; // цифры для наглядности
        int a = abc / 100; //7

        int b1 = abc / 10; //74
        int b = b1 % 10; // 4

        int c = abc % b1;


        System.out.print(a + b + c);
    }
}
