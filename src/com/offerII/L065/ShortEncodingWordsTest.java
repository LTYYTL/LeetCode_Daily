package com.offerII.L065;

public class ShortEncodingWordsTest {
    public static void main(String[] args) {
        ShortEncodingWords shortEncodingWords = new ShortEncodingWords();
        /*
          示例 1：
          输入：words = ["time", "me", "bell"]
          输出：10
          解释：一组有效编码为 s = "time#bell#" 和 indices = [0, 2, 5] 。
          words[0] = "time" ，s 开始于 indices[0] = 0 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
          words[1] = "me" ，s 开始于 indices[1] = 2 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
          words[2] = "bell" ，s 开始于 indices[2] = 5 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
         */
        System.out.println(shortEncodingWords.minimumLengthEncoding(new String[]{"time", "me", "bell"}));
        System.out.println(shortEncodingWords.minimumLengthEncoding_tire(new String[]{"time", "me", "bell"}));
        /*
          示例 2：
          输入：words = ["t"]
          输出：2
          解释：一组有效编码为 s = "t#" 和 indices = [0] 。
         */
        System.out.println(shortEncodingWords.minimumLengthEncoding(new String[]{"t"}));
        System.out.println(shortEncodingWords.minimumLengthEncoding_tire(new String[]{"t"}));
    }
}
