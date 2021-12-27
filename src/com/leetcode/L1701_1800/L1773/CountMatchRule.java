package com.leetcode.L1701_1800.L1773;

import java.util.List;

/**
 * 1773. 统计匹配检索规则的物品数量
 * 给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 * (1)ruleKey == "type" 且 ruleValue == typei 。
 * (2)ruleKey == "color" 且 ruleValue == colori 。
 * (3)ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 *
 * 示例 1：
 * 输入：items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * 输出：1
 * 解释：只有一件物品匹配检索规则，这件物品是 ["computer","silver","lenovo"] 。
 *
 * 示例 2：
 * 输入：items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
 * 输出：2
 * 解释：只有两件物品匹配检索规则，这两件物品分别是 ["phone","blue","pixel"] 和 ["phone","gold","iphone"] 。注意，["computer","silver","phone"] 未匹配检索规则。
 *
 * 提示：
 * 1 <= items.length <= 104
 * 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
 * ruleKey 等于 "type"、"color" 或 "name"
 * 所有字符串仅由小写字母组成
 */
public class CountMatchRule {
    /**
     * 方法：模拟
     * @param items
     * @param ruleKey
     * @param ruleValue
     * @return
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //根据key,获取对应索引
        int index = -1;
        if (ruleKey.equals("type")){
            index = 0;
        }
        if (ruleKey.equals("color")){
            index = 1;
        }
        if (ruleKey.equals("name")){
            index = 2;
        }
        //个数
        int count = 0;
        //遍历
        for (List<String> item : items) {
            //查看指定位置是否符合条件
            if (ruleValue.equals(item.get(index))) {
                count++;
            }
        }

        return count;
    }
}
