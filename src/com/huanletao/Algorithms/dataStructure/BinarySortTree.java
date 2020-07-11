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

                if (this.right == null){
                    this.right = node;
                }else{
                    this.right.add(node);
                }

            }else{
                if (this.left == null){
                    this.left = node;
                }else{
                    this.left.add(node);
                }
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

