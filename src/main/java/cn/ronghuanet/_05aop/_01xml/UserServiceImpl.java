package cn.ronghuanet._05aop._01xml;

public class UserServiceImpl implements IUserService {
    @Override
    public void save() {
        System.out.println("保存用户:");
    }

    @Override
    public void delete() {
        System.out.println("删除用户...");
    }


}

