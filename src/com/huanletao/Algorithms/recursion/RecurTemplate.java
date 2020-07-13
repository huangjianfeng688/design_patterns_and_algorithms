package com.huanletao.Algorithms.recursion;

/**
 * Created with IntelliJ IDEA.
 *
 * @auther: huangjianfeng
 * @Date: 2020/7/11
 * @Time: 18:08  递归代码模板。
 * Description: 思维方法：找最近重复子问题、数学归纳方法。
 */
public class RecurTemplate {

    private static final int MAX_LEVEL = 1;

    //方法模板
    public void recur(int level,int param){
        //递归终结条件。
        if (level > MAX_LEVEL){
            return;
        }
        //处理当前层
        process(level,param);

        //下探到下一层。
        recur(level,param);

        //清理当前层。

    }

    private void process(int level, int param) {

    }
}
