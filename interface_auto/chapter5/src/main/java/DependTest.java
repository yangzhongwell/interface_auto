import org.testng.annotations.Test;

/**
 * @author qxy
 * @date 2019/9/9 18:55
 * @decription 依赖测试，被依赖的方法执行失败，依赖的方法则被忽略不执行
 */
public class DependTest {

    // 运行整个类时，输出结果为 test1 test2
    @Test
    public void test1(){
        System.out.println("test1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }
}
