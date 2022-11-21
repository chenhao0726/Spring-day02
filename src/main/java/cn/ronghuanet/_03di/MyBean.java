package cn.ronghuanet._03di;

public class MyBean {
    private String name;
    private Integer age;
    private Integer gender;
    private OtherBean otherBean;

    public MyBean() {
    }

    public MyBean(String name, Integer age, Integer gender, OtherBean otherBean) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherBean = otherBean;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", otherBean=" + otherBean +
                '}';
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public MyBean(String name, Integer age, Integer gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
