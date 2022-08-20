package com.offerII.L087;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer II 087. 复原 IP
 * 给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
 *
 * 示例 1：
 * 输入：s = "25525511135"
 * 输出：["255.255.11.135","255.255.111.35"]
 *
 * 示例 2：
 * 输入：s = "0000"
 * 输出：["0.0.0.0"]
 *
 * 示例 3：
 * 输入：s = "1111"
 * 输出：["1.1.1.1"]
 *
 * 示例 4：
 * 输入：s = "010010"
 * 输出：["0.10.0.10","0.100.1.0"]
 *
 * 示例 5：
 * 输入：s = "10203040"
 * 输出：["10.20.30.40","102.0.30.40","10.203.0.40"]
 *
 * 提示：
 * 0 <= s.length <= 3000
 * s 仅由数字组成
 *
 * 注意：本题与主站 93 题相同：<a href="https://leetcode-cn.com/problems/restore-ip-addresses/">https://leetcode-cn.com/problems/restore-ip-addresses/</a>
 */
public class RestoreIPAddresses {
    /**
     * 方法：回溯算法
     * @param s
     * @return
     */
    public List<String> restoreIpAddresses(String s) {
        //结果集
        List<String> res = new ArrayList<>();
        //四段做多12位数
        if (s.length() > 12)
            return res;
        //回溯算法
        dfs(s,0,0,res);

        return res;
    }

    /**
     * 回溯算法
     * @param s       字符串
     * @param begin   起始位置
     * @param count   点的个数
     * @param res     结果
     */
    private void dfs(String s, int begin, int count, List<String> res) {
        //3个点，分成4段
        if (count == 3){
            //最后一段是否合法
            if (isValid(s,begin,s.length()-1))
                res.add(s);
            return;
        }
        //遍历
        for (int i = begin; i < s.length(); i++) {
            //不合法
            if (!isValid(s,begin,i))
                break;
            //字符串拼接，进行分段
            s = s.substring(0,i+1) + "." + s.substring(i+1);
            //增加点数
            count++;
            //加入下一层
            dfs(s,i+2,count,res);
            //回退
            count--;
            //复原字符串
            s = s.substring(0,i+1) + s.substring(i+2);
        }

    }

    /**
     * 判断字段是否合法
     * @param s
     * @param start
     * @param end
     * @return
     */
    private boolean isValid(String s, int start, int end) {
        //索引问题
        if (start > end)
            return false;
        //多位，但首位是0
        if (s.charAt(start) == '0' && start !=end )
            return false;
        //计算数字
        int num = 0;
        for (int i = start; i <= end ; i++) {
            //不是数字
            if (s.charAt(i) > '9' || s.charAt(i) < '0')
                return false;
            num = num *10 + (s.charAt(i) - '0');
            //大于255
            if (num > 255)
                return false;
        }
        return true;
    }
}
