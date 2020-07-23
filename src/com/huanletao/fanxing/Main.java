package com.huanletao.fanxing;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/23
 * @Time: 10:59
 * Description:
 */
public class Main {
    public static void main(String[] args) {

        SearchTree root  = new SearchTree(10);
        SearchTree right55 = new SearchTree(15);


        root.add(7);
        root.add(5);
        root.add(6);
        root.add(18);
        root.add(11);
        root.add(15);

        //递归输出二叉树，左序遍历输出，从小到大。
        System.out.println("先序遍历二叉树：");
        root.letfPrint(root);

        System.out.println("\n中序遍历二叉树:");
        root.centerPrint(root);

        System.out.println();
        //递归输出二叉树，后序遍历输出，从大到小。
        System.out.println("后序遍历二叉树：");
        root.rightPrint(root);

        //System.out.println(SearchTree.findData(root, right55));

    }
}
