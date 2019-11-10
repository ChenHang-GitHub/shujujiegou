package shujujiegou.sort;

import java.util.Arrays;

/*
* 选择排序
* */
public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public   static  void sort (int arr[])
    {

        for(int i=0;i<arr.length-1;i++){
            int min = arr[i]; //每次循环假定第一个是最小或最大的
            int minIndex =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<min)     //通过循环找出真正的最小或最大值
                {
                   min=arr[j];
                   minIndex=j;
                }
            }

            if(minIndex!=i)     //如果发现 Index变化 则发生交换 此时才交换下标 （优化）
            {
                arr[minIndex] =arr[i];
                arr[i] =min;
            }

        }
    }


    //    private static void sort(int[] arr) {
//
//        int t = 0;
//        boolean FuntionalInterface =false;
//        for(int i=0;i<arr.length-1;i++)
//        {
//            int index =i;
//            for(int j =i;j<arr.length-1;j++)
//            {
//                if(arr[index]>arr[j+1])
//                {
//                    index=j+1;
//                }
//            }
//            if(index!=i){
//                t=arr[i];
//                arr[i]=arr[index];
//                arr[index]=t;
//            }
//        }
//
//    }


}
