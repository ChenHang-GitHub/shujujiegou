
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class lab3    {




    public static void main(String[] args) {


        ExerciseFI exercise1 = ()->{
            List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
            String result = list.stream().map(s -> Character.toString(s.charAt(0))).reduce("", (a, b) -> a + b);
            System.out.println(result);
        };
        ExerciseFI exercise2 = ()-> {
            List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
            list.removeIf(s -> s.length() % 2 == 0);
            list.forEach(System.out::println);
        };
        ExerciseFI exercise3 = ()-> {
            List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
            list.replaceAll(s -> s.toUpperCase());
            list.forEach(System.out::println);
        };
        ExerciseFI exercise4 = ()-> {
            Map<String, Integer> map = new TreeMap<>();
            map.put("c", 3);
            map.put("b", 2);
            map.put("a", 1);
            StringBuilder builder = new StringBuilder();
            map.forEach((key, value) -> builder.append(key + value));
            System.out.println(builder.toString());
        };

        System.out.println("Running exercise 1 solution...");
         exercise1.runExercises();
        System.out.println("Running exercise 2 solution...");
         exercise2.runExercises();
        System.out.println("Running exercise 3 solution...");
         exercise3.runExercises();
        System.out.println("Running exercise 4 solution...");
         exercise4.runExercises();



    }


}



interface ExerciseFI {

    public  abstract void  runExercises();
}
