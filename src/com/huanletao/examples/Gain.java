package com.huanletao.examples;

import com.huanletao.examples.message.IMessageContainer;
import com.huanletao.examples.pojo.Message;
import com.huanletao.examples.utils.XmlUtil;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/10
 * @Time: 16:18
 * Description:
 */
public class Gain{

    private static Map<String,IMessageContainer> containerMap = new HashMap<>();

    static {
        List<Message> messages = XmlUtil.getMessages();
        for (Message message : messages) {
            String zlass = message.getZlass();
            zlass="com.huanletao.examples.message."+zlass;
            IMessageContainer iMessageContainer = null;
            try {
                Class<?> aClass = Gain.class.getClassLoader().loadClass(zlass);
                Constructor constructor = aClass.getDeclaredConstructor();
                constructor.setAccessible(true);
                iMessageContainer = (IMessageContainer)constructor.newInstance();

            } catch (Exception e) {
                e.printStackTrace();
            }
            containerMap.put(message.getKey(),iMessageContainer);
        }

    }

    public Map getMessage(String key,Map message){
        IMessageContainer messageContainer = containerMap.get(key);
        messageContainer.save(message);
        return message;
    }
}
