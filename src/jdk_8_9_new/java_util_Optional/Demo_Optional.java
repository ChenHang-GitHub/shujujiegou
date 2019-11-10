package jdk_8_9_new.java_util_Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @ClassName: Demo_Optional
 * @author: csh
 * @date: 2019/10/29  15:29
 * @Description:   测试optional的使用
 *当我们在自己的代码中加入 Optional 时，可以使用下面 3 个静态方法：
 * empty()：生成一个空 Optional。
 * of(value)：将一个非空值包装到 Optional 里。
 * ofNullable(value)：针对一个可能为空的值，为空时自动生成 Optional.empty，否则将值包装在 Optional 中。
 */
public class Demo_Optional {

    //未使用optinal
//    public static User wantAUser(){
//        try{
//            //every thing is right
//            return new User();
//        }catch (Exception e){
//            //some bad thing happened
//            return null;
//        }
//    }

    //使用optional
    public  static Optional<User> wantAUser() {
        try {
            return Optional.of(new User());
        }catch (Exception e){
            return Optional.empty();
        }

    }



    public static void main(String[] args) {
        Optional<User> user = wantAUser();
        /*
        *
        * public T orElse(T other) {
        return value != null ? value : other;
        }*/
        System.out.println(user.orElse(new User()).getName());   //不空则获取 空则返回 new User对象
        /*
           public T orElseGet(Supplier<? extends T> other) {
        return value != null ? value : other.get();
    }
        * */
        User user1 = user.orElseGet(() -> new User());//Supplier      //不空则获取，空则通过方法返回对象

        // map ->function
        String s2 = user.map(s -> {
            s.setName("abc");
            return s.getName();
                }
        ).map(s1 -> s1.toUpperCase()).orElse("noname");

        System.out.println(s2);
        Optional<String> s = user.flatMap(u -> Optional.ofNullable(u.getName()));
        Optional<Optional<String>> s1 = user.map(u -> Optional.ofNullable(u.getName()));

//        User user= new User();
//        if(null == user){
//            user = new User();
//        }
//        System.out.println(user.getName());


    }
}
