package com.huanletao.other;

import java.io.*;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/17
 * @Time: 17:38
 * Description:
 */
public class demo6 {

    public static void main(String[] args) throws IOException {

        File file = new File("D:/famerCardId.txt");

        int start = 102;
        Writer wrie = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(wrie);

        writer.write("id,no,bank_name,bank_code,status,is_main,farmer_id,is_card");
        writer.newLine();
        for(int i=0;i<=350000;i++) {
            StringBuilder stringid = random16();
            start++;
            writer.write(start+","+stringid+",测试银行,"+"212312312312,1"+",1,"+start+",1");
            writer.newLine();
            writer.flush();
        }
        writer.close();
        wrie.close();
        System.out.println("数据生成成功！");
    }

    public static StringBuilder random16() {
        StringBuilder s = new StringBuilder();
        Random random = new Random();
        Integer ints;
        for (int i = 0; i < 4 ; i++) {
            ints = (random.nextInt(10000)+100000)%10000;

            s.append(ints.toString());
        }
        return s;
    }

}
