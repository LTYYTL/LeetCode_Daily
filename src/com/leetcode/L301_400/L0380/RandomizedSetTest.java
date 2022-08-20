package com.leetcode.L301_400.L0380;

public class RandomizedSetTest {
    public static void main(String[] args) {
        /*
          RandomizedSet randomizedSet = new RandomizedSet();
          randomizedSet.insert(1); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
          randomizedSet.remove(2); // 返回 false ，表示集合中不存在 2 。
          randomizedSet.insert(2); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
          randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2 。
          randomizedSet.remove(1); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
          randomizedSet.insert(2); // 2 已在集合中，所以返回 false 。
          randomizedSet.getRandom(); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
         */
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
}
