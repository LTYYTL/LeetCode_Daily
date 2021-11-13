package com.interview.L0109;

/**
 * 面试题 01.09. 字符串轮转
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 *
 * 示例1:
 * 输入：s1 = "waterbottle", s2 = "erbottlewat"
 * 输出：True
 *
 * 示例2:
 * 输入：s1 = "aa", s2 = "aba"
 * 输出：False
 *
 * 提示：
 * 字符串长度在[0, 100000]范围内。
 *
 * 说明:
 * 你能只调用一次检查子串的方法吗？
 */
public class StringRotation {
    /**
     * 方法：模拟
     * @param s1
     * @param s2
     * @return
     */
    public boolean isFlipedString(String s1, String s2) {
        //长度
        int n1 = s1.length();
        int n2 = s2.length();
        //不等，直接返回
        if (n1 != n2)
            return false;
        if (s1.equals(s2))
            return true;
        //遍历
        for (int i = 0; i < s1.length(); i++) {
            //拼接字符串
            String temp = s1.substring(i) + s1.substring(0,i);
            //判断是否相等
            if (s2.equals(temp))
                return true;
        }
        return false;
    }
}
