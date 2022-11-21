package cn.ronghuanet._04proxy._02dynamicproxy.cglib;

import cn.ronghuanet._04proxy._02dynamicproxy.TxManager;
import cn.ronghuanet._04proxy._02dynamicproxy.User;
import cn.ronghuanet._04proxy._02dynamicproxy.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

public class CglibTest {
    @Test
    public void test(){

        // 创建真实对象
        UserServiceImpl realObject = new UserServiceImpl();
        // 事务对象
        TxManager txManager = new TxManager();
        // 创建一个增强器对象 Enhancer
        Enhancer enhancer = new Enhancer();
        // 吧真实类设置为代理类的父类
        enhancer.setSuperclass(realObject.getClass());
        // 设置回调方法 --  方法拦截器的方式
        enhancer.setCallback(new MethodInterceptor() {
            // 这个intercept方法里面就是 代理对象要做的事情
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                try {
                    txManager.begin();
                    result = method.invoke(realObject, objects);
                    txManager.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    txManager.rollback();
                }finally {
                    txManager.close();
                }
                return result;
            }
        });

        // 通过增强器对象帮我们创建一个 代理类
        UserServiceImpl proxy = (UserServiceImpl)enhancer.create();
        proxy.save(new User(6L, "aa"));
    }
}
