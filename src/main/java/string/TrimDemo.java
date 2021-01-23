package string;

/**
 * String Trim()
 * 去除字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String string = "   hello           ";
        System.out.println(string);

        String trim = string.trim();
        System.out.println(trim);

    }
}
