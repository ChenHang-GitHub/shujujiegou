package shejimoshi.prototype.qianfuzhi;

import java.util.Date;

/*
* cloneable  是个标记方法  重写的是Object 对象的clone （native 方法 ）*/
public class Sheep implements Cloneable {
    private  String sname ;
    private Date  birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
