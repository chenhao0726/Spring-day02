package cn.ronghuanet._04proxy._01static;

public class ProxyTest {
    public static void main(String[] args) {
        // 创建真实对象
        UserServiceImpl userService = new UserServiceImpl();
//        userService.save(new User(1L,"张三"));
        // 创建代理对象  并把真实对象放进去
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);//

        userServiceProxy.save(new User(1L,"张三"));
    }
}
