package JAVA300.lambdaExpression;
/*
* 作用？？
更好的封装性
内部类成员可以直接访问外部类的私有数据，因为内部类被当成其外部类成员，但外部类不能访问内部类的实现细节，例如内部类的成员变量*/
public class TestLambda {

    //静态内部类
    public  static  class Like2 implements  Ilike{
        @Override
        public void lambda() {
            System.out.println("2222222222");
        }
    }

    public static void main(String[] args) {
        Ilike ilike =   new Like();
        ilike.lambda();//111111111111
//        ilike=new Like2();
        ilike.lambda();//222222222222
        //局部内部类
        class Like2 implements  Ilike{
            @Override
            public void lambda() {
                System.out.println("3333333");
            }
        }
        ilike=new Like2();
        ilike.lambda();

        //匿名内部类
        ilike=new Ilike(){

            @Override
            public void lambda() {
                System.out.println("nimin");
            }
        };
        ilike.lambda();

        //lambda
        ilike = ()->{
            System.out.println("lamda1");
        };

        ilike.lambda();


    }

}


class Like   implements  Ilike{
    @Override
    public void lambda() {
        System.out.println("1111111");
    }
}

// 定义的一个函数式接口 (只包含一个方法的接口)
interface Ilike{
    public  abstract  void  lambda();
}