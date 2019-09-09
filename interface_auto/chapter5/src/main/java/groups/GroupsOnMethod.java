package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author qxy
 * @date 2019/9/9 17:09
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1()
    {
        System.out.println("test1");
    }
    @Test(groups = "server")
    public void test2()
    {
        System.out.println("test2");
    }

    @Test(groups = "client")
    public void test3()
    {
        System.out.println("test3");
    }

    @Test(groups = "client")
    public void test4()
    {
        System.out.println("test4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("before group: server端在执行");
    }


    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("after group: server端在执行");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("before group: client端在执行");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("after group: client端在执行");
    }


}
