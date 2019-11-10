package jdk_8_9_new.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @ClassName: Demo_List
 * @author: csh
 * @date: 2019/10/24  20:21
 * @Description:  使用Stream流对集合进行过滤
 * Stream 关注做什么，不关注怎么做
 * 创建流的常用方式：
 * 所有的Collection集合都可以通过stream默认方法获取流
 * 通过Stream接口的静态方法of可以获取数组对应的流
 * Stream流的常用方法：
 * 延迟方法 : 返回值类型仍然是Stream接口自身类型的方法,因此支持链式调用( 除了终结方法外,其余方法均为延迟方法 )
 * 终结方法 : 返回值类型不再是Stream接口自身类型的方法,因此不再支持类似StringBuilder那样的链式调用,终结方法例如count和forEach
 */
public class Demo_List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张ab");
        list.add("张a");
        list.add("张ac");
        list.add("陈ac");
        list.add("陈ab");

//        Stream 流的方式 进行list的过滤处理：
//        pipeLineing 形式 处理：
//        获取流的方式：
        list.stream()
                 .filter(name -> name.startsWith("张"))       //过滤
                 .filter(name-> name.length()==3)             //过滤
                 .forEach(name-> System.out.println(name));  // foreach 形式 输出


    }
}
