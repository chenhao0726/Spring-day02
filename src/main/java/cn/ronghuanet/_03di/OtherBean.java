package cn.ronghuanet._03di;

public class OtherBean {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "OtherBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public OtherBean() {
    }

    public OtherBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
