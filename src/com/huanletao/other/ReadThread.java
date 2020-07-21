package com.huanletao.other;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.huanletao.other.ExcelUtil.readTxt;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/20
 * @Time: 9:58
 * Description:
 */
public class ReadThread implements Runnable {

    private File read;
    private String columnName;
    public  List<String> content = new ArrayList<>();
    public int flag = 0;

    public ReadThread(File read,String columnName) {
        this.read = read;
        this.columnName = columnName;
    }

    @Override
    public void run() {
        content = readTxt(read,10000,columnName);
        System.out.println("content = " + content);
        System.out.println("content = " + content.size());
        System.out.println("读出完毕");
        flag = 1;
    }
}
