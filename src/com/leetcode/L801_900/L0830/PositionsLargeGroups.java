package com.leetcode.L801_900.L0830;

import java.util.ArrayList;
import java.util.List;

/**
 * 830. 较大分组的位置
 * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
 * 例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
 * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
 * 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
 *
 * 示例 1：
 * 输入：s = "abbxxxxzzy"
 * 输出：[[3,6]]
 * 解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。
 *
 * 示例 2：
 * 输入：s = "abc"
 * 输出：[]
 * 解释："a","b" 和 "c" 均不是符合要求的较大分组。
 *
 * 示例 3：
 * 输入：s = "abcdddeeeeaabbbcd"
 * 输出：[[3,5],[6,9],[12,14]]
 * 解释：较大分组为 "ddd", "eeee" 和 "bbb"
 *
 * 示例 4：
 * 输入：s = "aba"
 * 输出：[]
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 仅含小写英文字母
 */
public class PositionsLargeGroups {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        //结果集合
        List<List<Integer>> res = new ArrayList<>();
        //小于3就没有较大分组
        if (s.length() < 3)
            return res;
        //双指针
        int start = 0;
        int end =  1;
        //循环
        while(end < s.length()){
            //相等的情况end指针向后移动一位
            if (s.charAt(start) == s.charAt(end)){
                end++;
            }else {
                //不等情况，判断两个指针只差>=3，证明有较大分组，将索引加入集合中
                if (end - start  >= 3){
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(end-1);//因为当前end指针指向不相等的位置，所以减1
                    res.add(list);
                }
                start = end;
                end++;
            }
        }
        //处理最后三位是相同的字母，end+1后会直接超出索引最大值，无法加入list中的情况
        if(s.charAt(start) == s.charAt(end-1) && end - start >= 3){
            List<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(end-1);//因为当前end指针指向不相等的位置，所以减1
            res.add(list);
        }
        return res;
    }
}
