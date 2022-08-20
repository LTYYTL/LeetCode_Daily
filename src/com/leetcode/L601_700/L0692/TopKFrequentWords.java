package com.leetcode.L601_700.L0692;

import java.util.*;

/**
 * 692. 前K个高频单词
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 *
 * 示例 1：
 * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * 输出: ["i", "love"]
 * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 *     注意，按字母顺序 "i" 在 "love" 之前。
 *
 * 示例 2：
 * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * 输出: ["the", "is", "sunny", "day"]
 * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
 *     出现次数依次为 4, 3, 2 和 1 次。
 *
 * 注意：
 * 假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。
 * 输入的单词均由小写字母组成。
 *
 * 扩展练习：
 * 尝试以 O(n log k) 时间复杂度和 O(n) 空间复杂度解决。
 */
public class TopKFrequentWords {
    /**
     * 方法：小根堆
     * @param words
     * @param k
     * @return
     */
    public List<String> topKFrequent(String[] words, int k) {
        //1、记录每个单词出现的次数
        Map<String , Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        //2、小根堆
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> {
            if (map.get(o1).equals(map.get(o2)))
                return o2.compareTo(o1);
            else
                return map.get(o1) - map.get(o2);
        });
        //3、遍历map，把单词放入小根堆
        for (String s : map.keySet()) {
            queue.offer(s);
            if (queue.size() > k)
                queue.poll();
        }
        // 4.依次弹出堆中的 K 个元素，放入结果集合中。
        List<String> res = new ArrayList<>(k);
        while (queue.size() > 0) {
            res.add(queue.poll());
        }
        // 5.注意最后需要反转元素的顺序。
        Collections.reverse(res);

        return res;
    }
}
