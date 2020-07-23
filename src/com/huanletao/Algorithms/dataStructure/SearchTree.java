package com.huanletao.Algorithms.dataStructure;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/23
 * @Time: 11:03
 * Description: 传树要求树的数目不变 传数字能用while来改变二叉树的大小
 */
public class SearchTree {

    private Integer data; //当前节点的数据。
    private SearchTree left; //左节点。
    private SearchTree right; //右节点。

    public void setData(Integer data) {
        this.data = data;
    }

    public SearchTree(Integer data) {
        this.data = data;
    }

    public SearchTree(Integer data, SearchTree left, SearchTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * add 方法逻辑。如果添加的节点数值 大于当前节点，
     * 同时，右子树为空的时，将它接入右子树
     * 如果右子树不为空，递归。
     * @param data
     */
    public void add(Integer data){
        SearchTree tree = new SearchTree(data);
      if (tree.data > this.data){
         if (this.right == null)this.right = tree;
          right.add(data);
      }
      if (tree.data < this.data){
          if (this.left == null) this.left = tree;
          left.add(data);
      }
    }

    /**
     *   移除的逻辑 左旋的思想，当一个节点被删除时，
     *   把它的左子树的根节点指向这个节点的父节点。
     *   1.先找到要删除的节点位置，
     *   2.做以上的逻辑实现。
     * @param tree
     */
    public static void remove(SearchTree tree, SearchTree findTree){
        if (tree.data.compareTo(findTree.data) == 0) {


            

        } else if (tree.data > findTree.data) {
            if (tree.left == null) {

            } else {
               remove(tree.left, findTree);
            }
        } else if (tree.data < findTree.data) {
            if (tree.right == null) {

            } else {
               remove(tree.right, findTree);
            }
        }


    }

    /**
     * 查找数据。
     * @param tree
     * @param findTree
     * @return
     */
    private static int findData(SearchTree tree, SearchTree findTree) {

        if (tree.data.compareTo(findTree.data) == 0) {
            return 1;
        } else if (tree.data > findTree.data) {
            if (tree.left == null) {
                return -1;
            } else {
                return findData(tree.left, findTree);
            }
        } else if (tree.data < findTree.data) {
            if (tree.right == null) {
                return -1;
            } else {
                return findData(tree.right, findTree);
            }
        }
        return 0;
    }


    //先序遍历   --右序遍历时，换过来即可。
    public void letfPrint(SearchTree tree){
        if (tree != null){
            letfPrint(tree.left);
            System.out.print(tree.data + "\t");
            letfPrint(tree.right);
        }
    }

    //中序遍历。
    public void centerPrint(SearchTree tree){
        if (tree != null){
            this.centerPrint(tree.left);
            System.out.print(tree.data + "-");
            this.centerPrint(tree.right);
        }
    }

    //右序遍历 二叉树
    public void rightPrint(SearchTree tree){
        if (tree != null){
            rightPrint(tree.right);
            System.out.print(tree.data + "\t");
            rightPrint(tree.left);
        }
    }

    //findMax
    public void findMax(SearchTree tree){
        if (tree != null){
            if (tree.right != null){
                findMax(tree.right);
            }else{
                System.out.println(tree.data);
            }

        }
    }


    //findMin
    public void findMin(SearchTree tree){
        if (tree!= null){
            if (tree.left != null){
                findMin(tree.left);
            }else{
                System.out.println(tree.data);
            }
        }
    }
}
