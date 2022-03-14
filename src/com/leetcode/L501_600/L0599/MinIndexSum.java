package com.leetcode.L501_600.L0599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 599. 两个列表的最小索引总和
 * 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。
 *
 * 示例 1:
 * 输入: list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * 输出: ["Shogun"]
 * 解释: 他们唯一共同喜爱的餐厅是“Shogun”。
 *
 * 示例 2:
 * 输入:list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["KFC", "Shogun", "Burger King"]
 * 输出: ["Shogun"]
 * 解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
 */
public class MinIndexSum {
    /**
     * 方法：哈希表
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        //存储字符串的索引和
        Map<String,Integer> map = new HashMap<>();

        //遍历
        for (int i = 0; i < list1.length; i++) {
            //记录当前字符串的索引
            String cur = list1[i];
            map.put(cur,i);
        }

        //记录最小索引和
        int sum = Integer.MAX_VALUE;
        //记录结果
        List<String> res = new ArrayList<>();
        //遍历
        for (int i = 0; i < list2.length; i++) {
            //当前字符
            String cur = list2[i];
            //查看是否存在
            if (map.containsKey(cur)) {
                //索引和是最小索引和，加入结果集
                if (sum == map.get(cur) + i){
                    res.add(cur);
                }else if (sum > map.get(cur) + i) {//得到更小的索引和
                    //改变最小索引和
                    sum = map.get(cur) + i;
                    //清空结果集
                    res.clear();
                    //加入结果集
                    res.add(cur);
                }
            }
        }

        //转换成数组
        return res.toArray(new String[res.size()]);
    }
}
