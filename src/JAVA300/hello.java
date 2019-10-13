package JAVA300;




public class hello    {

    Age age ;
    int a;

    public hello(hello hello,Age age) {
        this.a = hello.a;
        this.age=age;
    }

    public hello() {
    }

    @Override
    public String toString() {
        return "hello{" +
                "age=" + age +
                ", a=" + a +
                '}';
    }

    public static void main(String[] args) throws Exception {

        hello hello1= new hello();
        hello1.a=1;
        hello1.age=new Age(100);
        System.out.println(hello1.toString());
        hello hello2 = new hello(hello1,hello1.age);             //通过拷贝构造方法进行了浅拷贝，各属性值成功复制。其中，p1值传递部分的属性值发生变化时，
        // p2不会随之改变；而引用传递部分属性值发生变化时，p2也随之改变。
        hello2.age.num=200;
        hello2.a=2;
        System.out.println(hello1.toString());


    }

}
class  Age{
    int num=0;
    public Age(int age) {
        this.num=age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "num=" + num +
                '}';
    }
}