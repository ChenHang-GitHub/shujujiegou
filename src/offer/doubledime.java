package offer;

import java.util.Arrays;

/*
* 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
* 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
* */
public class doubledime {
    public static void main(String[] args) {

        int array[][]= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int array2[][]={};
        System.out.println(array2.length);
        System.out.println(Find(4,array2));
    }

    public  static boolean Find(int target, int [][] array) {

//        1、二维数组首地址是否为空，即array==null；
//
//2、二维数组是否为{}，即array.length==0的情况；
//
//3、二维数组是否为{{}}，即array.length=1&&array[0].length==0的情况；
        if((array==null||array.length==0)||(array.length==1&&array[0].length==0))
        {
            return  false;
        }
        int row=0;
        int col=array.length-1;
        while (true)
        {

            if(target==array[row][col])
            {
                return true;
            }
            if(array[row][col]>target)
            {
                col--;
                if(col<0)
                {
                    break;
                }
            }
            if(array[row][col]<target){
                row++;
                if(row>array.length-1)
                {
                    break;
                }
            }


        }

        return false;
    }

}

