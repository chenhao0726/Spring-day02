package cn.ronghuanet._04proxy._01static;

public class UserServiceProxy implements IUserService{

    private IUserService userService;

    // 创建代理对象的时候 需要把真实对象传进来
    public UserServiceProxy(IUserService userService){
        this.userService = userService;
    }
    @Override
    public void save(User user) {
        TxManager txManager = new TxManager();
        try {
            // 开启事务
            txManager.begin();
            // 保存..
            userService.save(user);
            // 提交事务
            txManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // 回滚事务
            txManager.rollback();
        }finally {
            // 关闭事务
            txManager.close();
        }

    }
}
