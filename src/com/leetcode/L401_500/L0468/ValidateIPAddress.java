package com.leetcode.L401_500.L0468;

/**
 * 468. 验证IP地址
 * 给定一个字符串 queryIP。如果是有效的 IPv4 地址，返回 "IPv4" ；如果是有效的 IPv6 地址，返回 "IPv6" ；如果不是上述类型的 IP 地址，返回 "Neither" 。
 * <p>
 * 有效的IPv4地址 是 “x1.x2.x3.x4” 形式的IP地址。
 * 其中 0 <= xi <= 255 且 xi 不能包含 前导零。
 * 例如: “192.168.1.1” 、 “192.168.1.0” 为有效IPv4地址， “192.168.01.1” 为无效IPv4地址; “192.168.1.00” 、 “192.168@1.1” 为无效IPv4地址。
 * <p>
 * 一个有效的IPv6地址 是一个格式为“x1:x2:x3:x4:x5:x6:x7:x8” 的IP地址，其中:
 * 1 <= xi.length <= 4
 * xi 是一个 十六进制字符串 ，可以包含数字、小写英文字母( 'a' 到 'f' )和大写英文字母( 'A' 到 'F' )。
 * 在 xi 中允许前导零。
 * 例如 "2001:0db8:85a3:0000:0000:8a2e:0370:7334" 和 "2001:db8:85a3:0:0:8A2E:0370:7334" 是有效的 IPv6 地址，
 * 而 "2001:0db8:85a3::8A2E:037j:7334" 和 "02001:0db8:85a3:0000:0000:8a2e:0370:7334" 是无效的 IPv6 地址。
 * <p>
 * 示例 1：
 * 输入：queryIP = "172.16.254.1"
 * 输出："IPv4"
 * 解释：有效的 IPv4 地址，返回 "IPv4"
 * <p>
 * 示例 2：
 * 输入：queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * 输出："IPv6"
 * 解释：有效的 IPv6 地址，返回 "IPv6"
 * <p>
 * 示例 3：
 * 输入：queryIP = "256.256.256.256"
 * 输出："Neither"
 * 解释：既不是 IPv4 地址，又不是 IPv6 地址
 * <p>
 * <p>
 * 提示：
 * <p>
 * queryIP 仅由英文字母，数字，字符 '.' 和 ':' 组成。
 */
public class ValidateIPAddress {
    /**
     * 方法：模拟
     *
     * @param queryIP
     * @return
     */
    public String validIPAddress(String queryIP) {
        //Ipv4情况
        if (queryIP.indexOf(".") != -1) {
            return isIPV4(queryIP) ? "IPv4" : "Neither";
        }
        //Ipv6情况
        if (queryIP.indexOf(':') != -1) {
            return isIPV6(queryIP) ? "IPv6" : "Neither";
        }
        return "Neither";
    }

    /**
     * 判断Ipv6的有效性
     *
     * @param queryIP
     * @return
     */
    private boolean isIPV6(String queryIP) {
        //分割
        String[] strs = queryIP.split("\\:", -1);
        //长度不符合
        if (strs.length != 8)
            return false;
        //遍历
        for (int i = 0; i < strs.length; i++) {
            //当前xi
            String cur = strs[i];
            //每个xi 长度不在1-4之间
            if (cur.length() > 4 || cur.length() == 0) {
                return false;
            }
            //遍历
            for (int j = 0; j < cur.length(); j++) {
                //当前字符
                char c = cur.charAt(j);
                //不符合条件
                if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')))
                    return false;
            }
        }
        return true;
    }

    /**
     * 判断Ipv4的有效性
     *
     * @param queryIP
     * @return
     */
    private boolean isIPV4(String queryIP) {
        //分割
        String[] strs = queryIP.split("\\.", -1);
        //长度不符合
        if (strs.length != 4)
            return false;
        //遍历
        for (int i = 0; i < strs.length; i++) {
            //当前xi
            String cur = strs[i];
            //每个xi的长度不符合
            if (cur.length() > 3 || cur.length() == 0)
                return false;
            //不允许前导0
            if (cur.length() != 1 && cur.charAt(0) == '0')
                return false;
            //转换成数字
            int num = 0;
            //遍历
            for (int j = 0; j < cur.length(); j++) {
                //当前数字
                char c = cur.charAt(j);
                //不是数字
                if (!Character.isDigit(c)) {
                    return false;
                }
                //计算
                num = num * 10 + (c - '0');
            }
            //判断是否符合条件
            if (num > 255)
                return false;
        }
        return true;
    }
}
