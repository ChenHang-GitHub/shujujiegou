package shujujiegou.sort;

import java.util.Arrays;

/*
* 快速排序 ：用到了递归
* 冒泡排序的改进
* */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
// https://www.runoob.com/w3cnote/quick-sort.html
    private static void sort(int[] s,int l, int r) {

        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            sort(s, l, i - 1); // 递归调用
            sort(s, i + 1, r);
        }



    }
}
