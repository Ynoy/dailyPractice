package com.cheneyin.design.mode.adapter;

/**
 * 
 */
public class Banner {
    private String nameString;
    /**
     * Default constructor
     */
    public Banner(String nameString) {
        this.nameString=nameString;
    }

    /**
     * 
     */
    public void showWithParen() {
        System.out.println("("+nameString+")");
    }

    /**
     * 
     */
    public void showWithAster() {
        System.out.println("*"+nameString+"*");
    }

}