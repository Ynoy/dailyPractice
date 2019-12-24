package com.cheneyin.design.mode.template;

/**
 * @ClassName: StringDisplayTemplate
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-24
 */
public class StringDisplayTemplate extends AbstractDisplay {

    private String charString;

    public StringDisplayTemplate(String string) {
        this.charString = string;
    }

    @Override
    void open() {
        System.out.println("String Display open()");
    }

    @Override
    void print() {
        System.out.println(this.charString);
    }

    @Override
    void close() {
        System.out.println("String Display close()");
    }
}
