package shujujiegou;

/*
* 二维数组 和稀疏数组的相互转换
* */

public class sparseArr {

    public static void main(String[] args) {
        //原始的二维数组
        int chessArr[][] = new int[11][11];
        chessArr[2][3] = 1;
        chessArr[3][3] = 1;
        chessArr[4][3] = 2;
        int countData = 0;
        for (int line[] : chessArr
                ) {
            for (int data : line
                    ) {
                if (data != 0) {
                    countData++;
                }
                System.out.print(data + " ");
            }
            System.out.println();
        }
        //转换成sparse数组

        int sparseArr[][] = new int[countData + 1][3];
        //sparseArr第一行
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = countData;

        int count = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {

                if (chessArr[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        }
        System.out.println("输出sparse");
        for (int line[]:sparseArr
             ) {
            for (int data:line
                 ) {
                System.out.print(data+" ");
            }

            System.out.println();
        }

        // spaerseArr 转二维数组
        int  ArrFromSparse [][]= new int [sparseArr[0][0]][sparseArr[0][1]];
        for(int i=1;i<sparseArr.length;i++)
        {
          ArrFromSparse[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("输出转好的二维数组");
        for (int line[]:ArrFromSparse
             ) {
            for (int data:line
                 ) {
                System.out.print(data+" ");
            }
            System.out.println();
        }



    }
}
