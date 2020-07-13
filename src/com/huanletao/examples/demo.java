package com.huanletao.examples;

import com.huanletao.examples.utils.XmlUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 22:50
 * Description: dom4j 读取read/[创建写入]create，write xml 文件。
 */
public class demo {
    private static SAXReader reader = new SAXReader();
    public static void main(String[] args) throws DocumentException {
        String filePath = "com/huanletao/examples/demo.xml";

        dom4jReadXml(filePath);

    }

    private static void dom4jReadXml(String filePath) throws DocumentException {
        //读取文件流。
        Document doc = reader.read(demo.class.getClassLoader()
                .getResourceAsStream(filePath));
        //获取根节点。
        Element root = doc.getRootElement();

        //获取跟节点下所有节点元素。
        List<Element> elements = root.elements();


        // System.out.println(element);
        //第一种，获取在元素中的值。<a>你好</a>
        Element user = root.element("user");
        //获取user 元素下的name 元素。
        Element name = user.element("name");
        System.out.println("name = "+name.getText());

        Element age = user.element("age");
        System.out.println("age = "+age.getText());

        Element addr = user.element("addr");
        System.out.println("addr = "+addr.getText());

        System.out.println("=======================================");

        //第二种 写法 和读取方式 [推荐 常用] eg; <user name="赵云" age="24" addr="广州"></user>
        Element student = root.element("student");

        String name1 = student.attributeValue("name");
        String age1 = (String) student.attribute("age").getData();
        String addr1 = student.attributeValue("addr");
        System.out.println("name1 = " + name1);

        System.out.println("age1 = "+age1);
        System.out.println("addr1 =" +addr1);
    }
}
