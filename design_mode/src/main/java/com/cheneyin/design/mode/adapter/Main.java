package com.cheneyin.design.mode.adapter;

/**
 * @ClassName: Main
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-23
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner printBanner=new PrintBanner("Adapter mode");
        printBanner.printStrong();
        printBanner.printWeak();
    }
}
