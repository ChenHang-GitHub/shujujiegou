import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName: test
 * @author: csh
 * @date: 2019/12/12  18:52
 * @Description:
 */
public class test {





    public static void main(String[] args) {
            String aval = "零壹贰叁肆伍陆柒捌玖";
            String bval = "拾佰仟万亿";
            int[] bnum = {10, 100, 1000, 10000, 100000000, 1000000000};
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                long num = 0;
                String str = sc.next();
                char[] arr = str.toCharArray();
                int len = arr.length;
                Stack<Long> stack = new Stack<>();
                for (int i = 0; i < len; i++) {
                    char s = arr[i];
                    if (s == '零') continue;
                    int index = bval.indexOf(s);
                    if (index == -1) {
                        stack.push((long) aval.indexOf(s));
                    } else { //当前字符为单位。
                        int tempsum = 0;
                        long val = (int) bnum[index];
                        if (stack.isEmpty()) {
                            stack.push(val);
                            continue;
                        }
                        while (!stack.isEmpty() && stack.peek() < val) {
                            tempsum += stack.pop();
                        }
                        if (tempsum == 0) {
                            stack.push(val);
                        } else {
                            stack.push(tempsum * val);
                        }
                    }
                }
                while (!stack.isEmpty()) {
                    num += stack.pop();
                }
                System.out.println(num);
            }
        }}
