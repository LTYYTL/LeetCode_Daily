package com.leetcode.L701_800.L0748;

public class ShortestCompletingWordTest {
    public static void main(String[] args) {
        ShortestCompletingWord shortestCompletingWord = new ShortestCompletingWord();
        /*
          示例 1：
          输入：licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
          输出："steps"
          解释：最短补全词应该包括 "s"、"p"、"s"（忽略大小写） 以及 "t"。
          "step" 包含 "t"、"p"，但只包含一个 "s"，所以它不符合条件。
          "steps" 包含 "t"、"p" 和两个 "s"。
          "stripe" 缺一个 "s"。
          "stepple" 缺一个 "s"。
          因此，"steps" 是唯一一个包含所有字母的单词，也是本例的答案。
         */
        System.out.println(shortestCompletingWord.shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
        /*
          示例 2：
          输入：licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
          输出："pest"
          解释：licensePlate 只包含字母 "s" 。所有的单词都包含字母 "s" ，其中 "pest"、"stew"、和 "show" 三者最短。答案是 "pest" ，因为它是三个单词中在 words 里最靠前的那个。
         */
        System.out.println(shortestCompletingWord.shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"}));
        /*
          示例 3：
          输入：licensePlate = "Ah71752", words = ["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
          输出："husband"
         */
        System.out.println(shortestCompletingWord.shortestCompletingWord("Ah71752", new String[]{"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"}));
        /*
          示例 4：
          输入：licensePlate = "OgEu755", words = ["enough","these","play","wide","wonder","box","arrive","money","tax","thus"]
          输出："enough"
         */
        System.out.println(shortestCompletingWord.shortestCompletingWord("OgEu755", new String[]{"enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus"}));
        /*
          示例 5：
          输入：licensePlate = "iMSlpe4", words = ["claim","consumer","student","camera","public","never","wonder","simple","thought","use"]
          输出："simple"
         */
        System.out.println(shortestCompletingWord.shortestCompletingWord("iMSlpe4", new String[]{"claim", "consumer", "student", "camera", "public", "never", "wonder", "simple", "thought", "use"}));
    }
}
