public class Demo {
    public static void main(String[] args) {
        /**
         * 二进制：
         *      Java运行原理，编译器
         *
         */
        int n = 50;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n);//

        for (int i = 0; i < 100; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
