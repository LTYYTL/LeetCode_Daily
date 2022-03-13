package com.leetcode.L301_400.L0393;

/**
 * 393. UTF-8 编码验证
 * 给定一个表示数据的整数数组 data ，返回它是否为有效的 UTF-8 编码。
 *
 * UTF-8 中的一个字符可能的长度为 1 到 4 字节，遵循以下的规则：
 *
 * 对于 1 字节 的字符，字节的第一位设为 0 ，后面 7 位为这个符号的 unicode 码。
 * 对于 n 字节 的字符 (n > 1)，第一个字节的前 n 位都设为1，第 n+1 位设为 0 ，后面字节的前两位一律设为 10 。剩下的没有提及的二进制位，全部为这个符号的 unicode 码。
 * 这是 UTF-8 编码的工作方式：
 *
 *    Char. number range  |        UTF-8 octet sequence
 *       (hexadecimal)    |              (binary)
 *    --------------------+---------------------------------------------
 *    0000 0000-0000 007F | 0xxxxxxx
 *    0000 0080-0000 07FF | 110xxxxx 10xxxxxx
 *    0000 0800-0000 FFFF | 1110xxxx 10xxxxxx 10xxxxxx
 *    0001 0000-0010 FFFF | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
 * 注意：输入是整数数组。只有每个整数的 最低 8 个有效位 用来存储数据。这意味着每个整数只表示 1 字节的数据。
 *
 * 示例 1：
 * 输入：data = [197,130,1]
 * 输出：true
 * 解释：数据表示字节序列:11000101 10000010 00000001。
 * 这是有效的 utf-8 编码，为一个 2 字节字符，跟着一个 1 字节字符。
 *
 * 示例 2：
 * 输入：data = [235,140,4]
 * 输出：false
 * 解释：数据表示 8 位的序列: 11101011 10001100 00000100.
 * 前 3 位都是 1 ，第 4 位为 0 表示它是一个 3 字节字符。
 * 下一个字节是开头为 10 的延续字节，这是正确的。
 * 但第二个延续字节不以 10 开头，所以是不符合规则的。
 *
 * 提示:
 * 1 <= data.length <= 2 * 104
 * 0 <= data[i] <= 255
 */
public class UTF8Validation {

    //掩码：10000000
    private final static int MAX1 = 1 << 7;
    //掩码：11000000
    private final static int MAX2 = (1 << 7) + (1 << 6);


    /**
     * 方法：位运算
     * @param data
     * @return
     */
    public boolean validUtf8(int[] data) {
        //长度
        int m = data.length;
        //头字节索引
        int index = 0;
        //遍历
        while (index < m){
            //获取当前数字
            int num = data[index];
            //判断当前高位，如果是头节点返回的是长度，不是返回的是-1
            int n = getBytes(num);
            //判断当前索引+n是否超出长度，或者是超过4个字节
            if (index + n > m || n < 0)
                return false;
            //遍历之后的没有个数字，是否合法
            for (int i = 1; i < n; i++) {
                if (!isValid(data[index + i]))
                    return false;
            }
            //移动到下一个头字节
            index += n;
        }

        return true;
    }

    /**
     * 判断合法，即不是头节点要保证前两位为10
     * @param num
     * @return
     */
    private boolean isValid(int num) {
        return (num & MAX2) == MAX1;
    }

    /**
     * 判断头节点后有几个连续字节
     * @param num
     * @return
     */
    private int getBytes(int num) {
        //一个字节的情况
        if ((num &MAX1) == 0)
            return 1;
        //连续字节数
        int n = 0;
        //掩码
        int mask = MAX1;
        //计算连续1个的个数
        while ((num & mask) !=0){
            n++;
            //超过四个字节
            if (n > 4)
                return -1;
            //掩码移动
            mask >>= 1;
        }
        return n >= 2 ? n : -1;
    }
}
