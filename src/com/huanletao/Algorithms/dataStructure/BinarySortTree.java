package com.huanletao.Algorithms.dataStructure;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/11
 * @Time: 13:04
 * Description: 二叉搜索树、二叉排序树。
 */
public class BinarySortTree {
    /**
     * 节点。
     */
    class Node {
        private Integer data;
        private Node left;
        private Node right;

        public Node(Integer value){
            this.data = value;
        }

        //一个add 的方法
        public void add(Node node){
            if (node == null){
                return;
            }else if (node.data > this.data){
                putdata(node,this.right);
            }else{
                putdata(node,left);
            }

        }

        private void putdata(Node node,Node fang) {
            if (fang == null){
                fang = node;
            }else{
                fang.add(node);
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}

