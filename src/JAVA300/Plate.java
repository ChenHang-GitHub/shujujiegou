package JAVA300;

/**
 * @ClassName: Plate
 * @author: csh
 * @date: 2019/11/20  13:28
 * @Description:
 */


class Fruit {
}

class Apple extends Fruit {
}

public class Plate<T> {

    private  T item;

    public Plate(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class  Sds{
    public static void main(String[] args) {
        Plate<? extends Fruit> applePlate = new Plate<Apple>(new Apple());
//        Plate<Fruit> Plate = new Plate<Apple>(new Apple());   // bug!

    }
}
