package JAVA300.onJava8.InnerClassPackage;

/**
 * @ClassName: Parcel3
 * @author: csh
 * @date: 2019/11/13  15:44
 * @Description:
 *
 * 在拥有外部类对象之前是不可能创建内部类对象的。这是因为内部类对象会暗暗地连接到建它的外部类对象上。
 * 但是，如果你创建的是嵌套类（静态内部类），那么它就不需要对外部类对象的引用。
 */
public class Parcel3 {


    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private  String  label ;

        public Destination(String label) {
            this.label = label;
        }
        public  String readLabel(){
            return label;
        }
    }

    public static void main(String[] args) {

        Parcel3 parcel3 = new Parcel3();
        // Must use instance of outer class
        // to create an instance of the inner class:
        Contents contents = parcel3.new Contents();
        Destination destination = parcel3.new Destination(".new Test");

    }
}
