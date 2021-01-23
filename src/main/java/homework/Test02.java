package homework;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 *
 * @author Xiloer
 */
public class Test02 {
    public void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名（20字以内）：");
        String name = scanner.next();
        boolean b = false;
        do {
            if (name.length() == 0) {
                b = true;
                System.out.println("输入为空，请重新输入：");
                name = scanner.next();
            }
            if (name.length() >= 20) {
                b = true;
                System.out.println("请控制在20字以内：");
                name = scanner.next();
            }
        } while (b);
        System.out.println("您的名字为："+name);
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.getName();
    }

}
