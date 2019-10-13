package offer;

import java.util.Arrays;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int preIndex = 0;
        int lastIndex = array.length - 1;
        while (preIndex < lastIndex) {
            while (preIndex < lastIndex && array[preIndex] % 2 != 0) {
                preIndex++;
            }
            while (preIndex < lastIndex && array[lastIndex] % 2 == 0) {
                lastIndex--;
            }
            System.out.println(preIndex + "" + lastIndex);
            if (preIndex < lastIndex) {
                int temp;
                temp = array[preIndex];
                array[preIndex] = array[lastIndex];
                array[lastIndex] = temp;
            }
        }

    }
}
