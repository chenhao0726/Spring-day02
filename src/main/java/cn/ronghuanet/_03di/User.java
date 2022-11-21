package cn.ronghuanet._03di;

import java.math.BigDecimal;
import java.util.*;

public class User {
    // 简单属性
    private Long id;
    private String name;
    private Boolean sex;
    private BigDecimal salary;
    // 对象属性
    private List<OtherBean> otherBeanList;
    private List<String> list;
    private Set<String> set;
    private Set<OtherBean> otherBeanSet;
    private String[] arrays;
    //下面这个是重点
    private Properties props1;
    private Properties props2;
    private Map<String,String> maps;

    public User(Long id, String name, Boolean sex, BigDecimal salary, List<OtherBean> otherBeanList, Set<String> set, Set<OtherBean> otherBeanSet, Properties props1, Properties props2, String[] arrays, List<String> list, Map<String, String> maps) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.otherBeanList = otherBeanList;
        this.set = set;
        this.otherBeanSet = otherBeanSet;
        this.props1 = props1;
        this.props2 = props2;
        this.arrays = arrays;
        this.list = list;
        this.maps = maps;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<OtherBean> getOtherBeanList() {
        return otherBeanList;
    }

    public void setOtherBeanList(List<OtherBean> otherBeanList) {
        this.otherBeanList = otherBeanList;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Set<OtherBean> getOtherBeanSet() {
        return otherBeanSet;
    }

    public void setOtherBeanSet(Set<OtherBean> otherBeanSet) {
        this.otherBeanSet = otherBeanSet;
    }

    public Properties getProps1() {
        return props1;
    }

    public void setProps1(Properties props1) {
        this.props1 = props1;
    }

    public Properties getProps2() {
        return props2;
    }

    public void setProps2(Properties props2) {
        this.props2 = props2;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }
}
