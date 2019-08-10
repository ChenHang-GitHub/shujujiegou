package shujujiegou.sort;

import java.util.Arrays;

/* 插入排序
*
*   tip:将待排序 分为已排序和未排序两个部分
*
* */
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {

        int temp =0;
        int index=0;
        for(int i=1;i<arr.length;i++)
        {
            temp = arr[i];
            index=i-1;
            while(index>=0 &&temp<arr[index])
            {

                arr[index+1] =arr[index];
                index--;
            }
            if(index!=i-1)
            {
                arr[index+1] = temp;
            }

        }


    }

}
