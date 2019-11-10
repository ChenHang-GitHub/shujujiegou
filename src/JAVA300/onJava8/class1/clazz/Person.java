package JAVA300.onJava8.class1.clazz;

/**
 * @ClassName: Person
 * @author: csh
 * @date: 2019/11/7  18:53
 * @Description:
 */
public class Person {

     int age;
     private String name;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
