package JAVA300.ioPackage.Reader_Writer;

import org.junit.Test;

import java.io.*;

/**
 * @ClassName: FileReaderTest
 * @author: csh
 * @date: 2019/11/16  16:08
 * @Description:
 */
public class FileReaderTest {

    @Test
    public void fileReaderTest() throws IOException {
        File file = new File("hello.txt");
        FileReader fr = new FileReader(file);
        int data;
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }
        fr.close();

    }


    @Test
    public void fileReaderTest2() throws Exception {

        File file = new File("hello.txt");
        FileReader fr = new FileReader(file);
        char[] cbuf = new char[5];
        int len;
        while ((len = fr.read(cbuf)) != -1) {
            //错误的写法
//            for (int i = 0; i < cbuf.length; i++) {
//                System.out.print(cbuf[i]);
//            }

//            for (int i = 0; i < len; i++) {
//                System.out.print(cbuf[i]);
//            }

            String str = new String(cbuf, 0, len);
            System.out.println(str);

        }
        // close
        fr.close();
    }

    @Test
    public void fileWriterTest() {
//        public FileWriter(File file, boolean append) throws IOException {
//            super(new FileOutputStream(file, append));
//        }

        File file = new File("hello1.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.write("fileWriter/");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
