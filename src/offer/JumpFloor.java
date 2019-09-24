package offer;


import java.util.ArrayDeque;
import java.util.Queue;

/*
* 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
* */
public  class JumpFloor {

    public int JumpFloor(int target) {

        int arr[] = {1,2};

        if(target<=2)
        {
            return arr[target-1];
        }
        int first = 1;
        int second =2;
        int n = 0;
        for(int i=3;i<=target;i++)
        {
            n= first+second;
            first=second;
            second=n;

        }
        return n;
    }

}
