package com.interview.L0106;

/**
 * 面试题 01.06. 字符串压缩
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 *  示例1:
 *  输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 *
 *  示例2:
 *  输入："abbccd"
 *  输出："abbccd"
 *  解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 *
 * 提示：
 * 字符串长度在[0, 50000]范围内。
 */
public class CompressString {
    /**
     * 方法：双指针
     * @param S
     * @return
     */
    public String compressString(String S) {
        //特殊情况
        if (S == null || S.length() <= 2){
            return S;
        }
        //结果
        StringBuilder res = new StringBuilder();
        //双指针
        int i = 0;
        int j = 1;
        //遍历
        for (; j < S.length(); j++) {
            //相同
            if (S.charAt(i) == S.charAt(j))
                continue;
            //不同，将字母和长度添加
            res.append(S.charAt(i));
            res.append(j-i);
            //重新改变指针位置
            i = j;
        }
        //最后一个字母
        res.append(S.charAt(i));
        res.append(j-i);
        //长度缩短返回结果，变长直接返回
        if (res.length() <= S.length())
            return res.toString();
        return S;
    }
}
