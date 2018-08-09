package String.String;

/**
 * @Author: AT
 * @Date: 2018/7/15
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 public boolean contains(CharSequence s) 判断String中是否包含指定char序列
 * public boolean contentEquals(CharSequence cs) 判断String的字符序列是否与指定字符序列相等
 * public boolean contentEquals(StringBuffer sb) 判断String是否与StringBuffer相等
 */
public class ContainsTest {
    public static void main(String[] args){
        String s1 = "abcdefg";
        System.out.println(s1.contains("abc"));
        System.out.println(s1.contentEquals("abc"));
        System.out.println(s1.contentEquals("abcdefg"));
    }
}
