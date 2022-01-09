## [按键持续时间最长的键](https://leetcode-cn.com/problems/slowest-key/)

## 题目描述
```
LeetCode 设计了一款新式键盘，正在测试其可用性。测试人员将会点击一系列键（总计 n 个），每次一个。

给你一个长度为 n 的字符串 keysPressed ，其中 keysPressed[i] 表示测试序列中第 i 个被按下的键。
releaseTimes 是一个升序排列的列表，其中 releaseTimes[i] 表示松开第 i 个键的时间。字符串和数组的 下标都从 0 开始 。
第 0 个键在时间为 0 时被按下，接下来每个键都 恰好 在前一个键松开时被按下。
测试人员想要找出按键 持续时间最长 的键。第 i 次按键的持续时间为 releaseTimes[i] - releaseTimes[i - 1] ，第 0 次按键的持续时间为 releaseTimes[0] 。

注意，测试期间，同一个键可以在不同时刻被多次按下，而每次的持续时间都可能不同。

请返回按键 持续时间最长 的键，如果有多个这样的键，则返回 按字母顺序排列最大 的那个键。

示例 1：
输入：releaseTimes = [9,29,49,50], keysPressed = "cbcd"
输出："c"
解释：按键顺序和持续时间如下：
按下 'c' ，持续时间 9（时间 0 按下，时间 9 松开）
按下 'b' ，持续时间 29 - 9 = 20（松开上一个键的时间 9 按下，时间 29 松开）
按下 'c' ，持续时间 49 - 29 = 20（松开上一个键的时间 29 按下，时间 49 松开）
按下 'd' ，持续时间 50 - 49 = 1（松开上一个键的时间 49 按下，时间 50 松开）
按键持续时间最长的键是 'b' 和 'c'（第二次按下时），持续时间都是 20
'c' 按字母顺序排列比 'b' 大，所以答案是 'c'
```

## 难度：简单

## 方法

#### 模拟

- 思路
```
通过模拟按键的流程记录每个字母被按的持续的时间来获取最终的结果
1、初始化，默认第一个获取按键字母，第一个按键的持续时间
2、遍历keysPressed，因为第一个按键已经被记录，所以从第二个按键开始，获取按键和此按键持续时间（releaseTimes[i] - releaseTimes[i - 1]）
3、判断
（1）如果当前按键的持续时间比记录的最大的时间还要长，记录其按键的字母和持续的时间，继续遍历
（2）如果当前按键的持续时间和记录的最大的时间一样长，此时就需要判断那个字母顺序排列大，记录其按键的字母大的，继续遍历
4、遍历结束，最终记录的字母就是结果
```
- 图示

![SlowestKey](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L1601_1700/L1629/SlowestKey.png)

- 代码

```java_holder_method_tree
    /**
     * 方法：模拟
     * @param releaseTimes  每个按键被松开的时间
     * @param keysPressed   按的哪些键
     * @return
     */
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        //初始化
        char res = keysPressed.charAt(0);
        int max_time = releaseTimes[0];
        //遍历
        for (int i = 1; i < keysPressed.length(); i++) {
            //当前字符
            char c = keysPressed.charAt(i);
            //持续时间
            int time = releaseTimes[i] - releaseTimes[i-1];
            //持续时间比记录的时间长，替换
            if (time > max_time){
                res = c;
                max_time = time;
            }else if (time == max_time && c > res){
                res = c;
            }
        }
        return res;
    }
```

