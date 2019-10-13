package offer;

import java.util.ArrayList;

/*
* 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class shunPrintMatrix {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> integers = new ArrayList<>();
        int  row =matrix.length;
        int  col = matrix[0].length;
        if(row==0 || col==0)
        {
            return  new ArrayList<Integer>();
        }
        int left = 0 ,right =col-1 ,top =0,button = row-1;
        while (left<=right && top<=button)
        {
            for(int i =left;i<=right;i++){integers.add(matrix[top][i]);}
            for(int i =top+1;i<=button;i++){integers.add(matrix[i][right]);}
            if(top!=button)
            {
                for(int i =right-1;i>=left;i--){integers.add(matrix[button][i]);}
            }
            if(right!=left)
            {
                for(int i =button-1;i>top;i--){integers.add(matrix[i][left]);}
            }
            top++;button--;left++;right--;
        }
        return integers;
    }
}
