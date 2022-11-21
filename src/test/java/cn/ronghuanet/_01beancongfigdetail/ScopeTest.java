package cn.ronghuanet._01beancongfigdetail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * bean的作用域:
 * singleton:单例 我们的Spring默认的bean就是单例的
 * prototype: 多例 每一次获取都是给我们一个新的对象
 * 单例的是迫切加载 而 多例的不是迫切加载
 * 单例的 在容器中有几个? 全局只有一个 所以 可以先创建好放在那里
 * 多例的 不知道具体有多少个
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ScopeTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test(){
//        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("容器加载完成................");
        SocpeBean socpeBean1 = context.getBean("socpeBean", SocpeBean.class);
        SocpeBean socpeBean2 = context.getBean("socpeBean", SocpeBean.class);
        if (socpeBean1 == socpeBean2){
            System.out.println("我们俩是同一个对象");
        }else{
            System.out.println("我们俩不是同一个对象----");

        }
        System.out.println(socpeBean1);
        System.out.println(socpeBean2);

    }

}
