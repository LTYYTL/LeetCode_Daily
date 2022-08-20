package com.leetcode.L601_700.L0675;

import java.util.ArrayList;
import java.util.List;

public class CutTreesGolfTest {
    public static void main(String[] args) {
        CutTreesGolf cutTreesGolf = new CutTreesGolf();
        /*
          示例 1：
          输入：forest = [[1,2,3],[0,0,4],[7,6,5]]
          输出：6
          解释：沿着上面的路径，你可以用 6 步，按从最矮到最高的顺序砍掉这些树。
         */
        List<List<Integer>> list = new ArrayList<>() {{
            add(
                    new ArrayList<>() {{
                        add(1);
                        add(2);
                        add(3);
                    }}
            );
            add(
                    new ArrayList<>() {{
                        add(0);
                        add(0);
                        add(4);
                    }}
            );
            add(
                    new ArrayList<>() {{
                        add(7);
                        add(6);
                        add(5);
                    }}
            );
        }};
        System.out.println(cutTreesGolf.cutOffTree(list));
        /*
          示例 2：
          输入：forest = [[1,2,3],[0,0,0],[7,6,5]]
          输出：-1
          解释：由于中间一行被障碍阻塞，无法访问最下面一行中的树。
         */
        list.clear();
        list = new ArrayList<>() {{
            add(
                    new ArrayList<>() {{
                        add(1);
                        add(2);
                        add(3);
                    }}
            );
            add(
                    new ArrayList<>() {{
                        add(0);
                        add(0);
                        add(0);
                    }}
            );
            add(
                    new ArrayList<>() {{
                        add(7);
                        add(6);
                        add(5);
                    }}
            );
        }};
        System.out.println(cutTreesGolf.cutOffTree(list));
        /*
          示例 3：
          输入：forest = [[2,3,4],[0,0,5],[8,7,6]]
          输出：6
          解释：可以按与示例 1 相同的路径来砍掉所有的树。
          (0,0) 位置的树，可以直接砍去，不用算步数。
         */
        list.clear();
        list = new ArrayList<>() {{
            add(
                    new ArrayList<>() {{
                        add(2);
                        add(3);
                        add(4);
                    }}
            );
            add(
                    new ArrayList<>() {{
                        add(0);
                        add(0);
                        add(5);
                    }}
            );
            add(
                    new ArrayList<>() {{
                        add(8);
                        add(7);
                        add(6);
                    }}
            );
        }};
        System.out.println(cutTreesGolf.cutOffTree(list));
    }
}
