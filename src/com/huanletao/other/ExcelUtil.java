package com.huanletao.other;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 15:59
 * Description: 将生成的txt 文件内容写入到excel中。
 */
public class ExcelUtil {
    public static void main(String[] args) {
        File read = new File("D:famerCardId.txt");

        File write = new File("D:demo.xlsx");
        //将数据读出来，指定多少条数据。
        List<String> content = readTxt(read,10000,"no");

        //写入excel。传入内容，指定第几列。
        int success = writeExcel(content,2,write);

        if (success != 0) System.out.println("数据写入成功");
    }

    //将数据写入excel。
    private static int writeExcel(List<String> content, int n,File file) {
        FileInputStream in = null;
        Workbook Newworkbook = null;
        OutputStream out = null;
        // 创建一个工作簿
        try {
           in = new FileInputStream(file);
            Newworkbook = new XSSFWorkbook(in);
            Sheet sheet = Newworkbook.getSheetAt(0);
            for (int row = 1; row < content.size(); row++) {
                Row sheetRow = sheet.createRow(row);
                Cell cell = sheetRow.createCell(n-1);
                cell.setCellValue(content.get(row));
            }
            out = new FileOutputStream(file);
            Newworkbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
                Newworkbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return 1;
    }

    //将famerCardId.txt 文件中部分数据读出来。
    private static List<String> readTxt(File file, int i,String columnName) {
        List<String> content = new ArrayList<>();
        Reader reader = null;
        BufferedReader breader = null;
        try {
            reader = new FileReader(file);

             breader= new BufferedReader(reader);

            for (int j = 0; j < i; j++) {
                String line = breader.readLine();
                String newstr = parer(line,columnName);
                content.add(newstr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                breader.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return content;
    }

    //解析字符串。
    private static String parer(String s, String cloumName) {

        if (cloumName.equals("id")){
            String newStr = s.substring(0, s.indexOf(","));
            return newStr;
        }else if (cloumName.equals("no")){
            String substring = s.substring(s.indexOf(",")+1);
            String newStr = substring.substring(0, substring.indexOf(","));
            return newStr.trim();
        }

        return "";
    }
}
