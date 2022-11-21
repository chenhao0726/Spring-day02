package cn.ronghuanet._02beancreatemethod;

import org.springframework.beans.factory.FactoryBean;

public class FoodFactory implements FactoryBean<Food> {
    @Override
    public Food getObject() throws Exception {
        return new Food();
    }

    @Override
    public Class<?> getObjectType() {
        return Food.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
