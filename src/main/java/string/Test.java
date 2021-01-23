package string;

import javax.print.Doc;

public class Test {
    public static void main(String[] args) {
        String s1 = getHostName("www.tedu.com");
        String s2 = getHostName("http://www.tarena.com");
        String s3 = getHostName("doc.canglaoshi.com.cn");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

    public static String getHostName(String address) {
        int start = address.indexOf(".") + 1;//地址中第一个点的位置
        int end = address.indexOf(".", start);//地址中第二个点的位置
        return address.substring(start, end);
    }
}
