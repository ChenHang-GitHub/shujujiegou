package shujujiegou.search;
/*
*
* 插值查找
* */
public class InsertSearch {

    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 89,1000,1000, 1234 };
        int index = insertValueSearch(arr,0,arr.length-1,1234);
        System.out.println(index+1);

    }

    private static int insertValueSearch(int[] arr, int left, int right, int findValue) {
        int index =0;

        if (left > right || findValue < arr[0] || findValue > arr[arr.length - 1]) {
            return -1;
        }
        int mid = left + (right - left) * (findValue - arr[left]) / (arr[right] - arr[left]);   // 插值查找的mid

        int midVal = arr[mid];
        if (findValue > midVal) { // 说明应该向右边递归
            return insertValueSearch(arr, mid + 1, right, findValue);
        } else if (findValue < midVal) { // 说明向左递归查找
            return insertValueSearch(arr, left, mid - 1, findValue);
        } else {
            return mid;
        }

    }
}
