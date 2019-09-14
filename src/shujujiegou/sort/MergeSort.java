package shujujiegou.sort;

import java.util.Arrays;

/*
* 归并排序  分治算法效率为     O(n log n)
* */
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 8, 4, 5, 7, 1, 3, 6, 2 };
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }




    public  static  void  mergeSort (int arr[],int left ,int right ,int temp[])
    {
        if(left<right)
        {
            int mid = (left + right) / 2; //中间索引
            //向左递归进行分解
            mergeSort(arr, left, mid, temp);
            //向右递归进行分解
            mergeSort(arr, mid + 1, right, temp);
            //合并
            merge(arr, left, mid, right, temp);
        }
    }

    public static  void merge (int arr [] ,int left,int mid,int right,int temp[])
    {

        int i = left;
        int j = mid+1;
        int t = 0;


        //(一)
        //先把左右两边(有序)的数据按照规则填充到temp数组
        //直到左右两边的有序序列，有一边处理完毕为止

        while (i<=mid && j<=right)
        {
            if(arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t += 1;
                i += 1;
            } else { //反之,将右边有序序列的当前元素，填充到temp数组
                temp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }
//(二)
        //把有剩余数据的一边的数据依次全部填充到temp
        while( i <= mid) { //左边的有序序列还有剩余的元素，就全部填充到temp
            temp[t] = arr[i];
            t += 1;
            i += 1;
        }

        while( j <= right) { //右边的有序序列还有剩余的元素，就全部填充到temp
            temp[t] = arr[j];
            t += 1;
            j += 1;
        }


        t=0; //
        int tempLeft = left; //
        while(tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }



    }
}
