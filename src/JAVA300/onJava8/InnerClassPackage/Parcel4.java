package JAVA300.onJava8.InnerClassPackage;

import JAVA300.onJava8.InnerClassPackage.inf.Contents;
import JAVA300.onJava8.InnerClassPackage.inf.Destination;

/**
 * @ClassName: Parcel4
 * @author: csh
 * @date: 2019/11/13  15:55
 * @Description:
 */
public class Parcel4 {

    private class PContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }


    protected final class PDestination implements Destination {

        private String label;

        public PDestination(String label) {
            this.label = label;
        }


        @Override
        public String readLabel() {
            return label;
        }

    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();

    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents contents = p.contents();
        Destination ceshi = p.destination("ceshi");
        Parcel4.PContents pContents = p.new PContents();  //在 Parcel4 中，内部类 PContents 是 private，所以除了 Parcel4，没有人能访问它。普通（非内部）类的访问权限不能被设为 private 或者 protected；他们只能设置为 public 或 package 访问权限。


    }
}
