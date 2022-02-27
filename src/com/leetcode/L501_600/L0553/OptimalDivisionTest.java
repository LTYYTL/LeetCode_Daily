package com.leetcode.L501_600.L0553;

public class OptimalDivisionTest {
    public static void main(String[] args) {
        OptimalDivision optimalDivision = new OptimalDivision();
        /**
         * 示例：
         * 输入: [1000,100,10,2]
         * 输出: "1000/(100/10/2)"
         * 解释:
         * 1000/(100/10/2) = 1000/((100/10)/2) = 200
         * 但是，以下加粗的括号 "1000/((100/10)/2)" 是冗余的，
         * 因为他们并不影响操作的优先级，所以你需要返回 "1000/(100/10/2)"。
         * 其他用例:
         * 1000/(100/10)/2 = 50
         * 1000/(100/(10/2)) = 50
         * 1000/100/10/2 = 0.5
         * 1000/100/(10/2) = 2
         */
        System.out.println(optimalDivision.optimalDivision(new int[]{1000, 100, 10, 2}));
    }
}
