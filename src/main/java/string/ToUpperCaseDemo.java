package string;

/**
 * String ToUpperCase();
 * 将当前字符串中的英文部分转换为全大写
 * String ToLowerCase();
 * 将当前字符串中的英文部分转换为全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        System.out.println(str);

        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);

        System.out.println(upper.equalsIgnoreCase(lower));
    }
}
