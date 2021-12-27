package com.leetcode.L1701_1800.L1773;

import java.util.ArrayList;
import java.util.List;

public class CountMatchRuleTest {
    public static void main(String[] args) {
        CountMatchRule countMatchRule = new CountMatchRule();
        /**
         * 示例 1：
         * 输入：items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
         * 输出：1
         * 解释：只有一件物品匹配检索规则，这件物品是 ["computer","silver","lenovo"] 。
         */
        List<List<String>> items = new ArrayList<>(){{
            add(new ArrayList<>(){{add("phone");add("blue");add("pixel");}});
            add(new ArrayList<>(){{add("computer");add("silver");add("lenovo");}});
            add(new ArrayList<>(){{add("phone");add("gold");add("iphone");}});
        }};
        System.out.println(countMatchRule.countMatches(items, "color", "silver"));
        /**
         * 示例 2：
         * 输入：items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
         * 输出：2
         * 解释：只有两件物品匹配检索规则，这两件物品分别是 ["phone","blue","pixel"] 和 ["phone","gold","iphone"] 。注意，["computer","silver","phone"] 未匹配检索规则。
         */
        items.clear();
        items = new ArrayList<>(){{
            add(new ArrayList<>(){{add("phone");add("blue");add("pixel");}});
            add(new ArrayList<>(){{add("computer");add("silver");add("lenovo");}});
            add(new ArrayList<>(){{add("phone");add("gold");add("iphone");}});
        }};
        System.out.println(countMatchRule.countMatches(items, "type", "phone"));
    }
}
