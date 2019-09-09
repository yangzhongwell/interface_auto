package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author qxy
 * @date 2019/9/9 15:25
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 执行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 执行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 在执行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 在执行");
    }
}
