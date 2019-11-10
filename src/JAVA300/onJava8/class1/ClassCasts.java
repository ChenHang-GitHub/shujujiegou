package JAVA300.onJava8.class1;

/**
 * @ClassName: ClassCasts
 * @author: csh
 * @date: 2019/11/5  14:25
 * @Description: Java 中还有用于 Class 引用的转型语法，即 cast() 方法：
 */

class Building {
}

class House extends Building {
}

public class ClassCasts {

    public static void main(String[] args) {

        Building b  = new House();
        Class<House> houseType = House.class;
        House cast = houseType.cast(b);
        // or
        cast  =  (House) b;


    }
}
