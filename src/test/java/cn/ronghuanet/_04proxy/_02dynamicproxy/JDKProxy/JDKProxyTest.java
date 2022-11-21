package cn.ronghuanet._04proxy._02dynamicproxy.JDKProxy;

import cn.ronghuanet._04proxy._02dynamicproxy.IUserService;
import cn.ronghuanet._04proxy._02dynamicproxy.TxManager;
import cn.ronghuanet._04proxy._02dynamicproxy.User;
import cn.ronghuanet._04proxy._02dynamicproxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        // 创建 真实对象
        IUserService realObject = new UserServiceImpl();
        // 事务管理器
        TxManager txManager = new TxManager();

        // 通过jdk的proxy对象帮我创建代理对象
        IUserService proxyInstance = (IUserService)Proxy.newProxyInstance(IUserService.class.getClassLoader(),
                realObject.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        try {
                            txManager.begin();
                            // 使用反射 是执行的方法
                            method.invoke(realObject, args);
                            txManager.commit();
                        } catch (Exception e) {
                            e.printStackTrace();
                            txManager.rollback();
                        } finally {
                            txManager.close();
                        }
                        return null;
                    }
                }
        );


        proxyInstance.save(new User(3L,"cc"));
    }
}
