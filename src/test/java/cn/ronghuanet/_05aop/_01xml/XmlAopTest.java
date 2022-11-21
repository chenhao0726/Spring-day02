package cn.ronghuanet._05aop._01xml;

import cn.ronghuanet.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class XmlAopTest extends BaseTest {

    // 获取bean
    @Autowired
    private IUserService userService;

    @Test
    public void test() {
        userService.save();
        userService.delete();
    }
}
