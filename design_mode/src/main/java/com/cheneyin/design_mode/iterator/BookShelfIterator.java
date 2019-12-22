package com.cheneyin.design_mode.iterator;

import java.util.*;

/**
 * 遍历书架的类
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext(){
        if (index<bookShelf.getLength()){
            return true;
        }
        return false;
    }

    public Object next() {
        Book book=bookShelf.getBookAt(index);
        index++;
        return book;
    }

}