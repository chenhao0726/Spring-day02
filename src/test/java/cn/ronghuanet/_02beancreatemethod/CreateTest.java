package cn.ronghuanet._02beancreatemethod;

import cn.ronghuanet.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateTest extends BaseTest {

//    @Autowired
//    private Car car;

//    @Autowired
//    private Phone phone;

    @Autowired
    private Food food;
    @Test
    public void test(){
//        System.out.println(car);
//        System.out.println(phone);
        System.out.println(food);
    }
}
