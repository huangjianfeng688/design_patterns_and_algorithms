package com.huanletao.desiginPattern;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/9
 * @Time: 13:13
 * Description: 设计模式 之 组合设计模式，应用场景是树状结构的数据类型。
 *
 */
public abstract class Node {

    public Node() {
    }

    public abstract void  add(Node node);
    public abstract void  remove(Node node);
}

class Noder extends Node{

    private List<Node> nodeList;
    private String leafName;

    public Noder(String leafName, List<Node> nodeList) {
       this.leafName = leafName;
        this.nodeList = nodeList;
    }

    public Noder() {

    }

    @Override
    public void add(Node node) {
        nodeList.add(node);
    }

    @Override
    public void remove(Node node) {
        nodeList.remove(node);
    }
}