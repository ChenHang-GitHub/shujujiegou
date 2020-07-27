package JAVA300.onJava8.enumPackage.enumInterface;

/**
 * @ClassName: Food
 * @author: csh
 * @date: 2019/11/5  19:13
 * @Description:
 *在一个接口的内部，创建实现该接口的枚举，以此将元素进行分组，可以达到将枚举元素分类组织的目的。
 * 举例来说，假设你想用 enum 来表示不同类别的食物，同时还希望每个 enum 元素仍然保持 Food 类型。那可以这样实现：
 */
public interface Food {
    enum Appetizer implements Food {
        SALAD(1), SOUP(2);

        private  int num ;

        Appetizer(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI,
        LENTILS, HUMMOUS, VINDALOO;
    }
    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }
    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }
}
