package object;

/**
 * 测试Object中常用方法
 */
public class Test {
    public static void main(String[] args) {
        Point point = new Point(15, 20);

        /*
        Object中定义了方法：
        String toString()：作用是将当前对象转换为String，Object中该方法的实现返回的字符串格式为：类名@地址
         */
        String string = point.toString();
        System.out.println(string);

        /*
        向控制台输出是很常用的操作，当我们输出一个对象时，实际上该方法会调用该对象的toString方法，将返回的字符串输出在控制台上。
         */
        System.out.println(point);//

        /*
        字符串与其他类型连接时，会将其他类型转换为String，而转换类型也是依靠对象的toString。
        下面的代码实际上是将p.toString()返回的字符串链接的
         */
        String line = "这个对象是：" + point;
        System.out.println(line);

        /*
        Object提供的另一个常用的方法：
        boolean equals(Object o);
        该方法的作用是比较当前对象与给定参数的对象的内容是否相同
        但是如果子类不重写这个方法，则该方法毫无价值。因为Object实现该方法就是使用的是“==”比较的
         */
        Point point1 = new Point(15, 20);
        System.out.println(point == point1);
        System.out.println(point.equals(point1));
        /*
        JAVA提供的类基本都妥善的重写了toString()和equals()方法
         */
    }
}
