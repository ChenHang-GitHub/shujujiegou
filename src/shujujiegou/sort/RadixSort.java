package shujujiegou.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 基数排序 ： o（n*k）  k= 10
*
* */
public class RadixSort {

    public static void main(String[] args) {
        int arr[] = { 53, 3, 542, 748, 14, 214};

        radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }

//    private static void radixSort(int[] arr) {
//
//        int max = arr[0]; //假设第一数就是最大数
//        for(int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        //得到最大数是几位数  (循环次数)
//        int maxLength = (max + "").length();
//
//
//        int[][] bucket = new int[10][arr.length];
//
//        //比如：bucketElementCounts[0] , 记录的就是  bucket[0] 桶的放入数据个数
//        int[] bucketElementCounts = new int[10];
//
//
//        for(int i = 0 , n = 1; i < maxLength; i++, n *= 10) {
//            //(针对每个元素的对应位进行排序处理)， 第一次是个位，第二次是十位，第三次是百位..
//            for(int j = 0; j < arr.length; j++) {
//                //取出每个元素的对应位的值
//                int digitOfElement = arr[j] / n % 10;
//                //放入到对应的桶中
//                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
//                bucketElementCounts[digitOfElement]++;
//            }
//            //按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
//            int index = 0;
//            //遍历每一桶，并将桶中是数据，放入到原数组
//            for(int k = 0; k < bucketElementCounts.length; k++) {
//                //如果桶中，有数据，我们才放入到原数组
//                if(bucketElementCounts[k] != 0) {
//                    //循环该桶即第k个桶(即第k个一维数组), 放入
//                    for(int l = 0; l < bucketElementCounts[k]; l++) {
//                        //取出元素放入到arr
//                        arr[index++] = bucket[k][l];
//                    }
//                }
//                //第i+1轮处理后，需要将每个 bucketElementCounts[k] = 0 ！！！！
//                bucketElementCounts[k] = 0;
//
//            }
//            System.out.println("第"+(i+1)+"轮，对个位的排序处理 arr =" + Arrays.toString(arr));
//
//        }
//    }

private static void radixSort(int[] arr) {
        // 获取最高位的数字的长度
    int maxTemp = arr[0];
    for(int i=1;i<arr.length-1;i++)
    {
        if(arr[i]>maxTemp)
        {
            maxTemp=arr[i];
        }
    }
    int  maxLength = (maxTemp+"").length();

    int bucket [][] =  new int[10][arr.length];
    int count []=new int[10];

    for(int i=0,n=1;i<maxLength;i++,n=n*10)
    {

        for(int j =0;j<arr.length;j++)
        {
            int num  =  arr[j]/n%10;
            bucket[num][count[num]]=arr[j];
            count[num]+=1;
        }

        System.out.println("循环次数"+Arrays.toString(count));

        //拷贝回原数组
        int index =0;
        for(int k =0;k<10;k++)
        {
            if(count[k]!=0)
            {
                for(int l =0;l<count[k];l++)
                {
                    arr[index++] = bucket[k][l];
                }
            }
            count[k]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

}

}
