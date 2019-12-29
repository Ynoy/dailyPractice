package com.cheneyin.design.mode.prototype.simple;

/**
 * @ClassName: ConcretePrototype
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-29
 */
public class ConcretePrototype implements Prototype {
    public ConcretePrototype(){
        System.out.println("Prototype Design Patterns");
    }
    @Override
    public Object clone() {
        ConcretePrototype concretePrototype=null;
        try {
            concretePrototype=(ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return concretePrototype;
    }
}
