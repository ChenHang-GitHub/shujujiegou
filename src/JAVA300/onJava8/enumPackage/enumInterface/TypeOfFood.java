package JAVA300.onJava8.enumPackage.enumInterface;

/**
 * @ClassName: TypeOfFood
 * @author: csh
 * @date: 2019/11/5  19:13
 * @Description:
 *
 * 使用接口组织枚举
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food  = Food.Appetizer.SALAD;

        food= Food.MainCourse.HUMMOUS;

    }
}
