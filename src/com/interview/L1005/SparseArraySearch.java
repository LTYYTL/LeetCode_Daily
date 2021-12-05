package com.interview.L1005;

/**
 * 面试题 10.05. 稀疏数组搜索
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 *
 * 示例1:
 *  输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 *  输出：-1
 *  说明: 不存在返回-1。
 *
 * 示例2:
 *  输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 *  输出：4
 *
 * 提示:
 * words的长度在[1, 1000000]之间
 */
public class SparseArraySearch {
    /**
     * 方法：二分查找
     * @param words
     * @param s
     * @return
     */
    public int findString(String[] words, String s) {
        //做右指针
        int left = 0;
        int right = words.length - 1;
        //遍历
        while (left <= right){
            //去除空串
            while (left <= right && words[left].equals(""))
                left++;
            //去除空串
            while (left <= right && words[left].equals(""))
                right--;
            //中间值
            int mid = (right - left)/2 + left;
            int temp = mid;
            //去除空串
            while (mid < right && words[mid].equals(""))
                mid++;
            //相等
            if (words[mid].equals(s))
                return mid;
            else if (words[mid].compareTo(s) > 0){
                right = temp - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
