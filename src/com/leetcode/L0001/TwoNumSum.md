## [两数之和](https://leetcode-cn.com/problems/two-sum/)

## 题目描述
```
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

## 难度：简单

## 方法

#### 1.暴力法

- 思路
```
通过双循环的方式查找符合条件的两个数的索引（相当于双指针）
1、第一层循环为固定一个指针i
2、第二层循环的j相当于已经确定一个数去寻找符合条件的另一个数
3、当第二层循环一遍结束后，说明在固定指针i的情况下无满足条件的两个数，将指针i向后移动一位，继续进行步骤2的操作
4、当找到符合条件的两个数，用数组输出两个数的索引
```
- 图示

![TwoNumSum](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L0001/TwoNumSum.png)

- 代码

```java_holder_method_tree
    /**
     * 方法一：双指针
     * 时间复杂度：O(n^2)，对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)
     * 空间复杂度：O(1)。
     *
     * @param nums   数组
     * @param target 目标值
     * @return 满足条件的索引组成的数组
     */
    public int[] twoSum(int[] nums, int target) {
        //从索引为0的位置开始遍历
        for (int i = 0 ; i < nums.length ; i++){
            //与目标值的差值
            int temp = target - nums[i];
            //从索引为i+1的位置开始遍历，其目的可以省去已经遍历过一遍的数字组合
            for (int j = i +1; j < nums.length; j++){
                //当前值与差值相等时，即将当前的索引和差值所在索引放入int[]中
                if (temp == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
```

#### 2.哈希表
- 思路
```
通过Map存储每个数及其的索引
1、构建Map，key为数，value为数所在索引
2、遍历数组，将nums[]中的值存储在map中
3、在遍历过程中也进行判断，当前数与目标值target之间的差值，判断差值是否已经存储在map中
4、当找到符合条件的两个数，用数组输出两个数的索引
```
- 图示

![TwoNumSum_Map](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L0001/TwoNumSum_Map.png)

- 代码

```java_holder_method_tree
    /**
     * 方法二：哈希表
     * @param nums   数组
     * @param target 目标值
     * @return 满足条件的索引组成的数组
     */
    public int[] twoSum_hash(int[] nums, int target){
        //存储每个值及所在的索引
        Map<Integer,Integer> map = new HashMap<>();
        //遍历数组
        for (int i = 0 ; i < nums.length ; i++){
            //与目标值的差值
            int temp = target - nums[i];
            //判断当前的差值存在map中
            if(map.containsKey(temp)){
                //存在即将当前的索引和差值所在索引放入int[]中
                return new int[]{map.get(temp),i};
            }
            //将当前值及其索引存入map
            map.put(nums[i],i);
        }
        return null;
    }
```
