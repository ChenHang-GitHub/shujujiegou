package LabPackage;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: lab3
 * @author: csh
 * @date: 2020/2/27  14:57
 * @Description:
 */
public class lab3    {


    public static void main(String[] args) {


        ExerciseFI exercise1 = ()->{
            List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
            String result = list.stream().map(s -> Character.toString(s.charAt(0))).reduce("", (a, b) -> a + b);
            System.out.println(result);
        };

    }

}



interface ExerciseFI {
    public  abstract void  runExercises();
}
