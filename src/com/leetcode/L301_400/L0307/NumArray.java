package com.leetcode.L301_400.L0307;

/**
 * 307. 区域和检索 - 数组可修改
 * 给你一个数组 nums ，请你完成两类查询。
 * (1)其中一类查询要求 更新 数组 nums 下标对应的值
 * (2)另一类查询要求返回数组 nums 中索引 left 和索引 right 之间（ 包含 ）的nums元素的 和 ，其中 left <= right
 *
 * 实现 NumArray 类：
 * (1)NumArray(int[] nums) 用整数数组 nums 初始化对象
 * (2)void update(int index, int val) 将 nums[index] 的值 更新 为 val
 * (3)int sumRange(int left, int right) 返回数组 nums 中索引 left 和索引 right 之间（ 包含 ）的nums元素的和
 * （即，nums[left] + nums[left + 1], ..., nums[right]）
 *
 * 示例 1：
 * 输入：
 * ["NumArray", "sumRange", "update", "sumRange"]
 * [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
 * 输出：
 * [null, 9, null, 8]
 * 解释：
 * NumArray numArray = new NumArray([1, 3, 5]);
 * numArray.sumRange(0, 2); // 返回 1 + 3 + 5 = 9
 * numArray.update(1, 2);   // nums = [1,2,5]
 * numArray.sumRange(0, 2); // 返回 1 + 2 + 5 = 8
 *
 * 提示：
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * 0 <= index < nums.length
 * -100 <= val <= 100
 * 0 <= left <= right < nums.length
 */
public class NumArray {
    //线段树
    private int[] segmentTree;
    //长度
    private int n;


    public NumArray(int[] nums) {
        this.n = nums.length;
        this.segmentTree = new int[n * 4];
        //构建线段树
        build(0,0,n-1,nums);
    }


    public void update(int i, int val) {
        change(i,val,0,0,n-1);
    }


    public int sumRange(int i, int j) {
        return rang(i,j,0,0,n-1);
    }

    /**
     * 构建线段树
     * @param node
     * @param s
     * @param e
     * @param nums
     */
    private void build(int node, int s, int e, int[] nums) {
        //叶子节点
        if (s == e){
            segmentTree[node] = nums[s];
            return;
        }
        //中间值
        int m = s + (e-s)/2;
        //左子树
        build(node*2 + 1, s, m, nums);
        //右子树
        build(node*2 + 2, m+1, e, nums);
        //存储和值
        segmentTree[node] = segmentTree[node*2 + 1] + segmentTree[node*2 + 2];
    }

    /**
     * 改变对应位置的值
     * @param index
     * @param val
     * @param node
     * @param s
     * @param e
     */
    private void change(int index, int val, int node, int s, int e) {
        //目标点
        if (s == e){
            segmentTree[node] = val;
            return;
        }

        //中间开始查找
        int m = s + (e - s)/2;
        //查看索引在那个范围为上
        if (index <= m){
            //左子树
            change(index, val, node*2 + 1, s, m);
        }else{
            //右子树
            change(index, val, node*2 + 2, m+1, e);
        }
        //改变和值
        segmentTree[node] = segmentTree[node*2 + 1] + segmentTree[node*2 + 2];
    }

    /**
     * 范围求值
     * @param left
     * @param right
     * @param node
     * @param s
     * @param e
     * @return
     */
    private int rang(int left, int right, int node, int s, int e) {
        //在范围里
        if (left == s && right == e){
            return segmentTree[node];
        }

        //中间值
        int m = s + (e - s)/2;
        //寻找区间
        if (right <= m){
            return rang(left, right, node*2 + 1, s, m);
        }else if (left > m){
            return rang(left, right, node*2 + 2, m + 1, e);
        }else {
            return rang(left, m, node * 2 + 1, s, m) + rang(m + 1, right, node * 2 + 2, m+1, e);
        }
    }
}
