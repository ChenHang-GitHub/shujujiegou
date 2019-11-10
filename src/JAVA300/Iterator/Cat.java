package JAVA300.Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @ClassName: Cat
 * @author: csh
 * @date: 2019/11/1  20:19
 * @Description:     迭代器
 */
public class Cat {

    private  int num ;

    public Cat(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1));
        cats.add(new Cat(2));
        cats.add(new Cat(3));
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            Cat next = iterator.next();
            System.out.println(next);
        }

        //ListIterator 是一个更强大的 Iterator 子类型，它只能由各种 List 类生成。 Iterator 只能向前移动，而 ListIterator 可以双向移动
        ListIterator<Cat> catListIterator = cats.listIterator();

        //
    }
}
