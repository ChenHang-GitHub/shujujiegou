package shujujiegou.sort;

import java.util.Arrays;

/* 插入排序
*
*   tip:将待排序 分为已排序和未排序两个部分
*   　插入排序是简单排序中最快的排序算法，虽然时间复杂度仍然为O(n*n)，但是却比冒泡排序和选择排序快很多。
*
* */
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    private static void sort(int[] arr) {
//
//        int temp =0;
//        int index=0;
//        for(int i=1;i<arr.length;i++)
//        {
//            temp = arr[i];
//            index=i-1;
//            while(index>=0 &&temp<arr[index])
//            {
//
//                arr[index+1] =arr[index];
//                index--;
//            }
//            if(index!=i-1)
//            {
//                arr[index+1] = temp;
//            }
//
//        }
//    }

//    private static void sort(int[] arr) {
//        int  index = 0;
//        int temp= 0;
//        for(int i=1 ;i<arr.length;i++)
//        {
//            index=i-1;
//            temp=arr[i];
//            while (index>=0&&arr[index]>temp)
//            {
//                arr[index+1]=arr[index];
//                index--;
//            }
//                arr[index+1]=temp;
//
//        }
//    }
private static void sort(int[] arr) {
 int len = arr.length;
 for(int i =1;i<arr.length;i++)
 {
     int temp;
     for(int j=i;j>0&&arr[j]<arr[j-1];j--)
     {
         temp =arr[j];
         arr[j]=arr[j-1];
         arr[j-1]=temp;
     }

 }


    }



}
