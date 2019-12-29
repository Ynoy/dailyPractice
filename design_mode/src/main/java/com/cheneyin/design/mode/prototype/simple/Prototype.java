package com.cheneyin.design.mode.prototype.simple;

/**
 * @ClassName: Prototype
 * @Description: Prototype模式(简单形式)
 * @Author: CheneyIn
 * @Date: 2019-12-28
 */
public interface Prototype extends Cloneable {
    Object clone();
}
