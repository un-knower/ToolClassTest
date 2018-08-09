package String.String;

/**
 * @Author: AT
 * @Date: 2018/7/20
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 public boolean endsWith(String suffix)
 */
public class EndsWithTest {
    public static void main(String[] args) {
        String a = "abcdefg";
        String b = "efg";
        String c = new String("abcdefg");
        System.out.println(a.endsWith(b));//参数String是这个String对象的后缀
        System.out.println(a.endsWith(""));//参数是空字符串
        System.out.println(a.endsWith(c));//参数String与这个String相等
    }
}
