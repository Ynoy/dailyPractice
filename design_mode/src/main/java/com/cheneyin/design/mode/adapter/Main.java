package com.cheneyin.design.mode.adapter;

import com.cheneyin.design.mode.adapter.class_style.Print;
import com.cheneyin.design.mode.adapter.class_style.PrintBanner;
import com.cheneyin.design.mode.adapter.object_style.PrintBannerTwo;
import com.cheneyin.design.mode.adapter.object_style.PrintTwo;

/**
 * @ClassName: Main
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-23
 */
public class Main {
    public static void main(String[] args) {
        // 继承方式实现适配器
        Print printBanner=new PrintBanner("Adapter Class");
        printBanner.printStrong();
        printBanner.printWeak();
        // 委派方式实现适配器
        PrintTwo printTwo=new PrintBannerTwo("Adapter Object");
        printTwo.printStrong();
        printTwo.printWeak();
    }
}
