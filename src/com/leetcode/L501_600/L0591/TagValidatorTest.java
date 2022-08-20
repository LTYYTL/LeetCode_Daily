package com.leetcode.L501_600.L0591;

public class TagValidatorTest {
    public static void main(String[] args) {
        TagValidator tagValidator = new TagValidator();
        /*
          输入: "<DIV>This is the first line <![CDATA[<div>]]></DIV>"
          输出: True
          解释:
          代码被包含在了闭合的标签内： <DIV> 和 </DIV> 。
          TAG_NAME 是合法的，TAG_CONTENT 包含了一些字符和 cdata 。
          即使 CDATA_CONTENT 含有不匹配的起始标签和不合法的 TAG_NAME，它应该被视为普通的文本，而不是标签。
          所以 TAG_CONTENT 是合法的，因此代码是合法的。最终返回True。
         */
        System.out.println(tagValidator.isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"));
        /*
          输入: "<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"
          输出: True
          解释:
          我们首先将代码分割为： start_tag|tag_content|end_tag 。
          start_tag -> "<DIV>"
          end_tag -> "</DIV>"
          tag_content 也可被分割为： text1|cdata|text2 。
          text1 -> ">>  ![cdata[]] "
          cdata -> "<![CDATA[<div>]>]]>" ，其中 CDATA_CONTENT 为 "<div>]>"
          text2 -> "]]>>]"
          start_tag 不是 "<DIV>>>" 的原因参照规则 6 。
          cdata 不是 "<![CDATA[<div>]>]]>]]>" 的原因参照规则 7 。
         */
        System.out.println(tagValidator.isValid("<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"));
        /*
          输入: "<A>  <B> </A>   </B>"
          输出: False
          解释: 不合法。如果 "<A>" 是闭合的，那么 "<B>" 一定是不匹配的，反之亦然。
         */
        System.out.println(tagValidator.isValid("<A>  <B> </A>   </B>"));
        /*
          输入: "<DIV>  div tag is not closed  <DIV>"
          输出: False
         */
        System.out.println(tagValidator.isValid("<DIV>  div tag is not closed  <DIV>"));
        /*
          输入: "<DIV>  unmatched <  </DIV>"
          输出: False
         */
        System.out.println(tagValidator.isValid("<DIV>  unmatched <  </DIV>"));
        /*
          输入: "<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"
          输出: False
         */
        System.out.println(tagValidator.isValid("<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"));
        /*
          输入: "<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"
          输出: False
         */
        System.out.println(tagValidator.isValid("<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"));
        /*
          输入: "<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"
          输出: False
         */
        System.out.println(tagValidator.isValid("<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"));
    }
}
