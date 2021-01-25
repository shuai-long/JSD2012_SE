package integer;

/**
 * 包装类常见功能
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        //获取int最大值,最小值
        int imax = Integer.MAX_VALUE;
        System.out.println("imax：" + imax);
        int imin = Integer.MIN_VALUE;
        System.out.println("imin:" + imin);

        double dmax = Double.MAX_VALUE;
        System.out.println("dmax：" + dmax);
        double dmin = Double.MIN_VALUE;
        System.out.println("dmax：" + dmax);

        /*
        包装类提供了一个静态方法parseXXX(String line)可以将字符串解析为对应的基本类型数据，
        但前提是该字符串正确描述了基本类型可以保存的值，否则会抛出异常：
        java.lang.NuberFormotException
         */
        String line="123";
        int in=Integer .parseInt(line);
        System.out.println(in);
        double dou=Double.parseDouble(line);
        System.out.println(dou);

    }
}
