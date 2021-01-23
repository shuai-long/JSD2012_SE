package string;

/**
 * static String valueOf(XXX.xxx)
 * String提供了一组重载的静态方法：valueOf，作用是将Java中的其他类型转换为String
 * 最常使用于将基本类型转换为字符串
 */
public class ValueDemo {
    public static void main(String[] args) {
        int i = 123;
        String str1 = String.valueOf(i);
        System.out.println(str1);

        boolean boo = true;
        String str2 = String.valueOf(boo);
        System.out.println(str2);

        String s3 = i + "";//任何内容与字符串连接结果都是字符串
        System.out.println(s3);
    }
}
