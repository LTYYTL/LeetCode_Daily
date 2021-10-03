package com.leetcode.L101_200.L0118;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {
    /**
     * 方法：双循环
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        //层数
        for (int i = 1; i <= numRows; i++){
            List<Integer> temp = new ArrayList<>();
            //每层的元素从索引0处快开始，且个数跟层数相等
            for (int j = 0; j < i; ++j){
                //第一个和最后一个都为1
                if (j == 0 || j == i-1){
                    temp.add(1);
                }else {
                    //每个数是它左上方和右上方的数的和。
                    List<Integer> prevList = res.get(i-2);
                    int sum = prevList.get(j-1)+prevList.get(j);
                    temp.add(sum);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
