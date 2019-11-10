package jdk_8_9_new.Java_util_function;

import java.util.function.Function;

/**
 * @ClassName: Demo_Function
 * @author: csh
 * @date: 2019/10/24  19:18
 * @Description: java.util.function.Function;
 */
public class Demo_Function {

    public static void change(String s, Function<String, Integer> function) {
        Integer apply = function.apply(s);
        System.out.println(apply);
    }

    //andThen  方法
    public static void change2(String s, Function<String, Integer> function1, Function<Integer, String> function2) {
        String apply = function1.andThen(function2).apply(s);
        System.out.println(apply);
    }

    public static void main(String[] args) {
        change("123", s -> Integer.parseInt(s));
        change2("123", (s) -> {
            return (Integer.parseInt(s)) + 10;
        }, (s) -> {
            return String.valueOf(s);
        });
        //优化lambda
        change2("123", s -> (Integer.parseInt(s)) + 10, s -> String.valueOf(s));
    }
}
