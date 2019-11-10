package shejimoshi.prototype.shengfuzhi_clone;

import java.util.Date;

/*
* cloneable  是个标记方法  重写的是Object 对象的clone （native 方法 ）*/
public class Sheep implements Cloneable {
    private  String sname ;
    private Date  birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //实现深复制
        Object obj = super.clone();
        Sheep sheep = (Sheep) obj;
        //把Date 也复制一份  这样就指向了不同的Date 对象
        sheep.birthday= (Date) this.birthday.clone();

        return obj;
    }


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "sname='" + sname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
