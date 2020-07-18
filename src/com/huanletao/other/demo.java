package com.huanletao.other;

import java.io.File;
import java.util.List;
import com.huanletao.other.*;

import static com.huanletao.other.ExcelUtil.readTxt;
import static com.huanletao.other.ExcelUtil.writeExcel;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 16:31
 * Description:
 */
public class demo {
    public static void main(String[] args) {

        File read = new File("D:famerCardId.txt");
        File write = new File("D:demo.xlsx");


        //将数据读出来，指定多少条数据。
            List<String> content = readTxt(read,10000,"no");

            //写入excel。传入内容，指定第几列。
            int success = writeExcel(content,2,write);

            if (success != 0) System.out.println("数据写入成功");

    }

    private static void testSubstring() {
        String s = "103,614586376564795,测试银行,212312312312,1,1,103,1";

        String substring = s.substring(s.indexOf(",")+1);

        String substring1 = substring.substring(0,substring.indexOf(","));

        System.out.println(substring1);

        System.out.println(substring);
        System.out.println(s);
    }
}
