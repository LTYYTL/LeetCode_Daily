package com.offerII.L066;

import java.util.TreeMap;

/**
 * 剑指 Offer II 066. 单词之和
 * 实现一个 MapSum 类，支持两个方法，insert 和 sum：
 *
 * MapSum() 初始化 MapSum 对象
 * (1)void insert(String key, int val) 插入 key-val 键值对，字符串表示键 key ，整数表示值 val 。如果键 key 已经存在，那么原来的键值对将被替代成新的键值对。
 * (2)int sum(string prefix) 返回所有以该前缀 prefix 开头的键 key 的值的总和。
 *
 * 示例：
 * 输入：
 * inputs = ["MapSum", "insert", "sum", "insert", "sum"]
 * inputs = [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * 输出：
 * [null, null, 3, null, 5]
 * 解释：
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
 *
 * 提示：
 * 1 <= key.length, prefix.length <= 50
 * key 和 prefix 仅由小写英文字母组成
 * 1 <= val <= 1000
 * 最多调用 50 次 insert 和 sum
 *
 * 注意：本题与主站 677 题相同： https://leetcode-cn.com/problems/map-sum-pairs/
 */
public class MapSum {
    /**
     * 方法：字典树
     */
    private Node root;
    public MapSum() {
        root = new Node();
    }

    public void insert(String key, int val) {
        Node cur = root;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (cur.next.get(c) == null)
                cur.next.put(c,new Node());
            cur = cur.next.get(c);
        }
        cur.value = val;
    }

    public int sum(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            if (cur.next.get(c) == null)
                return 0;
            cur = cur.next.get(c);
        }
        return sum(cur);
    }

    private int sum(Node node) {
        int res = node.value;
        for (char c : node.next.keySet())
            res += sum(node.next.get(c));
        return res;
    }

    private class Node{
        TreeMap<Character,Node> next;
        int value;

        public Node() {
            this(0);
        }

        public Node(int value) {
            this.value = value;
            next = new TreeMap<>();
        }
    }
}
