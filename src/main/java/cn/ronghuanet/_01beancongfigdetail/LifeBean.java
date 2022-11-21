package cn.ronghuanet._01beancongfigdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LifeBean {

    public LifeBean(){
        System.out.println("被创建了................");
    }
    public void destroy(){
        System.out.println("destroy...........");
    }

    public void init(){
        System.out.println("init...........ing");
    }
    public void sayHi(){
        System.out.println("sayHi...............");
    }
}
