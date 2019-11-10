package JAVA300.abstractTest;

/**
 * @ClassName: Basic
 * @author: csh
 * @date: 2019/11/1  15:31
 * @Description:
 */
abstract class Basic {
      abstract void unimplement();
      int i =1;

      public  void  noAbstractMethod(){
          //将一个类指明为 abstract 并不强制类中的所有方法必须都是抽象方法。
      }
}



/*
* 如果创建一个继承抽象类的新类并为之创建对象，那么就必须为基类的所有抽象方法提供方法定义。
* 如果不这么做（可以选择不做），新类仍然是一个抽象类，编译器会强制我们为新类加上 abstract 关键字。*/
 class Basic2 extends Basic{
    int i=2;
    @Override
   public void unimplement() {
        System.out.println("Basic2");

    }
    public  void basic2Method(){
        System.out.println("xx 父类 new 子类 无法调用");
    }
}

class  Test{

    public static void main(String[] args) {

        Basic2 basic2 = new Basic2();
        basic2.unimplement();
        System.out.println(basic2.i);
        //
        Basic basic = new Basic2();
        int i = basic.i;     //basic .i
        int i1 = ((Basic2) basic).i; // basic2 .i
        basic.unimplement();
        ((Basic2) basic).basic2Method();   //向下转型 无法调用父类没有的方法

    }
}
