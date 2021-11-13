package com.interview.L0105;

/**
 * 面试题 01.05. 一次编辑
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 *
 * 示例 1:
 * 输入:
 * first = "pale"
 * second = "ple"
 * 输出: True
 *
 * 示例 2:
 * 输入:
 * first = "pales"
 * second = "pal"
 * 输出: False
 */
public class OneAway {
    /**
     * 方法：双指针
     * @param first
     * @param second
     * @return
     */
    public boolean oneEditAway(String first, String second) {
        //字符串长度
        int n1 = first.length();
        int n2 = second.length();
        //长度差大1，不符合条件
        if (Math.abs(n1-n2) > 1)
            return false;
        //不同字符的个数
        int count = 0;

        //字符串相等，只用替换
        if (n1 == n2){
            //遍历
            for (int i = 0; i < n1; i++) {
                //记录不同的字符
                if (first.charAt(i) != second.charAt(i))
                    count++;
            }
            //不同字符超过1个，不符合条件
            if (count > 1)
                return false;
            return true;
        }
        //长度相差1，用替换或删除

        //其中有一个为空，直接添加就可以
        if (n1 == 0 || n2 == 0)
            return true;
        //双指针
        int i = 0;
        int j = 0;

        //不同超过1个，不符合条件
        while (count <= 1){

            //相同向后移动
            if (first.charAt(i) == second.charAt(j)){
                i++;
                j++;
            }else {
                //不同字符+1
                count++;
                //长的字符串指针向后移动
                if (n1 > n2)
                    i++;
                else
                    j++;
            }
            //到达字符串末尾并且只有一个不同
            if ((i >= n1 || j >= n2) && count <= 1) {
                return true;
            }

        }
        return false;
    }
}
