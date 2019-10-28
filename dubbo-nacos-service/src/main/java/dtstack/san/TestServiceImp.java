package dtstack.san;

/**
 * @description:
 * @author: 33
 * @time: 2019/10/23 21:09
 */

public class TestServiceImp implements TestService{
    public void test() {
        System.out.println("---TestServiceImp test() --- 调用");
    }

    public String testString(String string) {
        System.out.println("---TestServiceImp test(+ " + string + ") --- 调用");
        return "输出：" + string;
    }
}
