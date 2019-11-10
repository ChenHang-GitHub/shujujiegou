package JAVA300.onJava8.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName: ListOfLines
 * @author: csh
 * @date: 2019/11/4  18:48
 * @Description: Files 读写 文件内容
 */
public class ListOfLines {

    public static void main(String[] args) throws IOException {
        //读每一行
        Files.readAllLines(Paths.get("Cheese.dat"))
                .stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.startsWith("I"))
                .forEach(System.out::println);

        //写

        Random random = new Random(47);
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));

        Files.write(Paths.get("Cheese.dat"), bytes);
    }
}
