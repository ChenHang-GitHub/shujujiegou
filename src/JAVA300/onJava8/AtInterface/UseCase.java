package JAVA300.onJava8.AtInterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: UseCase
 * @author: csh
 * @date: 2019/11/5  19:34
 * @Description:    自定义注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface UseCase {
    int id();
    String  desription() default  "no des";
}
