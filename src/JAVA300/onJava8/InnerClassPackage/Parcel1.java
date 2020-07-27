package JAVA300.onJava8.InnerClassPackage;



/**
 * @ClassName: Parcel1
 * @author: csh
 * @date: 2019/11/13  14:30
 * @Description:
 */
public class Parcel1 {

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
    public  void ship (String str){
        Contents c = new Contents();
        Destination destination = new Destination(str);
        System.out.println(destination.readLabel());

    }

    public static void main(String[] args) {

        Parcel1 p = new Parcel1();
//        Contents contents = p.new Contents();
//        int i = contents.i;
//        System.out.println(i);
        p.ship("普通内部类");


    }
}
