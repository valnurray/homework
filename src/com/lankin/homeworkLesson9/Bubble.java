package com.lankin.homeworkLesson9;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int data[] = {20,45,87,98,98,28,66,748,-20,-358,0,54};
        for (int barier = data.length-1; barier >=0; barier--){
            for(int index = 0; index < barier; index++){
                if (data[index] > data[index+1]){
                    swap(data, index);
                }
            }
        }
        System.out.println(Arrays.toString(data));
        }

    private static void swap(int[] data, int index) {
        int tmp = data[index];
        data[index]=data[index+1];
        data[index+1]=tmp;
    }
}

