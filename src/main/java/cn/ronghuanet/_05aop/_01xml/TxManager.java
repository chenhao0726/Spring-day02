package cn.ronghuanet._05aop._01xml;

import org.aspectj.lang.ProceedingJoinPoint;

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

    public Object around(ProceedingJoinPoint joinPoint){
        //System.out.println(joinPoint.getTarget());
        //调用的类
        //System.out.println(Arrays.asList(joinPoint.getArgs()));
        //参递的参数
        //System.out.println(joinPoint.getSignature());
        //方法签名
        Object object = null;
        try {
            begin();
            object = joinPoint.proceed();
            //执行相应的代码
            commit();
        } catch (Throwable e) {
            rollback();
        }finally{
            close();
        }
        return object;
    }
}
