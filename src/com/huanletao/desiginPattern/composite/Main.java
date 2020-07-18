package com.huanletao.desiginPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/18
 * @Time: 23:01
 * Description: 设计模式之组合设计模式。 一般用于树状结构。
 */
public class Main {
    public static void main(String[] args) {

        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");

        Node c11 = new LeafNode("c11");
        Node c22 = new LeafNode("c22");

        BranchNode b21 = new BranchNode("b21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(c11);
        chapter1.add(c22);

        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);


        tree(root,0);

    }

    //递归打印树。
    public static void tree(Node p,int deept){
        for (int i = 0; i < deept; i++) {
            System.out.print("--");
        }
        p.print();

        if (p instanceof BranchNode){
            for (Node n:((BranchNode) p).getNodes()){
                tree(n,deept+1);
            }
        }
    }
}

abstract class Node{
    abstract public void print();
}

//左节点。
class LeafNode extends Node{

    private String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}

//分支节点，
class BranchNode extends Node{

    //分支节点里面 可以有叶子节点，或者子节点。
    private List<Node> nodes = new ArrayList<>();
    private String name;

    public BranchNode(String name) {
        this.name = name;
    }

    public void add(Node node){
        nodes.add(node);
    }

    public void remove(Node node){
        nodes.remove(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
