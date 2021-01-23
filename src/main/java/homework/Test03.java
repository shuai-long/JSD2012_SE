package homework;

/**
 * 修改下面代码的错误
 * <p>
 * 下面代码完成的功能是输出字符串中的每一个字符
 *
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "hello world! i love java!";//String的首字母大写
        for (int i = 0; i<str.length(); i++) {//字符串的最后一个下标为length-1,
            char c = str.charAt(i);//循环和输出语句应该写在大括号内
            System.out.print(c);
        }
    }
}






