package com.leetcode.L0861;

/**
 * 861. 翻转矩阵后的得分
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 * 返回尽可能高的分数。
 *
 * 示例：
 * 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * 输出：39
 * 解释：
 * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 *
 * 提示：
 * 1 <= A.length <= 20
 * 1 <= A[0].length <= 20
 * A[i][j] 是 0 或 1
 */
public class ScoreAfterFlippingMatrix {
    /**
     * 方法：贪心算法
     * @param A
     * @return
     */
    public int matrixScore(int[][] A) {
        //结果
        int res = 0;
        //将最左边为0的行进行反转，使得最高位为1
        for (int i = 0; i <A.length ; ++i){
            if (A[i][0] == 0){
                for (int j = 0; j < A[i].length; ++j){
                    if (A[i][j] == 0){
                        A[i][j] = 1;
                    }else {
                        A[i][j] = 0;
                    }
                }
            }
            //计算每个二进制数的最高位的十进制和
            res += Math.pow(2,A[i].length - 1);
        }
        //除去最左边，之后的每一列中寻找0的个数比1的列进行反转，
        //如果不是直接计算其列对应的十进制
        int j = 1;
        while (j < A[0].length){
            //记录0的个数
            int zeroNum = 0;
            //记录1的个数
            int oneNum = 0;
            for (int i = 0; i < A.length; ++i){
                if (A[i][j] == 0){
                    zeroNum++;
                }else {
                    oneNum++;
                }
            }
            //0的个数比1多
            if (zeroNum > oneNum){
                //反转后0的个数就是1的个数
                oneNum = zeroNum;
            }
            //计算每个二进制数的最高位的十进制和
            res += oneNum * Math.pow(2, A[0].length - j - 1);
            //向后移动指针
            j++;
        }
        return res;
    }



}
