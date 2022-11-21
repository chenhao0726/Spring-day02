package cn.ronghuanet._04proxy._01static;

public class UserServiceImpl implements  IUserService{
    @Override
    public void save(User user) {
        System.out.println("保存用户:" + user);
    }
}
