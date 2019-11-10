package JAVA300.onJava8.class1.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName: ReflectionTest
 * @author: csh
 * @date: 2019/11/7  18:55
 * @Description:
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {


        Class clazz= Person.class;
        Constructor clazzConstructor = clazz.getConstructor(int.class, String.class);
        Object obj = clazzConstructor.newInstance(12,"Tom");
        Person p = (Person) obj;
        System.out.println(p.show());

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i]);
        }

        Field age = clazz.getDeclaredField("age");
        age.set(p,111);

        Method show = clazz.getDeclaredMethod("show");
        Object invoke = show.invoke(p);
        System.out.println(invoke);



        //  可以通过反射 调用类的私有结构

        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        Person p1 = (Person) o;
        //调用私有的属性 方法
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"aaa");
        System.out.println(p1.show());

        Method getName = clazz.getDeclaredMethod("getName");
        getName.setAccessible(true);
        String invoke1 = (String) getName.invoke(p1);
        System.out.println(invoke1);


    }
}
