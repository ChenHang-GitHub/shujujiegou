package JAVA300.onJava8.file;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @ClassName: PathInfo
 * @author: csh
 * @date: 2019/11/4  16:27
 * @Description:
 *
 * 一个Path对象表示一个文件或者目录的路径，是一个跨操作系统（OS）和文件系统的抽象，
 * 目的是在构造路径时不必关注底层操作系统，代码可以在不进行修改的情况下运行在不同的操作系统上
 */
public class PathInfo {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("os.name"));
        //java.nio.file.Paths类包含一个重载方法static get()，该方法方法接受一系列Strings字符串或一个统一资源标识符(URI)作为参数，并且进行转换返回一个Path对象：
        Path path = Paths.get("C:\\Users\\chenshihang\\IdeaProjects\\JAVA数据结构\\Cheese.dat");
        System.out.println(path);
        System.out.println(Files.exists(path));
        System.out.println(Files.isDirectory(path));
        System.out.println("-------------------");
        System.out.println(path.isAbsolute());    //是否是绝对路径
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.toUri());
        System.out.println("--------------------");

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }
        System.out.println("--------------------");



    }
}
