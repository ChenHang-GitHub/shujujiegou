package threadLeaning.syn;

/**
 * @ClassName: Test10
 * @author: csh
 * @date: 2019/11/8  16:30
 * @Description:
 *
 * 不要以字符串作为锁定的对象    syn锁的不是s1 ，s2 是“lock”   锁堆不锁栈
 */
public class Test10 {


        String s1 = "lock";
        String s2 = "lock";

}
