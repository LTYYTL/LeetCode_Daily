package com.offerII.L057;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 220. 存在重复元素 III
 * 给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 *
 * 如果存在则返回 true，不存在返回 false。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 *
 * 示例 2：
 * 输入：nums = [1,0,1,1], k = 1, t = 2
 * 输出：true
 *
 * 示例 3：
 * 输入：nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出：false
 *
 * 提示：
 * 0 <= nums.length <= 2 * 104
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 104
 * 0 <= t <= 231 - 1
 */
public class ContainsDuplicateIII {
    /**
     * 方法：滑动窗口
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            //从set中寻找比nums[i]-t大的最小数
            Long ceiling = set.ceiling(((long)nums[i] - (long)t));
            //存在当前值，并且在[nums[i]-t,nums[i]+t]之间
            if (ceiling != null && ceiling <= (long)nums[i] + (long) t)
                return true;
            //加入集合
            set.add((long) nums[i]);
            //超出索引位置
            if (i >= k){
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }

    /**
     * 方法二：桶
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public boolean containsNearbyAlmostDuplicate_bucket(int[] nums, int k, int t) {
        //key为桶号，value为值
        Map<Long,Long> map = new HashMap<>();
        //桶数，每个桶的间隔小于等于t
        long w = (long)t+1;
        //遍历
        for (int i = 0; i < nums.length; i++) {
            //获取桶号
            long id = getId(nums[i],w);
            //一个桶里存在两个说明满足条件
            if (map.containsKey(id))
                return true;
            //与前一个相邻桶内数的比较
            if (map.containsKey(id - 1) && Math.abs(nums[i] - map.get(id-1))< w)
                return true;
            //与后一个相邻桶内数的比较
            if (map.containsKey(id + 1) && Math.abs(nums[i] - map.get(id+1))< w)
                return true;
            //存入map
            map.put(id, (long) nums[i]);
            //超出索引位置移除
            if (i >= k)
                map.remove(getId(nums[i-k],w));
        }
        return false;
    }

    private long getId(int x, long w) {
        if (x >= 0)
            return x/w;
        return (x+1) / w-1;
    }
}
