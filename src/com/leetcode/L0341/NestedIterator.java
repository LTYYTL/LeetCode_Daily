package com.leetcode.L0341;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 341. 扁平化嵌套列表迭代器
 * 给你一个嵌套的整数列表 nestedList 。每个元素要么是一个整数，要么是一个列表；该列表的元素也可能是整数或者是其他列表。
 * 请你实现一个迭代器将其扁平化，使之能够遍历这个列表中的所有整数。
 *
 * 实现扁平迭代器类 NestedIterator ：
 * (1)NestedIterator(List<NestedInteger> nestedList) 用嵌套列表 nestedList 初始化迭代器。
 * (2)int next() 返回嵌套列表的下一个整数。
 * (3)boolean hasNext() 如果仍然存在待迭代的整数，返回 true ；否则，返回 false 。
 * 你的代码将会用下述伪代码检测：
 *
 * initialize iterator with nestedList
 * res = []
 * while iterator.hasNext()
 *     append iterator.next() to the end of res
 * return res
 * 如果 res 与预期的扁平化列表匹配，那么你的代码将会被判为正确。
 *
 * 示例 1：
 * 输入：nestedList = [[1,1],2,[1,1]]
 * 输出：[1,1,2,1,1]
 * 解释：通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,1,2,1,1]。
 *
 * 示例 2：
 * 输入：nestedList = [1,[4,[6]]]
 * 输出：[1,4,6]
 * 解释：通过重复调用 next 直到 hasNext 返回 false，next 返回的元素的顺序应该是: [1,4,6]。
 *
 * 提示：
 * 1 <= nestedList.length <= 500
 * 嵌套列表中的整数值在范围 [-106, 106] 内
 */
public class NestedIterator implements Iterator<Integer> {

    Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedIntegers) {
        //存放打平的结果
        List<Integer> res = new ArrayList<>();
        for (NestedInteger node : nestedIntegers) {
            //以每个节点为根
            traverse(node,res);
        }
        //将结果变成迭代器
        this.it = res.iterator();
    }

    //遍历以root为根的多叉树，将叶子节点加入结果集
    private void traverse(NestedInteger root, List<Integer> res) {
        //根节点为数字
        if (root.isInteger()){
            //到达跟节点
            res.add(root.getInteger());
            return;
        }
        //遍历孩子
        for (NestedInteger node : root.getList()) {
            traverse(node,res);
        }
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Integer next() {
        return it.next();
    }


}

class NestedInteger{
    private Integer val;
    private List<NestedInteger> list;

    public boolean isInteger(){
        return val != null;
    }

    public Integer getInteger(){
        return this.val;
    }

    public List<NestedInteger> getList(){
        return this.list;
    }
}



