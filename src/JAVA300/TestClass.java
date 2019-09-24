package JAVA300;

import java.io.Serializable;
import java.text.DecimalFormat;

public class TestClass  implements Serializable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("aa");

//        System.out.println(sb.length());
        String str = "abc\n\nng";
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='\n')
            {
                System.out.println(true);
            }
        }

        Double data = 888.56789;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(data));

        String s1= "123";
        s1=s1.concat("abc");
//        s1=s1+s1.concat("abc");
        System.out.println(s1);



    }
}
