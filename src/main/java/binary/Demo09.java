package binary;

public class Demo09 {
    public static void main(String[] args) {
        /**
         * 比较负数时候，>>> >> 的区别
         * >> 移动一次的运算相当于数学除以2，向小方向取整数
         * >>> 移动一次，仅仅是将数字的每个位向右侧移动一次，不管是否正负
         */
        int n = -50;
        int m = n>>1;
        int k = n>>2;
        int g = n>>>1;
        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
        System.out.println(g);
    }
}
