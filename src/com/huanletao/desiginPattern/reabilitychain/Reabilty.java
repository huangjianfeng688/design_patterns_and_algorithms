package com.huanletao.desiginPattern.reabilitychain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/6/13
 * @Time: 12:53
 * Description: 设计模式之责任链模式。
 */
public class Reabilty {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("你好，<script>欢迎来到 www.baidu.com ,大家都是996");
        System.out.println(msg.getMsg());

        FilterChain cf = new FilterChain();

        cf.add(new HTMLFilter());
        cf.add(new SentisveFilter());

        FilterChain chainFilter = new FilterChain();

        chainFilter.add(new UsFilter());
        chainFilter.add(new UrlFilter());
        chainFilter.add(new ScriptFilter());

        cf.add(chainFilter);

        cf.doFilter(msg);

        System.out.println(msg.getMsg());

    }

}

class Msg{
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

interface Filter{

    boolean doFilter(Msg msg);
}

class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        //去掉html
        String r = msg.getMsg();
        r = r.replace("<", "[");
        r = r.replace(">","]");

        msg.setMsg(r);
        return true;
    }
}

class SentisveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {

        //过滤敏感词。
        String r = msg.getMsg();

        r = r.replace("996","955");

        msg.setMsg(r);
        return true;

    }
}

class UsFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replace("你","大家");

        msg.setMsg(msg1);
        return true;
    }
}

class UrlFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
         msg1 = msg1.replace("www.baidu.com", "www.huanletao.com");
         msg.setMsg(msg1);
         return true;
    }
}


class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public void add(Filter filter){
        filters.add(filter);
    }

    @Override
    public boolean doFilter(Msg msg){
        for (Filter filter:filters) {
            if(!filter.doFilter(msg)) return false;
        }
        return true;
    }
}

class ScriptFilter implements Filter{

    @Override
    public boolean doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replace("script","java");
        msg.setMsg(msg1);
        return true;
    }
}