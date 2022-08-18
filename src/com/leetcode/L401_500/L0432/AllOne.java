package com.leetcode.L401_500.L0432;

import java.util.HashMap;
import java.util.Map;

/**
 * 432. 全 O(1) 的数据结构
 * 请你设计一个用于存储字符串计数的数据结构，并能够返回计数最小和最大的字符串。
 *
 * 实现 AllOne 类：
 * (1)AllOne() 初始化数据结构的对象。
 * (2)inc(String key) 字符串 key 的计数增加 1 。如果数据结构中尚不存在 key ，那么插入计数为 1 的 key 。
 * (3)dec(String key) 字符串 key 的计数减少 1 。如果 key 的计数在减少后为 0 ，那么需要将这个 key 从数据结构中删除。测试用例保证：在减少计数前，key 存在于数据结构中。
 * (4)getMaxKey() 返回任意一个计数最大的字符串。如果没有元素存在，返回一个空字符串 "" 。
 * (5)getMinKey() 返回任意一个计数最小的字符串。如果没有元素存在，返回一个空字符串 "" 。
 *
 * 示例：
 * 输入
 * ["AllOne", "inc", "inc", "getMaxKey", "getMinKey", "inc", "getMaxKey", "getMinKey"]
 * [[], ["hello"], ["hello"], [], [], ["leet"], [], []]
 * 输出
 * [null, null, null, "hello", "hello", null, "hello", "leet"]
 *
 * 解释
 * AllOne allOne = new AllOne();
 * allOne.inc("hello");
 * allOne.inc("hello");
 * allOne.getMaxKey(); // 返回 "hello"
 * allOne.getMinKey(); // 返回 "hello"
 * allOne.inc("leet");
 * allOne.getMaxKey(); // 返回 "hello"
 * allOne.getMinKey(); // 返回 "leet"
 *
 * 提示：
 *
 * 1 <= key.length <= 10
 * key 由小写英文字母组成
 * 测试用例保证：在每次调用 dec 时，数据结构中总存在 key
 * 最多调用 inc、dec、getMaxKey 和 getMinKey 方法 5 * 104 次
 */
public class AllOne {
    /**
     * 方法：双向链表
     */
    //存储对应键和信息
    private final Map<String, Node> map;
    //按照次数从小到大排序
    Node head;
    Node tail;

    /**
     * 初始化
     */
    public AllOne() {
        map = new HashMap<>();
        //头节点
        head = new Node(null,0);
        //尾节点
        tail = new Node(null,Integer.MAX_VALUE);
        //相连
        head.next = tail;
        tail.prev = head;
    }

    public void inc(String key) {
        //不存在
        if (!map.containsKey(key)){
            //第一次加入
            Node node = new Node(key,1);
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            map.put(key,node);
        }else{
            // 包含这个key，数值增加1，并往后移动
            Node node = map.get(key);
            node.val++;
            while (node.val > node.next.val) {
                // 交换两个节点的位置
                Node next = node.next;
                node.next = next.next;
                next.next.prev = node;
                node.prev.next = next;
                next.prev = node.prev;
                node.prev = next;
                next.next = node;
            }
        }
    }

    public void dec(String key) {
        // 包含这个key的时候才处理
        if (map.containsKey(key)) {
            Node node = map.get(key);
            if (node.val == 1) {
                map.remove(key);
                Node prev = node.prev;
                Node next = node.next;
                prev.next = next;
                next.prev = prev;
            } else {
                node.val--;
                // 往前移动
                while (node.val < node.prev.val) {
                    Node prev = node.prev;
                    node.prev = prev.prev;
                    prev.prev.next = node;
                    prev.next = node.next;
                    node.next.prev = prev;
                    prev.prev = node;
                    node.next = prev;
                }
            }
        }
    }

    public String getMaxKey() {
        return tail.prev == head ? "" : tail.prev.key;
    }

    public String getMinKey() {
        return head.next == tail ? "" : head.next.key;
    }
}

class Node{
    Node prev;
    Node next;
    String key;
    int val;

    public Node(String key, int val) {
        this.key = key;
        this.val = val;
    }
}
