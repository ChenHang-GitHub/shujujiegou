package JAVA300.onJava8.enumPackage;

/**
 * @ClassName: E
 * @author: csh
 * @date: 2019/11/5  16:43
 * @Description: Enum  在实际中的运用
 */

//所有的 enum 都继承自 Java.lang.Enum 类。由于 Java 不支持多重继承，所以你的 enum 不能再继承其他类：
public enum ETest {
    NOT_NULL(1001,"不能为NULL"),
    NOT_EMPTY(1002,"不能为空");
    private int code;
    private String msg;

    ETest(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public static void main(String[] args) {

    }
}
class EnumClass {

    public static void main(String[] args) {

        for (ETest eTest : ETest.values()) {
            System.out.println(eTest.ordinal() + ":" + eTest + "->" + eTest.getCode());
        }

        int code = ETest.NOT_NULL.getCode();
        String msg = ETest.NOT_NULL.getMsg();

    }

}
