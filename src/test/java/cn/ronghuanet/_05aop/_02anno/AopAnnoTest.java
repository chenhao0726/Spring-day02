package cn.ronghuanet._05aop._02anno;

import cn.ronghuanet.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AopAnnoTest extends BaseTest {

    @Autowired
    private IStudentService studentService;

    @Test
    public void test() {
        studentService.save();
        studentService.delete();
    }

}
