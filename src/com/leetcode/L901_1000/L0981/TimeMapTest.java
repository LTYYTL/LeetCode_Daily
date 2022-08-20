package com.leetcode.L901_1000.L0981;

public class TimeMapTest {
    public static void main(String[] args) {
        /* * 示例 1：
          输入：inputs = ["TimeMap","set","get","get","set","get","get"],
               inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
          输出：[null,null,"bar","bar",null,"bar2","bar2"]
          解释：
          TimeMap kv;
          kv.set("foo", "bar", 1); // 存储键 "foo" 和值 "bar" 以及时间戳 timestamp = 1
          kv.get("foo", 1);  // 输出 "bar"
          kv.get("foo", 3); // 输出 "bar" 因为在时间戳 3 和时间戳 2 处没有对应 "foo" 的值，所以唯一的值位于时间戳 1 处（即 "bar"）
          kv.set("foo", "bar2", 4);
          kv.get("foo", 4); // 输出 "bar2"
          kv.get("foo", 5); // 输出 "bar2"
         */
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        System.out.println(timeMap.get("foo", 1));
        System.out.println(timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        System.out.println(timeMap.get("foo", 4));
        System.out.println(timeMap.get("foo", 5));
        /*
          示例 2：
          输入：inputs = ["TimeMap","set","set","get","get","get","get","get"],
               inputs = [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
          输出：[null,null,null,"","high","high","low","low"]
         */
        TimeMap kv = new TimeMap();
        kv.set("love", "high", 10);
        kv.set("love", "low", 20);
        System.out.println(kv.get("love", 5));
        System.out.println(kv.get("love", 10));
        System.out.println(kv.get("love", 15));
        System.out.println(kv.get("love", 20));
        System.out.println(kv.get("love", 25));
    }
}
