package com.leetcode.L2101_2200.L2155;

public class HighScoreArrIndexTest {
    public static void main(String[] args) {
        HighScoreArrIndex highScoreArrIndex = new HighScoreArrIndex();
        /*
          示例 1：
          输入：nums = [0,0,1,0]
          输出：[2,4]
          解释：按下标分组
          - 0 ：numsleft 为 [] 。numsright 为 [0,0,1,0] 。得分为 0 + 1 = 1 。
          - 1 ：numsleft 为 [0] 。numsright 为 [0,1,0] 。得分为 1 + 1 = 2 。
          - 2 ：numsleft 为 [0,0] 。numsright 为 [1,0] 。得分为 2 + 1 = 3 。
          - 3 ：numsleft 为 [0,0,1] 。numsright 为 [0] 。得分为 2 + 0 = 2 。
          - 4 ：numsleft 为 [0,0,1,0] 。numsright 为 [] 。得分为 3 + 0 = 3 。
          下标 2 和 4 都可以得到最高的分组得分 3 。
          注意，答案 [4,2] 也被视为正确答案。
         */
        System.out.println(highScoreArrIndex.maxScoreIndices(new int[]{0, 0, 1, 0}));
        /*
          示例 2：
          输入：nums = [0,0,0]
          输出：[3]
          解释：按下标分组
          - 0 ：numsleft 为 [] 。numsright 为 [0,0,0] 。得分为 0 + 0 = 0 。
          - 1 ：numsleft 为 [0] 。numsright 为 [0,0] 。得分为 1 + 0 = 1 。
          - 2 ：numsleft 为 [0,0] 。numsright 为 [0] 。得分为 2 + 0 = 2 。
          - 3 ：numsleft 为 [0,0,0] 。numsright 为 [] 。得分为 3 + 0 = 3 。
          只有下标 3 可以得到最高的分组得分 3 。
         */
        System.out.println(highScoreArrIndex.maxScoreIndices(new int[]{0, 0, 0}));
        /*
          示例 3：
          输入：nums = [1,1]
          输出：[0]
          解释：按下标分组
          - 0 ：numsleft 为 [] 。numsright 为 [1,1] 。得分为 0 + 2 = 2 。
          - 1 ：numsleft 为 [1] 。numsright 为 [1] 。得分为 0 + 1 = 1 。
          - 2 ：numsleft 为 [1,1] 。numsright 为 [] 。得分为 0 + 0 = 0 。
          只有下标 0 可以得到最高的分组得分 2 。
         */
        System.out.println(highScoreArrIndex.maxScoreIndices(new int[]{1, 1}));
    }
}
