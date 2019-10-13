package JAVA300.jichen;

import javax.sound.midi.Soundbank;

public class Father {
    int  f = 1;
    public  void   get(){
        System.out.println("Father :get ");
    }

    public  void  set(){
        System.out.println("Father :set ");
    }

}

class Child extends Father {

//    @Override
//    public void get() {
//        System.out.println("super get :");
//        super.get();
//    }
    public  void  childget(){
        System.out.println("child onlyl ");
    }
}

class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.get();

        Father fatherChild = new Child();
        //只能调用父类的方法
        fatherChild.get();
        fatherChild.set();
    }
}