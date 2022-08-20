package com.offerII.L064;

public class MagicDictionaryTest {
    public static void main(String[] args) {
        /*
          示例：
          输入
          ["MagicDictionary", "buildDict", "search", "search", "search", "search"]
          [[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
          输出
          [null, null, false, true, false, false]
          解释
          MagicDictionary magicDictionary = new MagicDictionary();
          magicDictionary.buildDict(["hello", "leetcode"]);
          magicDictionary.search("hello"); // 返回 False
          magicDictionary.search("hhllo"); // 将第二个 'h' 替换为 'e' 可以匹配 "hello" ，所以返回 True
          magicDictionary.search("hell"); // 返回 False
          magicDictionary.search("leetcoded"); // 返回 False
         */
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[]{"hello", "leetcode"});
        System.out.println(magicDictionary.search("hello"));
        System.out.println(magicDictionary.search("hhllo"));
        System.out.println(magicDictionary.search("hell"));
        System.out.println(magicDictionary.search("leetcoded"));
    }
}
