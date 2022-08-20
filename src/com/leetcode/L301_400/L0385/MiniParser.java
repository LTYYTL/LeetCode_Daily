package com.leetcode.L301_400.L0385;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 385. 迷你语法分析器
 * 给定一个字符串 s 表示一个整数嵌套列表，实现一个解析它的语法分析器并返回解析的结果 NestedInteger 。
 * 列表中的每个元素只可能是整数或整数嵌套列表
 *
 * 示例 1：
 * 输入：s = "324",
 * 输出：324
 * 解释：你应该返回一个 NestedInteger 对象，其中只包含整数值 324。
 *
 * 示例 2：
 * 输入：s = "[123,[456,[789]]]",
 * 输出：[123,[456,[789]]]
 * 解释：返回一个 NestedInteger 对象包含一个有两个元素的嵌套列表：
 * 1. 一个 integer 包含值 123
 * 2. 一个包含两个元素的嵌套列表：
 *     i.  一个 integer 包含值 456
 *     ii. 一个包含一个元素的嵌套列表
 *          a. 一个 integer 包含值 789
 *
 * 提示：
 * 1 <= s.length <= 5 * 104
 * s 由数字、方括号 "[]"、负号 '-' 、逗号 ','组成
 * 用例保证 s 是可解析的 NestedInteger
 * 输入中的所有值的范围是 [-106, 106]
 */
public class MiniParser {
    /**
     * 方法：栈
     * @param s
     * @return
     */
    public NestedInteger deserialize(String s) {
        //只有一个数的情况
        if (s.charAt(0) != '[')
            return new NestedInteger(Integer.parseInt(s));
        //栈
        Deque<NestedInteger> stack = new LinkedList<>();

        //计算数字
        int num = 0;
        //记录是否是负数
        boolean negative = false;
        //遍历
        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //负数情况
            if (c == '-') {
                negative = true;
            }else if (Character.isDigit(c)){//数字情况
                num = num * 10 + c -'0';
            }else if (c == '['){//是一个嵌套列表
                stack.push(new NestedInteger());
            }else if (c == ',' || c == ']'){
                if (Character.isDigit(s.charAt(i-1))){
                    if (negative)
                        num *= -1;
                    stack.peek().add(new NestedInteger(num));
                }
                //一个数字走完后，清零
                num = 0;
                negative = false;
                //一个嵌套走完，出栈
                if (c == ']' && stack.size() > 1){
                    NestedInteger ni = stack.pop();
                    stack.peek().add(ni);
                }
            }
        }
        return stack.pop();
    }
}

class NestedInteger{
    int val;
    List<NestedInteger> list;

    public NestedInteger(){
        list = new ArrayList<>();
    }

    public NestedInteger(int val){
        this.val = val;
        list = new ArrayList<>();
    }

    public void add(NestedInteger n){
        list.add(n);
    }

    @Override
    public String toString() {
        return "NestedInteger{" +
                "val=" + val +
                ", list=" + list +
                '}';
    }
}
