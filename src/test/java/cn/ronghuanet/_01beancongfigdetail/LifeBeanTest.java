package cn.ronghuanet._01beancongfigdetail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  singleton:单例的生命周期
 *  创建: 程序启动 调用的无参构造
 *  初始化: 对象被创建以后 立刻初始化
 *  运行: 调用实例方法
 *  销毁: 容器销毁的时候调用销毁
 *
 *  prototype:多例
 *  创建: 容器加载完毕第一次使用bean的时候创建...
 *  初始化:创建完就init
 *  运行:调用实例方法
 *  销毁: 以为多例模式的bean,Spring创建出来交给我们之后,Spring就不在管理整个bean了
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LifeBeanTest {

    @Autowired
    private ApplicationContext context;
//    @Autowired
//    private LifeBean lifeBean;
    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("容器创建.....");
        LifeBean lifeBean = context.getBean("lifeBean", LifeBean.class);
        lifeBean.sayHi();
    }
}
