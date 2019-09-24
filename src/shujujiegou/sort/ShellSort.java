package shujujiegou.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 * 希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。但希尔排序是非稳定排序算法。
 * */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int temp = 0;
    //插入排序实现 移位法
    private static void sort(int[] arr) {


        for (int gap = arr.length/2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                for (int j = i; j >= gap && arr[j] < arr[j - gap]; j = j - gap)
                {
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                }
                }
            }

    }


    //交换法


//    public static void sort(int arr[]) {
//
//        for (int gap = arr.length/2; gap > 0; gap /= 2) {
//
//            for (int i = gap; i < arr.length; i++) {
//
//                for (int j = i - gap; j >= 0; j =j- gap) {
//                    if (arr[j] > arr[j + gap]) {
//                        temp = arr[j + gap];
//                        arr[j + gap] = arr[j];
//                        arr[j] = temp;
//                    }
//
//                }
//            }
//
//
//        }
//
//
//    }
}
