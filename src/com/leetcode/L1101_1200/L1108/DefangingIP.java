package com.leetcode.L1101_1200.L1108;

/**
 * 1108. IP 地址无效化
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *
 * 示例 1：
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 *
 * 示例 2：
 * 输入：address = "255.100.50.0"
 * 输出："255[.]100[.]50[.]0"
 *
 * 提示：
 * 给出的 address 是一个有效的 IPv4 地址
 */
public class DefangingIP {
    /**
     * 方法：模拟
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        //结果
        StringBuilder res = new StringBuilder();
        //遍历
        for (int i = 0; i < address.length(); i++) {
            //当前字符
            char c = address.charAt(i);
            //是‘.’用'[.]'替换，否则直接存入
            if (c == '.')
                res.append("[.]");
            else
                res.append(c);
        }
        return res.toString();
    }
}
