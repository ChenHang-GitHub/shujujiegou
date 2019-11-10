package jdk_8_9_new.Java_util_function;

import java.util.function.Supplier;

/**
 * @ClassName: Demo_Supplier
 * @author: csh
 * @date: 2019/10/23  20:24
 * @Description: java.util.function.Supplier;
 */
public class Demo_Supplier {
    public  static  String getString(Supplier<String> supplier)
    {
        return supplier.get();
    }

    public static void main(String[] args) {
        String string = getString(() -> {
            return "lambda";
        });

    }
}
