package com.leetcode.L501_600.L0535;

public class CodecTest {
    public static void main(String[] args) {
        Codec codec = new Codec();
        /*
          示例：
          输入：url = "https://leetcode.com/problems/design-tinyurl"
          输出："https://leetcode.com/problems/design-tinyurl"
         */
        String tiny = codec.encode("https://leetcode.com/problems/design-tinyurl"); // 返回加密后得到的 TinyURL 。
        System.out.println(tiny);
        String ans = codec.decode(tiny); // 返回解密后得到的原本的 URL 。
        System.out.println(ans);
    }
}
