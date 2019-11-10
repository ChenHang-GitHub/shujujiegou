package jdk_8_9_new.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @ClassName: Demo_getStream
 * @author: csh
 * @date: 2019/10/24  21:01
 * @Description:  获取stream流的几种方式
 */
public class Demo_getStream {


    public static void main(String[] args) {
        //List
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        //Set
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();
        //Map :
        HashMap<String, String> map = new HashMap<>();
           //keySet
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();
           //Values
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();
           //entrySet
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entrySet.stream();

        //（Stream 的静态方法 of）
        //Array
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);
        //String
        Stream<String> stream6 = Stream.of("a", "b", "c", "d", "e");

    }
}
