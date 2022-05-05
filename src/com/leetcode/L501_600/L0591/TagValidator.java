package com.leetcode.L501_600.L0591;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 591. 标签验证器
 * 给定一个表示代码片段的字符串，你需要实现一个验证器来解析这段代码，并返回它是否合法。合法的代码片段需要遵守以下的所有规则：
 * (1)代码必须被合法的闭合标签包围。否则，代码是无效的。
 * (2)闭合标签（不一定合法）要严格符合格式：<TAG_NAME>TAG_CONTENT</TAG_NAME>。其中，<TAG_NAME>是起始标签，</TAG_NAME>是结束标签。
 * 起始和结束标签中的 TAG_NAME 应当相同。当且仅当 TAG_NAME 和 TAG_CONTENT 都是合法的，闭合标签才是合法的。
 * (3)合法的 TAG_NAME 仅含有大写字母，长度在范围 [1,9] 之间。否则，该 TAG_NAME 是不合法的。
 * (4)合法的 TAG_CONTENT 可以包含其他合法的闭合标签，cdata （请参考规则7）和任意字符（注意参考规则1）除了不匹配的<、不匹配的起始和结束标签、不匹配的或带有不合法 TAG_NAME 的闭合标签。否则，TAG_CONTENT 是不合法的。
 * (5)一个起始标签，如果没有具有相同 TAG_NAME 的结束标签与之匹配，是不合法的。反之亦然。不过，你也需要考虑标签嵌套的问题。
 * (6)一个<，如果你找不到一个后续的>与之匹配，是不合法的。并且当你找到一个<或</时，所有直到下一个>的前的字符，都应当被解析为 TAG_NAME（不一定合法）。
 * (7)cdata 有如下格式：<![CDATA[CDATA_CONTENT]]>。CDATA_CONTENT 的范围被定义成 <![CDATA[ 和后续的第一个 ]]>之间的字符。
 * (8)CDATA_CONTENT 可以包含任意字符。cdata 的功能是阻止验证器解析CDATA_CONTENT，所以即使其中有一些字符可以被解析为标签（无论合法还是不合法），也应该将它们视为常规字符。
 * <p>
 * 合法代码的例子:
 * 输入: "<DIV>This is the first line <![CDATA[<div>]]></DIV>"
 * 输出: True
 * 解释:
 * 代码被包含在了闭合的标签内： <DIV> 和 </DIV> 。
 * TAG_NAME 是合法的，TAG_CONTENT 包含了一些字符和 cdata 。
 * 即使 CDATA_CONTENT 含有不匹配的起始标签和不合法的 TAG_NAME，它应该被视为普通的文本，而不是标签。
 * 所以 TAG_CONTENT 是合法的，因此代码是合法的。最终返回True。
 * <p>
 * 输入: "<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"
 * 输出: True
 * 解释:
 * 我们首先将代码分割为： start_tag|tag_content|end_tag 。
 * start_tag -> "<DIV>"
 * end_tag -> "</DIV>"
 * tag_content 也可被分割为： text1|cdata|text2 。
 * text1 -> ">>  ![cdata[]] "
 * cdata -> "<![CDATA[<div>]>]]>" ，其中 CDATA_CONTENT 为 "<div>]>"
 * text2 -> "]]>>]"
 * start_tag 不是 "<DIV>>>" 的原因参照规则 6 。
 * cdata 不是 "<![CDATA[<div>]>]]>]]>" 的原因参照规则 7 。
 * <p>
 * 不合法代码的例子:
 * 输入: "<A>  <B> </A>   </B>"
 * 输出: False
 * 解释: 不合法。如果 "<A>" 是闭合的，那么 "<B>" 一定是不匹配的，反之亦然。
 * <p>
 * 输入: "<DIV>  div tag is not closed  <DIV>"
 * 输出: False
 * <p>
 * 输入: "<DIV>  unmatched <  </DIV>"
 * 输出: False
 * <p>
 * 输入: "<DIV> closed tags with invalid tag name  <b>123</b> </DIV>"
 * 输出: False
 * <p>
 * 输入: "<DIV> unmatched tags with invalid tag name  </1234567890> and <CDATA[[]]>  </DIV>"
 * 输出: False
 * <p>
 * 输入: "<DIV>  unmatched start tag <B>  and unmatched end tag </C>  </DIV>"
 * 输出: False
 * <p>
 * 注意:
 * 为简明起见，你可以假设输入的代码（包括提到的任意字符）只包含数字, 字母, '<','>','/','!','[',']'和' '。
 */
public class TagValidator {
    /**
     * 方法：栈
     *
     * @param code
     * @return
     */
    public boolean isValid(String code) {
        //长度
        int n = code.length();
        //栈
        Deque<String> stack = new LinkedList<>();
        //索引
        int i = 0;
        //遍历
        while (i < n) {
            //当前字符
            char c = code.charAt(i);
            //分类讨论
            if (c == '<') {
                //已经是最后一个字符
                if (i == n - 1)
                    return false;
                //下一个字符
                char d = code.charAt(i + 1);
                //是”/“的情况
                if (d == '/') {
                    //在索引i之后寻找第一个>
                    int j = code.indexOf('>', i);
                    //不存在
                    if (j < 0)
                        return false;
                    //截取之间的部分，即结束标签
                    String temp = code.substring(i + 2, j);
                    //没有开始标签或者与上一个开始标签不匹配
                    if (stack.isEmpty() || !stack.peek().equals(temp))
                        return false;
                    //上一个开始标签出栈
                    stack.pop();
                    //索引移动
                    i = j + 1;
                    //已经没有开始标签但是后面还有字符，即没有被标签包裹
                    if (stack.isEmpty() && i != n)
                        return false;
                } else if (d == '!') {//是”!“的情况
                    //没有开始标签
                    if (stack.isEmpty())
                        return false;
                    //超过长度
                    if (i + 9 > n)
                        return false;
                    //获取cdata
                    String cdata = code.substring(i + 2, i + 9);
                    //不匹配
                    if (!"[CDATA[".equals(cdata))
                        return false;
                    //获取在索引i之后的第一个‘]’
                    int j = code.indexOf("]]>", i);
                    //不存在
                    if (j < 0)
                        return false;
                    //移动索引
                    i = j + 3;
                } else {
                    //在索引i之后寻找第一个>
                    int j = code.indexOf('>', i);
                    //不存在
                    if (j < 0)
                        return false;
                    //截取开始标签
                    String temp = code.substring(i + 1, j);
                    //不符合标签规则
                    if (temp.length() < 1 || temp.length() > 9)
                        return false;
                    //遍历标签内每个字符是不是都是小写字母
                    for (int k = 0; k < temp.length(); k++) {
                        if (!Character.isUpperCase(temp.charAt(k)))
                            return false;
                    }
                    //入栈
                    stack.push(temp);
                    //索引后移
                    i = j + 1;
                }
            } else {
                //不存在开始标签
                if (stack.isEmpty())
                    return false;
                ++i;
            }
        }
        //是否都匹配完了
        return stack.isEmpty();
    }
}
