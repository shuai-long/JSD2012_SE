package string;

/**
 * String 支持正则表达式的方法之二：
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以一个String数组的形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String string = "212sad12ad5as4d8wd45sad1a";
        String[] strings = string.split("[0-9]+");
        System.out.println(strings.length);
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }

        String string1="123.456.789";
        String[] strings1=string1.split("\\.");//要将字符串按照 "."拆分，需要加\\转义
        System.out.println(strings1.length);
        for (int i = 0; i < strings1.length; i++) {
            System.out.print(strings1[i]);
        }

        /**
         * 当遇到连续出现的可拆分字符串项时，中间会拆分出一个空字符串。
         * 如果字符串最开始就是可拆分项，则拆分后的第一项是空字符串。
         *
         * 注意：
         * 若字符串末尾出现连续的可拆分项，所有拆分出来的空字符串会被忽略。
         */
        String string2=",123,,456,789,,,";
        String [] strings2=string2.split(",");
        System.out.println(strings2 );
        System.out.println(strings2.length);
        for (int i = 0; i < strings2.length; i++) {
            System.out.print(strings2[i]);
        }

    }
}
