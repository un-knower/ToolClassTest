package String.String;

/**
 * @Author: AT
 * @Date: 2018/7/19
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试：
 * public static String copyValueOf(char[] data)
 * public static String valueOf(char[] data)
 * public static String copyValueOf(char[] data, int offset, int count)
 * public static String valueOf(char[] data, int offset, int count)
 */
public class CopyValueOfTest {
    public static void main(String[] args) {
       char[] a = new char[]{'a','b','c','d'};
       char[] b = {'j','a','v','a'};
       char[] c = new char[5];

        System.out.println(String.copyValueOf(a));
        System.out.println(String.copyValueOf(b, 1, 1));
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b, 1, 1));
    }
}
