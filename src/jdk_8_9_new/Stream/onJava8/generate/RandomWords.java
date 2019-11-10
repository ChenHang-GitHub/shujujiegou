package jdk_8_9_new.Stream.onJava8.generate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: RandomWords
 * @author: csh
 * @date: 2019/11/2  19:32
 * @Description:
 */
public class RandomWords implements Supplier<String> {

    List<String> words = new ArrayList<>();
    Random rand = new Random(47);
    RandomWords(String fname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fname));
        // 略过第一行
        for (String line : lines.subList(1, lines.size())) {
            for (String word : line.split("[ .?,]+"))
                words.add(word.toLowerCase());
        }
    }

    public String get() {
//        System.out.println(1);
        return words.get(rand.nextInt(words.size()));
    }


    @Override
    public String toString() {
        return words.stream()
                .collect(Collectors.joining(" "));  //本程序中没有被调用到
    }
    public static void main(String[] args) throws Exception {
        System.out.println(
                Stream.generate(new RandomWords("Cheese.dat"))  //Stream.generate() 的用法，它可以把任意 Supplier<T> 用于生成 T 类型的流。 (返回一个无限长度的Stream,其元素由Supplier接口的提供 (get方法))
                        .limit(10)
                        .collect(Collectors.joining(" ")));  //当你使用 Collectors.joining()，你将会得到一个 String 类型的结果  (内部调用toString方法)
    }
}
