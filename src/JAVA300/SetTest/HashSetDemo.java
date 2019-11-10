package JAVA300.SetTest;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName: HashSetDemo
 * @author: csh
 * @date: 2019/11/1  20:46
 * @Description:       测试HashSet  1. int 有序
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for(int i = 0; i < 10000; i++)
            intset.add(random.nextInt(30));
        System.out.println(intset);

        for (int a :intset
             ) {
            System.out.print(a+" ");
        }

        HashSet<String> strings = new HashSet<>();



    }
}
