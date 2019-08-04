package shujujiegou;

/*
二分查找 （必须有序）
* */
public class BinarySearch {

    public static int  BinarySearch(int target, int arr[])
    {
        int tar = target;
        int tarArr []  = arr;
        int begin = 0;
        int end = tarArr.length-1;
        int mid = (begin+end)/2;
        int index =-1;
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

        return  index;
    }
    public static void main(String[] args) {
        int  arr[] = new int[]{1,2,3,4,5,6,7,8};
        int index = 5;
        int output =  BinarySearch(index,arr);
        System.out.println(arr[output]);
    }
}
