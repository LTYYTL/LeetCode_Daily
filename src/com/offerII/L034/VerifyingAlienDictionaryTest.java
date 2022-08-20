package com.offerII.L034;

public class VerifyingAlienDictionaryTest {
    public static void main(String[] args) {
        VerifyingAlienDictionary verifyingAlienDictionary = new VerifyingAlienDictionary();
        /*
          示例 1：
          输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
          输出：true
          解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。
         */
        System.out.println(verifyingAlienDictionary.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        /*
          示例 2：
          输入：words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
          输出：false
          解释：在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。
         */
        System.out.println(verifyingAlienDictionary.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
        /*
          示例 3：
          输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
          输出：false
          解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。
         */
        System.out.println(verifyingAlienDictionary.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }
}
