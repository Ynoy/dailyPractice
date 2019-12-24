package com.cheneyin.design.mode.template;

/**
 * @ClassName: Main
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-24
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplayTemplate('a');
        charDisplay.display();
        AbstractDisplay stringDisplay=new StringDisplayTemplate("String");
        stringDisplay.display();
    }
}
