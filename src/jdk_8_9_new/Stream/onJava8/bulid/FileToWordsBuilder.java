package jdk_8_9_new.Stream.onJava8.bulid;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: FileToWordsBuilder
 * @author: csh
 * @date: 2019/11/3  16:50
 * @Description: 流的建造者模式
 */
public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1) // 略过开头的注释行
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+"))
                        builder.add(w);
                });
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        String collect = new FileToWordsBuilder("Cheese.dat")
                .stream()
                .limit(7)
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }

}
