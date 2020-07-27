package JAVA300.ioPackage;

import java.io.File;

/**
 * @ClassName: FileTest
 * @author: csh
 * @date: 2019/11/16  15:29
 * @Description:
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("hello.txt");  //相对路径
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
