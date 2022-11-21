package cn.ronghuanet._03di;

import cn.ronghuanet.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ComplexTest extends BaseTest {
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
        System.out.println("============getOtherBeanList===================");
        user.getOtherBeanList().forEach(System.out::println);
        System.out.println("============set<String>===================");
        user.getSet().forEach(System.out::println);
        System.out.println("============otherBeanSet===================");
        user.getOtherBeanSet().forEach(System.out::println);
        System.out.println("============array===================");
        for (String array : user.getArrays()) {
            System.out.println(array);
        }
        System.out.println("============list<String>===================");
        user.getList().forEach(System.out::println);
        System.out.println("============properties  1  ===================");
        System.out.println(user.getProps1());
        System.out.println("============properties  2  ===================");
        System.out.println(user.getProps2());
        System.out.println("============maps    ===================");
        System.out.println(user.getMaps());
    }
}
