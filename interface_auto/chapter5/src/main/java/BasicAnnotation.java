import org.testng.annotations.*;

/**
 * @author qxy
 * @time 2019/9/9 14:28
 */
public class BasicAnnotation {

    // 最基本的注解，把方法标注为测试方法
    @Test
    public void testCase1(){
        System.out.println("case1");
    }

    @Test
    public void testCase2(){
        System.out.println("case2");
    }

    // 在每个测试方法执行前都会运行这个方法
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod：这是在测试方法开始前执行");
    }

    // 在每个测试方法执行后都会运行这个方法
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod: 这是在测试方法开始后执行");
    }

    // 在类运行前执行的方法
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass: 这是在类运行前执行的方法");
    }

    // 在类运行后执行的方法
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass: 这是在类运行后执行的方法");
    }

    // 类运行前执行
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    // 类运行后执行
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }


}
