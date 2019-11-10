package threadLeaning.someContainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: T03_SynchronizedList
 * @author: csh
 * @date: 2019/11/10  15:48
 * @Description:
 */
public class T03_SynchronizedList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 返回的实例，每个方法都加了一个互斥锁
        List<String> synchronizedList = Collections.synchronizedList(list);


    }
}
