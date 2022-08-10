package com.leetcode.L601_700.L0640;

/**
 * 640. 求解方程
 * 求解一个给定的方程，将x以字符串 "x=#value" 的形式返回。该方程仅包含 '+' ， '-' 操作，变量 x 和其对应系数。
 * 如果方程没有解，请返回 "No solution" 。如果方程有无限解，则返回 “Infinite solutions” 。
 * 如果方程中只有一个解，要保证返回值 'x' 是一个整数。
 * <p>
 * 示例 1：
 * 输入: equation = "x+5-3+x=6+x-2"
 * 输出: "x=2"
 * <p>
 * 示例 2:
 * 输入: equation = "x=x"
 * 输出: "Infinite solutions"
 * <p>
 * 示例 3:
 * 输入: equation = "2x=x"
 * 输出: "x=0"
 * <p>
 * 提示:
 * 3 <= equation.length <= 1000
 * equation 只有一个 '='.
 * equation 方程由整数组成，其绝对值在 [0, 100] 范围内，不含前导零和变量 'x' 。
 */
public class SolveEquation {
    /**
     * 方法：模拟
     *
     * @param equation
     * @return
     */
    public String solveEquation(String equation) {
        // 分成左右两个部分
        String[] split = equation.split("=");
        // 左右两部分和
        int leftSum = 0;
        int rightSum = 0;

        // 将"-"变成"+-",按照"+"分割
        String[] left = split[0].replace("-", "+-").split("\\+");
        String[] right = split[1].replace("-", "+-").split("\\+");

        //处理左右两部分
        for (String s : left) {
            if (s.equals("x"))
                leftSum += 1;
            else if (s.equals("-x"))
                leftSum -= 1;
            else if (s.contains("x"))
                leftSum += Integer.parseInt(s.substring(0, s.length() - 1));
            else if (!s.equals(""))
                rightSum -= Integer.parseInt(s);
        }

        for (String s : right) {
            if (s.equals("x"))
                leftSum -= 1;
            else if (s.equals("-x"))
                leftSum += 1;
            else if (s.contains("x"))
                leftSum -= Integer.parseInt(s.substring(0, s.length() - 1));
            else if (!s.equals(""))
                rightSum += Integer.parseInt(s);
        }

        if (leftSum == 0) {
            if (rightSum == 0) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        } else {
            return "x=" + rightSum / leftSum;
        }

    }
}
