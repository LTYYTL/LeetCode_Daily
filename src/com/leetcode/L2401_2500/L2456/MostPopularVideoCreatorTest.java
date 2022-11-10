package com.leetcode.L2401_2500.L2456;

public class MostPopularVideoCreatorTest {
    public static void main(String[] args) {
        MostPopularVideoCreator mostPopularVideoCreator = new MostPopularVideoCreator();
        /*
          示例 1：
          输入：creators = ["alice","bob","alice","chris"], ids = ["one","two","three","four"], views = [5,10,5,4]
          输出：[["alice","one"],["bob","two"]]
          解释：
          alice 的流行度是 5 + 5 = 10 。
          bob 的流行度是 10 。
          chris 的流行度是 4 。
          alice 和 bob 是流行度最高的创作者。
          bob 播放量最高的视频 id 为 "two" 。
          alice 播放量最高的视频 id 是 "one" 和 "three" 。由于 "one" 的字典序比 "three" 更小，所以结果中返回的 id 是 "one" 。
         */
        System.out.println(mostPopularVideoCreator.mostPopularCreator(new String[]{"alice", "bob", "alice", "chris"}, new String[]{"one", "two", "three", "four"}, new int[]{5, 10, 5, 4}));
        /*
          示例 2：
          输入：creators = ["alice","alice","alice"], ids = ["a","b","c"], views = [1,2,2]
          输出：[["alice","b"]]
          解释：
          id 为 "b" 和 "c" 的视频都满足播放量最高的条件。
          由于 "b" 的字典序比 "c" 更小，所以结果中返回的 id 是 "b" 。
         */
        System.out.println(mostPopularVideoCreator.mostPopularCreator(new String[]{"alice", "alice", "alice"}, new String[]{"a", "b", "c"}, new int[]{1, 2, 2}));

    }
}
