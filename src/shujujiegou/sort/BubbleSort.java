package shujujiegou.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
* 冒泡排序和 优化    大数据时间的比较 o(n^2)
* */
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int  [80000];
        for(int i=0;i<80000;i++)
        {
            arr[i] = (int)(Math.random() * 8000000);
        }

//        System.out.println(Arrays.toString(arr));

        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        sort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序后的时间是=" + date2Str);


    }


    public  static  void  sort ( int arr[])
    {
        int temp=0;
        boolean flag =false;
        for (int i =0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=true;
                    temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] = temp;
                }

                if(flag==false)
                {
                    //本次循环没有进行过交换的话 已经排序好了 就跳出循环   减少循环次数
                    break;
                }else
                {
                    flag=false;
                }
            }
        }

    }
}
