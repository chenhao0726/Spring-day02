package cn.ronghuanet._03di;

import cn.ronghuanet.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DiTest extends BaseTest {
    @Autowired
    private MyBean myBean1; // 构造器索引

    @Autowired
    private MyBean myBean2; // 构造的类型

    @Autowired
    private MyBean myBean3; // 构造的类型

    @Autowired
    private MyBean myBean4; // 内部bean

    @Autowired
    private MyBean myBean5; // 外部bean
    @Test
    public void test(){
        System.out.println(myBean1);
        System.out.println(myBean2);
        System.out.println(myBean3);
        System.out.println(myBean4);
        System.out.println(myBean5);
    }
}
