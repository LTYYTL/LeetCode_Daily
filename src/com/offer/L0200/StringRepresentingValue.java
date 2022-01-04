package com.offer.L0200;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 20. 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *
 * 数值（按顺序）可以分成以下几个部分：
 *  (1)若干空格
 *  (2)一个 小数 或者 整数
 *  (3)（可选）一个 'e' 或 'E' ，后面跟着一个 整数
 *  (4)若干空格
 * 小数（按顺序）可以分成以下几个部分：
 *  (1)（可选）一个符号字符（'+' 或 '-'）
 *  (2)下述格式之一：
 *      a.至少一位数字，后面跟着一个点 '.'
 *      b.至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
 *      c.一个点 '.' ，后面跟着至少一位数字
 * 整数（按顺序）可以分成以下几个部分：
 *  (1)（可选）一个符号字符（'+' 或 '-'）
 *  (2)至少一位数字
 *
 * 部分数值列举如下：
 * ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123"]
 * 部分非数值列举如下：
 * ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]
 *
 * 示例 1：
 * 输入：s = "0"
 * 输出：true
 *
 * 示例 2：
 * 输入：s = "e"
 * 输出：false
 *
 * 示例 3：
 * 输入：s = "."
 * 输出：false
 *
 * 示例 4：
 * 输入：s = "    .1  "
 * 输出：true
 *
 * 提示：
 * 1 <= s.length <= 20
 * s 仅含英文字母（大写和小写），数字（0-9），加号 '+' ，减号 '-' ，空格 ' ' 或者点 '.' 。
 */
public class StringRepresentingValue {
    /**
     * 方法：有限状态机
     * @param s
     * @return
     */
    public boolean isNumber(String s) {
        /**
         * 按照字符串从左到右的顺序，定义以下 9 种状态。
         *
         * 0、开始的空格
         * 1、幂符号前的正负号
         * 2、小数点前的数字
         * 3、小数点、小数点后的数字
         * 4、当小数点前为空格时，小数点、小数点后的数字
         * 5、幂符号
         * 6、幂符号后的正负号
         * 7、幂符号后的数字
         * 8、结尾的空格
         */
        //‘ ’为空格、‘d’为数字、‘s’为符号、‘.’为小数点、‘e’为幂号
        Map[] state = {
                //0:
                new HashMap<Character,Integer>(){{put(' ',0);put('d',2);put('s',1);put('.',4);}},
                //1:
                new HashMap<Character,Integer>(){{put('d',2);put('.',4);}},
                //2:
                new HashMap<Character,Integer>(){{put(' ',8);put('d',2);put('.',3);put('e',5);}},
                //3:
                new HashMap<Character,Integer>(){{put(' ',8);put('d',3);put('e',5);}},
                //4:
                new HashMap<Character,Integer>(){{put('d',3);}},
                //5:
                new HashMap<Character,Integer>(){{put('d',7);put('s',6);}},
                //6:
                new HashMap<Character,Integer>(){{put('d',7);}},
                //7:
                new HashMap<Character,Integer>(){{put(' ',8);put('d',7);}},
                //8:
                new HashMap<Character,Integer>(){{put(' ',8);}},
        };
        //初始状态
        int p = 0;
        //状态
        char t;
        for (char c : s.toCharArray()) {
            //当前是数字
            if (c >= '0'  && c <= '9')
                t = 'd';
            //当前是空格或小数点
            else if (c == ' ' || c == '.')
                t = c;
            //当前是符号
            else if (c == '+' || c == '-')
                t = 's';
            //当前是幂符号
            else if (c == 'e' || c == 'E')
                t = 'e';
            else //不存在的符号
                t = '?';
            //不能转换的状态，直接返回
            if (!state[p].containsKey(t))
                return false;
            //改变状态
            p = (int) state[p].get(t);
        }
        /**
         * 以p==2结尾：整数
         * 以p==3结尾：小数
         * 以p==7结尾：有幂的数
         * 以p==8结尾：空格结尾
         */
        return p == 2 || p == 3 || p == 7 || p == 8;
    }
}
