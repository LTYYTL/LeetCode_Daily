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
    /**
     * 方法：数学
     * @param num
     * @param xPos
     * @param yPos
     * @return
     */
    public int orchestraLayout(int num, int xPos, int yPos) {
        //先确定这个位置在第几圈,circle从0开始计数，即第“一”圈为circle == 0
        long circle = Math.min(Math.min(xPos,num-1-xPos), Math.min(yPos,num-1-yPos));

        //len 记录第circle圈的边长，边长为正方形边长-1，每圈过后边长减2
        long len = num-1-2*circle;

        //count一定会溢出，这里参考 @灰包包 老哥的count解法。
        long count = (long)num*num - (len+1)*(len+1);

        //根据pos在不同的坐标来计算count，其实这里想要优化来着
        if(xPos == circle && yPos < num-1-circle){
            count += yPos - circle + 1;          //这个时候在上边的边
        }else if(yPos == num-1-circle && xPos < num-1-circle){
            count += len + xPos-circle+1;        //在右边的边
        }else if(xPos == num-1-circle && yPos>circle){
            count += 2*len + num-circle-yPos;    //在下边的边
        }else{
            count += 3*len + num-circle-xPos;
        }

        return (int)(count%9==0?9:count%9);
    }

}
