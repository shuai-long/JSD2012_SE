package binary;

public class Demo08 {
    public static void main(String[] args) {
        //Java中的数字都是2进制，向左移位时候，每移动一次数值扩大2倍！
        int n = 5; //101
        int m = n<<1;
        int k = n<<2;
        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
    }
}
