package com.cheneyin.design.mode.prototype.registration;

/**
 * @ClassName: Prototype
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-29
 */
public interface Prototype {
    Object clone();
    String getName();
    void setName(String name);
}
