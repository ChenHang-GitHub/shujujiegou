package JAVA300.onJava8.InnerClassPackage;

/**
 * @ClassName: Parcel2
 * @author: csh
 * @date: 2019/11/13  14:43
 * @Description:  Returning a reference to an inner class
 */
public class Parcel2 {


    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination to(String str) {
        return new Destination(str);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String str) {
        Contents contents = contents();
        Destination to = to(str);
        System.out.println(to.readLabel());
    }


    public static void main(String[] args) {

        Parcel2 parcel2 = new Parcel2();
        parcel2.ship("返回一个指向内部类的引用");

        // 测试返回实例

        Parcel2 p = new Parcel2();
        Parcel2.Destination ceshi = p.to("ceshi");
        Parcel2.Contents contents = p.contents();
    }
}
