package jdk_8_9_new.Stream.onJava8;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @ClassName: Randoms
 * @author: csh
 * @date: 2019/11/2  19:05
 * @Description:  假如你要随机展示 5 至 20 之间不重复的整数并进行排序。实际上，你的关注点首先是创建一个有序集合。围绕这个集合进行后续的操作。但是使用流式编程，你就可以简单陈述你想做什么：
 */
public class Randoms {

    //可以将重复操作进行封装
    public  static  <T> void  show (Stream<T> stream){
           stream
                .limit(4)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        /**
         * 首先，我们给 Random 对象一个种子（以便程序再次运行时产生相同的输出）。
         * ints() 方法产生一个流并且 ints() 方法有多种方式的重载 — 两个参数限定了数值产生的边界
         * 。这将生成一个整数流。我们可以使用中间流操作（intermediate stream operation） distinct() 来获取它们的非重复值，然后使用 limit() 方法获取前 7 个元素。接下来，我们使用 sorted() 方法排序。
         * 最终使用 forEach() 方法遍历输出，它根据传递给它的函数对每个流对象执行操作。
         * 在这里，我们传递了一个可以在控制台显示每个元素的方法引用。System.out::println 。
         */

        show(new Random()
                .ints(5,20)
                .boxed()          //自动地把基本类型包装成为对应的装箱类型， 从而使得 show() 能够接受流
        );
//      new Random(12)  //seed =12   以便程序再次运行时产生相同的输出
//        .ints(5,200)
//              .distinct()
//              .limit(150)
//              .sorted()
//              .forEach(System.out::println);
    }



}
