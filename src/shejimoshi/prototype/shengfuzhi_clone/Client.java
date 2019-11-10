package shejimoshi.prototype.shengfuzhi_clone;

import java.util.Date;
/*
* Clone 实现深复制
* */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(123);
        Sheep sheep1 = new Sheep("sheep1",date);
        System.out.println(sheep1.toString());
        //浅复制
        Sheep sheep2 = (Sheep)sheep1.clone();

        sheep1.setSname("s1");
        date.setTime(4444444L);
        sheep1.setBirthday(date);
        System.out.println("s1"+sheep1.toString());

        System.out.println("s2"+sheep2.toString());
    }
}
