package jdk_8_9_new.Stream.onJava8.collect;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: TreeSetOfWords
 * @author: csh
 * @date: 2019/11/3  21:24
 * @Description:   collect(Collector)：使用 Collector 收集流元素到结果集合中。
 *
 * 假设我们现在为了保证元素有序，将元素存储在 TreeSet 中。
 * Collectors 里面没有特定的 toTreeSet()，但是我们可以通过将集合的构造函数引用传递给 Collectors.toCollection()，从而构建任何类型的集合。
 * 下面我们来将一个文件中的单词收集到 TreeSet 集合中。代码示例：
 */
public class TreeSetOfWords {

    public static void main(String[] args) throws IOException {

        Set<String> words2 =
                Files.lines(Paths.get("Cheese.dat"))
                        .flatMap(s -> Arrays.stream(s.split("\\W+")))
                        .filter(s -> !s.matches("\\d+")) // No numbers
                        .map(String::trim)
                        .filter(s -> s.length() > 2)
                        .limit(100)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(words2);

//        Stream<String> lines = Files.lines(Paths.get("Cheese.dat"));
//        Stream<String> stream = lines.flatMap(s -> Arrays.stream(s.split("\\W+")));
//        Stream<String> stream1 = stream.filter(s -> !s.matches("\\d+"));
//        Stream<String> stream2 = stream1.map(String::trim);
//        Stream<String> limit = stream2.limit(100);

    }
}
