package string;

/**
 * String 支持正则表达式的方法之三：
 * <p>
 * String replaceAll(String regex,String str);
 * 将当前字符串满足正则表达式的内容替换为给定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        //将字符串中的数字部分替换为#Number#
        String str = "abc123abc123cad123add123";
        str = str.replaceAll("[0-9]+", "#number#");
        System.out.println(str);

        //将满足的部分替换为空串可以达到去除的效果
        str = str.replaceAll("[0-9]+", "");
        System.out.println(str);

        //和谐用语
        String regex = "(wqnmlgb|dsb|mdzz|nc)";
        String message = "wqnmlgb,你就是个dsb";
        message = message.replaceAll(regex, "***");
        System.out.println(message);
    }
}
