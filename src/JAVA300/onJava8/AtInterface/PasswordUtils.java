package JAVA300.onJava8.AtInterface;

/**
 * @ClassName: PasswordUtils
 * @author: csh
 * @date: 2019/11/5  19:38
 * @Description:
 */
public class PasswordUtils {

    @UseCase(id = 47, desription = "1")
    public boolean validatePassword(String passwd) {
        return (passwd.matches("\\w*\\d\\w*"));
    }
}
