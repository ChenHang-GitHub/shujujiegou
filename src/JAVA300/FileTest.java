package JAVA300;

import java.io.*;

/*
*JAVA中针对文件的读写操作设置了一系列的流，其中主要有FileInputStream,FileOutputStream,FileReader,FileWriter四种最为常用的流
            1:FileInputStream流被称为文件 字节输入流，意思指对文件数据以字节的形式进行读取操作 如读取图片视频等
            2:FileReader                   字符输入流 Unicode字符

* */
public class FileTest {

    public static void main(String[] args) {
        File file=new File("a.txt"); //根据路径创建File类对象--这里路径即使错误也不会报错，因为只是产生File对象，还并未与计算机文件读写有关联
        try
        {
            //FileInputStream的父类InputStream 是抽象类      *读取数据的三种方法：
            FileInputStream fileInputStream=new FileInputStream(file);//与根据File类对象的所代表的实际文件建立链接创建fileInputStream对象
            int  b ;
            // read()方法只能一个字节一个字节地读取
            //从输入流中读取一个字节返回int型变量，若到达文件末尾，则返回-1

            while ((b=fileInputStream.read())!=-1)
            {
                System.out.print( (char)b);
            }



//*****************************
//            StringBuffer stringBuffer = new StringBuffer();
//            while ((b=fileInputStream.read())!=-1)
//            {
//                stringBuffer.append((char)b);
//            }
//            System.out.println(stringBuffer.charAt(13));

//*****************************

            //使用FileInputStream的read(byte[] b)方法读取文本文件。
//            byte[] buf =  new byte[fileInputStream.available()];
//            fileInputStream.read(buf);
//            System.out.println(new String(buf));



//*****************************        FileReader ： 3种读书方式
            FileReader fileReader  = new FileReader(file);
//            int ch  ;
//            while ((ch=fileReader.read())!=-1)
//            {
//                System.out.print((char)ch);
//            }

//****************************** 用缓冲区读取文本文件
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line= null;

//            while((line = bufferedReader.readLine())!=null)
//            {
//                System.out.println(((int)line.charAt(8))-48);
//            }







//----------------------------FileOutputStream
//            FileOutputStream fileOutputStream = new FileOutputStream(file,true);  // 默认为false 覆盖 true 追加到末尾
//            String  content = "abc";
//            fileOutputStream.write(content.getBytes());
//


        }
        catch (FileNotFoundException e)
        {
            System.out.println("文件不存在或者文件不可读或者文件是目录");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
