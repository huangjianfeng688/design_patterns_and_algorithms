package com.huanletao.examples.utils;

import com.huanletao.examples.pojo.Message;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 16:23
 * Description: 读取xml 配置文件。
 * 将添加的key和class 名字配置到xml 中，进增的class放到message中。
 */
public class XmlUtil {

    private static SAXReader reader;
    private static List<Message> messages = new ArrayList<>();

    public static List<Message> dom4jLoadXml(String filePath) throws DocumentException {
        reader = new SAXReader();
        Document doc = reader.read(XmlUtil.class.
                getClassLoader().getResourceAsStream(filePath));

        dom4jReadXml(doc,null);
        return messages;
    }

    private static void dom4jReadXml(Document doc,Integer type) {

        if (type != null && type == 1) {
            //3.获取根元素
            Element root = doc.getRootElement();
            List<Element> elements = root.elements();
            for (Element element : elements) {
                Message message = new Message();
                message.setKey(element.elementText("key"));
                message.setZlass(element.elementText("class"));
                messages.add(message);
            }
        }

        dom4jReadXml(doc);

    }

    private static void dom4jReadXml(Document doc) {
        //3.获取根元素
        Element root = doc.getRootElement();
        List<Element> elements = root.elements();
        for (Element element : elements) {
            Message message = new Message();
            String key = element.attributeValue("key");
            String aClass = element.attributeValue("class");
            message.setKey(key);
            message.setZlass(aClass);
            messages.add(message);
        }

    }
}


