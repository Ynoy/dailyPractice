package com.cheneyin.design.mode.adapter;

/**
 * 
 */
public class PrintBanner extends Banner implements Print {

    /**
     * Default constructor
     */
    public PrintBanner(String nameString) {
        super(nameString);
    }

    /* */
    @Override
    public void printWeak() {
        showWithParen();
    }

    /* */
    @Override
    public void printStrong() {
        showWithAster();
    }

}