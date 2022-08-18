package com.offerII.L111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluateDivisionTest {
    public static void main(String[] args) {
        EvaluateDivision evaluateDivision = new EvaluateDivision();
        /**
         * 示例 1：
         * 输入：equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
         * 输出：[6.00000,0.50000,-1.00000,1.00000,-1.00000]
         * 解释：
         * 条件：a / b = 2.0, b / c = 3.0
         * 问题：a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
         * 结果：[6.0, 0.5, -1.0, 1.0, -1.0 ]
         */
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));

        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        System.out.println(Arrays.toString(evaluateDivision.calcEquation(equations, new double[]{2.0, 3.0}, queries)));
        /**
         * 示例 2：
         * 输入：equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
         * 输出：[3.75000,0.40000,5.00000,0.20000]
         */
        /**
         * 示例 3：
         * 输入：equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
         * 输出：[0.50000,2.00000,-1.00000,-1.00000]
         */
    }
}
