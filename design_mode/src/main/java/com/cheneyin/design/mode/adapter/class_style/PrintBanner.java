package com.cheneyin.design.mode.adapter.class_style;

import com.cheneyin.design.mode.adapter.Banner;

/**
 * ①.类适配器的实现方式
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