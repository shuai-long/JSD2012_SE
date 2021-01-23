package binary;

public class Homework {
    public static void main(String[] args) {
        //将一个long类型拆分为8个字节
        long l = 1234899123488822L;
        long b1 = (l>>56) & 0xff;
        long b2 = (l>>48) & 0xff;
        long b3 = (l>>40) & 0xff;
        long b4 = (l>>32) & 0xff;
        long b5 = (l>>24) & 0xff;
        long b6 = (l>>16) & 0xff;
        long b7 = (l>>8) & 0xff;
        long b8 = l & 0xff;
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toBinaryString(b1));
        System.out.println(Long.toBinaryString(b2));
        System.out.println(Long.toBinaryString(b3));
        System.out.println(Long.toBinaryString(b4));
        System.out.println(Long.toBinaryString(b5));
        System.out.println(Long.toBinaryString(b6));
        System.out.println(Long.toBinaryString(b7));
        System.out.println(Long.toBinaryString(b8));

        //将8给字节合并为一个long数据
        long num = (b1<<56) | (b2<<48) | (b3<<40) | (b4<<32) |
                (b5<<24) | (b6<<16) | (b7<<8)| b8;
        System.out.println(Long.toBinaryString(num));

        //测试int拆分与合并
        int n = -232323;
        byte[] bytes = getBytes(n);
        int x = toInt(bytes);
        System.out.println(n);
        System.out.println(x);

    }

    //将正数拆分为四个byte
    public static byte[] getBytes(int n){
        int b1 = (n>>>24) & 0xff;
        int b2 = (n>>>16) & 0xff;
        int b3 = (n>>>8) & 0xff;
        int b4 = n & 0xff;
        return new byte[]{(byte)b1, (byte)b2, (byte)b3, (byte)b4};
    }

    public static int toInt(byte[] bytes){
        //利用掩码运算0xff消息负数时候，符号位扩展造成的影响
        int b1 = bytes[0] & 0xff;
        int b2 = bytes[1] & 0xff;
        int b3 = bytes[2] & 0xff;
        int b4 = bytes[3] & 0xff;
        return (b1<<24) | (b2<<16) | (b3<<8) | b4;
    }
}
