package offer;
/*
*
*
* 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
* 请找出数组中任意一个重复的数字。
* 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
* */
public class Duplicate {


    public static void main(String[] args) {
        int[] arr ={2, 3, 1, 0, 2, 5, 3};
        int []arr2 = new int[arr.length];
        System.out.println("1");
        boolean b = duplicate(arr,arr.length,arr2);
        System.out.println(b);

        System.out.println("test2:");
        int array[] =  {1,2,3,4,5,6,7,6};
        int duplicata = duplicata(array);
        System.out.println(duplicata);


    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {

        if(length<=0 || numbers.length<=0)
        {
            return  false;
        }

        for(int i = 0 ;i<numbers.length;i++)
        {
            if(numbers[i]<0 || numbers[i]>length-1)
            {
                return  false;
            }
        }

        for(int i = 0;i<length;i++)
        {
            while (numbers[i]!=i)
            {
                if(numbers[i]==numbers[numbers[i]])
                {
                    duplication[0]=numbers[i];
                    return true;
                }
                int temp =numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }

        }
        return  false;
    }


    // 不修改数组 查找一个重复数字  （二分查找）   n+1 数组   元素 1-n
    public  static  int  duplicata(int numbers[]){
        if(numbers.length<=0){
            return -1;
        }
        int end = numbers.length-1;
        int start=1;
        while (end>=start)
        {
            int mid = ((end-start)>>1)+start; //mid
            int count =0;
            for(int i=0;i<numbers.length;i++)
            {
                if(numbers[i]>=start&&numbers[i]<=mid)
                {
                    count++;
                }
            }
            System.out.println(count+"count");
            if(start==end){
                if(count>1){
                    return  end;
                }else {
                    break;
                }
            }

            if(count>(mid-start+1))
            {
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return  -1;

    }
}
