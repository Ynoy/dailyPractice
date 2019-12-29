package com.cheneyin.design.mode.prototype.registration;

/**
 * @ClassName: ConcretePrototype
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-29
 */
public class ConcretePrototype implements Prototype {
    private String name;

    @Override
    public Object clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName(this.name);
        return concretePrototype;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
