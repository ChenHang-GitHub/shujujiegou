package shujujiegou.search;

/*
二分查找 （必须有序）
* */
public class BinarySearch {


    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index = 4;
        int output = BinarySearch1(index, arr);
        System.out.println(arr[output]);
    }


    //非递归
    public static int BinarySearch1(int target, int arr[]) {
        int tar = target;
        int tarArr[] = arr;
        int begin = 0;
        int end = tarArr.length - 1;
        int mid = (begin + end) / 2;
        int index = -1;
        while (true) {
            if (tarArr[mid] == tar) {
                index = mid;
                break;
            } else {
                if (tarArr[mid] > tar) {
                    end = mid - 1;

                } else {
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
        }

        return index;
    }


    //非递归
    public static int BinarySearch2(int arr[], int left, int right, int findVal) {

        // 当 left > right 时，说明递归整个数组，但是没有找到
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) { // 向 右递归
            return BinarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) { // 向左递归
            return BinarySearch2(arr, left, mid - 1, findVal);
        } else {

            return mid;
        }

    }
}

