package com.leetcode.L501_600.L0535;

import java.util.HashMap;
import java.util.Map;

/**
 * 535. TinyURL 的加密与解密
 * TinyURL 是一种 URL 简化服务， 比如：当你输入一个 URL <a href="https://leetcode.com/problems/design-tinyurl">https://leetcode.com/problems/design-tinyurl</a> 时，
 * 它将返回一个简化的URL <a href="http://tinyurl.com/4e9iAk">http://tinyurl.com/4e9iAk</a> 。请你设计一个类来加密与解密 TinyURL 。
 * 加密和解密算法如何设计和运作是没有限制的，你只需要保证一个 URL 可以被加密成一个 TinyURL ，并且这个 TinyURL 可以用解密方法恢复成原本的 URL 。
 * <p>
 * 实现 Solution 类：
 * (1)Solution() 初始化 TinyURL 系统对象。
 * (2)String encode(String longUrl) 返回 longUrl 对应的 TinyURL 。
 * (3)String decode(String shortUrl) 返回 shortUrl 原本的 URL 。题目数据保证给定的 shortUrl 是由同一个系统对象加密的。
 * <p>
 * 示例：
 * 输入：url = "<a href="https://leetcode.com/problems/design-tinyurl">https://leetcode.com/problems/design-tinyurl</a>"
 * 输出："<a href="https://leetcode.com/problems/design-tinyurl">https://leetcode.com/problems/design-tinyurl</a>"
 * <p>
 * 解释：
 * Solution obj = new Solution();
 * string tiny = obj.encode(url); // 返回加密后得到的 TinyURL 。
 * string ans = obj.decode(tiny); // 返回解密后得到的原本的 URL 。
 * <p>
 * 提示：
 * 1 <= url.length <= 104
 * 题目数据保证 url 是一个有效的 URL
 */
public class Codec {
    /**
     * 方法：模拟
     */
    //存储网站映射
    private final Map<Integer, String> map = new HashMap<>();
    //自增id
    private int id = 0;

    // Encodes a URL to a shortened URL.
    @SuppressWarnings("HttpUrlsUsage")
    public String encode(String longUrl) {
        id++;
        //id与网站映射
        map.put(id, longUrl);
        //返回映射网址
        return "http://tinyurl.com/" + id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        //寻找id出现的索引
        int index = shortUrl.lastIndexOf("/") + 1;
        //获取id
        int key = Integer.parseInt(shortUrl.substring(index));
        //获取映射
        return map.get(key);
    }
}
