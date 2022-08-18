package com.leetcode.L601_700.L0638;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingOffersTest {
    public static void main(String[] args) {
        ShoppingOffers shoppingOffers = new ShoppingOffers();
        /**
         * 示例 1：
         * 输入：price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
         * 输出：14
         * 解释：有 A 和 B 两种物品，价格分别为 ¥2 和 ¥5 。
         * 大礼包 1 ，你可以以 ¥5 的价格购买 3A 和 0B 。
         * 大礼包 2 ，你可以以 ¥10 的价格购买 1A 和 2B 。
         * 需要购买 3 个 A 和 2 个 B ， 所以付 ¥10 购买 1A 和 2B（大礼包 2），以及 ¥4 购买 2A 。
         */
        List<List<Integer>> special = new ArrayList<>();
        special.add(Arrays.asList(3, 0, 5));
        special.add(Arrays.asList(1, 2, 10));
        System.out.println(shoppingOffers.shoppingOffers(Arrays.asList(2, 5), special, Arrays.asList(3, 2)));
        /**
         * 示例 2：
         * 输入：price = [2,3,4], special = [[1,1,0,4],[2,2,1,9]], needs = [1,2,1]
         * 输出：11
         * 解释：A ，B ，C 的价格分别为 ¥2 ，¥3 ，¥4 。
         * 可以用 ¥4 购买 1A 和 1B ，也可以用 ¥9 购买 2A ，2B 和 1C 。
         * 需要买 1A ，2B 和 1C ，所以付 ¥4 买 1A 和 1B（大礼包 1），以及 ¥3 购买 1B ， ¥4 购买 1C 。
         * 不可以购买超出待购清单的物品，尽管购买大礼包 2 更加便宜。
         */
    }
}
