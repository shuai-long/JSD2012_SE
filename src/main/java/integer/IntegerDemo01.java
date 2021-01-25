package integer;

/**
 * 包装类：
 * 包装类是为了解决基本类型不能直接参与面向对象的开发的问题，使得基本类型可以以对象的形式存在。
 * 包装类都定义在java.lang包中作为基础类使用。6个数字类型的包装类继承自Number，其余两个直接继承自Object。
 */
public class IntegerDemo01 {
    public static void main(String[] args) {

        //基本类型转换为包装类
        int d = -128;
        Integer integer = new Integer(d);
        Integer integer1 = new Integer(d);

        /*
        基本类型转换为包装类建议使用包装类提供的静态方法valueOf()，
        对于Integer而言，该方法会重用1字节之内的正数的包装类对象
         */
        Integer integer2 = Integer.valueOf(d);
        Integer integer3 = Integer.valueOf(d);


        System.out.println(integer2 == integer3);
        //包装类都重写过equals方法
        System.out.println(integer.equals(integer1));

        //包装类转换为基本类型
        int i = integer.intValue();//将包装类表示的数字以int类型返回
        System.out.println(i);
        double dou=integer.doubleValue();//以double类型返回
        System.out.println(dou);
    }
}
