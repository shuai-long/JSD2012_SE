package doc;

/**
 * 文档注释只用在三个地方：类上，方法上，和常量上。
 * 文档注释是功能级注释，在类上使用是时用来说明当前类的设计意图和整体意图。
 *
 * @author :作者
 */
public class Demo {
    /**
     * sayHello用到的问候语
     */
    public static final String INFO = "你好！";

    /**
     * 为指定的用户添加一个问候语
     *
     * @param name 参数
     * @return 返回值
     */
    public String sayHello(String name) {
        return "你好" + name;
    }

    public static void main(String[] args) {

    }
}
