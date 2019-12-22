package com.cheneyin.design_mode.iterator;

import java.util.*;

/**
 * 遍历集合接口
 */
public interface Iterator {

    /**
     * 判断是否存在下一个元素
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素
     */
    public abstract Object next();

}