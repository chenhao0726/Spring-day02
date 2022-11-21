package cn.ronghuanet._05aop._02anno;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
    @Override
    public void save() {
        System.out.println("保存学生信息");
    }

    @Override
    public void delete() {
        System.out.println("删除学生信息");
    }
}
