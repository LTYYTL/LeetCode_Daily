package com.leetcode.L1_100.L0014;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    /**
     * 链接：https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-yi-dong-de-ti-jie-by-ivan1/
     * 参考此题解的方法，改写成Java版
     *
     * 依次将基准元素x和后面的元素进行比较（假定后面的元素依次为x1,x2,x3....），不断更新基准元素，
     * 直到基准元素和所有元素都满足最长公共前缀的条件，就可以得到最长公共前缀。
     *
     * 具体比对过程如下：
     * 1、如果strings.Index(x1,x) == 0，则直接跳过（因为此时x就是x1的最长公共前缀），对比下一个元素。
     * 2、如果strings.Index(x1,x) != 0, 则截取掉基准元素x的最后一个元素，再次和x1进行比较，
     * 直至满足string.Index(x1,x) == 0，此时截取后的x为x和x1的最长公共前缀。
     *
     * @param strs String[]
     * @return 最长前缀
     */
    public String longestCommonPrefix(String[] strs) {
        //空值情况
        if(strs.length==0 || strs == null){
            return "";
        }
        //最初用strs[0]作为最长前缀的基准
        String res = strs[0];
        //遍历str[]
        for (int i = 1 ; i < strs.length ;i++){
            //临时变量，用于存储当前的str[i]
            String tempStr = strs[i];
            //判断基准res是否为tempStr的前缀，不是的情况进入循环
            while (!tempStr.startsWith(res)){
                //基准的长度变为0，说明没有最长前缀，直接返回“”
                if (res.length() == 0){
                    return "";
                }
                //改变基准的长度，从每次改变都丢掉最后一位
                res = res.substring(0,res.length() -1);
            }
        }
        return res;
    }

    /**
     * 分治法
     * @param strs
     * @return
     */
    public String longestCommonPrefix_divide(String[] strs) {
        //空值情况
        if(strs.length==0 || strs == null){
            return "";
        }else {
            return longestCommonPrefix(strs,0,strs.length - 1);
        }
    }

    /**
     *
     * @param strs  String[]
     * @param start 开始位置
     * @param end   结束位置
     * @return 最长前缀
     */
    private String longestCommonPrefix(String[] strs, int start, int end) {
        //当start == end 的情况
        if (start == end)
            return strs[start];
        //中点的位置，其中再加上start为偏移量
        int mid = (end - start)/2 + start;
        //左边的最长前缀
        String leftStr = longestCommonPrefix(strs,start,mid);
        //右边的最长前缀
        String rightStr = longestCommonPrefix(strs,mid+1,end);
        return commonPrefix(leftStr,rightStr);
    }

    /**
     * 发现两个String的最长前缀
     * @param leftStr
     * @param rightStr
     * @return
     */
    private String commonPrefix(String leftStr, String rightStr) {
        //获取两个String中最小长度
        int minLength = Math.min(leftStr.length(),rightStr.length());
        //循环遍历，获取两个String最长前缀
        for (int i = 0; i < minLength; i++){
            //当两个string[]在第i个位置不同时，最长前缀就截止于此
            if (leftStr.charAt(i) != rightStr.charAt(i))
                return leftStr.substring(0,i);
        }
        //没有发现不同，最长前缀的长度为最短String的长度
        return leftStr.substring(0,minLength);
    }
}
