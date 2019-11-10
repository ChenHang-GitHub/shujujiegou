package JAVA300.onJava8.AtInterface;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @ClassName: UseCaseTracker
 * @author: csh
 * @date: 2019/11/5  19:47
 * @Description: 编写注解处理器
 */
public class UseCaseTracker {

    public static void
    trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case " +
                        uc.id() + "\n " + uc.desription());
                useCases.remove(Integer.valueOf(uc.id()));
            }
        }
        useCases.forEach(i ->
                System.out.println("Missing use case " + i));

    }

    public static void main(String[] args) {
        List<Integer> useCases = IntStream.range(47, 51)
                .boxed().collect(Collectors.toList());
        trackUseCases(useCases, PasswordUtils.class);
    }
}
