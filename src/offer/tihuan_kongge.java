package offer;

/*
* 请实现一个函数，将一个字符串中的每个空格替换成“%20”
* 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
* */
public class tihuan_kongge {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(" We Are Happy. ");
//        replaceSpace(str);
//        while (str.indexOf(" ")!=-1)
//        {
//            System.out.println("time");
//            str.replace(str.indexOf(" "),str.indexOf(" ")+1,"%20");
//        }
//        System.out.println(str);

        String str1 = " We Are Happy. ";
        char c = str1.charAt(str1.length()-1);
        for (int i =str1.length()-1;i>=0;i--)
        {
            if(str1.charAt(i)==' '){
                System.out.println("1");
                str1=str1.replaceAll(" ","1");

            }
        }


    }
// StringBuffer 实现
    public static String replaceSpace(StringBuffer str) {

        while (str.indexOf(" ")!=-1)
        {
            System.out.println("time");
            str.replace(str.indexOf(" "),str.indexOf(" ")+1,"%20");
        }
        return  str.toString();
    }
    // String 实现
    public static String replaceSpace(String str) {
        int count = 0;
        char c = str.charAt(str.length());


        return  str.toString();
    }
}
