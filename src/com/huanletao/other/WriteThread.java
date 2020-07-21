package com.huanletao.other;

import java.io.File;
import java.util.List;

import static com.huanletao.other.ExcelUtil.writeExcel;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/20
 * @Time: 10:01
 * Description:
 */
public class WriteThread implements Runnable {

    private List<String> content;
    private File write;
    private int column;

    public WriteThread(File write, int column) {
        this.write = write;
        this.column = column;
    }

    @Override
    public void run() {
        //写入excel。传入内容，指定第几列。
       // int success = writeExcel(content,column,write);
        System.out.println("写出内容完毕");
    }
}
