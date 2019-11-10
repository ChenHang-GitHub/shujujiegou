package jdk_8_9_new.Stream.onJava8.iterate;

import java.util.stream.Stream;

/**
 * @ClassName: Fibonacci
 * @author: csh
 * @date: 2019/11/2  21:03
 * @Description:
 *
 * Stream.iterate() 以种子（第一个参数）开头，并将其传给方法（第二个参数）。
 * 方法的结果将添加到流，并存储作为第一个参数用于下次调用 iterate()，依次类推。
 * 我们可以利用 iterate() 生成一个斐波那契数列。代码示例：
 *
 */
public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            System.out.print("i = "+i);

            int result = x + i;
            //iterate() 只能记忆结果，因此我们需要利用一个变量 x 追踪另外一个元素。
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {

//        new Fibonacci().numbers()
//                .skip(20) // 过滤前 20 个
//                .limit(10) // 然后取 10 个
//                .forEach(i-> System.out.println( "F = "+ i));




     //   Seed  为第一次的结果
//        Stream<Integer> iterate = Stream.iterate(1, i -> {
//            System.out.println("i = " +i);
//            i++;
//            return  ++i;
//        });
//        iterate.limit(10)
//                .forEach(i-> System.out.println(i));


    }

}
