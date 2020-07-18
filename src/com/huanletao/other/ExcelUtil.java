package com.huanletao.other;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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
    /**
     *    write data for excel
     * @param content data
     * @param n   row number of data
     * @param file file object
     * @return
     */
    public static int writeExcel(List<String> content, int n,File file) {
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
            return 0;
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

    /**
     *  read content of text file
     * @param file file object
     * @param i  row number of data
     * @param columnName column name of table
     * @return
     */
    public static List<String> readTxt(File file, int i,String columnName) {
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

    /**
     *   parser of string
     * @param s  string
     * @param cloumName parser of cloumn name
     * @return 返回解析后的字符串。
     */
    private static String parer(String s, String cloumName) {

        if (cloumName.equals("id")){
            String newStr = s.substring(0, s.indexOf(","));
            return newStr;
        }else if (cloumName.equals("no")){
            String substring = s.substring(s.indexOf(",")+1);
            String newStr = substring.substring(0, substring.indexOf(","));
            return newStr.trim();
        }else if (cloumName.equals("")){

        }

        return "";
    }

    public static class Builder{
        public ExcelUtil build(){
            return new ExcelUtil();
        }
    }

}
