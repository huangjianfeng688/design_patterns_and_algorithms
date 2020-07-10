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

    static {
         reader = new SAXReader();

        Document doc = null;
        try {
            doc = reader.read(XmlUtil.class.getClassLoader().getResourceAsStream("com/huanletao/examples/Message.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
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


    public static List<Message> getMessages() {
        return messages;
    }
}


