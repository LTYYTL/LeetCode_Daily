package com.leetcode.L0028;

/**
 * 28. 实现 strStr()
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class ImplementstrStr {
    /**
     * 方法一：Sunday匹配
     * 1、对齐目标串和模式串，从前向后匹配
     * 2、关注主串中位于模式串后面的第一个元素（核心）
     * 3、如果关注的字符没有在子串中出现则直接跳过，否则开始移动模式串，移动位数 = 子串长度 - 该字符最右出现的位置(以0开始)
     *
     * @param haystack 目标串
     * @param needle   模式串
     * @return 匹配第一位的索引
     */
    public int strStr(String haystack, String needle) {
        //目标串或者模式串为空的情况
        if (needle == null || haystack == null)
            return 0;
        //目标串的长度比模式串短
        if (haystack.length() < needle.length())
            return -1;
        //目标串匹配索
        int originIndex = 0;
        //模式串匹配索引
        int aimIndex = 0;
        // 成功匹配完终止条件：所有aim均成功匹配
        while(aimIndex < needle.length()){
            // 针对origin匹配完，但aim未匹配完情况处理 如 mississippi sippia
            if(originIndex > haystack.length() - 1)
                return -1;
            // 匹配则index均加1
            if (haystack.charAt(originIndex) == needle.charAt(aimIndex)){
                originIndex++;
                aimIndex++;
            }else {
                //在我们上面的样例中，第一次计算值为6，第二次值为13
                int nextCharIndex = originIndex - aimIndex + needle.length();
                //判断下一个目标字符是否存在。
                if (nextCharIndex < haystack.length()){
                    // 判断目标字符在模式串中匹配到，返回最后一个匹配的index
                    int step = needle.lastIndexOf(haystack.charAt(nextCharIndex));
                    if (step == -1) {
                        // 不存在的话，设置到目标字符的下一个元素
                        originIndex = nextCharIndex + 1;
                    }else{
                        // 存在的话，移动对应的数字
                        originIndex = nextCharIndex - step;
                    }
                    //模式串总是从第一个开始匹配
                    aimIndex = 0;
                }else {
                    return -1;
                }
            }

        }
        return originIndex - aimIndex;
    }

    /**
     * 方法二：KMP算法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr_kmp(String haystack, String needle) {
        //生成next数组
        int[] next = getNexts(needle);
        int j = 0;
        //主循环，遍历主字符串
        for (int i = 0; i < haystack.length(); i++){
            while(j > 0 & haystack.charAt(i) != needle.charAt(j))
                //遇到坏字符串，查询next数组并改变模拟串起点
                j = next[j];
            if (haystack.charAt(i) == needle.charAt(j))
                j++;
            if (j == needle.length())
                //匹配成功，返回下标
                return i - needle.length() + 1;
        }
        return -1;
    }

    /**
     * 生成next数组
     * @param needle 模拟串
     * @return
     */
    private int[] getNexts(String needle){
        int[] next = new int[needle.length()];
        int j = 0;
        for (int i = 2; i < needle.length(); ++i){
            //从next[i+1]的求解回溯到next[j]
            while (j != 0 && needle.charAt(j) != needle.charAt(i-1)){
                j = next[j];
            }
            if(needle.charAt(j) == needle.charAt(i-1)) {
                j++;
            }
            next[i] = j;

        }
        return next;
    }

}
