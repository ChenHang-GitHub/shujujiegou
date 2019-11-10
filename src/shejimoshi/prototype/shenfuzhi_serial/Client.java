package shejimoshi.prototype.shenfuzhi_serial;

import java.io.*;
import java.util.Date;
/*
* 原型模式需要和工厂模式一起使用  （当new 对象很耗时的时候就可以使用 原型模式去clone对象)*/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(123);
        Sheep sheep1 = new Sheep("sheep1",date);
        System.out.println(sheep1.toString());
        //序列化实现深复制
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        ObjectOutputStream oos =new ObjectOutputStream(bos);
        oos.writeObject(sheep1);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Sheep sheep2 = (Sheep) ois.readObject();

        sheep1.setSname("s1");
        date.setTime(4444444L);
        sheep1.setBirthday(date);
        System.out.println("s1"+sheep1.toString());
        System.out.println("s2"+sheep2.toString());
    }
}
