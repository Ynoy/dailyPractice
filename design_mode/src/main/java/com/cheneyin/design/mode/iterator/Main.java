package com.cheneyin.design.mode.iterator;

/**
 * @ClassName: Main
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-23
 */
public class Main {
    public static void main(String[] args) {
        /* 先初始化来一个存放书的书架 */
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("firstOneBook"));
        bookShelf.appendBook(new Book("firstTwoBook"));
        bookShelf.appendBook(new Book("firstThreeBook"));
        bookShelf.appendBook(new Book("firstFourBook"));
        /* 通过Iterator拿到遍历书架的实例 */
        Iterator iterator = bookShelf.iterator();
        /* 没有下一个元素就停止遍历 */
        while (iterator.hasNext()) {
            /* 通过next()方法拿出下一本书 */
            System.out.println(((Book) iterator.next()).getName());
        }
    }

}
