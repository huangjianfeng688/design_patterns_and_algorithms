package com.huanletao.examples;

import com.huanletao.examples.pojo.Message;
import com.huanletao.examples.utils.XmlUtil;
import org.dom4j.DocumentException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 16:18
 * Description: 根据读取配置文件，生成任意的对象。(工厂模式。)
 */
public class GerenateObject<T> {

    private Map<String, T> objectMap = new HashMap<>();

    private static final String filePath = "com/huanletao/examples/object.xml";

    public GerenateObject(){
        try {
            read();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void read() throws DocumentException {
        List<Message> messages = XmlUtil.dom4jLoadXml(filePath);
        for (Message message : messages) {
            String zlass = message.getZlass();
            zlass = "com.huanletao.examples.message." + zlass;
            T iMessageContainer = null;
            try {
                Class<?> aClass = GerenateObject.class.getClassLoader().loadClass(zlass);
                Constructor constructor = aClass.getDeclaredConstructor();
                constructor.setAccessible(true);

                Field[] fields = aClass.getDeclaredFields();
                for (Field field : fields) {
                    String name = field.getName();
                    System.out.println("name = " + name);
                }


                iMessageContainer = (T) constructor.newInstance();

            } catch (Exception e) {
                e.printStackTrace();
            }
            objectMap.put(message.getKey(), iMessageContainer);
        }
    }


    public T getObject(String key){
        return objectMap.get(key);
    }
}
