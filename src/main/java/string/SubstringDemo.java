package string;

/**
 * String Substring(int start, int end)
 * 截取指定范围内的字符串。两个参数分别是范围对应的下标。
 * 注：在JavaAPI中通常使用两个数字的下标都是”含头不含尾“的。
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";
        String sub = host.substring(4, 8);
        System.out.println(sub);

        //重载的Substring方法从头截取到末尾
        sub = host.substring(4);
        System.out.println(sub);
    }
}
