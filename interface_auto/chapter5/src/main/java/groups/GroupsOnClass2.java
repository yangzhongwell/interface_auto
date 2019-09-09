package groups;

import org.testng.annotations.Test;

/**
 * @author qxy
 * @date 2019/9/9 17:48
 */
@Test(groups = "stu")
public class GroupsOnClass2 {

    public void test1(){
        System.out.println("GroupsOnClass2类的test1方法 在执行");
    }

    public void test2(){
        System.out.println("GroupsOnClass2类的test2方法 在执行");
    }
}
