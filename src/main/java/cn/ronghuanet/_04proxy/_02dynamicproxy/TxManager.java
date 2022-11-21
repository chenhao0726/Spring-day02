package cn.ronghuanet._04proxy._02dynamicproxy;

public class TxManager {
    public void begin(){
        System.out.println("开始事务............");
    }
    public void commit(){
        System.out.println("提交事务............");
    }
    public void rollback(){
        System.out.println("回滚事务............");
    }
    public  void close(){
        System.out.println("关闭事务............");
    }
}
