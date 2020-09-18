package com.lankin.FizzBuzz;

//2. Задача FizzBuzz. Создать массив от 1 до 100 и выводить на консоль Fizz если кратно 3, Buzz если кратно 5 и FizzBuzz если кратно 3 и 5.
public class FizzBuzz {
    public static void main(String args[]) {

        int arr [] = new int [100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;

            if ( arr[i] % 3 == 0){
                if (arr[i]%3 == 0 && arr[i]%5 == 0){System.out.println("FizzBuzz");}
                else System.out.println("Fizz");
            }

            else if ( arr[i]%5 ==0){
                if (arr[i]%3 == 0 && arr[i]%5 == 0){System.out.println("FizzBuzz");}

                else System.out.println("Buzz");
            }

        }


    }
}
