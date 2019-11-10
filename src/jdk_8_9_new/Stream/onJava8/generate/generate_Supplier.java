package jdk_8_9_new.Stream.onJava8.generate;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: generate_Supplier
 * @author: csh
 * @date: 2019/11/2  20:41
 * @Description: RandomWords.java 中 Stream.generate() 搭配 Supplier<T> 使用的例子。代码示例：
 *
 *
 */
class Bubble {
    public final int i;

    public Bubble(int n) {
        i = n;
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }

    private static int count = 0;
    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}

public class generate_Supplier implements Supplier<String> {

    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    //调用get方法
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        //调用get方法
//        Stream<String> generate = Stream.generate(new generate_Supplier());
        String word = Stream.generate(new generate_Supplier())
                .limit(30)
                .collect(Collectors.joining());
        System.out.println(word);


//如果要创建包含相同对象的流，只需要传递一个生成那些对象的 lambda 到 generate() 中：
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);



        //   generate()  参数为Supplier接口    可以传入 -> 1  lambda表达式  2 接口实现类  3  方法引用
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);



    }
}
