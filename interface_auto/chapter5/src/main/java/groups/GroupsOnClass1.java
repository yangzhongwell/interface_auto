package groups;

import org.testng.annotations.Test;

/**
 * @Description: 组测试如何在类上运行
 * @Author: qxy
 * @Date: 2019/9/9 17:48
 */
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void test1(){
        System.out.println("GroupsOnClass1类的test1方法 在执行");
    }

    public void test2(){
        System.out.println("GroupsOnClass1类的test2方法 在执行");
    }
}
