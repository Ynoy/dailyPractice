package com.cheneyin.design.mode.template;

/**
 * @ClassName: CharDisplayTemplate
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-24
 */
public class CharDisplayTemplate extends AbstractDisplay {

    private char aChar;

    public CharDisplayTemplate(char a) {
        this.aChar = a;
    }

    @Override
    void open() {
        System.out.println("Char Display open()");
    }

    @Override
    void print() {
        System.out.println("Char Display print():" + this.aChar);
    }

    @Override
    void close() {
        System.out.println("Char Display close()");
    }
}
