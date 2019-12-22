package com.cheneyin.design_mode.iterator;

import java.util.*;

/**
 * 表示书的类
 */
public class Book {

    private String name;

    /**
     * Default constructor
     */
    public Book(String name) {
        this.name=name;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

}