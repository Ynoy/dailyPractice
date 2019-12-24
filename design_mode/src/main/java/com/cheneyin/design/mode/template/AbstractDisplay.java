package com.cheneyin.design.mode.template;

/**
 * @ClassName: AbstractDisplay
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-24
 */
public abstract class AbstractDisplay {
    public void display() {
        open();
        print();
        close();
    }

    abstract void open();

    abstract void print();

    abstract void close();
}
