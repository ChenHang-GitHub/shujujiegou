package JAVA300;
/*
*
*     1.父类 xx = new 子类（）定义的对象只能调用继承来的方法。

      2.父类 xx = new 子类（）定义的对象调用的是子类的方法，而不是父类的。
* */
public  class Person {

    private int a = 4;
   public    void  stud(){
       System.out.println("PPPPP");
   };

    public static void main(String[] args) {
//        School school =new School();
//        Person person =new Student();
//        Student student = new Student();
//        int a = student.a;
//        int a1 = person.a;
//        int a2 = ((Student) person).a;
//        System.out.println(a +" "+a1+a2);
//        school.g(person);
//        person.stud();
//        //只能调用继承来的方法
//        ((Student) person).get();
//        int that[] = new int[]{1,2,3};
//        int d ='a'+'b'+'c';
//        char b =1000+300;
//        int a21=888888888;
//    }
        Person person =  new Student();
        person.stud();
        int a = person.a;
        System.out.println(a);


    }
}

class  ceshi{
    public static void main(String[] args) {
    }
}

class Student extends  Person{
  public  int a = 5;
    @Override
    public void stud() {
        System.out.println("stu :study ");
    }
    public  void get(){
        System.out.println("get");
    }
}

class School  extends  Student{
    public  void  g (Student student ){

        System.out.println("S");
        student.stud();
    }

    public  void  g (Person person ){

        System.out.println("P");
        person.stud();
    }

}

