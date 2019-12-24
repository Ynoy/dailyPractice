package com.cheneyin.design.mode.adapter.object_style;

import com.cheneyin.design.mode.adapter.Banner;

/**
 * @ClassName: PrintBannerTwo
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-24
 */
public class PrintBannerTwo extends PrintTwo {

    private Banner banner;
    // 初始化类的时候获取到委派对象
    public PrintBannerTwo(String nameString) {
        this.banner = new Banner(nameString);
    }

    @Override
    public void printWeak() {
        /**
         * 通过委派形式实现适配器
         */
        banner.showWithParen();
    }
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
