package com.LCP.L0029;

/**
 * LCP 29. 乐团站位
 * 某乐团的演出场地可视作 num * num 的二维矩阵 grid（左上角坐标为 [0,0])，每个位置站有一位成员。乐团共有 9 种乐器，乐器编号为 1~9，每位成员持有 1 个乐器。
 * 为保证声乐混合效果，成员站位规则为：自 grid 左上角开始顺时针螺旋形向内循环以 1，2，...，9 循环重复排列。例如当 num = 5 时，站位如图所示
 * 请返回位于场地坐标 [Xpos,Ypos] 的成员所持乐器编号。
 *
 * 示例 1：
 * 输入：num = 3, Xpos = 0, Ypos = 2
 * 输出：3
 *
 * 示例 2：
 * 输入：num = 4, Xpos = 1, Ypos = 2
 * 输出：5
 *
 * 提示：
 * 1 <= num <= 10^9
 * 0 <= Xpos, Ypos < num
 */
public class OrchestraPosition {
    //计算所在圈数
    public int getTopLeft(int num, int xPos, int yPos) {
        int diffX = Math.min(xPos, num - 1 - xPos);
        int diffY = Math.min(yPos, num - 1 - yPos);
        return Math.min(diffX, diffY);
    }

    public int orchestraLayout(int num, int xPos, int yPos) {
        int topLeft = getTopLeft(num, xPos, yPos);

        return 0;
    }

}
