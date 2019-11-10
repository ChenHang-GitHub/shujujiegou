package JAVA300.onJava8.matcher;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @ClassName: IntegerMatch
 * @author: csh
 * @date: 2019/11/4  19:46
 * @Description:
 */
public class IntegerMatch {
    public static void main(String[] args) {

        System.out.println("-1234".matches("-?\\d+")); // 要找一个数字，它可能有一个负号在最前面，那你就写一个负号加上一个问号，就像这样：
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));  //以 - 或者+ 号开头    \\+ 转义加号

        System.out.println("---------------------------------------------------");
        //       String.split()
        String knights =
                "Then, when you have found the shrubbery, " +
                        "you must cut down the mightiest tree in the " +
                        "forest...with... a herring!";

        System.out.println(Arrays.toString(knights.split("\\W+")));   //  \\W+  一个或多个非单词字符
        System.out.println(Arrays.toString(knights.split("\\w+")));   //  \\W+  一个或多个单词字符
        System.out.println(Arrays.toString(knights.split("n\\W+")));   //  字母n后面跟着一个或多个非单词字符。


        System.out.println(knights.replaceFirst("f\\w+", "located"));         // 替换第一个以f开头的单词  为located
        System.out.println(knights.replaceAll("shrubbery|tree|herring","banana"));






    }
}
