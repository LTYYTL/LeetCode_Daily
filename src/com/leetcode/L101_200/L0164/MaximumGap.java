package com.leetcode.L101_200.L0164;

import java.util.Arrays;

/**
 * 164. 最大间距
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 * 如果数组元素个数小于 2，则返回 0。
 *
 * 示例 1:
 * 输入: [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 *
 * 示例 2:
 * 输入: [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 *
 * 说明:
 * 你可以假设数组中所有元素都是非负整数，且数值在 32 位有符号整数范围内。
 * 请尝试在线性时间复杂度和空间复杂度的条件下解决此问题。
 */
public class MaximumGap {
    /**
     * 方法一：非线性排序
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        //如果数组元素个数小于 2，则返回 0。
        if(nums.length < 2){
            return 0;
        }
        //排序
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int max = 0;
        while(j < nums.length){
            max = Math.max(nums[j] - nums[i],max);
            j++;
            i++;
        }
        return max;
    }

    /**
     * 方法二：桶排序
     * @param num
     * @return
     */
    public int maximumGap_barrel(int[] num) {
        // 边界条件判断
        if (num == null || num.length < 2)
            return 0;
        int length = num.length;
        // min和max分别表示数组中的最小值和最大值，因为题中说了数组中所有
        // 元素都是非负整数，所以最大值默认为0就可以了
        int min = Integer.MAX_VALUE;
        int max = 0;
        // 找出数组中的最大值和最小值
        for (int i = 0; i < length; i++) {
            min = Math.min(min, num[i]);
            max = Math.max(max, num[i]);
        }
        // 计算最小间隔，往上取整（比如2.1，往上取整就是3）
        int minGap = (int) Math.ceil((double) (max - min) / (length - 1));
        // 如果最小间隔是0，说明所有元素都相同，直接返回0即可
        if (minGap == 0)
            return 0;
        // 桶的数量是length，每个桶只能放两个元素，一个是最大值，一个是最小值，
        // 其中buckets[i][0]表示的是最小值，buckets[i][1]表示的是最大值
        int[][] buckets = new int[length][2];
        for (int i = 0; i < length; i++) {
            // 初始化每个桶里的最小值，因为题中说了数组中所有元素都是非负整数，
            // 所以每个桶里的最大值不需要初始化，默认为0即可
            buckets[i][0] = Integer.MAX_VALUE;
        }
        // 遍历数组中的所有元素，然后根据大小放到对应的桶里（每个桶里只能存储两个元素，一个是最大值一个是最小值）
        for (int i = 0; i < length; i++) {
            int index = (num[i] - min) / minGap;
            buckets[index][0] = Math.min(num[i], buckets[index][0]);
            buckets[index][1] = Math.max(num[i], buckets[index][1]);
        }
        // 初始化桶的大小的时候，就已经默认桶里的两个元素的差值是不可能大于minGap的，所以就更不可能大于最大间隔值,
        // 这里就不需要计算每个桶里的间隔值了，只需要计算前一个桶里的最大值和当前桶里的最小值的差值即可。
        int maxGap = 0;
        int pre = buckets[0][1];
        for (int i = 1; i < length; i++) {
            //如果桶里个元素最小值大于最大值，说明桶里没放元素，就跳过
            if (buckets[i][0] > buckets[i][1])
                continue;
            // 这里是当前桶里的最小值和前一个桶里的最大值的差值和maxGap比较，保存最大的
            maxGap = Math.max(maxGap, buckets[i][0] - pre);
            // 更新pre
            pre = buckets[i][1];
        }
        return maxGap;
    }

}
