package string;

import javax.sound.midi.Soundbank;

/**
 * String的优化导致其为不变对象，，这会存在利于重用不利于修改操作。
 * 频繁修改String会降低性能并有较多的内存开销。
 * <p>
 * java.lang.StringBuilder是专门设计用来修改String的API，其内部维护一个可变的char数组，并提供了多种修改字符串内容的方法，
 * 例如：增删改插，和String原有的相关方法：indexOf，length等等。
 * StringBuilder修改String的速度快，内存小。
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习Java";

        //内部表示空字符串
        StringBuilder builder = new StringBuilder();

        //基于给定的字符串内容进行修改
        StringBuilder builder1 = new StringBuilder(str);

        /**
         * StringBuffer builder=new StringBuilder;
         * StringBuilder:线程不安全的  StringBuffer:线程安全的
         */
        StringBuffer buffer=new StringBuffer(str);

        /**
         * append：将给定内容增加至字符串末尾
          */
        builder1.append("就是为了找个好工作");//字符串追加
        str = builder1.toString();//StringBuilder本身不是String对象，只是一个修改字符串的工具类
        System.out.println(str);

        /**
         * 好好学习Java，就是为了找个好工作
         * 好好学习Java，就是为了改变世界
         * replace(start ,  end ,     str):替换当前字符串中的部分内容为指定的内容
         *         开始下标,  结束下标,  给定字符串
         */
        builder1.replace(12, 18, "改变世界");
        //System.out.println(builder1.toString());
        System.out.println(builder1);//直接输出builder也是输出toString()返回的字符串

        /**
         * 好好学习，就是为了改变世界！
         * ，就是为了改变世界
         * delete()：删除当前字符串的内容
         */
        builder1.delete(0, 8);
        System.out.println(builder1);

        /**
         * ,就是为了改变世界
         * 活着，就是为了改变世界
         * insert()将给定内容插入到指定位置
         */
        builder1.insert(0, "活着,");
        System.out.println(builder1);

    }
}
