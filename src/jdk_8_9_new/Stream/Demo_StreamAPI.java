package jdk_8_9_new.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @ClassName: Demo_StreamAPI
 * @author: csh
 * @date: 2019/10/24  21:12
 * @Description:  Test StreamAPI :
 */
public class Demo_StreamAPI {

    public static void main(String[] args) {

//延迟方法 : 返回值类型仍然是Stream接口自身类型的方法,因此支持链式调用( 除了终结方法外,其余方法均为延迟方法 )
//终结方法 : 返回值类型不再是Stream接口自身类型的方法,因此不再支持类似StringBuilder那样的链式调用,终结方法例如count和forEach
// 流执行完后 就关闭了 只能被消费一次 （非终结方法会再获得新的流对象）

         //foreach   终结方法  不会继续获得流对象  执行完foreach后就关闭 （只能被消费一次）
        Stream<String> stream = Stream.of("Aaa", "Aa", "C", "D");
//        stream.forEach(name-> System.out.println(name));


         //filter     --参数为consumer函数式接口
        Stream<String> stream1 = stream.filter(name -> name.startsWith("A"));
        stream1.forEach(name-> System.out.println(name));


        //map:    -- 参数为function函数式接口
        Stream<String> mapStream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> integerStream = mapStream.map(s -> Integer.parseInt(s));


        //count  终结方法  (用于统计元素的个数)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        long count = list.stream().count();  //4


        //limit  截取方法  只取前 n 个
        Stream<Integer> limit = list.stream().limit(2);
        System.out.println(limit.count());
//        limit.forEach(num-> System.out.println(num));


        //skip     用于跳过前 n 个元素  if（n>=stream.count()）  返回长度为0 的空流
        list.stream().skip(3).forEach(num-> System.out.println(num));  //跳过 1，2，3  输出4


        //concat 将两个流合并为一个流
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        Stream<Integer> stream2 = list.stream();
        Stream<Integer> stream3 = list1.stream();
//        Stream.concat(stream2,stream3).forEach(num-> System.out.println(num));

        //



    }
}
