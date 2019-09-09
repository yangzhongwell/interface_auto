import org.testng.annotations.Test;

/**
 * @author qxy
 * @date 2019/9/9 18:45
 */
public class ExceptedException {
    /**
     * 什么时候会用到异常测试
     * 我们期望结果是某一个异常的时候
     * 比如：我们传入了不合法的参数，程序抛出异常，也就是我们预期结果就是这个异常
     */
    // 这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个测试结果会失败的测试");
    }

    // 这是一个测试结果成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个测试结果会失败的测试,但不报错");
        throw new RuntimeException();
    }
}
