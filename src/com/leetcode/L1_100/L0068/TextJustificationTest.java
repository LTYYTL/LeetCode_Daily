package com.leetcode.L1_100.L0068;

public class TextJustificationTest {
    public static void main(String[] args) {
        TextJustification textJustification = new TextJustification();
        /*
          示例:
          输入:
          words = ["This", "is", "an", "example", "of", "text", "justification."]
          maxWidth = 16
          输出:
          [
             "This    is    an",
             "example  of text",
             "justification.  "
          ]
         */
        System.out.println(textJustification.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
        /*
          示例 2:
          输入:
          words = ["What","must","be","acknowledgment","shall","be"]
          maxWidth = 16
          输出:
          [
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
          ]
          解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
               因为最后一行应为左对齐，而不是左右两端对齐。
               第二行同样为左对齐，这是因为这行只包含一个单词。
         */
        System.out.println(textJustification.fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16));
        /*
          示例 3:
          输入:
          words = ["Science","is","what","we","understand","well","enough","to","explain",
                   "to","a","computer.","Art","is","everything","else","we","do"]
          maxWidth = 20
          输出:
          [
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
          ]
         */
        System.out.println(textJustification.fullJustify(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
                "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20));
    }
}
