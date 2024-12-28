# LeetCode_Daily

记录自己LeetCode每日刷题之旅（现有**1174**道，持续更新中...）

## 1. **_数组系列_**

| #    | 题目                                                 | 类名                                                                                                                            | 难度 | 方法              | 标签                       |
|------|----------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|----|-----------------|--------------------------|
| 1    | [两数之和](src/com/leetcode/L1_100/L0001/TwoNumSum.md) | [TwoNumSum](src/com/leetcode/L1_100/L0001/TwoNumSum.java)                                                                     | 简单 | 双指针、Map映射       | 数组、哈希表                   |
| 11   | 盛最多水的容器                                            | [ContainerWithMostWater](src/com/leetcode/L1_100/L0011/ContainerWithMostWater.java)                                           | 中等 | 双指针             | 数组、双指针                   |
| 15   | 三数之和                                               | [Sum3](src/com/leetcode/L1_100/L0015/Sum3.java)                                                                               | 中等 | 双指针             | 数组、双指针、排序                |
| 16   | 最接近的三数之和                                           | [ThreeSumClosest](src/com/leetcode/L1_100/L0016/ThreeSumClosest.java)                                                         | 中等 | 双指针             | 数组、双指针、排序                |
| 18   | 四数之和                                               | [Sum4](src/com/leetcode/L1_100/L0018/Sum4.java)                                                                               | 中等 | 双指针             | 数组、双指针、排序                |
| 26   | 删除有序数组中的重复项                                        | [RemoveDuplicatesSortedArray](src/com/leetcode/L1_100/L0026/RemoveDuplicatesSortedArray.java)                                 | 简单 | 双指针             | 数组、双指针                   |
| 27   | 移除元素                                               | [RemoveElement](src/com/leetcode/L1_100/L0027/RemoveElement.java)                                                             | 简单 | 双指针             | 数组、双指针                   |
| 31   | 下一个排列                                              | [NextPermutation](src/com/leetcode/L1_100/L0031/NextPermutation.java)                                                         | 中等 | 双指针             | 数组、双指针                   |
| 33   | 搜索旋转排序数组                                           | [SearchRotatedSortedArray](src/com/leetcode/L1_100/L0033/SearchRotatedSortedArray.java)                                       | 简单 | 暴力法、二分查找        | 数组、二分查找                  |
| 34   | 在排序数组中查找元素的第一个和最后一个位置                              | [FindFirstAndEnd](src/com/leetcode/L1_100/L0034/FindFirstAndEnd.java)                                                         | 简单 | 二分查找            | 数组、二分查找                  |
| 35   | 搜索插入位置                                             | [SearchInsertPosition](src/com/leetcode/L1_100/L0035/SearchInsertPosition.java)                                               | 简单 | 二分查找            | 数组、二分查找                  |
| 36   | 有效的数独                                              | [ValidSudoku](src/com/leetcode/L1_100/L0036/ValidSudoku.java)                                                                 | 中等 | 模拟              | 哈希表                      |
| 41   | 缺失的第一个正数                                           | [FirstMissingPositive](src/com/leetcode/L1_100/L0041/FirstMissingPositive.java)                                               | 困难 | 哈希表、排序          | 数组                       |
| 42   | 接雨水                                                | [TrappingRainWater](src/com/leetcode/L1_100/L0042/TrappingRainWater.java)                                                     | 困难 | 单调栈、双指针         | 数组、栈、单调栈、双指针、动态规划        |
| 54   | 螺旋矩阵                                               | [SpiralMatrix](src/com/leetcode/L1_100/L0054/SpiralMatrix.java)                                                               | 中等 | 模拟              | 数组                       |
| 56   | 合并区间                                               | [MergeIntervals](src/com/leetcode/L1_100/L0056/MergeIntervals.java)                                                           | 中等 | 排序              | 数组、排序                    |
| 73   | 矩阵置零                                               | [SetMatrixZeroes](src/com/leetcode/L1_100/L0073/SetMatrixZeroes.java)                                                         | 中等 | 数组              | 数组                       |
| 74   | 搜索二维矩阵                                             | [Search2DMatrix](src/com/leetcode/L1_100/L0074/Search2DMatrix.java)                                                           | 中等 | 二分法             | 数组、二分查找                  |
| 80   | 删除有序数组中的重复项 II                                     | [RemoveDuplicatesSortedArrayII](src/com/leetcode/L1_100/L0080/RemoveDuplicatesSortedArrayII.java)                             | 中等 | 双指针             | 数组、双指针                   |
| 81   | 搜索旋转排序数组 II                                        | [SearchRotatedSortedArrayII](src/com/leetcode/L1_100/L0081/SearchRotatedSortedArrayII.java)                                   | 中等 | 二分法             | 数组、二分查找                  |
| 84   | 柱状图中最大的矩形                                          | [LargestRectangleHistogram](src/com/leetcode/L1_100/L0084/LargestRectangleHistogram.java)                                     | 困难 | 单调栈             | 数组、栈、单调栈                 |
| 88   | 合并两个有序数组                                           | [MergeSortedArray](src/com/leetcode/L1_100/L0088/MergeSortedArray.java)                                                       | 简单 | 双指针             | 数组、双指针                   |
| 118  | 杨辉三角                                               | [PascalTriangle](src/com/leetcode/L101_200/L0118/PascalTriangle.java)                                                         | 简单 | 模拟              | 数组                       |
| 153  | 寻找旋转排序数组中的最小值                                      | [FindMinimumRotatedSortedArray](src/com/leetcode/L101_200/L0153/FindMinimumRotatedSortedArray.java)                           | 中等 | 二分查找            | 数组、二分查找                  |
| 154  | 寻找旋转排序数组中的最小值II                                    | [FindMinimumRotatedSortedArrayII](src/com/leetcode/L101_200/L0154/FindMinimumRotatedSortedArrayII.java)                       | 困难 | 二分查找            | 数组、二分查找                  |
| 162  | 寻找峰值                                               | [FindPeakElement](src/com/leetcode/L101_200/L0162/FindPeakElement.java)                                                       | 中等 | 二分查找            | 数组、二分查找                  |
| 167  | 两数之和 II - 输入有序数组                                   | [TwoSumII](src/com/leetcode/L101_200/L0167/TwoSumII.java)                                                                     | 简单 | 双指针             | 数组、双指针、二分查找              |
| 169  | 多数元素                                               | [MajorityElement](src/com/leetcode/L101_200/L0169/MajorityElement.java)                                                       | 简单 | map映射、排序、摩尔投票法  | 数组、哈希表、排序、分治、计数          |
| 179  | 最大数                                                | [LargestNumber](src/com/leetcode/L101_200/L0179/LargestNumber.java)                                                           | 中等 | 排序              | 排序                       |
| 215  | 数组中的第K个最大元素                                        | [KthLargestElementArray](src/com/leetcode/L201_300/L0215/KthLargestElementArray.java)                                         | 中等 | 排序、堆、快速排序       | 数组、堆、排序、快速排序、分治          |
| 217  | 存在重复元素                                             | [ContainsDuplicate](src/com/leetcode/L201_300/L0217/ContainsDuplicate.java)                                                   | 简单 | 排序、set集合        | 数组、哈希表                   |
| 218  | 天际线问题                                              | [TheSkylineProblem](src/com/leetcode/L201_300/L0218/TheSkylineProblem.java)                                                   | 困难 | 扫描线             | 数组、分治、堆、扫描线、线段树          |
| 219  | 存在重复元素 II                                          | [ContainsDuplicateII](src/com/leetcode/L201_300/L0219/ContainsDuplicateII.java)                                               | 简单 | set集合           | 数组、哈希表、滑动窗口              |
| 220  | 存在重复元素 III                                         | [ContainsDuplicateIII](src/com/leetcode/L201_300/L0220/ContainsDuplicateIII.java)                                             | 中等 | 滑动窗口、桶          | 数组、有序集合、桶排序、排序、滑动窗口      |
| 229  | 求众数 II                                             | [MajorityElementII](src/com/leetcode/L201_300/L0229/MajorityElementII.java)                                                   | 中等 | map映射、摩尔投票      | 数组、哈希、排序、计数              |
| 240  | 搜索二维矩阵 II                                          | [FindToArray](src/com/leetcode/L201_300/L0240/FindToArray.java)                                                               | 中等 | 暴力法、数学          | 数组、双指针                   |
| 268  | 丢失的数字                                              | [MissingNumber](src/com/leetcode/L201_300/L0268/MissingNumber.java)                                                           | 简单 | 排序、set集合、位运算、数学 | 数组、哈希表、排序、数学、位运算         |
| 274  | H 指数                                               | [HIndex](src/com/leetcode/L201_300/L0274/HIndex.java)                                                                         | 中等 | 计数、排序           | 数组、排序、计数排序               |
| 275  | H 指数II                                             | [HIndexII](src/com/leetcode/L201_300/L0275/HIndexII.java)                                                                     | 中等 | 遍历、二分查找         | 数组、二分查找                  |
| 278  | 第一个错误的版本                                           | [FirstBadVersion](src/com/leetcode/L201_300/L0278/FirstBadVersion.java)                                                       | 简单 | 二分查找            | 二分查找                     |
| 283  | 移动零                                                | [MoveZeroes](src/com/leetcode/L201_300/L0283/MoveZeroes.java)                                                                 | 简单 | 双指针             | 数组、双指针                   |
| 287  | 寻找重复数                                              | [FindDuplicateNum](src/com/leetcode/L201_300/L0287/FindDuplicateNum.java)                                                     | 中等 | sey集合、双指针       | 数组、双指针、二分查找、位运算          |
| 324  | 摆动排序 II                                            | [WiggleSortII](src/com/leetcode/L301_400/L0324/WiggleSortII.java)                                                             | 中等 | 双指针             | 数组、排序、分治、快速选择            |
| 344  | 字符串反转                                              | [ReverseString](src/com/leetcode/L301_400/L0344/ReverseString.java)                                                           | 简单 | 双指针             | 数组、双指针                   |
| 347  | 前 K 个高频元素                                          | [KHighElement](src/com/leetcode/L301_400/L0347/KHighElement.java)                                                             | 中等 | 最小根堆            | 堆、哈希表                    |
| 349  | 两个数组的交集                                            | [IntersectionArray](src/com/leetcode/L301_400/L0349/IntersectionArray.java)                                                   | 简单 | Set集合、双指针       | 哈希表、双指针、二分查找             |
| 350  | 两个数组的交集II                                          | [IntersectionArrayII](src/com/leetcode/L301_400/L0350/IntersectionArrayII.java)                                               | 简单 | Map映射、双指针       | 哈希表、双指针、二分查找             |
| 363  | 矩形区域不超过 K 的最大数值和                                   | [MaxSumRectangleNoLargerThanK](src/com/leetcode/L301_400/L0363/MaxSumRectangleNoLargerThanK.java)                             | 困难 | 暴力法、二分查找        | 队列、二分查找、动态规划             |
| 370  | 区间加法                                               | [IntervalAddition](src/com/leetcode/L301_400/L0370/IntervalAddition.java)                                                     | 中等 | 差分数组            | 数组、前缀和                   |*
| 373  | 查找和最小的K对数字                                         | [FindKPairsSmallestSums](src/com/leetcode/L301_400/L0373/FindKPairsSmallestSums.java)                                         | 中等 | 堆               | 数组、堆                     |
| 374  | 猜数字大小                                              | [GuessNumberHigherLower](src/com/leetcode/L301_400/L0374/GuessNumberHigherLower.java)                                         | 简单 | 二分查找            | 二分查找                     |
| 384  | 打乱数组                                               | [Solution](src/com/leetcode/L301_400/L0384/Solution.java)                                                                     | 中等 | 洗牌算法            | 数组、数学、随进化                |
| 386  | 字典序排数                                              | [LexicographicalNumbers](src/com/leetcode/L301_400/L0386/LexicographicalNumbers.java)                                         | 中等 | 深度优先搜索          | 字典树、深度优先搜索               |
| 414  | 第三大的数                                              | [ThirdMaximumNumber](src/com/leetcode/L401_500/L0414/ThirdMaximumNumber.java)                                                 | 简单 | 排序、set集合        | 数组、排序                    |
| 421  | 数组中两个数的最大异或值                                       | [MaximumXORTwoNumbersArray](src/com/leetcode/L401_500/L0421/MaximumXORTwoNumbersArray.java)                                   | 中等 | 暴力法、前缀树         | 位运算、前缀树                  |
| 436  | 寻找右区间                                              | [FindRightInterval](src/com/leetcode/L401_500/L0436/FindRightInterval.java)                                                   | 中等 | 二分查找            | 数组、二分查找、排序               |
| 441  | 排列硬币                                               | [ArrangingCoins](src/com/leetcode/L401_500/L0441/ArrangingCoins.java)                                                         | 简单 | 二分查找            | 数学、二分查找                  |
| 442  | 数组中重复的数据                                           | [FindDuplicatesArray](src/com/leetcode/L401_500/L0442/FindDuplicatesArray.java)                                               | 中等 | 数组              | 数学、哈希表                   |
| 448  | 找到所有数组中消失的数字                                       | [FindAllNumbersDisappearedArray](src/com/leetcode/L401_500/L0448/FindAllNumbersDisappearedArray.java)                         | 简单 | 哈希表             | 数组                       |
| 456  | 132模式                                              | [Pattern132](src/com/leetcode/L401_500/L0456/Pattern132.java)                                                                 | 中等 | 栈               | 数组、栈                     |
| 457  | 环形数组是否存在循环                                         | [CircularArrayLoop](src/com/leetcode/L401_500/L0457/CircularArrayLoop.java)                                                   | 中等 | 快慢指针            | 数组、双指针、哈希表               |
| 485  | 最大连续1的个数                                           | [MaxConsecutiveOnes](src/com/leetcode/L401_500/L0485/MaxConsecutiveOnes.java)                                                 | 简单 | 一次遍历            | 数组                       |
| 495  | 提莫攻击                                               | [TeemoAttacking](src/com/leetcode/L401_500/L0495/TeemoAttacking.java)                                                         | 简单 | 模拟              | 数组、模拟                    |
| 496  | 下一个更大元素 I                                          | [NextGreaterElementI](src/com/leetcode/L401_500/L0496/NextGreaterElementI.java)                                               | 简单 | 单调栈             | 数组、栈、哈希表、单调栈             |
| 502  | IPO                                                | [PIO](src/com/leetcode/L501_600/L0502/PIO.java)                                                                               | 困难 | 堆               | 数组、优先队列、贪心算法、排序          |
| 503  | 下一个更大元素 II                                         | [NextGreaterElementII](src/com/leetcode/L501_600/L0503/NextGreaterElementII.java)                                             | 中等 | 栈               | 单调栈                      |
| 506  | 相对名次                                               | [RelativeRanks](src/com/leetcode/L501_600/L0506/RelativeRanks.java)                                                           | 简单 | 堆               | 数组、堆、排序                  |
| 522  | 最长特殊序列 II                                          | [LongUncommonSubII](src/com/leetcode/L501_600/L0522/LongUncommonSubII.java)                                                   | 中等 | 双指针             | 数组、字符串、哈希表、双指针、排序        |
| 523  | 连续的子数组和                                            | [ContinuousSubarraySum](src/com/leetcode/L501_600/L0523/ContinuousSubarraySum.java)                                           | 中等 | 暴力法             | 数学、动态规划                  |
| 525  | 连续数组                                               | [ContiguousArray](src/com/leetcode/L501_600/L0525/ContiguousArray.java)                                                       | 中等 | Map映射           | 哈希表                      |
| 532  | 数组中的 k-diff 数对                                     | [KdiffPairsArray](src/com/leetcode/L501_600/L0532/KdiffPairsArray.java)                                                       | 中等 | Set集合           | 数组、哈希表、双指针、二分查找、排序       |
| 540  | 有序数组中的单一元素                                         | [SingleElementSortedArray](src/com/leetcode/L501_600/L0540/SingleElementSortedArray.java)                                     | 中等 | 暴力法、二分查找        | 数组、二分查找                  |
| 565  | 数组嵌套                                               | [ArrayNesting](src/com/leetcode/L501_600/L0565/ArrayNesting.java)                                                             | 中等 | 模拟              | 数组、深度优先搜索                |
| 575  | 分糖果                                                | [DistributeCandies](src/com/leetcode/L501_600/L0575/DistributeCandies.java)                                                   | 简单 | set集合           | 数组、哈希表                   |
| 581  | 最短无序连续子数组                                          | [ShortestUnsortedContinuousSubarray](src/com/leetcode/L501_600/L0581/ShortestUnsortedContinuousSubarray.java)                 | 中等 | 排序              | 数组、栈、贪心算法、排序、单调栈、双指针     |
| 594  | 最长和谐子序列                                            | [LongestHarmoniousSubsequence](src/com/leetcode/L501_600/L0594/LongestHarmoniousSubsequence.java)                             | 简单 | map映射           | 数组、哈希表、排序                |
| 611  | 有效三角形的个数                                           | [ValidTriangleNumber](src/com/leetcode/L601_700/L0611/ValidTriangleNumber.java)                                               | 中等 | 二分查找、双指针        | 数组、二分查找、双指针、排序、贪心算法      |
| 628  | 三个数的最大乘积                                           | [MaxProductThreeNumbers](src/com/leetcode/L601_700/L0628/MaxProductThreeNumbers.java)                                         | 简单 | 排序              | 数组、数学                    |
| 630  | 课程表 III                                            | [CourseScheduleIII](src/com/leetcode/L601_700/L0630/CourseScheduleIII.java)                                                   | 困难 | 堆               | 数组、堆、贪心算法                |
| 636  | 函数的独占时间                                            | [ExclusiveTimeFunctions](src/com/leetcode/L601_700/L0636/ExclusiveTimeFunctions.java)                                         | 中等 | 栈               | 数组、栈                     |
| 643  | 子数组最大平均数I                                          | [MaximumAverageSubarrayI](src/com/leetcode/L601_700/L0643/MaximumAverageSubarrayI.java)                                       | 简单 | 双指针             | 数组                       |
| 645  | 错误的集合                                              | [SetMismatch](src/com/leetcode/L601_700/L0645/SetMismatch.java)                                                               | 简单 | set集合           | 数组、哈希表、排序、位运算            |
| 646  | 最长数对链                                              | [MaxPairChain](src/com/leetcode/L601_700/L0646/MaxPairChain.java)                                                             | 中等 | 排序              | 数组、排序、动态规划、贪心算法          |
| 658  | 找到 K 个最接近的元素                                       | [FindKClosestElements](src/com/leetcode/L601_700/L0658/FindKClosestElements.java)                                             | 中等 | 排序              | 数组、堆、排序、双指针、二分查找         |
| 682  | 棒球比赛                                               | [BaseballGame](src/com/leetcode/L601_700/L0682/BaseballGame.java)                                                             | 简单 | 栈               | 数组、栈、模拟                  |
| 690  | 员工的重要性                                             | [EmployeeImportance](src/com/leetcode/L601_700/L0690/EmployeeImportance.java)                                                 | 简单 | 深度优先遍历、广度优先遍历   | 数组                       |
| 692  | 前K个高频单词                                            | [TopKFrequentWords](src/com/leetcode/L601_700/L0692/TopKFrequentWords.java)                                                   | 中等 | 最小堆             | 堆、哈希表、字典树                |
| 699  | 掉落的方块                                              | [FallingSquares](src/com/leetcode/L601_700/L0699/FallingSquares.java)                                                         | 困难 | 暴力法             | 数组、线段树、有序集合              |
| 704  | 二分查找                                               | [BinarySearch](src/com/leetcode/L701_800/L0704/BinarySearch.java)                                                             | 简单 | 二分查找            | 数组、二分查找                  |
| 717  | 1比特与2比特字符                                          | [BitCharacters](src/com/leetcode/L701_800/L0717/BitCharacters.java)                                                           | 简单 | 模拟              | 数组                       |
| 719  | 找出第 K 小的数对距离                                       | [FindKSmallestPairDistance](src/com/leetcode/L701_800/L0719/FindKSmallestPairDistance.java)                                   | 困难 | 二分查找            | 数组、双指针、排序、二分查找           |
| 735  | 行星碰撞                                               | [AsteroidCollision](src/com/leetcode/L701_800/L0735/AsteroidCollision.java)                                                   | 中等 | 栈               | 数组、栈                     |
| 739  | 每日温度                                               | [DailyTemperatures](src/com/leetcode/L701_800/L0739/DailyTemperatures.java)                                                   | 中等 | 单调栈             | 数组、栈、单调栈                 |
| 744  | 寻找比目标字母大的最小字母                                      | [FindSmallestLetterTarget](src/com/leetcode/L701_800/L0744/FindSmallestLetterTarget.java)                                     | 简单 | 二分查找            | 数组、二分查找                  |
| 747  | 至少是其他数字两倍的最大数                                      | [NumberTwiceOthers](src/com/leetcode/L701_800/L0747/NumberTwiceOthers.java)                                                   | 简单 | 模拟              | 数组、排序                    |
| 752  | 打开转盘锁                                              | [OpenTheLock](src/com/leetcode/L701_800/L0752/OpenTheLock.java)                                                               | 中等 | 广度优先搜索          | 广度优先搜索                   |
| 764  | 最大加号标志                                             | [LargestPlusSign](src/com/leetcode/L701_800/L0764/LargestPlusSign.java)                                                       | 中等 | 模拟              | 数组、动态规划                  |
| 766  | 托普利茨矩阵                                             | [ToeplitzMatrix](src/com/leetcode/L701_800/L0766/ToeplitzMatrix.java)                                                         | 简单 | 遍历              | 数组                       |
| 768  | 最多能完成排序的块 II                                       | [MaxChunksSortedII](src/com/leetcode/L701_800/L0768/MaxChunksSortedII.java)                                                   | 困难 | 栈               | 数组、栈、单调栈、贪心算法、排序         |
| 769  | 最多能完成排序的块                                          | [MaxChunksMakeSorted](src/com/leetcode/L701_800/L0769/MaxChunksMakeSorted.java)                                               | 中等 | 模拟              | 数组、栈、单调栈、贪心算法、排序         |
| 786  | 第 K 个最小的素数分数                                       | [KSmallestPrimeFraction](src/com/leetcode/L701_800/L0786/KSmallestPrimeFraction.java)                                         | 困难 | 堆               | 数组、二分查找、优先队列             |
| 795  | 区间子数组个数                                            | [NumberSubMax](src/com/leetcode/L701_800/L0795/NumberSubMax.java)                                                             | 中等 | 双指针             | 数组、双指针                   |
| 815  | 公交路线                                               | [BusRoutes](src/com/leetcode/L801_900/L0815/BusRoutes.java)                                                                   | 困难 | 广度优先搜索          | 数组、哈希表、广度优先搜索            |
| 825  | 适龄的朋友                                              | [FriendsAppropriateAges](src/com/leetcode/L801_900/L0825/FriendsAppropriateAges.java)                                         | 中等 | 双指针             | 数组、排序、双指针、二分查找           |
| 830  | 较大分组的位置                                            | [PositionsLargeGroups](src/com/leetcode/L801_900/L0830/PositionsLargeGroups.java)                                             | 简单 | 双指针             | 数组                       |
| 852  | 山脉数组的峰顶索引                                          | [PeakIndexMountainArray](src/com/leetcode/L801_900/L0852/PeakIndexMountainArray.java)                                         | 简单 | 二分查找            | 二分查找                     |
| 867  | 转置矩阵                                               | [TransposeMatrix](src/com/leetcode/L801_900/L0867/TransposeMatrix.java)                                                       | 简单 | 模拟              | 数组                       |
| 870  | 优势洗牌                                               | [AdvantageShuffle](src/com/leetcode/L801_900/L0870/AdvantageShuffle.java)                                                     | 中等 | 排序              | 数组、排序、双指针、贪心算法           |
| 875  | 爱吃香蕉的珂珂                                            | [KokoEatingBananas](src/com/leetcode/L801_900/L0875/KokoEatingBananas.java)                                                   | 中等 | 二分查找            | 数组、二分查找                  |
| 881  | 救生艇                                                | [BoatsSavePeople](src/com/leetcode/L801_900/L0881/BoatsSavePeople.java)                                                       | 中等 | 双指针             | 数组、排序、双指针、贪心算法           |
| 905  | 按奇偶排序数组                                            | [SortArrayByParityII](src/com/leetcode/L901_1000/L0905/SortArrayByParity.java)                                                | 简单 | 双指针             | 数组                       |
| 907  | 子数组的最小值之和                                          | [SumSubarrayMin](src/com/leetcode/L901_1000/L0907/SumSubarrayMin.java)                                                        | 中等 | 单调栈             | 数组、栈、单调栈、动态规划            |
| 912  | 排序数组                                               | [SortArray](src/com/leetcode/L901_1000/L0912/SortArray.java)                                                                  | 简单 | 快速排序            | 数组、排序、基数排序、堆、桶排序、分治、计数排序 |
| 915  | 分割数组                                               | [PartitionArrayDisjoint](src/com/leetcode/L901_1000/L0915/PartitionArrayDisjoint.java)                                        | 中等 | 模拟              | 数组                       |
| 922  | 按奇偶排序数组 II                                         | [SortArrayByParityII](src/com/leetcode/L901_1000/L0922/SortArrayByParityII.java)                                              | 简单 | 暴力法             | 数组、排序                    |
| 942  | 增减字符串匹配                                            | [DIStringMatch](src/com/leetcode/L901_1000/L0942/DIStringMatch.java)                                                          | 简单 | 数学              | 数组、字符串、数学、双指针、贪心算法       |
| 946  | 验证栈序列                                              | [ValidateStackSequences](src/com/leetcode/L901_1000/L0946/ValidateStackSequences.java)                                        | 中等 | 模拟              | 数组、栈、模拟                  |
| 954  | 二倍数对数组                                             | [ArrayDoubledPairs](src/com/leetcode/L901_1000/L0954/ArrayDoubledPairs.java)                                                  | 中等 | map映射           | 数组、哈希表、贪心算法、排序           |
| 961  | 在长度 2N 的数组中找出重复 N 次的元素                             | [RepeatedElementArray](src/com/leetcode/L901_1000/L0961/RepeatedElementArray.java)                                            | 简单 | set集合           | 数组、哈希表                   |
| 969  | 煎饼排序                                               | [PancakeSorting](src/com/leetcode/L901_1000/L0969/PancakeSorting.java)                                                        | 中等 | 递归              | 数组、双指针、排序、贪心算法           |
| 973  | 最接近原点的 K 个点                                        | [KClosestPointsOrigin](src/com/leetcode/L901_1000/L0973/KClosestPointsOrigin.java)                                            | 中等 | 最大堆             | 堆、排序、分治算法                |
| 977  | 有序数组的平方                                            | [SquaresSortedArray](src/com/leetcode/L901_1000/L0977/SquaresSortedArray.java)                                                | 简单 | 模拟              | 数组、双指针                   |
| 1001 | 网格照明                                               | [GridIllumination](src/com/leetcode/L1001_1100/L1001/GridIllumination.java)                                                   | 困难 | map映射           | 数组、哈希表                   |
| 1011 | 在 D 天内送达包裹的能力                                      | [CapacityToShipPackagesWithinDDays](src/com/leetcode/L1001_1100/L1011/CapacityToShipPackagesWithinDDays.java)                 | 中等 | 二分查找            | 数组、二分查找                  |
| 1036 | 逃离大迷宫                                              | [EscapeLargeMaze](src/com/leetcode/L1001_1100/L1036/EscapeLargeMaze.java)                                                     | 困难 | 广度优先搜索          | 数组、哈希表、广度优先搜索、深度优先搜索     |
| 1051 | 高度检查器                                              | [HeightChecker](src/com/leetcode/L1001_1100/L1051/HeightChecker.java)                                                         | 简单 | 排序              | 数组、排序、计数排序               |
| 1089 | 复写零                                                | [DuplicateZeros](src/com/leetcode/L1001_1100/L1089/DuplicateZeros.java)                                                       | 简单 | 栈               | 数组、双指针                   |
| 1094 | 拼车                                                 | [CarPooling](src/com/leetcode/L1001_1100/L1094/CarPooling.java)                                                               | 中等 | 差分数组            | 数组、堆、前缀和、排序、模拟           |
| 1122 | 数组的相对排序                                            | [RelativeSortArray](src/com/leetcode/L1101_1200/L1122/RelativeSortArray.java)                                                 | 简单 | 排序              | 数组、哈希表、排序、计数排序           |
| 1200 | 最小绝对差                                              | [MinAbsoluteDiff](src/com/leetcode/L1101_1200/L1200/MinAbsoluteDiff.java)                                                     | 简单 | 排序              | 数组、排序                    |
| 1224 | 最大相等频率                                             | [MaxEqualFrequency](src/com/leetcode/L1201_1300/L1224/MaxEqualFrequency.java)                                                 | 困难 | map映射           | 数组、哈希表                   |
| 1252 | 奇数值单元格的数目                                          | [CellsValuesMatrix](src/com/leetcode/L1201_1300/L1252/CellsValuesMatrix.java)                                                 | 简单 | 模拟              | 数组、数学、模拟                 |
| 1282 | 用户分组                                               | [GroupPeople](src/com/leetcode/L1201_1300/L1282/GroupPeople.java)                                                             | 简单 | map映射           | 数组、哈希表                   |
| 1295 | 统计位数为偶数的数字                                         | [FindEvenNumDigits](src/com/leetcode/L1201_1300/L1295/FindEvenNumDigits.java)                                                 | 简单 | 模拟              | 数组                       |
| 1313 | 解压缩编码列表                                            | [DecompressEncodedList](src/com/leetcode/L1301_1400/L1313/DecompressEncodedList.java)                                         | 简单 | 模拟              | 数组                       |
| 1331 | 数组序号转换                                             | [RankTransformArray](src/com/leetcode/L1301_1400/L1331/RankTransformArray.java)                                               | 简单 | 排序              | 数组、哈希表、排序                |
| 1331 | 数组大小减半                                             | [HalfArray](src/com/leetcode/L1301_1400/L1338/HalfArray.java)                                                                 | 中等 | 优先队列            | 贪心、数组、哈希表、排序、堆（优先队列）     |
| 1345 | 跳跃游戏 IV                                            | [JumpGameIV](src/com/leetcode/L1301_1400/L1345/JumpGameIV.java)                                                               | 困难 | 广度优先搜索          | 数组、哈希表、广度优先搜索            |
| 1365 | 有多少小于当前数字的数字                                       | [ManyNumMin](src/com/leetcode/L1301_1400/L1365/ManyNumMin.java)                                                               | 简单 | 暴力法、Map映射       | 数组、哈希表                   |
| 1403 | 非递增顺序的最小子序列                                        | [MinSubNonOrder](src/com/leetcode/L1401_1500/L1403/MinSubNonOrder.java)                                                       | 简单 | 排序              | 数组、排序、贪心算法               |
| 1418 | 点菜展示表                                              | [DisplayTableFoodOrdersRestaurant](src/com/leetcode/L1401_1500/L1418/DisplayTableFoodOrdersRestaurant.java)                   | 中等 | Map映射           | 数组、字符串、哈希表、排序、有序集合       |
| 1431 | 拥有最多糖果的孩子                                          | [KidsWithMaxCandies](src/com/leetcode/L1401_1500/L1431/KidsWithMaxCandies.java)                                               | 简单 | 模拟              | 数组                       |
| 1441 | 用栈操作构建数组                                           | [BuildArrayStackOperations](src/com/leetcode/L1401_1500/L1441/BuildArrayStackOperations.java)                                 | 中等 | 模拟              | 数组、栈、模拟                  |
| 1442 | 形成两个异或相等数组的三元组数目                                   | [CountTripletsThatCanFormTwoArraysEqualXOR](src/com/leetcode/L1401_1500/L1442/CountTripletsThatCanFormTwoArraysEqualXOR.java) | 中等 | 双指针             | 数组、位运算、数学                | 
| 1450 | 在既定时间做作业的学生人数                                      | [NumberStudentsGivenTime](src/com/leetcode/L1401_1500/L1450/NumberStudentsGivenTime.java)                                     | 简单 | 模拟              | 数组                       |
| 1460 | 通过翻转子数组使两个数组相等                                     | [TwoArraysEqual](src/com/leetcode/L1401_1500/L1460/TwoArraysEqual.java)                                                       | 简单 | 排序              | 数组、哈希表、排序                |
| 1464 | 数组中两元素的最大乘积                                        | [MaxTwoElements](src/com/leetcode/L1401_1500/L1464/MaxTwoElements.java)                                                       | 简单 | 排序              | 数组、堆、排序                  |
| 1470 | 重新排列数组                                             | [ShuffleArray](src/com/leetcode/L1401_1500/L1470/ShuffleArray.java)                                                           | 简单 | 模拟              | 数组                       |
| 1475 | 商品折扣后的最终价格                                         | [PricesShop](src/com/leetcode/L1401_1500/L1475/PricesShop.java)                                                               | 简单 | 双指针             | 数组、栈、单调栈                 |
| 1480 | 一维数组的动态和                                           | [RunningSumArray](src/com/leetcode/L1401_1500/L1480/RunningSumArray.java)                                                     | 简单 | 模拟              | 数组、前缀和                   |
| 1512 | 好数对的数目                                             | [NumberGoodPairs](src/com/leetcode/L1501_1600/L1512/NumberGoodPairs.java)                                                     | 简单 | map映射           | 数组、哈希表、数学、计数             |
| 1583 | 统计不开心的朋友                                           | [CountUnhappyFriends](src/com/leetcode/L1501_1600/L1583/CountUnhappyFriends.java)                                             | 中等 | 模拟              | 数组、模拟                    |
| 1598 | 文件夹操作日志搜集器                                         | [CrawlerLogFolder](src/com/leetcode/L1501_1600/L1598/CrawlerLogFolder.java)                                                   | 简单 | 栈               | 数组、字符串、栈                 |
| 1606 | 找到处理最多请求的服务器                                       | [FindServersMostRequests](src/com/leetcode/L1601_1700/L1606/FindServersMostRequests.java)                                     | 中等 | 优先队列+有序集合       | 数组、优先队列、有序集合、贪心算法        |
| 1608 | 特殊数组的特征值                                           | [ArrayElements](src/com/leetcode/L1601_1700/L1608/ArrayElements.java)                                                         | 简单 | 排序              | 数组、排序、二分查找               |
| 1619 | 删除某些元素后的数组均值                                       | [MeanArrayElements](src/com/leetcode/L1601_1700/L1619/MeanArrayElements.java)                                                 | 简单 | 排序              | 数组、排序                    |
| 1620 | 网络信号最好的坐标                                          | [CoordinateMaxNetwork](src/com/leetcode/L1601_1700/L1620/CoordinateMaxNetwork.java)                                           | 中等 | 模拟              | 数组、枚举                    |
| 1636 | 按照频率将数组升序排序                                        | [SortArrayIncreasingFrequency](src/com/leetcode/L1601_1700/L1636/SortArrayIncreasingFrequency.java)                           | 简单 | map映射           | 数组、哈希表、排序                |
| 1640 | 能否连接形成数组                                           | [CheckArrayConcatenation](src/com/leetcode/L1601_1700/L1640/CheckArrayConcatenation.java)                                     | 简单 | map映射           | 数组、哈希表                   |
| 1646 | 获取生成数组中的最大值                                        | [GetMaximumGeneratedArray](src/com/leetcode/L1601_1700/L1646/GetMaximumGeneratedArray.java)                                   | 简单 | 模拟              | 数组、模拟、动态规划               |
| 1652 | 拆炸弹                                                | [DefuseBomb](src/com/leetcode/L1601_1700/L1652/DefuseBomb.java)                                                               | 简单 | 模拟              | 数组                       |
| 1700 | 无法吃午餐的学生数量                                         | [StudentsEatLunch](src/com/leetcode/L1601_1700/L1700/StudentsEatLunch.java)                                                   | 简单 | 模拟              | 数组、队列、栈、模拟               |
| 1705 | 吃苹果的最大数目                                           | [MaxEatenApples](src/com/leetcode/L1701_1800/L1705/MaxEatenApples.java)                                                       | 中等 | 堆               | 数组、堆、贪心算法                |
| 1710 | 卡车上的最大单元数                                          | [MaxUnitsTruck](src/com/leetcode/L1701_1800/L1710/MaxUnitsTruck.java)                                                         | 简单 | 排序              | 数组、排序、贪心算法               |
| 1711 | 大餐计数                                               | [CountGoodMeals](src/com/leetcode/L1701_1800/L1711/CountGoodMeals.java)                                                       | 中等 | map映射           | 数组、哈希表                   |
| 1713 | 得到子序列的最少操作次数                                       | [MinimumOperationsMakeSubsequence](src/com/leetcode/L1701_1800/L1713/MinimumOperationsMakeSubsequence.java)                   | 困难 | 二分查找            | 数组、哈希表、贪心算法、二分查找         |
| 1725 | 可以形成最大正方形的矩形数目                                     | [CountGoodRectangles](src/com/leetcode/L1701_1800/L1725/CountGoodRectangles.java)                                             | 简单 | 模拟              | 数组                       |
| 1732 | 找到最高海拔                                             | [FindHighestAltitude](src/com/leetcode/L1701_1800/L1732/FindHighestAltitude.java)                                             | 简单 | 模拟              | 数组、前缀和                   |
| 1743 | 从相邻元素对还原数组                                         | [RestoreArrayFromAdjacentPairs](src/com/leetcode/L1701_1800/L1743/RestoreArrayFromAdjacentPairs.java)                         | 中等 | Map映射           | 数组、哈希表                   |
| 1748 | 唯一元素的和                                             | [SumUniqueElements](src/com/leetcode/L1701_1800/L1748/SumUniqueElements.java)                                                 | 简单 | Map映射           | 数组、哈希表、计数                |
| 1752 | 检查数组是否经排序和轮转得到                                     | [CheckSorted](src/com/leetcode/L1701_1800/L1752/CheckSorted.java)                                                             | 简单 | 模拟              | 数组                       |
| 1779 | 找到最近的有相同 X 或 Y 坐标的点                                | [FindPointSame](src/com/leetcode/L1701_1800/L1779/FindPointSame.java)                                                         | 简单 | 模拟              | 数组                       |
| 1800 | 最大升序子数组和                                           | [MaximumAscendingSubarraySum](src/com/leetcode/L1701_1800/L1800/MaximumAscendingSubarraySum.java)                             | 简单 | 双指针             | 数组、双指针                   |
| 1801 | 积压订单中的订单总数                                         | [NumberOrdersBacklog](src/com/leetcode/L1801_1900/L1801/NumberOrdersBacklog.java)                                             | 中等 | 堆               | 堆、贪心算法                   |
| 1818 | 绝对差值和                                              | [MinimumAbsoluteSumDifference](src/com/leetcode/L1801_1900/L1818/MinimumAbsoluteSumDifference.java)                           | 中等 | 二分查找            | 数组、贪心算法、二分查找、有序集合        |
| 1823 | 找出游戏的获胜者                                           | [FindWinnerGame](src/com/leetcode/L1801_1900/L1823/FindWinnerGame.java)                                                       | 中等 | 队列              | 数组、队列、数学、模拟、递归           |
| 1827 | 最少操作使数组递增                                          | [MinOperationsArray](src/com/leetcode/L1801_1900/L1827/MinOperationsArray.java)                                               | 简单 | 模拟              | 数组、贪心算法                  |
| 1833 | 雪糕的最大数量                                            | [MaximumIceCreamBars](src/com/leetcode/L1801_1900/L1833/MaximumIceCreamBars.java)                                             | 中等 | 排序              | 数组、排序                    |
| 1834 | 单线程 CPU                                            | [SingleThreadedCPU](src/com/leetcode/L1801_1900/L1834/SingleThreadedCPU.java)                                                 | 中等 | 堆               | 数组、堆                     |
| 1846 | 减小和重新排列数组后的最大元素                                    | [MaximumElementAfterDecreasingRearranging](src/com/leetcode/L1801_1900/L1846/MaximumElementAfterDecreasingRearranging.java)   | 中等 | 排序、计数           | 数组、排序、贪心                 |
| 1877 | 数组中最大数对和的最小值                                       | [MinimizeMaximumPairSumArray](src/com/leetcode/L1801_1900/L1877/MinimizeMaximumPairSumArray.java)                             | 中等 | 排序              | 贪心算法、排序                  |
| 1882 | 使用服务器处理任务                                          | [ProcessTasksUsingServers](src/com/leetcode/L1801_1900/L1882/ProcessTasksUsingServers.java)                                   | 中等 | 堆               | 堆                        |
| 1887 | 使数组元素相等的减少操作次数                                     | [ReductionOperationsArrayEqual](src/com/leetcode/L1801_1900/L1887/ReductionOperationsArrayEqual.java)                         | 中等 | 排序              | 数组、排序                    |
| 1913 | 两个数对之间的最大乘积差                                       | [MaxDiffTwoPairs](src/com/leetcode/L1901_2000/L1913/MaxDiffTwoPairs.java)                                                     | 简单 | 排序              | 数组、排序                    |
| 1920 | 基于排列构建数组                                           | [BuildArrayPermutation](src/com/leetcode/L1901_2000/L1920/BuildArrayPermutation.java)                                         | 简单 | 模拟              | 数组、模拟                    |
| 1929 | 数组串联                                               | [ConcatenationArray](src/com/leetcode/L1901_2000/L1929/ConcatenationArray.java)                                               | 简单 | 模拟              | 数组                       |
| 1984 | 学生分数的最小差值                                          | [MinKScores](src/com/leetcode/L1901_2000/L1984/MinKScores.java)                                                               | 简单 | 排序              | 数组、排序、滑动窗口               |
| 1995 | 统计特殊四元组                                            | [CountSpecialQuadruplets](src/com/leetcode/L1901_2000/L1995/CountSpecialQuadruplets.java)                                     | 简单 | 暴力法、map映射       | 数组、数学                    |
| 1996 | 游戏中弱角色的数量                                          | [NumWeakCharacters](src/com/leetcode/L1901_2000/L1996/NumWeakCharacters.java)                                                 | 中等 | 排序              | 数组、栈、单调栈、排序、贪心算法         |
| 2006 | 差的绝对值为 K 的数对数目                                     | [CountAbsDiffK](src/com/leetcode/L2001_2100/L2006/CountAbsDiffK.java)                                                         | 简单 | 暴力法、map映射       | 数组                       |
| 2011 | 执行操作后的变量值                                          | [FinalValueOpe](src/com/leetcode/L2001_2100/L2011/FinalValueOpe.java)                                                         | 简单 | 模拟              | 数组、字符串、模拟                |
| 2016 | 增量元素之间的最大差值                                        | [MaxDifferenceElements](src/com/leetcode/L2001_2100/L2016/MaxDifferenceElements.java)                                         | 简单 | 双指针             | 数组                       |
| 2029 | 石子游戏 IX                                            | [StoneGameIX](src/com/leetcode/L2001_2100/L2029/StoneGameIX.java)                                                             | 中等 | 博弈论             | 数组、数学、计数、贪心算法、博弈论        |
| 2089 | 找出数组排序后的目标下标                                       | [TargetIndexSortingArr](src/com/leetcode/L2001_2100/L2089/TargetIndexSortingArr.java)                                         | 简单 | 二分查找            | 数组、二分查找、排序               |
| 2104 | 子数组范围和                                             | [SumSubRanges](src/com/leetcode/L2101_2200/L2104/SumSubRanges.java)                                                           | 中等 | 双指针             | 数组、栈、单调栈                 |
| 2154 | 将找到的值乘以 2                                          | [KeepMultValuesTwo](src/com/leetcode/L2101_2200/L2154/KeepMultValuesTwo.java)                                                 | 简单 | set集合           | 数组、哈希表、排序、模拟             |
| 2170 | 使数组变成交替数组的最少操作数                                    | [MinOpArrayAlternating](src/com/leetcode/L2101_2200/L2170/MinOpArrayAlternating.java)                                         | 中等 | map映射           | 数组、哈希表、计数、贪心算法           |
| 2171 | 拿出最少数目的魔法豆                                         | [RemoveMinBeans](src/com/leetcode/L2101_2200/L2171/RemoveMinBeans.java)                                                       | 中等 | 排序              | 数组、前缀和、排序                |
| 2210 | 统计数组中峰和谷的数量                                        | [CountHillsAndValleys](src/com/leetcode/L2201_2300/L2210/CountHillsAndValleys.java)                                           | 简单 | 双指针             | 数组                       |
| 2248 | 多个数组求交集                                            | [IntersectionMultipleArrays](src/com/leetcode/L2201_2300/L2248/IntersectionMultipleArrays.java)                               | 简单 | map映射           | --                       |
| 2250 | 统计包含每个点的矩形数目                                       | [CountContainingPoint](src/com/leetcode/L2201_2300/L2250/CountContainingPoint.java)                                           | 中等 | 二分查找            | --                       |
| 2367 | 算术三元组的数目                                           | [NumberArithmeticTriplets](src/com/leetcode/L2301_2400/L2367/NumberArithmeticTriplets.java)                                   | 简单 | set集合           | 数组、哈希表、双指针、枚举            |
| 2441 | 与对应负数同时存在的最大正整数                                    | [LargestIntegerNegative](src/com/leetcode/L2401_2500/L2441/LargestIntegerNegative.java)                                       | 简单 | set集合           | 数组、哈希表                   |
| 2442 | 反转之后不同整数的数目                                        | [CountNumberIntegers](src/com/leetcode/L2401_2500/L2442/CountNumberIntegers.java)                                             | 中等 | set集合           | 数组、哈希表、数学                |
| 2455 | 可被三整除的偶数的平均值                                       | [AverageValueThree](src/com/leetcode/L2401_2500/L2455/AverageValueThree.java)                                                 | 简单 | 数学              | --                       |
| 2545 | 根据第 K 场考试的分数排序                                     | [ExamScoreSorterByKth](src/com/leetcode/L2501_2600/L2545/ExamScoreSorterByKth.java)                                           | 中等 | 快速排序            | 数组、矩阵、排序                 |
| 3046 | 分割数组                                               | [ArraySplitter](src/com/leetcode/L3001_3100/L3046/ArraySplitter.java)                                                         | 简单 | 计数              | 数组、哈希表、计数                |
| 3159 | 查询数组中元素的出现位置                                       | [ArrayElementPositionFinder](src/com/leetcode/L3101_3200/L3159/ArrayElementPositionFinder.java)                               | 中等 | 哈希表             | 数组、哈希表                   |
| 3264 | K 次乘运算后的最终数组 I                                     | [KMultiplicationArrayI](src/com/leetcode/L3201_3300/L3264/KMultiplicationArrayI.java)                                         | 简单 | 堆（优先队列）         | 数组、数学、模拟、堆（优先队列）         |
| 3285 | 找到稳定山的下标                                           | [StableMountainIndexFinder](src/com/leetcode/L3201_3300/L3285/StableMountainIndexFinder.java)                                 | 简单 | 数组              | 数组                       |

## 2. **_链表系列_**

| #   | 题目              | 类名                                                                                                          | 难度 | 方法          | 标签                |
|-----|-----------------|-------------------------------------------------------------------------------------------------------------|----|-------------|-------------------|
| 19  | 删除链表的倒数第N个节点    | [DeleteNode](src/com/leetcode/L1_100/L0019/DeleteNode.java)                                                 | 中等 | 双指针         | 链表、双指针            |
| 21  | 合并两个有序链表        | [MergeTwoSortedLists](src/com/leetcode/L1_100/L0021/MergeTwoSortedLists.java)                               | 简单 | 双指针         | 链表、递归             |
| 23  | 合并K个升序链表        | [MergeKSortedLists](src/com/leetcode/L1_100/L0023/MergeKSortedLists.java)                                   | 困难 | 最小堆、递归、分治算法 | 堆、链表、分治算法         |
| 24  | 两两交换链表中的节点      | [SwapNodesInPairs](src/com/leetcode/L1_100/L0024/SwapNodesInPairs.java)                                     | 中等 | 递归、迭代       | 链表                |
| 25  | K 个一组翻转链表       | [ReverseNodesKGroup](src/com/leetcode/L1_100/L0025/ReverseNodesKGroup.java)                                 | 困难 | 迭代          | 链表、递归             |
| 82  | 删除排序链表中的重复元素 II | [RemoveDuplicatesSortedListII](src/com/leetcode/L1_100/L0082/RemoveDuplicatesSortedListII.java)             | 中等 | 迭代          | 链表                |
| 83  | 删除排序链表中的重复元素    | [RemoveDuplicatesSortedList](src/com/leetcode/L1_100/L0083/RemoveDuplicatesSortedList.java)                 | 简单 | 双指针         | 链表                |
| 92  | 反转链表 II         | [ReverseLinkedList](src/com/leetcode/L1_100/L0092/ReverseLinkedList.java)                                   | 中等 | 头节点         | 链表                |
| 138 | 复制带随机指针的链表      | [CopyListRandomPointer](src/com/leetcode/L101_200/L0138/CopyListRandomPointer.java)                         | 中等 | map映射       | 链表、哈希表            |
| 141 | 环形链表            | [LinkedListCycle](src/com/leetcode/L101_200/L0141/LinkedListCycle.java)                                     | 简单 | 双指针、set集合   | 链表、双指针            |
| 142 | 环形链表II          | [LinkedListCycleII](src/com/leetcode/L101_200/L0142/LinkedListCycleII.java)                                 | 中等 | 双指针、set集合   | 链表、双指针            |
| 143 | 重排链表            | [ReorderList](src/com/leetcode/L101_200/L0143/ReorderList.java)                                             | 中等 | 双指针         | 链表、栈、双指针、递归       |
| 148 | 排序链表            | [SortList](src/com/leetcode/L101_200/L0148/SortList.java)                                                   | 中等 | 归并排序        | 链表、双指针、排序、归并排序、分治 |
| 160 | 相交链表            | [IntersectionTwoLinkedLists](src/com/leetcode/L101_200/L0160/IntersectionTwoLinkedLists.java)               | 简单 | 双指针、set集合   | 链表                |
| 203 | 移除链表元素          | [RemoveLinkedListElements](src/com/leetcode/L201_300/L0203/RemoveLinkedListElements.java)                   | 简单 | 递归、迭代       | 链表                |
| 206 | 反转链表            | [ReverseLinkedList](src/com/leetcode/L201_300/L0206/ReverseLinkedList.java)                                 | 简单 | 栈、递归、迭代     | 链表、递归             |
| 234 | 回文链表            | [PalindromeLinkedList](src/com/leetcode/L201_300/L0234/PalindromeLinkedList.java)                           | 中等 | 栈           | 链表、栈、递归、双指针       |
| 237 | 删除链表中的节点        | [DeleteNodeLinkedList](src/com/leetcode/L201_300/L0237/DeleteNodeLinkedList.java)                           | 简单 | 模拟          | 链表                |
| 328 | 奇偶链表            | [OddEvenLinkedList](src/com/leetcode/L301_400/L0328/OddEvenLinkedList.java)                                 | 中等 | 双指针         | 链表                |
| 430 | 扁平化多级双向链表       | [FlattenMultilevelDoublyLinkedList](src/com/leetcode/L401_500/L0430/FlattenMultilevelDoublyLinkedList.java) | 中等 | 深度优先搜索      | 链表、双向链表、深度优先搜索    |
| 445 | 两数相加 II         | [AddTwoNumbersII](src/com/leetcode/L401_500/L0445/AddTwoNumbersII.java)                                     | 中等 | 栈           | 链表、栈、数学           |
| 725 | 分隔链表            | [SplitLinkedListParts](src/com/leetcode/L701_800/L0725/SplitLinkedListParts.java)                           | 中等 | 模拟          | 链表                |
| 817 | 链表组件            | [LinkedListComponents](src/com/leetcode/L801_900/L0817/LinkedListComponents.java)                           | 中等 | 模拟          | 链表、数组、哈希表         |
| 876 | 链表的中间结点         | [MiddleTheLinkedList](src/com/leetcode/L801_900/L0876/MiddleTheLinkedList.java)                             | 简单 | 双指针、数组      | 链表、双指针            |

## 3. **_字符串系列_**

| #    | 题目                   | 类名                                                                                                                                | 难度 | 方法             | 标签                         |
|------|----------------------|-----------------------------------------------------------------------------------------------------------------------------------|----|----------------|----------------------------|
| 5    | 最长回文子串               | [LongestPalindromicSubstring](src/com/leetcode/L1_100/L0005/LongestPalindromicSubstring.java)                                     | 中等 | 模拟             | 字符串、动态规划                   |
| 6    | Z 字形变换               | [ZigZagConversion](src/com/leetcode/L1_100/L0006/ZigZagConversion.java)                                                           | 中等 | 模拟             | 字符串                        |
| 8    | 字符串转换整数 (atoi)       | [StringToInteger](src/com/leetcode/L1_100/L0008/StringToInteger.java)                                                             | 中等 | 模拟             | 字符串                        |
| 14   | 最长公共前缀               | [LongestCommonPrefix](src/com/leetcode/L1_100/L0014/LongestCommonPrefix.java)                                                     | 简单 | 分治法            | 字符串                        |
| 20   | 有效的括号                | [ValidParentheses](src/com/leetcode/L1_100/L0020/ValidParentheses.java)                                                           | 简单 | 栈              | 栈、字符串                      |
| 28   | 实现strStr()           | [ImplementstrStr](src/com/leetcode/L1_100/L0028/ImplementstrStr.java)                                                             | 简单 | Sunday算法、KMP算法 | 字符串、双指针                    |
| 32   | 最长有效括号               | [LongestValidParentheses](src/com/leetcode/L1_100/L0032/LongestValidParentheses.java)                                             | 困难 | 栈              | 字符串、栈、动态规划                 |
| 38   | 外观数列                 | [CountSay](src/com/leetcode/L1_100/L0038/CountSay.java)                                                                           | 中等 | 枚举             | 字符串                        |
| 43   | 字符串相乘                | [MultiplyStrings](src/com/leetcode/L1_100/L0043/MultiplyStrings.java)                                                             | 中等 | 双指针            | 字符串、模拟、数学                  |
| 49   | 字母异位词分组              | [GroupAnagrams](src/com/leetcode/L1_100/L0049/GroupAnagrams.java)                                                                 | 中等 | 排序             | 字符串、哈希表                    |
| 58   | 最后一个单词的长度            | [LastWordLength](src/com/leetcode/L1_100/L0058/LastWordLength.java)                                                               | 简单 | 暴力法            | 字符串                        |
| 67   | 二进制加法                | [AddBinary](src/com/leetcode/L1_100/L0067/AddBinary.java)                                                                         | 简单 | 模拟             | 字符串、模拟、数学、位运算              |
| 68   | 文本左右对齐               | [TextJustification](src/com/leetcode/L1_100/L0068/TextJustification.java)                                                         | 困难 | 模拟             | 字符串、模拟                     |
| 71   | 简化路径                 | [SimplifyPath](src/com/leetcode/L1_100/L0071/SimplifyPath.java)                                                                   | 中等 | 栈              | 字符串、栈                      |
| 125  | 验证回文串                | [ValidPalindrome](src/com/leetcode/L101_200/L0125/ValidPalindrome.java)                                                           | 简单 | 双指针            | 字符串、双指针                    |
| 165  | 比较版本号                | [CompareVersionNumbers](src/com/leetcode/L101_200/L0165/CompareVersionNumbers.java)                                               | 中等 | 模拟、双指针         | 字符串、双指针                    |
| 150  | 逆波兰表达式求值             | [EvaluateReversePolishNotation](src/com/leetcode/L101_200/L0150/EvaluateReversePolishNotation.java)                               | 中等 | 栈              | 字符串、栈                      |
| 151  | 翻转字符串里的单词            | [ReverseWordsString](src/com/leetcode/L101_200/L0151/ReverseWordsString.java)                                                     | 简单 | 模拟             | 字符串、双指针                    |
| 187  | 重复的DNA序列             | [RepeatedDNASequences](src/com/leetcode/L101_200/L0187/RepeatedDNASequences.java)                                                 | 中等 | 模拟             | 字符串、哈希表、滑动窗口、位运算、哈希函数、滚动哈希 |
| 224  | 基本计算器                | [BasicCalculator](src/com/leetcode/L201_300/L0224/BasicCalculator.java)                                                           | 困难 | 模拟             | 栈、数学                       |
| 241  | 为运算表达式设计优先级          | [DiffWaysAddParentheses](src/com/leetcode/L201_300/L0241/DiffWaysAddParentheses.java)                                             | 中等 | 分治算法           | 字符串、数学、动态规划、记忆化搜索、递归       |
| 242  | 有效的字母异位词             | [ValidAnagram](src/com/leetcode/L201_300/L0242/ValidAnagram.java)                                                                 | 简单 | 排序             | 哈希表、排序                     |
| 273  | 整数转换英文表示             | [IntegerEnglishWords](src/com/leetcode/L201_300/L0273/IntegerEnglishWords.java)                                                   | 困难 | 模拟             | 字符串、递归、数学                  |
| 290  | 单词规律                 | [WordPattern](src/com/leetcode/L201_300/L0290/WordPattern.java)                                                                   | 简单 | 哈希表            | 哈希表                        |
| 299  | 猜数字游戏                | [BullsCows](src/com/leetcode/L201_300/L0299/BullsCows.java)                                                                       | 中等 | 模拟             | 字符串、哈希表、计数                 |
| 316  | 去除重复字母               | [RemoveDuplicateLetters](src/com/leetcode/L301_400/L0316/RemoveDuplicateLetters.java)                                             | 中等 | 栈              | 字符串、栈、贪心算法                 |
| 318  | 最大单词长度乘积             | [MaximumProductWordLengths](src/com/leetcode/L301_400/L0318/MaximumProductWordLengths.java)                                       | 中等 | 位运算            | 数组、字符串、位运算                 |
| 345  | 反转字符串中的元音字母          | [ReverseVowelsString](src/com/leetcode/L301_400/L0345/ReverseVowelsString.java)                                                   | 简单 | 双指针            | 字符串、双指针                    |
| 383  | 赎金信                  | [RansomNote](src/com/leetcode/L301_400/L0383/RansomNote.java)                                                                     | 简单 | Map映射          | 字符串、哈希表、计数                 |
| 385  | 迷你语法分析器              | [MiniParser](src/com/leetcode/L301_400/L0385/MiniParser.java)                                                                     | 中等 | 栈              | 字符串、栈、深度优先搜索               |
| 387  | 字符串中的第一个唯一字符         | [FirstUniqueChar](src/com/leetcode/L301_400/L0387/FirstUniqueChar.java)                                                           | 简单 | Map映射          | 字符串、哈希表                    |
| 388  | 文件的最长绝对路径            | [LongAbsoluteFilePath](src/com/leetcode/L301_400/L0388/LongAbsoluteFilePath.java)                                                 | 中等 | 栈              | 字符串、栈、深度优先搜索               |
| 392  | 判断子序列                | [IsSub](src/com/leetcode/L301_400/L0392/IsSub.java)                                                                               | 简单 | 双指针、二分查找       | 字符串、双指针、动态规划               |
| 394  | 字符串解码                | [DecodeString](src/com/leetcode/L301_400/L0394/DecodeString.java)                                                                 | 中等 | 栈              | 字符串、栈、递归                   |
| 402  | 移掉K位数字               | [RemoveKDigits](src/com/leetcode/L401_500/L0402/RemoveKDigits.java)                                                               | 中等 | 栈              | 字符串、栈、贪心算法                 |
| 409  | 最长回文串                | [LongestPalindrome](src/com/leetcode/L401_500/L0409/LongestPalindrome.java)                                                       | 中等 | 模拟             | 字符串、哈希表、贪心算法               |
| 412  | Fizz Buzz            | [FizzBuzz](src/com/leetcode/L401_500/L0412/FizzBuzz.java)                                                                         | 简单 | 模拟             | 字符串、数学、模拟                  |
| 423  | 从英文中重建数字             | [ReconstructDigitsEnglish](src/com/leetcode/L401_500/L0423/ReconstructDigitsEnglish.java)                                         | 中等 | 模拟             | 字符串、哈希表、数学                 |
| 433  | 最小基因变化               | [MinGeneticMutation](src/com/leetcode/L401_500/L0433/MinGeneticMutation.java)                                                     | 中等 | 广度优先搜索         | 字符串、哈希表、广度优先搜索             |
| 434  | 字符串中的单词数             | [NumberSegmentsString](src/com/leetcode/L401_500/L0434/NumberSegmentsString.java)                                                 | 简单 | 模拟             | 字符串                        |
| 443  | 压缩字符串                | [StringCompression](src/com/leetcode/L401_500/L0443/StringCompression.java)                                                       | 简单 | 双指针            | 字符串、双指针                    |
| 451  | 根据字符出现频率排序           | [SortCharactersByFrequency](src/com/leetcode/L401_500/L0451/SortCharactersByFrequency.java)                                       | 中等 | 哈希表            | 字符串、哈希表、桶排序、计数、排序、堆        |
| 468  | 验证IP地址               | [ValidateIPAddress](src/com/leetcode/L401_500/L0468/ValidateIPAddress.java)                                                       | 简单 | 模拟             | 字符串                        |
| 481  | 神奇字符串                | [MagicalString](src/com/leetcode/L401_500/L0481/MagicalString.java)                                                               | 中等 | 双指针            | 字符串、双指针                    |
| 482  | 密钥格式化                | [LicenseKeyFormatting](src/com/leetcode/L401_500/L0482/LicenseKeyFormatting.java)                                                 | 简单 | 模拟             | 字符串                        |
| 500  | 键盘行                  | [KeyboardRow](src/com/leetcode/L401_500/L0500/KeyboardRow.java)                                                                   | 简单 | map映射          | 字符串、数组、哈希表                 |
| 520  | 检测大写字母               | [DetectCapital](src/com/leetcode/L501_600/L0520/DetectCapital.java)                                                               | 简单 | 模拟             | 字符串                        |
| 521  | 最长特殊序列 Ⅰ             | [LongestUncommonSubI](src/com/leetcode/L501_600/L0521/LongestUncommonSubI.java)                                                   | 简单 | 模拟             | 字符串                        |
| 524  | 通过删除字母匹配到字典里最长单词     | [LongestWordDictionaryDeleting](src/com/leetcode/L501_600/L0524/LongestWordDictionaryDeleting.java)                               | 中等 | 双指针            | 数组、字符串、双指针、排序              |
| 539  | 最小时间差                | [MinimumTimeDifference](src/com/leetcode/L501_600/L0539/MinimumTimeDifference.java)                                               | 中等 | 排序             | 字符串、数组、排序、数学               |
| 541  | 反转字符串 II             | [ReverseStringII](src/com/leetcode/L501_600/L0541/ReverseStringII.java)                                                           | 简单 | 模拟             | 双指针、字符串                    |
| 551  | 学生出勤记录 I             | [StudentAttendanceRecordI](src/com/leetcode/L501_600/L0551/StudentAttendanceRecordI.java)                                         | 简单 | 模拟             | 字符串                        |
| 556  | 下一个更大元素 III          | [NextGreaterElementIII](src/com/leetcode/L501_600/L0556/NextGreaterElementIII.java)                                               | 中等 | 双指针            | 字符串、双指针、数学                 |
| 557  | 反转字符串中的单词 III        | [ReverseWordsIII](src/com/leetcode/L501_600/L0557/ReverseWordsIII.java)                                                           | 简单 | 双指针            | 字符串、双指针                    |
| 564  | 寻找最近的回文数             | [FindClosestPalindrome](src/com/leetcode/L501_600/L0564/FindClosestPalindrome.java)                                               | 困难 | 模拟             | 字符串、数学                     |
| 591  | 标签验证器                | [TagValidator](src/com/leetcode/L501_600/L0591/TagValidator.java)                                                                 | 困难 | 栈              | 字符串、栈                      |
| 599  | 两个列表的最小索引总和          | [MinIndexSum](src/com/leetcode/L501_600/L0599/MinIndexSum.java)                                                                   | 简单 | 哈希表            | 数组、字符串、哈希表                 |
| 640  | 求解方程                 | [SolveEquation](src/com/leetcode/L601_700/L0640/SolveEquation.java)                                                               | 中等 | 模拟             | 字符串、模拟、数学                  |
| 649  | Dota2 参议院            | [Dota2Senate](src/com/leetcode/L601_700/L0649/Dota2Senate.java)                                                                   | 中等 | 队列             | 字符串、队列、贪心算法                |
| 678  | 有效的括号字符串             | [ValidParenthesisString](src/com/leetcode/L601_700/L0678/ValidParenthesisString.java)                                             | 中等 | 栈              | 字符串、栈、贪心算法、动态规划            |
| 680  | 验证回文字符串 Ⅱ            | [ValidPalindromeII](src/com/leetcode/L601_700/L0680/ValidPalindromeII.java)                                                       | 简单 | 双指针            | 字符串、贪心算法、双指针               |
| 686  | 重复叠加字符串匹配            | [RepeatedMatch](src/com/leetcode/L601_700/L0686/RepeatedMatch.java)                                                               | 中等 | 模拟             | 字符串、字符串匹配                  |
| 709  | 转换成小写字母              | [ToLowerCase](src/com/leetcode/L701_800/L0709/ToLowerCase.java)                                                                   | 简单 | 模拟             | 字符串                        |
| 726  | 原子的数量                | [NumberAtoms](src/com/leetcode/L701_800/L0726/NumberAtoms.java)                                                                   | 困难 | map映射          | 字符串、栈、哈希表                  |
| 748  | 最短补全词                | [ShortestCompletingWord](src/com/leetcode/L701_800/L0748/ShortestCompletingWord.java)                                             | 简单 | 模拟             | 数组、字符串、哈希表                 |
| 771  | 宝石与石头                | [JewelsAndStones](src/com/leetcode/L701_800/L0771/JewelsAndStones.java)                                                           | 简单 | Set集合          | 字符串                        |
| 777  | 在LR字符串中交换相邻字符        | [SwapLRString](src/com/leetcode/L701_800/L0777/SwapLRString.java)                                                                 | 中等 | 模拟             | 字符串、双指针                    |
| 791  | 自定义字符串排序             | [CustomSortString](src/com/leetcode/L701_800/L0791/CustomSortString.java)                                                         | 中等 | 排序             | 字符串、哈希表、排序                 |
| 794  | 有效的井字游戏              | [ValidTicState](src/com/leetcode/L701_800/L0794/ValidTicState.java)                                                               | 中等 | 模拟             | 数组、字符串                     |
| 796  | 旋转字符串                | [RotateString](src/com/leetcode/L701_800/L0796/RotateString.java)                                                                 | 简单 | 暴力法、KMP算法      | 字符串                        |
| 804  | 唯一摩尔斯密码词             | [MorseCode](src/com/leetcode/L801_900/L0804/MorseCode.java)                                                                       | 简单 | Set集合          | 字符串                        |
| 806  | 写字符串需要的行数            | [LinesWriteString](src/com/leetcode/L801_900/L0806/LinesWriteString.java)                                                         | 简单 | 模拟             | 数组、字符串                     |
| 809  | 情感丰富的文字              | [ExpressiveWords](src/com/leetcode/L801_900/L0809/ExpressiveWords.java)                                                           | 中等 | 双指针            | 数组、字符串、双指针                 |
| 811  | 子域名访问计数              | [SubdomainVisitCount](src/com/leetcode/L801_900/L0811/SubdomainVisitCount.java)                                                   | 简单 | map映射          | 字符串、数组、哈希表、计数              |
| 816  | 模糊坐标                 | [AmbiguousCoordinates](src/com/leetcode/L801_900/L0816/AmbiguousCoordinates.java)                                                 | 中等 | 模拟             | 字符串、回溯算法                   |
| 819  | 最常见的单词               | [MostCommonWord](src/com/leetcode/L801_900/L0819/MostCommonWord.java)                                                             | 简单 | map映射          | 字符串、哈希表、计数                 |
| 821  | 字符的最短距离              | [ShortestDistanceCharacter](src/com/leetcode/L801_900/L0821/ShortestDistanceCharacter.java)                                       | 简单 | 双指针            | 字符串、数组、双指针                 |
| 824  | 山羊拉丁文                | [GoatLatin](src/com/leetcode/L801_900/L0824/GoatLatin.java)                                                                       | 简单 | 模拟             | 字符串                        |
| 838  | 推多米诺                 | [PushDominoes](src/com/leetcode/L801_900/L0838/PushDominoes.java)                                                                 | 中等 | 双指针            | 字符串、双指针、动态规划               |
| 844  | 比较含退格的字符串            | [BackspaceStringCompare](src/com/leetcode/L801_900/L0844/BackspaceStringCompare.java)                                             | 简单 | Set集合          | 字符串                        |
| 856  | 括号的分数                | [ScoreParentheses](src/com/leetcode/L801_900/L0856/ScoreParentheses.java)                                                         | 中等 | 栈              | 字符串、栈                      |
| 859  | 亲密字符串                | [BuddyStrings](src/com/leetcode/L801_900/L0859/BuddyStrings.java)                                                                 | 简单 | 模拟             | 字符串、哈希表                    |
| 884  | 两句话中的不常见单词           | [UncommonWordsSentences](src/com/leetcode/L801_900/L0884/UncommonWordsSentences.java)                                             | 简单 | map映射          | 字符串、哈希表                    |
| 890  | 查找和替换模式              | [FindReplacePattern](src/com/leetcode/L801_900/L0890/FindReplacePattern.java)                                                     | 中等 | map映射          | 数组、字符串、哈希表                 |
| 899  | 有序队列                 | [OrderlyQueue](src/com/leetcode/L801_900/L0899/OrderlyQueue.java)                                                                 | 困难 | 模拟             | 字符串、数学、排序                  |
| 917  | 仅仅反转字母               | [ReverseOnlyLetters](src/com/leetcode/L901_1000/L0917/ReverseOnlyLetters.java)                                                    | 简单 | 双指针            | 字符串、双指针                    |
| 921  | 使括号有效的最少添加           | [MinParenthesesValid](src/com/leetcode/L901_1000/L0921/MinParenthesesValid.java)                                                  | 中等 | 模拟             | 字符串、栈、贪心算法                 |
| 925  | 长按键入                 | [LongPressedName](src/com/leetcode/L901_1000/L0925/LongPressedName.java)                                                          | 简单 | 双指针            | 字符串                        |
| 929  | 独特的电子邮件地址            | [UniqueEmailAddresses](src/com/leetcode/L901_1000/L0929/UniqueEmailAddresses.java)                                                | 简单 | set集合          | 字符串、数组、哈希表                 |
| 937  | 重新排列日志文件             | [ReorderDataLogFiles](src/com/leetcode/L901_1000/L0937/ReorderDataLogFiles.java)                                                  | 简单 | 排序             | 字符串、数组、排序                  |
| 940  | 不同的子序列 II            | [DistinctSubsequencesII](src/com/leetcode/L901_1000/L0940/DistinctSubsequencesII.java)                                            | 困难 | 字符串            | 字符串、动态规划                   |
| 944  | 删列造序                 | [DeleteColumnsSorted](src/com/leetcode/L901_1000/L0944/DeleteColumnsSorted.java)                                                  | 简单 | 模拟             | 字符串、数组                     |
| 953  | 验证外星语词典              | [VerifyingAlienDictionary](src/com/leetcode/L901_1000/L0953/VerifyingAlienDictionary.java)                                        | 简单 | map映射          | 字符串、数组、哈希表                 |
| 1021 | 删除最外层的括号             | [RemoveOutermostParentheses](src/com/leetcode/L1001_1100/L1021/RemoveOutermostParentheses.java)                                   | 简单 | 栈              | 字符串、栈                      |
| 1046 | 最后一块石头的重量            | [LastStoneWeight](src/com/leetcode/L1001_1100/L1046/LastStoneWeight.java)                                                         | 简单 | 最大堆            | 堆、贪心算法                     |
| 1047 | 删除字符串中的所有相邻重复项       | [RemoveAllAdjacentDuplicatesString](src/com/leetcode/L1001_1100/L1047/RemoveAllAdjacentDuplicatesString.java)                     | 简单 | 栈              | 栈                          |
| 1078 | Bigram 分词            | [OccurrencesBigram](src/com/leetcode/L1001_1100/L1078/OccurrencesBigram.java)                                                     | 简单 | 模拟             | 字符串                        |
| 1106 | 解析布尔表达式              | [ParsingBooleanExpression](src/com/leetcode/L1101_1200/L1106/ParsingBooleanExpression.java)                                       | 困难 | 栈              | 字符串、栈、递归                   |
| 1108 | IP 地址无效化             | [DefangingIP](src/com/leetcode/L1101_1200/L1108/DefangingIP.java)                                                                 | 简单 | 模拟             | 字符串                        |
| 1189 | “气球” 的最大数量           | [MaxNumberBalloons](src/com/leetcode/L1101_1200/L1189/MaxNumberBalloons.java)                                                     | 简单 | map映射          | 字符串、哈希表、计数                 |
| 1190 | 反转每对括号间的子串           | [ReverseSubstringsBetweenEachPairParentheses](src/com/leetcode/L1101_1200/L1190/ReverseSubstringsBetweenEachPairParentheses.java) | 中等 | 栈              | 字符串、栈                      |
| 1221 | 分割平衡字符串              | [SplitStringBalancedStrings](src/com/leetcode/L1201_1300/L1221/SplitStringBalancedStrings.java)                                   | 简单 | 计数             | 字符串、贪心算法、计数                |
| 1332 | 删除回文子序列              | [RemovePalindromicSub](src/com/leetcode/L1301_1400/L1332/RemovePalindromicSub.java)                                               | 简单 | 模拟             | 字符串、双指针                    |
| 1370 | 上升下降字符串              | [IncreasingDecreasingString](src/com/leetcode/L1301_1400/L1370/IncreasingDecreasingString.java)                                   | 简单 | 桶计数            | 字符串、排序                     |
| 1374 | 生成每种字符都是奇数个的字符串      | [GenerateStringOdd](src/com/leetcode/L1301_1400/L1374/GenerateStringOdd.java)                                                     | 简单 | 字符串            | 字符串                        |
| 1408 | 数组中的字符串匹配            | [StringMatchingArray](src/com/leetcode/L1401_1500/L1408/StringMatchingArray.java)                                                 | 简单 | 排序             | 字符串、 字符串匹配                 |
| 1417 | 重新格式化字符串             | [ReformatString](src/com/leetcode/L1401_1500/L1417/ReformatString.java)                                                           | 简单 | 模拟             | 字符串                        |
| 1422 | 分割字符串的最大得分           | [MaxScoreString](src/com/leetcode/L1401_1500/L1422/MaxScoreString.java)                                                           | 简单 | 模拟             | 字符串                        |
| 1436 | 旅行终点站                | [DestinationCity](src/com/leetcode/L1401_1500/L1436/DestinationCity.java)                                                         | 简单 | set集合          | 字符串、哈希表                    |
| 1446 | 连续字符                 | [ConsecutiveCharacters](src/com/leetcode/L1401_1500/L1446/ConsecutiveCharacters.java)                                             | 简单 | 双指针            | 字符串                        |
| 1455 | 检查单词是否为句中其他单词的前缀     | [CheckPrefixWord](src/com/leetcode/L1401_1500/L1455/CheckPrefixWord.java)                                                         | 简单 | 模拟             | 字符串、 字符串匹配                 |
| 1541 | 平衡括号字符串的最少插入次数       | [MinBalanceStr](src/com/leetcode/L1501_1600/L1541/MinBalanceStr.java)                                                             | 中等 | 模拟             | 字符串、栈、贪心算法                 |
| 1576 | 替换所有的问号              | [ReplaceAvoidConsecutive](src/com/leetcode/L1501_1600/L1576/ReplaceAvoidConsecutive.java)                                         | 中等 | 模拟             | 字符串                        |
| 1592 | 重新排列单词间的空格           | [RearrangeSpacesWords](src/com/leetcode/L1501_1600/L1592/RearrangeSpacesWords.java)                                               | 简单 | 模拟             | 字符串                        |
| 1614 | 括号的最大嵌套深度            | [MaxDepthParentheses](src/com/leetcode/L1601_1700/L1614/MaxDepthParentheses.java)                                                 | 简单 | 栈              | 字符串、栈                      |
| 1624 | 两个相同字符之间的最长子字符串      | [LargestEqualCharacters](src/com/leetcode/L1601_1700/L1624/LargestEqualCharacters.java)                                           | 简单 | 模拟             | 字符串、哈希表                    |
| 1629 | 按键持续时间最长的键           | [SlowestKey](src/com/leetcode/L1601_1700/L1629/SlowestKey.java)                                                                   | 简单 | 模拟             | 数组、字符串                     |
| 1662 | 检查两个字符串数组是否相等        | [CheckStringEqual](src/com/leetcode/L1601_1700/L1662/CheckStringEqual.java)                                                       | 简单 | 模拟             | 数组、字符串                     |
| 1668 | 最大重复子字符串             | [MaxRepeatingSubstring](src/com/leetcode/L1601_1700/L1668/MaxRepeatingSubstring.java)                                             | 简单 | 暴力法            | 字符串、字符串匹配                  |
| 1678 | 设计 Goal 解析器          | [Goal](src/com/leetcode/L1601_1700/L1678/Goal.java)                                                                               | 简单 | 字符串            | 字符串                        |
| 1684 | 统计一致字符串的数目           | [CountNumConsistentStr](src/com/leetcode/L1601_1700/L1684/CountNumConsistentStr.java)                                             | 中等 | set集合          | 数组、字符串、哈希表、位运算             |
| 1694 | 重新格式化电话号码            | [ReformatPhoneNumber](src/com/leetcode/L1601_1700/L1694/ReformatPhoneNumber.java)                                                 | 简单 | 模拟             | 字符串                        |
| 1704 | 判断字符串的两半是否相似         | [DetermineStringAlike](src/com/leetcode/L1701_1800/L1704/DetermineStringAlike.java)                                               | 简单 | 模拟             | 字符串、计数                     |
| 1736 | 替换隐藏数字得到的最晚时间        | [LatestTimeReplacingHiddenDigits](src/com/leetcode/L1701_1800/L1736/LatestTimeReplacingHiddenDigits.java)                         | 简单 | 模拟             | 字符串                        |
| 1758 | 生成交替二进制字符串的最少操作数     | [MinChangesString](src/com/leetcode/L1701_1800/L1758/MinChangesString.java)                                                       | 简单 | 模拟             | 字符串                        |
| 1763 | 最长的美好子字符串            | [LongNiceSub](src/com/leetcode/L1701_1800/L1763/LongNiceSub.java)                                                                 | 简单 | 模拟             | 字符串、哈希表、位运算、滑动窗口           |
| 1768 | 交替合并字符串              | [MergeStrings](src/com/leetcode/L1701_1800/L1768/MergeStrings.java)                                                               | 简单 | 双指针            | 字符串、双指针                    |
| 1769 | 移动所有球到每个盒子所需的最小操作数   | [MinMoveBox](src/com/leetcode/L1701_1800/L1769/MinMoveBox.java)                                                                   | 中等 | 模拟             | 字符串、数组                     |
| 1773 | 统计匹配检索规则的物品数量        | [CountMatchRule](src/com/leetcode/L1701_1800/L1773/CountMatchRule.java)                                                           | 简单 | 模拟             | 数组、字符串                     |
| 1781 | 所有子字符串美丽值之和          | [SumBeautyString](src/com/leetcode/L1701_1800/L1781/SumBeautyString.java)                                                         | 中等 | 模拟             | 字符串、哈希表、计数                 |
| 1784 | 检查二进制字符串字段           | [CheckStringSegment](src/com/leetcode/L1701_1800/L1784/CheckStringSegment.java)                                                   | 简单 | 模拟             | 字符串                        |
| 1790 | 仅执行一次字符串交换能否使两个字符串相等 | [OneSwapStringsEqual](src/com/leetcode/L1701_1800/L1790/OneSwapStringsEqual.java)                                                 | 简单 | 双指针            | 字符串、哈希表、计数                 |
| 1796 | 字符串中第二大的数字           | [SecondDigitString](src/com/leetcode/L1701_1800/L1796/SecondDigitString.java)                                                     | 简单 | 模拟             | 字符串、哈希表                    |
| 1816 | 截断句子                 | [TruncateSentence](src/com/leetcode/L1801_1900/L1816/TruncateSentence.java)                                                       | 简单 | 模拟             | 数组、字符串                     |
| 1832 | 判断句子是否为全字母句          | [CheckSentenceIsPangram](src/com/leetcode/L1801_1900/L1832/CheckSentenceIsPangram.java)                                           | 简单 | Set集合          | 字符串                        |
| 1839 | 所有元音按顺序排布的最长子字符串     | [LongestSubstringOfAllVowelsOrder](src/com/leetcode/L1801_1900/L1839/LongestSubstringOfAllVowelsOrder.java)                       | 中等 | 双指针            | 字符串、双指针                    |
| 1859 | 将句子排序                | [SortingSentence](src/com/leetcode/L1801_1900/L1859/SortingSentence.java)                                                         | 简单 | 排序、Map映射、数组    | 字符串、排序                     |
| 1876 | 长度为三且各字符不同的子字符串      | [SubstringsSizeThreeDistinctCharacters](src/com/leetcode/L1801_1900/L1876/SubstringsSizeThreeDistinctCharacters.java)             | 简单 | 双指针            | 字符串                        |
| 1945 | 字符串转化后的各位数字之和        | [SumDigitsString](src/com/leetcode/L1901_2000/L1945/SumDigitsString.java)                                                         | 简单 | 模拟             | 字符串、模拟                     |
| 2000 | 反转单词前缀               | [ReversePrefixWord](src/com/leetcode/L1901_2000/L2000/ReversePrefixWord.java)                                                     | 简单 | 模拟             | 字符串、双指针                    |
| 2038 | 如果相邻两个颜色均相同则删除当前颜色   | [RemoveColored](src/com/leetcode/L2001_2100/L2038/RemoveColored.java)                                                             | 中等 | 双指针            | 字符串、贪心算法、数学、博弈论            |
| 2047 | 句子中的有效单词数            | [NumValidWords](src/com/leetcode/L2001_2100/L2047/NumValidWords.java)                                                             | 简单 | 模拟             | 字符串                        |
| 2114 | 句子中的最多单词数            | [MaxNumWordsSentences](src/com/leetcode/L2101_2200/L2114/MaxNumWordsSentences.java)                                               | 简单 | 模拟             | 数组、字符串                     |
| 2211 | 统计道路上的碰撞次数           | [CountCollisionsRoad](src/com/leetcode/L2201_2300/L2211/CountCollisionsRoad.java)                                                 | 中等 | 模拟             | --                         |
| 2399 | 检查相同字母间的距离           | [CheckDistancesSameLetters](src/com/leetcode/L2301_2400/L2399/CheckDistancesSameLetters.java)                                     | 简单 | map映射          | 数组、字符串、哈希表                 |
| 2456 | 最流行的视频创作者            | [MostPopularVideoCreator](src/com/leetcode/L2401_2500/L2456/MostPopularVideoCreator.java)                                         | 中等 | map映射          | --                         |
| 3083 | 字符串及其反转中是否存在同一子字符串   | [StringReversalSubstringValidator](src/com/leetcode/L3001_3100/L3083/StringReversalSubstringValidator.java)                       | 简单 | 模拟             | 字符串、哈希表                    |

## 4. **_二叉树系列_**

| #    | 题目                                                             | 类名                                                                                                              | 难度 | 方法               | 标签                                |
|------|----------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|----|------------------|-----------------------------------|
| 94   | 二叉树的中序遍历                                                       | [InOrder](src/com/leetcode/L1_100/L0094/InOrder.java)                                                           | 中等 | 递归、迭代            | 栈、树、哈希表                           |
| 95   | 不同的二叉搜索树II                                                     | [UniqueBSTII](src/com/leetcode/L1_100/L0095/UniqueBSTII.java)                                                   | 中等 | 递归               | 树、二叉树、二叉搜索树、回溯算法、动态规划             |
| 96   | 不同的二叉搜索树                                                       | [UniqueBST](src/com/leetcode/L1_100/L0096/UniqueBST.java)                                                       | 中等 | 递归               | 树、二叉树、二叉搜索树、数学、动态规划               |
| 98   | 验证二叉搜索树                                                        | [ValidateBinarySearchTree](src/com/leetcode/L1_100/L0098/ValidateBinarySearchTree.java)                         | 中等 | 递归               | 栈、树、哈希表                           |
| 100  | 相同的树                                                           | [SameTree](src/com/leetcode/L1_100/L0100/SameTree.java)                                                         | 简单 | 递归               | 树、二叉树、广度优先搜索、深度优先搜索               |
| 101  | 对称的二叉树                                                         | [SymmetricBinaryTree](src/com/leetcode/L101_200/L0101/SymmetricBinaryTree.java)                                 | 简单 | 递归               | 树、二叉树、广度优先搜索、深度优先搜索               |
| 102  | [二叉树的层序遍历](src/com/leetcode/L101_200/L0102/LevelOrder.md)      | [LevelOrder](src/com/leetcode/L101_200/L0102/LevelOrder.java)                                                   | 中等 | 递归、广度优先搜索        | 树、广度优先搜索                          |
| 103  | 二叉树的锯齿形层序遍历                                                    | [BTreeZigzagLevelOrderTraversal](src/com/leetcode/L101_200/L0103/BTreeZigzagLevelOrderTraversal.java)           | 中等 | 递归、广度优先搜索        | 树、广度优先搜索                          |
| 104  | 二叉树的最大深度                                                       | [BinaryTreeDepth](src/com/leetcode/L101_200/L0104/BinaryTreeDepth.java)                                         | 简单 | 递归、广度优先搜索、深度优先搜索 | 树、深度优先搜索                          |
| 105  | 从前序与中序遍历序列构造二叉树                                                | [PerOrderAndInOrder](src/com/leetcode/L101_200/L0105/PerOrderAndInOrder.java)                                   | 中等 | 递归               | 树                                 |
| 106  | 从中序与后序遍历序列构造二叉树                                                | [InOrderAndLastOrder](src/com/leetcode/L101_200/L0106/InOrderAndLastOrder.java)                                 | 中等 | 递归               | 树                                 |
| 107  | [二叉树的层次遍历 II](src/com/leetcode/L101_200/L0107/LevelOrderII.md) | [LevelOrderII](src/com/leetcode/L101_200/L0107/LevelOrderII.java)                                               | 简单 | 广度优先搜索           | 树、广度优先搜索                          |
| 108  | 将有序数组转换为二叉搜索树                                                  | [ConvertSortedArrayBinarySearchTree](src/com/leetcode/L101_200/L0108/ConvertSortedArrayBinarySearchTree.java)   | 简单 | 递归               | 数组、树、二叉树、二叉搜索树、分治                 |
| 110  | 平衡二叉树                                                          | [AVL](src/com/leetcode/L101_200/L0110/AVL.java)                                                                 | 简单 | 递归               | 树、深度优先搜索                          |
| 111  | 二叉树的最小深度                                                       | [MinimumDepthBinaryTree](src/com/leetcode/L101_200/L0111/MinimumDepthBinaryTree.java)                           | 简单 | 广度优先搜索           | 树、深度优先搜索、广度优先搜索                   |
| 112  | 路径总和                                                           | [PathSum](src/com/leetcode/L101_200/L0112/PathSum.java)                                                         | 简单 | 递归、深度优先搜索        | 树、深度优先搜索                          |
| 113  | 路径总和II                                                         | [PathSumII](src/com/leetcode/L101_200/L0113/PathSumII.java)                                                     | 中等 | 深度优先搜索           | 树、深度优先搜索                          |
| 114  | 二叉树展开为链表                                                       | [TreeToLinkedList](src/com/leetcode/L101_200/L0114/TreeToLinkedList.java)                                       | 中等 | 递归               | 树、二叉树、链表、栈、深度优先搜索                 |
| 116  | 填充每个节点的下一个右侧节点指针                                               | [PopulatingNextRightPointersEachNode](src/com/leetcode/L101_200/L0116/PopulatingNextRightPointersEachNode.java) | 中等 | 广度优先搜索           | 树、广度优先搜索                          |
| 124  | 二叉树中的最大路径和                                                     | [BinaryTreeMaximumPathSum](src/com/leetcode/L101_200/L0124/BinaryTreeMaximumPathSum.java)                       | 困难 | 递归               | 树、二叉树、深度优先搜索、动态规划                 |
| 129  | 求根节点到叶节点数字之和                                                   | [SumRootLeafNumbers](src/com/leetcode/L101_200/L0129/SumRootLeafNumbers.java)                                   | 中等 | 递归               | 树、二叉树、深度优先搜索                      |
| 145  | 二叉树的前序遍历                                                       | [PerOrder](src/com/leetcode/L101_200/L0144/PerOrder.java)                                                       | 中等 | 递归、迭代            | 树                                 |
| 145  | 二叉树的后序遍历                                                       | [PostOrder](src/com/leetcode/L101_200/L0145/PostOrder.java)                                                     | 中等 | 递归、迭代            | 树                                 |
| 199  | 二叉树的右视图                                                        | [BinaryTreeRightSideView](src/com/leetcode/L101_200/L0199/BinaryTreeRightSideView.java)                         | 中等 | 广度优先搜索           | 树、二叉树、广度优先搜索、深度优先搜索               |
| 222  | 完全二叉树的节点个数                                                     | [CountCompleteTreeNodes](src/com/leetcode/L201_300/L0222/CountCompleteTreeNodes.java)                           | 中等 | 递归               | 树、二分查找                            |
| 226  | 翻转二叉树                                                          | [InvertBinaryTree](src/com/leetcode/L201_300/L0226/InvertBinaryTree.java)                                       | 简单 | 递归               | 树                                 |
| 230  | 二叉搜索树中第K小的元素                                                   | [KthSmallestElementBST](src/com/leetcode/L201_300/L0230/KthSmallestElementBST.java)                             | 中等 | 递归、迭代            | 树                                 |
| 235  | 二叉搜索树的最近公共祖先                                                   | [LowestCommonAncestorBST](src/com/leetcode/L201_300/L0235/LowestCommonAncestorBST.java)                         | 简单 | 递归               | 树、二叉树、二叉搜素树、深度优先搜索                |
| 236  | 二叉树的最近公共祖先                                                     | [LowestCommonAncestorBinaryTree](src/com/leetcode/L201_300/L0236/LowestCommonAncestorBinaryTree.java)           | 中等 | 递归               | 树、二叉树、深度优先搜索                      |
| 404  | [左叶子之和](src/com/leetcode/L401_500/L0404/LeftLeavesSum.md)      | [LeftLeavesSum](src/com/leetcode/L401_500/L0404/LeftLeavesSum.java)                                             | 简单 | 递归               | 树                                 |
| 429  | N 叉树的层序遍历                                                      | [NTreeLevelTraversal](src/com/leetcode/L401_500/L0429/NTreeLevelTraversal.java)                                 | 中等 | 层序遍历             | 树、广度优先搜索                          |
| 437  | 路径总和III                                                        | [PathSumIII](src/com/leetcode/L401_500/L0437/PathSumIII.java)                                                   | 中等 | 递归、前缀和           | 树、二叉树、深度优先搜索                      |
| 450  | 删除二叉搜索树中的节点                                                    | [DeleteNodeTToBST](src/com/leetcode/L401_500/L0450/DeleteNodeTToBST.java)                                       | 中等 | 递归               | 树                                 |
| 501  | 二叉搜索树中的众数                                                      | [BSTMode](src/com/leetcode/L501_600/L0501/BSTMode.java)                                                         | 简单 | 递归、迭代            | 树                                 |
| 508  | 出现次数最多的子树元素和                                                   | [MostFrequentSubtreeSum](src/com/leetcode/L501_600/L0508/MostFrequentSubtreeSum.java)                           | 中等 | 深度优先搜索           | 树、二叉树、哈希表、深度优先搜索                  |
| 513  | 找树左下角的值                                                        | [FindBottomLeftTreeValue](src/com/leetcode/L501_600/L0513/FindBottomLeftTreeValue.java)                         | 中等 | 广度优先搜索           | 树、二叉树、广度优先搜索、深度优先搜索               |
| 515  | 在每个树行中找最大值                                                     | [FindLargestValueEachTreeRow](src/com/leetcode/L501_600/L0515/FindLargestValueEachTreeRow.java)                 | 中等 | 广度优先搜索           | 树、二叉树、广度优先搜索、深度优先搜索               |
| 530  | 二叉搜索树的最小绝对差                                                    | [BSTMin](src/com/leetcode/L501_600/L0530/BSTMin.java)                                                           | 简单 | 递归、迭代            | 树                                 |
| 538  | 把二叉搜索树转换为累加树                                                   | [ConvertBSTToGreaterTree](src/com/leetcode/L501_600/L0538/ConvertBSTToGreaterTree.java)                         | 简单 | 递归、迭代            | 树                                 |
| 543  | 二叉树的直径                                                         | [DiameterBinaryTree](src/com/leetcode/L501_600/L0543/DiameterBinaryTree.java)                                   | 简单 | 递归               | 树、二叉树、深度优先搜索                      |
| 559  | N 叉树的最大深度                                                      | [MaxDepthNTree](src/com/leetcode/L501_600/L0559/MaxDepthNTree.java)                                             | 简单 | 广度优先搜索、深度优先搜索    | 树、广度优先搜索、深度优先搜索                   |
| 563  | 二叉树的坡度                                                         | [BinaryTreeTilt](src/com/leetcode/L501_600/L0563/BinaryTreeTilt.java)                                           | 简单 | 深度优先搜索           | 树、二叉树、深度优先搜索                      |
| 589  | N 叉树的前序遍历                                                      | [NTreePreTraversal](src/com/leetcode/L501_600/L0589/NTreePreTraversal.java)                                     | 简单 | 递归               | 树、栈、深度优先搜索                        |
| 590  | N 叉树的后序遍历                                                      | [NTreePostTraversal](src/com/leetcode/L501_600/L0590/NTreePostTraversal.java)                                   | 简单 | 递归               | 树、栈、深度优先搜索                        |
| 606  | 根据二叉树创建字符串                                                     | [ConstructStringBST](src/com/leetcode/L601_700/L0606/ConstructStringBST.java)                                   | 简单 | 递归               | 树、二叉树、字符串、深度优先搜索                  |
| 617  | 合并二叉树                                                          | [MergeTwoBinaryTrees](src/com/leetcode/L601_700/L0617/MergeTwoBinaryTrees.java)                                 | 简单 | 递归               | 树                                 |
| 623  | 在二叉树中增加一行                                                      | [AddOneRowTree](src/com/leetcode/L601_700/L0623/AddOneRowTree.java)                                             | 中等 | 广度优先搜索           | 树、二叉树、广度优先搜索、深度优先搜索               |
| 637  | 二叉树的层平均值                                                       | [BinaryTreeLevelAverage](src/com/leetcode/L601_700/L0637/BinaryTreeLevelAverage.java)                           | 简单 | 广度优先搜索           | 树                                 |
| 652  | 寻找重复的子树                                                        | [FindDuplicateSubtrees](src/com/leetcode/L601_700/L0652/FindDuplicateSubtrees.java)                             | 中等 | 递归               | 树、二叉树、哈希表、深度优先搜索                  |
| 653  | 两数之和 IV - 输入 BST                                               | [TwoSumIV](src/com/leetcode/L601_700/L0653/TwoSumIV.java)                                                       | 简单 | 双指针、set集合        | 树、二叉树、二叉搜索树、哈希表、广度优先搜索、深度优先搜索、双指针 |
| 654  | 最大二叉树                                                          | [MaxBinaryTree](src/com/leetcode/L601_700/L0654/MaxBinaryTree.java)                                             | 中等 | 递归               | 树、二叉树、数组、栈、单调栈、分治算法               |
| 655  | 输出二叉树                                                          | [PrintBinaryTree](src/com/leetcode/L601_700/L0655/PrintBinaryTree.java)                                         | 中等 | 深度优先搜索           | 树、二叉树、广度优先搜索、深度优先搜索               |
| 662  | 二叉树最大宽度                                                        | [MaxBinaryTree](src/com/leetcode/L601_700/L0662/MaxBinaryTree.java)                                             | 中等 | 广度优先搜索           | 树、二叉树、广度优先搜索、深度优先搜索               |
| 669  | 修剪二叉搜索树                                                        | [TrimBST](src/com/leetcode/L601_700/L0669/TrimBST.java)                                                         | 中等 | 递归               | 树、二叉树、二叉搜索树、深度优先搜索                |
| 671  | 二叉树中第二小的节点                                                     | [SecondMinimumNodeInBinaryTree](src/com/leetcode/L601_700/L0671/SecondMinimumNodeInBinaryTree.java)             | 简单 | 深度优先搜索、set集合     | 树、二叉树、深度优先搜索                      |
| 687  | 最长同值路径                                                         | [LongestUnivaluePath](src/com/leetcode/L601_700/L0687/LongestUnivaluePath.java)                                 | 中等 | 后序遍历             | 树、二叉树、深度优先搜索                      |
| 700  | 二叉搜索树中的搜索                                                      | [SearchBST](src/com/leetcode/L601_700/L0700/SearchBST.java)                                                     | 简单 | 递归、迭代            | 树                                 |
| 701  | 二叉搜索树中的插入操作                                                    | [insertIntoBST](src/com/leetcode/L701_800/L0701/InsertBST.java)                                                 | 中等 | 递归、迭代            | 树                                 |
| 783  | 二叉搜索树节点最小距离                                                    | [BSTMinDistance](src/com/leetcode/L701_800/L0783/BSTMinDistance.java)                                           | 简单 | 递归、迭代            | 树                                 |
| 792  | 匹配子序列的单词数                                                      | [NumberMatchSub](src/com/leetcode/L701_800/L0792/NumberMatchSub.java)                                           | 中等 | 二分查找             | 字符串、哈希表、字典树、排序                    |
| 814  | 二叉树剪枝                                                          | [BinaryTreePruning](src/com/leetcode/L801_900/L0814/BinaryTreePruning.java)                                     | 中等 | 递归               | 树                                 |
| 863  | 二叉树中所有距离为 K 的结点                                                | [AllNodesDistanceKBinaryTree](src/com/leetcode/L801_900/L0863/AllNodesDistanceKBinaryTree.java)                 | 中等 | 深度优先搜索           | 树、深度优先搜索、广度优先搜索、二叉树               |
| 872  | 叶子相似的树                                                         | [Leaf_SimilarTrees](src/com/leetcode/L801_900/L0872/Leaf_SimilarTrees.java)                                     | 简单 | 深度优先搜索           | 树、深度优先搜索                          |
| 897  | 递增顺序搜索树                                                        | [IncreasingOrderSearchTree](src/com/leetcode/L801_900/L0897/IncreasingOrderSearchTree.java)                     | 简单 | 递归、迭代            | 树、递归、深度优先搜索                       |
| 938  | 二叉搜索树的范围和                                                      | [RangeSumBST](src/com/leetcode/L901_1000/L0938/RangeSumBST.java)                                                | 简单 | 递归、迭代            | 树、递归、深度优先搜索                       |
| 965  | 单值二叉树                                                          | [UnivaluedBinaryTree](src/com/leetcode/L901_1000/L0965/UnivaluedBinaryTree.java)                                | 简单 | 广度优先搜索           | 树、二叉树、深度优先搜索、广度优先搜索               |
| 987  | 二叉树的垂序遍历                                                       | [VerticalOrderTraversalBinaryTree](src/com/leetcode/L901_1000/L0987/VerticalOrderTraversalBinaryTree.java)      | 困难 | 深度优先搜索           | 树、二叉树、哈希表、深度优先搜索、广度优先搜索           |
| 993  | 二叉树的堂兄弟节点                                                      | [CousinsBinaryTree](src/com/leetcode/L901_1000/L0993/CousinsBinaryTree.java)                                    | 简单 | 深度优先搜索、广度优先搜索    | 树、广度优先搜索                          |
| 998  | 最大二叉树 II                                                       | [MaxBinaryTreeII](src/com/leetcode/L901_1000/L0998/MaxBinaryTreeII.java)                                        | 中等 | 递归               | 树、二叉树                             |
| 1022 | 从根到叶的二进制数之和                                                    | [SumRootBinaryNumbers](src/com/leetcode/L1001_1100/L1022/SumRootBinaryNumbers.java)                             | 简单 | 递归               | 树、二叉树、深度优先搜索                      |
| 1038 | 从二叉搜索树到更大和树                                                    | [BSTToGST](src/com/leetcode/L1001_1100/L1038/BSTToGST.java)                                                     | 中等 | 递归、迭代            | 树                                 |
| 1104 | 二叉树寻路                                                          | [PathInZigzagLabelledBinaryTree](src/com/leetcode/L1101_1200/L1104/PathInZigzagLabelledBinaryTree.java)         | 中等 | 数学               | 树、二叉树、数学                          |
| 1161 | 最大层内元素和                                                        | [MaxLevelSumTree](src/com/leetcode/L1101_1200/L1161/MaxLevelSumTree.java)                                       | 中等 | 广度优先搜索           | 树、二叉树、深度优先搜索、广度优先搜索               |
| 1302 | 层数最深叶子节点的和                                                     | [DeepestLeavesSum](src/com/leetcode/L1301_1400/L1302/DeepestLeavesSum.java)                                     | 中等 | 广度优先搜索           | 树、二叉树、深度优先搜索、广度优先搜索               |
| 1305 | 两棵二叉搜索树中的所有元素                                                  | [AllElementsBST](src/com/leetcode/L1301_1400/L1305/AllElementsBST.java)                                         | 中等 | 递归               | 树、二叉树、二叉搜索树、深度优先搜索、排序             |
| 1382 | 将二叉搜索树变平衡                                                      | [BalanceBinarySearchTree](src/com/leetcode/L1301_1400/L1382/BalanceBinarySearchTree.java)                       | 中等 | 递归               | 树、二叉树、二叉搜索树、贪心、分治、深度优先搜索          |
| 1609 | 奇偶树                                                            | [EvenOddTree](src/com/leetcode/L1601_1700/L1609/EvenOddTree.java)                                               | 中等 | 广度优先搜索           | 树、二叉树、广度优先搜索                      |
| 2049 | 统计最高分的节点数目                                                     | [CountNodesHighestScore](src/com/leetcode/L2001_2100/L2049/CountNodesHighestScore.java)                         | 中等 | 深度优先搜索           | 数组、树、二叉树、深度优先搜索                   |

## 5. **_字典树系列_**

| #   | 题目        | 类名                                                                                  | 难度 | 方法         | 标签                     |
|-----|-----------|-------------------------------------------------------------------------------------|----|------------|------------------------|
| 440 | 字典序的第K小数字 | [KSmallestOrder](src/com/leetcode/L401_500/L0440/KSmallestOrder.java)               | 简单 | 模拟         | 字典树                    |
| 472 | 连接词       | [ConcatenatedWords](src/com/leetcode/L401_500/L0472/ConcatenatedWords.java)         | 困难 | 字典树+深度优先搜索 | 数组、字符串、字典树、深度优先搜索、动态规划 |
| 648 | 单词替换      | [ReplaceWords](src/com/leetcode/L601_700/L0648/ReplaceWords.java)                   | 中等 | 字典树        | 字符串、哈希表、字典树、数组         |
| 720 | 词典中最长的单词  | [LongestWordDictionary](src/com/leetcode/L701_800/L0720/LongestWordDictionary.java) | 简单 | 字典树        | 字符串、哈希表、字典树、数组、排序      |
| 820 | 单词的压缩编码   | [ShortEncodingWords](src/com/leetcode/L801_900/L0820/ShortEncodingWords.java)       | 中等 | Set集合、字典树  | 数组、字符串、哈希表、字典树         |

## 6. **_矩阵系列_**

| #    | 题目            | 类名                                                                                                      | 难度 | 方法            | 标签                         |
|------|---------------|---------------------------------------------------------------------------------------------------------|----|---------------|----------------------------|
| 85   | 最大矩形          | [MaximalRectangle](src/com/leetcode/L1_100/L0085/MaximalRectangle.java)                                 | 困难 | 单调栈           | 数组、栈、单调栈、矩阵、动态规划           |
| 200  | 岛屿数量          | [NumberIslands](src/com/leetcode/L101_200/L0200/NumberIslands.java)                                     | 中等 | 深度优先搜索、广度优先搜索 | 数组、矩阵、并查集、深度优先搜索、广度优先搜索    |
| 407  | 接雨水 II        | [TrappingRainWaterII](src/com/leetcode/L401_500/L0407/TrappingRainWaterII.java)                         | 困难 | 堆             | 数组、堆、矩阵、广度优先搜索             |
| 417  | 太平洋大西洋水流问题    | [WaterFlow](src/com/leetcode/L401_500/L0417/WaterFlow.java)                                             | 中等 | 深度优先搜索        | 数组、矩阵、深度优先搜索、广度优先搜索        |
| 419  | 甲板上的战舰        | [BattleshipsBoard](src/com/leetcode/L401_500/L0419/BattleshipsBoard.java)                               | 中等 | 模拟            | 数组、矩阵、深度优先搜索               |
| 427  | 建立四叉树         | [ConstructQuadTree](src/com/leetcode/L401_500/L0427/ConstructQuadTree.java)                             | 中等 | 深度优先搜索        | 数组、矩阵、树、分治                 |
| 498  | 对角线遍历         | [DiagonalTraverse](src/com/leetcode/L401_500/L0498/DiagonalTraverse.java)                               | 中等 | 模拟            | 数组、矩阵、模拟                   |
| 542  | 01 矩阵         | [Matrix01](src/com/leetcode/L501_600/L0542/Matrix01.java)                                               | 中等 | 广度优先搜索        | 数组、矩阵、广度优先搜索、动态规划          |
| 661  | 图片平滑器         | [ImageSmoother](src/com/leetcode/L601_700/L0661/ImageSmoother.java)                                     | 简单 | 模拟            | 数组、矩阵                      |
| 675  | 为高尔夫比赛砍树      | [CutTreesGolf](src/com/leetcode/L601_700/L0675/CutTreesGolf.java)                                       | 困难 | 广度优先搜索        | 数组、矩阵、广度优先搜索、堆             |
| 694  | 不同的岛屿数量       | [NumberDistinctIslands](src/com/leetcode/L601_700/L0694/NumberDistinctIslands.java)                     | 中等 | 深度优先搜索        | 哈希表、并查集、深度优先搜索、广度优先搜索、哈希函数 |
| 695  | 岛屿的最大面积       | [MaxAreaIsland](src/com/leetcode/L601_700/L0695/MaxAreaIsland.java)                                     | 中等 | 深度优先搜索、广度优先搜索 | 数组、矩阵、并查集、深度优先搜索、广度优先搜索    |
| 733  | 图像渲染          | [FloodFill](src/com/leetcode/L701_800/L0733/FloodFill.java)                                             | 简单 | 广度优先搜索        | 数组、矩阵、深度优先搜索、广度优先搜索        |
| 773  | 滑动谜题          | [SlidingPuzzle](src/com/leetcode/L701_800/L0773/SlidingPuzzle.java)                                     | 困难 | 广度优先搜索        | 数组、矩阵、广度优先搜索               |
| 827  | 最大人工岛         | [MakingLargeIsland](src/com/leetcode/L801_900/L0827/MakingLargeIsland.java)                             | 困难 | 深度优先搜索        | 数组、矩阵、并查集、深度优先搜索、广度优先搜索    |
| 864  | 获取所有钥匙的最短路径   | [ShortestPathKeys](src/com/leetcode/L801_900/L0864/ShortestPathKeys.java)                               | 困难 | 广度优先搜索        | 数组、矩阵、广度优先搜索、位运算           |
| 909  | 蛇梯棋           | [SnakesLadders](src/com/leetcode/L901_1000/L0909/SnakesLadders.java)                                    | 中等 | 广度优先搜索        | 数组、矩阵、广度优先搜索               |
| 934  | 最短的桥          | [ShortestBridge](src/com/leetcode/L901_1000/L0934/ShortestBridge.java)                                  | 中等 | 广度优先搜索        | 数组、矩阵、广度优先搜索、深度优先搜索        |
| 994  | 腐烂的橘子         | [RottingOranges](src/com/leetcode/L901_1000/L0994/RottingOranges.java)                                  | 中等 | 广度优先搜索        | 数组、矩阵、广度优先搜索               |
| 1020 | 飞地的数量         | [NumberEnclaves](src/com/leetcode/L1001_1100/L1020/NumberEnclaves.java)                                 | 中等 | 深度优先搜索        | 数组、矩阵、并查集、广度优先搜索、深度优先搜索    |
| 1034 | 边界着色          | [ColoringBorder](src/com/leetcode/L1001_1100/L1034/ColoringBorder.java)                                 | 中等 | 广度优先搜索        | 数组、矩阵、广度优先搜索、深度优先搜索        |
| 1254 | 统计封闭岛屿的数目     | [NumberClosedIslands](src/com/leetcode/L1201_1300/L1254/NumberClosedIslands.java)                       | 中等 | 深度优先搜索        | 数组、矩阵、并查集、广度优先搜索、深度优先搜索    |
| 1337 | 矩阵中战斗力最弱的 K 行 | [TheKWeakestRowsMatrix](src/com/leetcode/L1301_1400/L1337/TheKWeakestRowsMatrix.java)                   | 简单 | 堆+二分查找        | 数组、矩阵、堆、二分查找、排列            |
| 1380 | 矩阵中的幸运数       | [LuckyNumbersMatrix](src/com/leetcode/L1301_1400/L1380/LuckyNumbersMatrix.java)                         | 简单 | 模拟            | 数组、矩阵                      |
| 1582 | 二进制矩阵中的特殊位置   | [SpecialPositionsMatrix](src/com/leetcode/L1501_1600/L1582/SpecialPositionsMatrix.java)                 | 简单 | 模拟            | 数组、矩阵                      |
| 1672 | 最富有客户的资产总量    | [RichCustomerWealth](src/com/leetcode/L1601_1700/L1672/RichCustomerWealth.java)                         | 简单 | 模拟            | 数组、矩阵                      |
| 1706 | 球会落何处         | [WhereWillBallFall](src/com/leetcode/L1701_1800/L1706/WhereWillBallFall.java)                           | 中等 | 深度优先搜索        | 数组、矩阵、深度优先搜索、模拟、动态规划       | 
| 1765 | 地图中的最高点       | [MapHighestPeak](src/com/leetcode/L1701_1800/L1765/MapHighestPeak.java)                                 | 中等 | 广度优先搜索        | 数组、矩阵、广度优先搜索               |
| 1886 | 判断矩阵经轮转后是否一致  | [DetermineWhetherMatrixRotation](src/com/leetcode/L1801_1900/L1886/DetermineWhetherMatrixRotation.java) | 简单 | 模拟            | 数组、矩阵                      |
| 1905 | 统计子岛屿         | [CountSubIslands](src/com/leetcode/L1901_2000/L1905/CountSubIslands.java)                               | 中等 | 深度优先搜索        | 数组、矩阵、并查集、广度优先搜索、深度优先搜索    |
| 2022 | 将一维数组转变成二维数组  | [Convert1DInto2D](src/com/leetcode/L2001_2100/L2022/Convert1DInto2D.java)                               | 简单 | 模拟            | 数组、矩阵、模拟                   |

## 7. **_图系列_**

| #    | 题目           | 类名                                                                                                | 难度 | 方法                        | 标签                             |
|------|--------------|---------------------------------------------------------------------------------------------------|----|---------------------------|--------------------------------|
| 127  | 单词接龙         | [WordLadder](src/com/leetcode/L101_200/L0127/WordLadder.java)                                     | 中等 | 广度优先搜索                    | 字符串、哈希表、广度优先搜索                 |
| 207  | 课程表          | [CourseSchedule](src/com/leetcode/L201_300/L0207/CourseSchedule.java)                             | 中等 | 拓扑排序                      | 图、深度优先搜索、广度优先搜索、拓扑排序           |
| 210  | 课程表 II       | [CourseScheduleII](src/com/leetcode/L201_300/L0210/CourseScheduleII.java)                         | 中等 | 拓扑排序                      | 图、深度优先搜索、广度优先搜索、拓扑排序           |
| 310  | 最小高度树        | [MinHeightTrees](src/com/leetcode/L301_400/L0310/MinHeightTrees.java)                             | 中等 | 拓扑排序                      | 图、深度优先搜索、广度优先搜索、拓扑排序           |
| 743  | 网络延迟时间       | [NetworkDelayTime](src/com/leetcode/L701_800/L0743/NetworkDelayTime.java)                         | 中等 | Dijkstra算法、SPFA算法、Floyd算法 | 图、深度优先搜索、广度优先搜索、最短路、堆          |
| 785  | 判断二分图        | [IsGraphBipartite](src/com/leetcode/L701_800/L0785/IsGraphBipartite.java)                         | 中等 | 深度优先搜索、广度优先搜索             | 图、深度优先搜索、广度优先搜索、并查集            |
| 787  | K 站中转内最便宜的航班 | [CheapestFlightsWithinKStops](src/com/leetcode/L701_800/L0787/CheapestFlightsWithinKStops.java)   | 中等 | Dijkstra算法                | 图、深度优先搜索、广度优先搜索、最短路、堆、动态规划     |
| 797  | 所有可能的路径      | [AllPathsFromSourceTarget](src/com/leetcode/L701_800/L0797/AllPathsFromSourceTarget.java)         | 中等 | 深度优先搜索、广度优先搜索             | 图、深度优先搜索、广度优先搜索、回溯算法           |
| 802  | 找到最终的安全状态    | [FindEventualSafeStates](src/com/leetcode/L801_900/L0802/FindEventualSafeStates.java)             | 中等 | 拓扑排序                      | 图、深度优先搜索、广度优先搜索、拓扑排序           |
| 847  | 访问所有节点的最短路径  | [ShortestPathVisitingAllNodes](src/com/leetcode/L801_900/L0847/ShortestPathVisitingAllNodes.java) | 困难 | 广度优先搜索                    | 图、广度优先搜索、位运算、动态规划、状态压缩         |
| 851  | 喧闹和富有        | [LoudRich](src/com/leetcode/L801_900/L0851/LoudRich.java)                                         | 中等 | 拓扑排序                      | 图、数组、深度优先搜索、拓扑排序               |
| 886  | 可能的二分法       | [PossibleBipartition](src/com/leetcode/L801_900/L0886/PossibleBipartition.java)                   | 中等 | 图                         | 图、并查集、深度优先搜索、广度优先搜索            |
| 997  | 找到小镇的法官      | [FindTownJudge](src/com/leetcode/L901_1000/L0997/FindTownJudge.java)                              | 简单 | 图                         | 图、数组、哈希表                       |
| 1135 | 最低成本连通城市     | [ConnectCitiesLowestCost](src/com/leetcode/L1101_1200/L1135/ConnectCitiesLowestCost.java)         | 中等 | Kruskal算法、Prim算法          | 图、并查集、最小生成树、堆                  |
| 1514 | 概率最大的路径      | [PathMaximumProbability](src/com/leetcode/L1501_1600/L1514/PathMaximumProbability.java)           | 中等 | Dijkstra算法                | 图、最短路、堆                        |
| 1584 | 连接所有点的最小费用   | [MinCostConnectPoints](src/com/leetcode/L1501_1600/L1584/MinCostConnectPoints.java)               | 中等 | Kruskal算法、Prim算法          | 数组、并查集、最小生成树                   |
| 1631 | 最小体力消耗路径     | [PathWithMinimumEffort](src/com/leetcode/L1601_1700/L1631/PathWithMinimumEffort.java)             | 中等 | Dijkstra算法                | 数组、并查集、矩阵、堆、深度优先搜索、广度优先搜索、二分查找 |
| 1728 | 猫和老鼠 II      | [CatAndMouseII](src/com/leetcode/L1701_1800/L1728/CatAndMouseII.java)                             | 困难 | 图                         | 图、广度优先搜索、数学、动态规划、记忆化搜索、博弈论     |
| 1791 | 找出星型图的中心节点   | [FindStarGraph](src/com/leetcode/L1701_1800/L1791/FindStarGraph.java)                             | 简单 | 图                         | 图                              |
| 2039 | 网络空闲的时刻      | [TimeNetworkIdle](src/com/leetcode/L2001_2100/L2039/TimeNetworkIdle.java)                         | 中等 | Dijkstra算法                | 图、数组、广度优先搜索                    |
| 2045 | 到达目的地的第二短时间  | [SecondMinTimeDestination](src/com/leetcode/L2001_2100/L2045/SecondMinTimeDestination.java)       | 困难 | 广度优先搜索                    | 图、广度优先搜索、最短路                   |

## 8. **_并查集系列_**

| #   | 题目           | 类名                                                                                                       | 难度 | 方法  | 标签                         |
|-----|--------------|----------------------------------------------------------------------------------------------------------|----|-----|----------------------------|
| 128 | 最长连续序列       | [LongestConsecutiveSeq](src/com/leetcode/L101_200/L0128/LongestConsecutiveSeq.java)                      | 中等 | 并查集 | 数组、并查集、哈希表                 |
| 130 | 被围绕的区域       | [SurroundedRegions](src/com/leetcode/L101_200/L0130/SurroundedRegions.java)                              | 中等 | 并查集 | 数组、并查集、矩阵、深度优先搜索、广度优先搜索    |
| 399 | 除法求值         | [EvaluateDivision](src/com/leetcode/L301_400/L0399/EvaluateDivision.java)                                | 中等 | 并查集 | 数组、并查集、图、深度优先搜索、广度优先搜索、最短路 |
| 547 | 省份数量         | [NumberProvinces](src/com/leetcode/L501_600/L0547/NumberProvinces.java)                                  | 中等 | 并查集 | 图、并查集、深度优先搜索、广度优先搜索        |
| 684 | 冗余连接         | [RedundantConnection](src/com/leetcode/L601_700/L0684/RedundantConnection.java)                          | 中等 | 并查集 | 图、并查集、深度优先搜索、广度优先搜索        |
| 839 | 相似字符串组       | [SimilarStringGroups](src/com/leetcode/L801_900/L0839/SimilarStringGroups.java)                          | 困难 | 并查集 | 字符串、并查集、深度优先搜索、广度优先搜索      |
| 952 | 按公因数计算最大组件大小 | [LargestComponentSize](src/com/leetcode/L901_1000/L0952/LargestComponentSize.java)                       | 困难 | 并查集 | 数组、并查集、数学                  |
| 990 | 等式方程的可满足性    | [SatisfiabilityEqualityEquations](src/com/leetcode/L901_1000/L0990/SatisfiabilityEqualityEquations.java) | 困难 | 并查集 | 并查集、图                      |

## 9. **_动态规划系列_**

| #    | 题目               | 类名                                                                                                                            | 难度 | 方法          | 标签                              |
|------|------------------|-------------------------------------------------------------------------------------------------------------------------------|----|-------------|---------------------------------|
| 10   | 正则表达式匹配          | [RegularExpressionMatching](src/com/leetcode/L1_100/L0010/RegularExpressionMatching.java)                                     | 困难 | 动态规划        | 字符串、动态规划、回溯算法                   |
| 53   | 最大子序和            | [MaxSequenceSum](src/com/leetcode/L1_100/L0053/MaxSequenceSum.java)                                                           | 简单 | 动态规划        | 数组、动态规划、分治算法                    |
| 62   | 不同路径             | [UniquePaths](src/com/leetcode/L1_100/L0062/UniquePaths.java)                                                                 | 中等 | 动态规划        | 动态规划                            |
| 64   | 最小路径和            | [MinPathSum](src/com/leetcode/L1_100/L0064/MinPathSum.java)                                                                   | 中等 | 动态规划        | 数组、动态规划                         |
| 70   | 爬楼梯              | [ClimbStairs](src/com/leetcode/L1_100/L0070/ClimbStairs.java)                                                                 | 简单 | 动态规划        | 动态规划                            |
| 72   | 编辑距离             | [EditDistance](src/com/leetcode/L1_100/L0072/EditDistance.java)                                                               | 困难 | 动态规划        | 字符串、动态规划                        |
| 87   | 扰乱字符串            | [ScrambleString](src/com/leetcode/L1_100/L0087/ScrambleString.java)                                                           | 困难 | 暴力法、动态规划    | 字符串、动态规划                        |
| 91   | 解码方法             | [DecodeWays](src/com/leetcode/L1_100/L0091/DecodeWays.java)                                                                   | 中等 | 动态规划        | 字符串、动态规划                        |
| 97   | 交错字符串            | [InterleavingString](src/com/leetcode/L1_100/L0097/InterleavingString.java)                                                   | 中等 | 动态规划        | 字符串、动态规划                        |
| 115  | 不同的子序列           | [DistinctSubsequences](src/com/leetcode/L101_200/L0115/DistinctSubsequences.java)                                             | 困难 | 动态规划        | 字符串、动态规划                        |
| 120  | 三角形最小路径和         | [TriangleMinPathSum](src/com/leetcode/L101_200/L0120/TriangleMinPathSum.java)                                                 | 中等 | 动态规划        | 数组、动态规划                         |
| 121  | 买卖股票的最佳时机        | [BestTimeBuyAndSellStock](src/com/leetcode/L101_200/L0121/BestTimeBuyAndSellStock.java)                                       | 简单 | 模拟、动态规划     | 数组、动态规划                         |
| 123  | 买卖股票的最佳时机III     | [StockIII](src/com/leetcode/L101_200/L0123/StockIII.java)                                                                     | 困难 | 动态规划        | 数组、动态规划                         |
| 132  | 分割回文串 II         | [PalindromePartitioningII](src/com/leetcode/L101_200/L0132/PalindromePartitioningII.java)                                     | 困难 | 动态规划        | 字符串、动态规划                        |
| 139  | 单词拆分             | [WordBreak](src/com/leetcode/L101_200/L0139/WordBreak.java)                                                                   | 中等 | 动态规划        | 字符串、哈希表、字典树、记忆化搜索、动态规划          |
| 152  | 乘积最大子数组          | [MaxProductSub](src/com/leetcode/L101_200/L0152/MaxProductSub.java)                                                           | 中等 | 动态规划        | 数组、动态规划                         |
| 188  | 买卖股票的最佳时机IV      | [StockIV](src/com/leetcode/L101_200/L0188/StockIV.java)                                                                       | 困难 | 动态规划        | 数组、动态规划                         |
| 198  | 打家劫舍             | [HouseRobber](src/com/leetcode/L101_200/L0198/HouseRobber.java)                                                               | 简单 | 动态规划        | 动态规划                            |
| 213  | 打家劫舍II           | [HouseRobberII](src/com/leetcode/L201_300/L0213/HouseRobberII.java)                                                           | 中等 | 动态规划        | 动态规划                            |
| 221  | 最大正方形            | [MaxSquare](src/com/leetcode/L201_300/L0221/MaxSquare.java)                                                                   | 中等 | 动态规划        | 数组、矩阵、动态规划                      |
| 264  | 丑数 II            | [UglyNumberII](src/com/leetcode/L201_300/L0264/UglyNumberII.java)                                                             | 中等 | 小根堆、动态规划    | 堆、数学、动态规划                       |
| 300  | 最长递增子序列          | [LongestAscSequence](src/com/leetcode/L201_300/L0300/LongestAscSequence.java)                                                 | 中等 | 动态规划        | 动态规划、二分查找                       |
| 309  | 最佳买卖股票时机含冷冻期     | [StockWithCool](src/com/leetcode/L301_400/L0309/StockWithCool.java)                                                           | 中等 | 动态规划        | 数组、动态规划                         |
| 312  | 戳气球              | [BurstBalloons](src/com/leetcode/L301_400/L0312/BurstBalloons.java)                                                           | 困难 | 动态规划        | 动态规划                            |
| 313  | 超级丑数             | [SuperUglyNumber](src/com/leetcode/L301_400/L0313/SuperUglyNumber.java)                                                       | 中等 | 堆、动态规划      | 数组、哈希表、堆、动态规划、数学                |
| 322  | 零钱兑换             | [CoinChange](src/com/leetcode/L301_400/L0322/CoinChange.java)                                                                 | 中等 | 动态规划        | 动态规划                            |
| 329  | 矩阵中的最长递增路径       | [LongestIncreasingPathMatrix](src/com/leetcode/L301_400/L0329/LongestIncreasingPathMatrix.java)                               | 困难 | 动态规划        | 图、深度优先搜索、广度优先搜索、拓扑排序、记忆化搜索、动态规划 |
| 354  | 俄罗斯套娃信封问题        | [RussianDollEnvelopes](src/com/leetcode/L301_400/L0354/RussianDollEnvelopes.java)                                             | 困难 | 动态规划        | 动态规划、二分查找                       |
| 375  | 猜数字大小 II         | [GuessNumberII](src/com/leetcode/L301_400/L0375/GuessNumberII.java)                                                           | 中等 | 动态规划        | 数组、动态规划、博弈                      |
| 376  | 摆动序列             | [WiggleSubsequence](src/com/leetcode/L301_400/L0376/WiggleSubsequence.java)                                                   | 中等 | 动态规划        | 动态规划、贪心算法                       |
| 403  | 青蛙过河             | [FrogJump](src/com/leetcode/L401_500/L0403/FrogJump.java)                                                                     | 困难 | 动态规划        | 动态规划                            |
| 413  | 等差数列划分           | [ArithmeticSlices](src/com/leetcode/L401_500/L0413/ArithmeticSlices.java)                                                     | 中等 | 动态规划        | 数组、动态规划                         |
| 416  | 分割等和子集           | [PartitionStringSum](src/com/leetcode/L401_500/L0416/PartitionStringSum.java)                                                 | 中等 | 动态规划        | 动态规划                            |
| 446  | 等差数列划分 II - 子序列  | [ArithmeticSlicesII_Subsequence](src/com/leetcode/L401_500/L0446/ArithmeticSlicesII_Subsequence.java)                         | 困难 | 动态规划        | 数组、动态规划                         |
| 467  | 环绕字符串中唯一的子字符串    | [UniqueSubstringsWraparound](src/com/leetcode/L401_500/L0467/UniqueSubstringsWraparound.java)                                 | 中等 | 动态规划        | 字符串、动态规划                        |
| 474  | 一和零              | [OnesAndZeroes](src/com/leetcode/L401_500/L0474/OnesAndZeroes.java)                                                           | 中等 | 动态规划        | 动态规划                            |
| 494  | 目标和              | [TargetSum](src/com/leetcode/L401_500/L0494/TargetSum.java)                                                                   | 中等 | 回溯算法、动态规划   | 数组、回溯算法、动态规划                    |
| 516  | 最长回文子序列          | [LongestPalindromicSubsequence](src/com/leetcode/L501_600/L0516/LongestPalindromicSubsequence.java)                           | 中等 | 动态规划        | 动态规划                            |
| 518  | 零钱兑换 II          | [CoinChange2](src/com/leetcode/L501_600/L0518/CoinChange2.java)                                                               | 中等 | 动态规划        | 动态规划                            |
| 552  | 学生出勤记录 II        | [CoinChange2](src/com/leetcode/L501_600/L0552/StudentAttendanceRecordII.java)                                                 | 困难 | 动态规划        | 动态规划                            |
| 576  | 出界的路径数           | [OutBoundaryPaths](src/com/leetcode/L501_600/L0576/OutBoundaryPaths.java)                                                     | 中等 | 动态规划        | 动态规划                            |
| 583  | 两个字符串的删除操作       | [DeleteOperationTwoStrings](src/com/leetcode/L501_600/L0583/DeleteOperationTwoStrings.java)                                   | 中等 | 动态规划        | 字符串、动态规划                        |
| 600  | 不含连续1的非负整数       | [NoIntegersConsecutiveOnes](src/com/leetcode/L501_600/L0600/NoIntegersConsecutiveOnes.java)                                   | 困难 | 动态规划        | 动态规划                            |
| 629  | K个逆序对数组          | [KInversePairsArray](src/com/leetcode/L601_700/L0629/KInversePairsArray.java)                                                 | 困难 | 动态规划        | 动态规划                            |
| 638  | 大礼包              | [ShoppingOffers](src/com/leetcode/L601_700/L0638/ShoppingOffers.java)                                                         | 中等 | 深度优先搜索、动态规划 | 数组、位运算、状态压缩、动态规划、记忆化搜索、回溯       |
| 639  | 解码方法 II          | [DecodeWaysII](src/com/leetcode/L601_700/L0639/DecodeWaysII.java)                                                             | 困难 | 动态规划        | 字符串、动态规划                        |
| 647  | 回文子串             | [PalindromicSubstrings](src/com/leetcode/L601_700/L0647/PalindromicSubstrings.java)                                           | 中等 | 动态规划        | 字符串、动态规划                        |
| 650  | 只有两个键的键盘         | [KeysKeyboard](src/com/leetcode/L601_700/L0650/KeysKeyboard.java)                                                             | 中等 | 动态规划        | 动态规划、数学                         |
| 664  | 奇怪的打印机           | [StrangePrinter](src/com/leetcode/L601_700/L0664/StrangePrinter.java)                                                         | 困难 | 动态规划        | 动态规划、深度优先搜索                     |
| 673  | 最长递增子序列的个数       | [NumberLongestIncreasingSubsequence](src/com/leetcode/L601_700/L0673/NumberLongestIncreasingSubsequence.java)                 | 中等 | 动态规划        | 数组、树状数组、线段树、动态规划                |
| 688  | 骑士在棋盘上的概率        | [KProbabilityChessboard](src/com/leetcode/L601_700/L0688/KProbabilityChessboard.java)                                         | 中等 | 动态规划        | 动态规划                            |
| 714  | 买卖股票的最佳时机含手续费    | [StockWithFee](src/com/leetcode/L701_800/L0714/StockWithFee.java)                                                             | 中等 | 动态规划        | 数组、贪心算法、动态规划                    |
| 740  | 删除并获得点数          | [DeleteAndEarn](src/com/leetcode/L701_800/L0740/DeleteAndEarn.java)                                                           | 中等 | 动态规划        | 动态规划                            |
| 746  | 使用最小花费爬楼梯        | [MinCostClimbingStairs](src/com/leetcode/L701_800/L0746/MinCostClimbingStairs.java)                                           | 简单 | 动态规划        | 数组、动态规划                         |
| 790  | 多米诺和托米诺平铺        | [Domino](src/com/leetcode/L701_800/L0790/Domino.java)                                                                         | 中等 | 动态规划        | 动态规划                            |
| 799  | 香槟塔              | [ChampagneTower](src/com/leetcode/L701_800/L0799/ChampagneTower.java)                                                         | 中等 | 动态规划        | 动态规划                            |
| 801  | 使序列递增的最小交换次数     | [MinSwapsSeq](src/com/leetcode/L801_900/L0801/MinSwapsSeq.java)                                                               | 困难 | 动态规划        | 数组、动态规划                         |
| 808  | 分汤               | [SoupServings](src/com/leetcode/L801_900/L0808/SoupServings.java)                                                             | 中等 | 动态规划        | 动态规划、数学、概率与统计                   |
| 813  | 最大平均值和的分组        | [LargestSumAve](src/com/leetcode/L801_900/L0813/LargestSumAve.java)                                                           | 中等 | 动态规划        | 数组、动态规划、前缀和                     |
| 873  | 最长的斐波那契子序列的长度    | [LengthLongestFibonacciSubsequence](src/com/leetcode/L801_900/L0873/LengthLongestFibonacciSubsequence.java)                   | 中等 | 动态规划、set集合  | 数组、哈希表、动态规划                     |
| 877  | 石子游戏             | [StoneGame](src/com/leetcode/L801_900/L0877/StoneGame.java)                                                                   | 中等 | 动态规划        | 极小化极大、数学、动态规划                   |
| 887  | 鸡蛋掉落             | [SuperEggDrop](src/com/leetcode/L801_900/L0887/SuperEggDrop.java)                                                             | 简单 | 动态规划        | 数组、动态规划                         |
| 913  | 猫和老鼠             | [CatAndMouse](src/com/leetcode/L901_1000/L0913/CatAndMouse.java)                                                              | 困难 | 动态规划        | 图、动态规划、博弈、数学、广度优先搜索、记忆化搜索       |
| 926  | 将字符串翻转到单调递增      | [FlipStringMonotoneIncreasing](src/com/leetcode/L901_1000/L0926/FlipStringMonotoneIncreasing.java)                            | 中等 | 动态规划        | 字符串、动态规划                        |
| 1035 | 不相交的线            | [UncrossedLines](src/com/leetcode/L1001_1100/L1035/UncrossedLines.java)                                                       | 中等 | 动态规划        | 数组                              |
| 1074 | 元素和为目标值的子矩阵数量    | [NumberSubmatricesThatSumTarget](src/com/leetcode/L1001_1100/L1074/NumberSubmatricesThatSumTarget.java)                       | 困难 | 动态规划        | 数组、动态规划、滑动窗口                    |
| 1137 | 第 N 个泰波那契数       | [NTribonacciNumber](src/com/leetcode/L1101_1200/L1137/NTribonacciNumber.java)                                                 | 简单 | 动态规划        | 动态规划、数学、记忆化搜索                   |
| 1143 | 最长公共子序列          | [LongestCommonSubsequence](src/com/leetcode/L1101_1200/L1143/LongestCommonSubsequence.java)                                   | 中等 | 动态规划        | 动态规划                            |
| 1220 | 统计元音字母序列的数目      | [CountVowelsPermutation](src/com/leetcode/L1201_1300/L1220/CountVowelsPermutation.java)                                       | 困难 | 动态规划        | 动态规划                            |
| 1218 | 最长定差子序列          | [LongestSubsequenceDifference](src/com/leetcode/L1201_1300/L1218/LongestSubsequenceDifference.java)                           | 中等 | 动态规划        | 数组、哈希表、动态规划                     |
| 1269 | 停在原地的方案数         | [NumberWaysStaySamePlaceAfterSomeSteps](src/com/leetcode/L1201_1300/L1269/NumberWaysStaySamePlaceAfterSomeSteps.java)         | 困难 | 动态规划        | 动态规划                            |
| 1312 | 让字符串成为回文串的最少插入次数 | [MinimumInsertionStepsMakeStringPalindrome](src/com/leetcode/L1301_1400/L1312/MinimumInsertionStepsMakeStringPalindrome.java) | 困难 | 动态规划        | 动态规划                            |
| 1387 | 将整数按权重排序         | [SortIntegersByWeight](src/com/leetcode/L1301_1400/L1387/SortIntegersByWeight.java)                                           | 中等 | 动态规划        | 记忆化搜索、动态规划、排序                   |
| 2100 | 适合打劫银行的日子        | [GoodDaysRob](src/com/leetcode/L2001_2100/L2100/GoodDaysRob.java)                                                             | 中等 | 动态规划        | 数组、动态规划、前缀和                     |

## 10. **_回溯算法系列_**

| #    | 题目               | 类名                                                                                                | 难度 | 方法         | 标签                          |
|------|------------------|---------------------------------------------------------------------------------------------------|----|------------|-----------------------------|
| 17   | 电话号码的字母组合        | [LetterCombinationsPhoneNumber](src/com/leetcode/L1_100/L0017/LetterCombinationsPhoneNumber.java) | 中等 | 回溯算法       | 字符串、哈希表、回溯算法                |
| 22   | 括号生成             | [GenerateParentheses](src/com/leetcode/L1_100/L0022/GenerateParentheses.java)                     | 中等 | 回溯算法       | 字符串、回溯算法、动态规划               |
| 37   | 解数独              | [Sudoku](src/com/leetcode/L1_100/L0037/Sudoku.java)                                               | 困难 | 回溯算法       | 哈希表、回溯算法                    |
| 39   | 组合总和             | [CombinationSum](src/com/leetcode/L1_100/L0039/CombinationSum.java)                               | 中等 | 回溯算法       | 数组、回溯算法                     |
| 40   | 组合总和II           | [CombinationSumII](src/com/leetcode/L1_100/L0040/CombinationSumII.java)                           | 中等 | 回溯算法       | 数组、回溯算法                     |
| 46   | 全排列              | [Permutations](src/com/leetcode/L1_100/L0046/Permutations.java)                                   | 中等 | 回溯算法       | 回溯算法                        |
| 47   | 全排列II            | [PermutationsII](src/com/leetcode/L1_100/L0047/PermutationsII.java)                               | 中等 | 回溯算法       | 回溯算法                        |
| 51   | N皇后              | [NQueens](src/com/leetcode/L1_100/L0051/NQueens.java)                                             | 困难 | 回溯算法       | 回溯算法                        |
| 52   | N皇后II            | [NQueensII](src/com/leetcode/L1_100/L0052/NQueensII.java)                                         | 困难 | 回溯算法       | 回溯算法                        |
| 77   | 组合               | [Combination](src/com/leetcode/L1_100/L0077/Combination.java)                                     | 中等 | 回溯算法       | 回溯算法                        |
| 78   | 子集               | [Subsets](src/com/leetcode/L1_100/L0078/Subsets.java)                                             | 中等 | 回溯算法       | 数组、回溯算法、位运算                 |
| 79   | 单词搜索             | [WordSearch](src/com/leetcode/L1_100/L0079/WordSearch.java)                                       | 中等 | 回溯算法       | 数组、回溯算法                     |
| 90   | 子集II             | [SubsetsII](src/com/leetcode/L1_100/L0090/SubsetsII.java)                                         | 中等 | 回溯算法       | 数组、回溯算法                     |
| 93   | 复原 IP 地址         | [RestoreIPAddresses](src/com/leetcode/L1_100/L0093/RestoreIPAddresses.java)                       | 中等 | 回溯算法       | 字符串、回溯算法                    |
| 131  | 分割回文串            | [PalindromePartitioning](src/com/leetcode/L101_200/L0131/PalindromePartitioning.java)             | 中等 | 回溯算法       | 字符串、回溯算法、动态规划               |
| 212  | 单词搜索 II          | [WordSearchII](src/com/leetcode/L201_300/L0212/WordSearchII.java)                                 | 困难 | 字典树+回溯算法   | 数组、字符串、字典树、回溯算法、矩阵          |
| 216  | 组合总和III          | [CombinationSumIII](src/com/leetcode/L201_300/L0216/CombinationSumIII.java)                       | 中等 | 回溯算法       | 数组、回溯算法                     |
| 282  | 给表达式添加运算符        | [ExpressionAddOperators](src/com/leetcode/L201_300/L0282/ExpressionAddOperators.java)             | 困难 | 回溯算法       | 字符串、数学、回溯算法                 |
| 301  | 删除无效的括号          | [RemoveInvalidParentheses](src/com/leetcode/L301_400/L0301/RemoveInvalidParentheses.java)         | 困难 | 回溯算法       | 字符串、回溯算法、广度优先搜索             |
| 306  | 累加数              | [AdditiveNumber](src/com/leetcode/L301_400/L0306/AdditiveNumber.java)                             | 中等 | 回溯算法       | 字符串、回溯算法                    |
| 473  | 火柴拼正方形           | [MatchsticksSquare](src/com/leetcode/L401_500/L0473/MatchsticksSquare.java)                       | 中等 | 回溯算法       | 数组、回溯算法、动态规划、位运算、状态压缩       |
| 488  | 祖玛游戏             | [ZumaGame](src/com/leetcode/L401_500/L0488/ZumaGame.java)                                         | 困难 | 回溯算法       | 字符串、回溯算法                    |
| 526  | 优美的排列            | [BeautifulArrangement](src/com/leetcode/L501_600/L0526/BeautifulArrangement.java)                 | 中等 | 回溯算法、动态规划  | 数组、位运算、回溯算法、动态规划、状态压缩       |
| 698  | 划分为k个相等的子集       | [PartitionKEqualSum](src/com/leetcode/L601_700/L0698/PartitionKEqualSum.java)                     | 中等 | 回溯算法       | 数组、位运算、回溯算法、动态规划、状态压缩、记忆化搜索 |
| 784  | 字母大小写全排列         | [LetterCasePermutation](src/com/leetcode/L701_800/L0784/LetterCasePermutation.java)               | 中等 | 回溯算法       | 字符串、位运算、回溯算法                |
| 854  | 相似度为 K 的字符串      | [KSimilarStrings](src/com/leetcode/L801_900/L0854/KSimilarStrings.java)                           | 困难 | 回溯算法       | 字符串、广度优先搜索                  |
| 869  | 重新排序得到 2 的幂      | [ReorderedPower2](src/com/leetcode/L801_900/L0869/ReorderedPower2.java)                           | 中等 | 回溯算法、set集合 | 数学、计数、排序、枚举                 |
| 1219 | 黄金矿工             | [PathMaxGold](src/com/leetcode/L1201_1300/L1219/PathMaxGold.java)                                 | 中等 | 回溯算法       | 数组、矩阵、回溯算法                  |
| 1863 | 找出所有子集的异或总和再求和   | [SumAllSubsetXORTotals](src/com/leetcode/L1801_1900/L1863/SumAllSubsetXORTotals.java)             | 简单 | 回溯算法       | 回溯算法                        |
| 2044 | 统计按位或能得到最大值的子集数目 | [CountMaxOR](src/com/leetcode/L2001_2100/L2044/CountMaxOR.java)                                   | 中等 | 回溯算法       | 数组、回溯算法、位运算                 |

## 11. **_贪心算法系列_**

| #    | 题目               | 类名                                                                                              | 难度 | 方法   | 标签             |
|------|------------------|-------------------------------------------------------------------------------------------------|----|------|----------------|
| 122  | 买卖股票的最佳时机II      | [StockII](src/com/leetcode/L101_200/L0122/StockII.java)                                         | 简单 | 贪心算法 | 数组、贪心算法        |
| 321  | 拼接最大数            | [CreateMaximumNumber](src/com/leetcode/L301_400/L0321/CreateMaximumNumber.java)                 | 困难 | 贪心算法 | 数组、贪心算法、动态规划   |
| 330  | 按要求补齐数组          | [PatchingArray](src/com/leetcode/L301_400/L0330/PatchingArray.java)                             | 困难 | 贪心算法 | 贪心算法           |
| 334  | 递增的三元子序列         | [IncreasingTripletSub](src/com/leetcode/L301_400/L0334/IncreasingTripletSub.java)               | 中等 | 贪心算法 | 数组、贪心算法        |
| 455  | 分发饼干             | [AssignCookies](src/com/leetcode/L401_500/L0455/AssignCookies.java)                             | 简单 | 贪心算法 | 贪心算法           |
| 517  | 超级洗衣机            | [SuperWashingMachines](src/com/leetcode/L501_600/L0517/SuperWashingMachines.java)               | 困难 | 贪心算法 | 数组、贪心算法        |
| 738  | 单调递增的数字          | [MonotoneIncreasingDigits](src/com/leetcode/L701_800/L0738/MonotoneIncreasingDigits.java)       | 中等 | 贪心算法 | 贪心算法           |
| 763  | 划分字母区间           | [PartitionLabels](src/com/leetcode/L701_800/L0763/PartitionLabels.java)                         | 中等 | 贪心算法 | 字符串            |
| 767  | 重构字符串            | [ReorganizeString](src/com/leetcode/L701_800/L0767/ReorganizeString.java)                       | 中等 | 贪心算法 | 字符串、堆、贪心算法、排序  |
| 807  | 保持城市天际线          | [MaxKeepCitySkyline](src/com/leetcode/L801_900/L0807/MaxKeepCitySkyline.java)                   | 中等 | 贪心算法 | 数组、矩阵、贪心算法     |
| 846  | 一手顺子             | [HandStraights](src/com/leetcode/L801_900/L0846/HandStraights.java)                             | 中等 | 贪心算法 | 数组、哈希表、排序、贪心算法 |
| 860  | 柠檬水找零            | [LemonadeChange](src/com/leetcode/L801_900/L0860/LemonadeChange.java)                           | 简单 | 贪心算法 | 数组、贪心算法        |
| 861  | 翻转矩阵后的得分         | [ScoreAfterFlippingMatrix](src/com/leetcode/L801_900/L0861/ScoreAfterFlippingMatrix.java)       | 中等 | 贪心算法 | 数组、贪心算法        |
| 871  | 最低加油次数           | [MinNumberStops](src/com/leetcode/L801_900/L0871/MinNumberStops.java)                           | 困难 | 贪心算法 | 数组、堆、贪心算法、动态规划 |
| 1005 | K 次取反后最大化的数组和    | [MaximizeSumArrayKNegations](src/com/leetcode/L1001_1100/L1005/MaximizeSumArrayKNegations.java) | 简单 | 贪心算法 | 数组、贪心算法、排序     |
| 1405 | 最长快乐字符串          | [LongestHappyString](src/com/leetcode/L1401_1500/L1405/LongestHappyString.java)                 | 中等 | 贪心算法 | 字符春、堆、贪心算法     |
| 1414 | 和为 K 的最少斐波那契数字数目 | [FindMinFibSumK](src/com/leetcode/L1401_1500/L1414/FindMinFibSumK.java)                         | 中等 | 贪心算法 | 贪心算法           |
| 1689 | 十-二进制数的最少数目      | [Ten_TwoMin](src/com/leetcode/L1601_1700/L1689/Ten_TwoMin.java)                                 | 中等 | 贪心算法 | 字符串、贪心算法       |
| 1881 | 插入后的最大值          | [MaximumValueInsertion](src/com/leetcode/L1801_1900/L1881/MaximumValueInsertion.java)           | 中等 | 贪心算法 | 贪心算法           |

## 12. **_数学方法系列_**

| #    | 题目                                                                  | 类名                                                                                                                  | 难度 | 方法       | 标签                  |
|------|---------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|----|----------|---------------------|
| 2    | 两数相加                                                                | [TwoNumAdd](src/com/leetcode/L1_100/L0002/TwoNumAdd.java)                                                           | 中等 | 数学       | 链表、数学               |
| 7    | 整数反转                                                                | [ReverseInteger](src/com/leetcode/L1_100/L0007/ReverseInteger.java)                                                 | 简单 | 数学       | 数学                  |
| 9    | 回文数                                                                 | [PalindromeNumber](src/com/leetcode/L1_100/L0009/PalindromeNumber.java)                                             | 简单 | 双指针      | 数学                  |
| 12   | 整数转罗马数字                                                             | [IntegerRoman](src/com/leetcode/L1_100/L0012/IntegerRoman.java)                                                     | 中等 | 数学       | 数学、字符串              |
| 13   | 罗马数字转整数                                                             | [RomanInteger](src/com/leetcode/L1_100/L0013/RomanInteger.java)                                                     | 简单 | 数学       | 数学、字符串              |
| 29   | 两数相除                                                                | [DivideTwoIntegers](src/com/leetcode/L1_100/L0029/DivideTwoIntegers.java)                                           | 中等 | 数学       | 数学、位运算              |
| 50   | Pow(x, n)                                                           | [Pow](src/com/leetcode/L1_100/L0050/Pow.java)                                                                       | 中等 | 数学       | 数学、二分查找             |
| 60   | 第k个排序                                                               | [KthPermutation](src/com/leetcode/L1_100/L0060/KthPermutation.java)                                                 | 中等 | 数学       | 数学、回溯算法             |
| 66   | 加一                                                                  | [AddOne](src/com/leetcode/L1_100/L0066/AddOne.java)                                                                 | 简单 | 数学       | 数组                  |
| 69   | Sqrt(x)                                                             | [Sqrt](src/com/leetcode/L1_100/L0069/Sqrt.java)                                                                     | 简单 | 二分查找     | 数学、二分查找             |
| 149  | 直线上最多的点数                                                            | [MaxPointsLine](src/com/leetcode/L101_200/L0149/MaxPointsLine.java)                                                 | 困难 | 数学       | 几何、哈希表、数学           |
| 166  | 分数到小数                                                               | [FractionRecurringDecimal](src/com/leetcode/L101_200/L0166/FractionRecurringDecimal.java)                           | 中等 | 数学       | 字符串、哈希表、数学          |
| 168  | Excel表列名称                                                           | [ExcelSheetColumnTitle](src/com/leetcode/L101_200/L0168/ExcelSheetColumnTitle.java)                                 | 简单 | 数学       | 字符串、数学              |
| 171  | Excel表列序号                                                           | [ExcelSheetColumnNumber](src/com/leetcode/L101_200/L0171/ExcelSheetColumnNumber.java)                               | 简单 | 数学       | 字符串、数学              |
| 172  | 阶乘后的零                                                               | [FactorialTrailingZeroes](src/com/leetcode/L101_200/L0172/FactorialTrailingZeroes.java)                             | 中等 | 数学       | 数学                  |
| 189  | 轮转数组                                                                | [RotateArray](src/com/leetcode/L101_200/L0189/RotateArray.java)                                                     | 中等 | 数学       | 数组、数学、双指针           |
| 204  | 计数质数                                                                | [CountPrimes](src/com/leetcode/L201_300/L0204/CountPrimes.java)                                                     | 简单 | 数学       | 数学                  |
| 223  | 矩形面积                                                                | [RectangleArea](src/com/leetcode/L201_300/L0223/RectangleArea.java)                                                 | 中等 | 数学       | 数学、几何               |
| 231  | 2 的幂                                                                | [PowerTwo](src/com/leetcode/L201_300/L0231/PowerTwo.java)                                                           | 简单 | 数学       | 数学、位运算              |
| 258  | 各位相加                                                                | [AddDigits](src/com/leetcode/L201_300/L0258/AddDigits.java)                                                         | 简单 | 数学       | 数学、数论、模拟            |
| 263  | 丑数                                                                  | [UglyNumber](src/com/leetcode/L201_300/L0263/UglyNumber.java)                                                       | 简单 | 数学       | 数学                  |
| 264  | 丑数II                                                                | [UglyNumberII](src/com/leetcode/L201_300/L0264/UglyNumberII.java)                                                   | 中等 | 堆        | 哈希表、堆、数学、动态规划       |
| 292  | Nim 游戏                                                              | [NimGame](src/com/leetcode/L201_300/L0292/NimGame.java)                                                             | 简单 | 数学-博弈论   | 数学、博弈、脑筋急转弯         |
| 319  | 灯泡开关                                                                | [BulbSwitcher](src/com/leetcode/L301_400/L0319/BulbSwitcher.java)                                                   | 简单 | 数学       | 数学、脑筋急转弯            |
| 326  | 3的幂                                                                 | [PowerThree](src/com/leetcode/L301_400/L0326/PowerThree.java)                                                       | 简单 | 数学       | 数学、递归               |
| 335  | 路径交叉                                                                | [SelfCrossing](src/com/leetcode/L301_400/L0335/SelfCrossing.java)                                                   | 困难 | 数学       | 数组、数学、几何            |
| 343  | 整数拆分                                                                | [IntegerBreak](src/com/leetcode/L301_400/L0343/IntegerBreak.java)                                                   | 中等 | 数学       | 数学、动态规划             |
| 357  | 统计各位数字都不同的数字个数                                                      | [CountUniqueDigits](src/com/leetcode/L301_400/L0357/CountUniqueDigits.java)                                         | 中等 | 数学       | 数学、动态规划、回溯算法        |
| 367  | 有效的完全平方数                                                            | [ValidPerfectSquare](src/com/leetcode/L301_400/L0367/ValidPerfectSquare.java)                                       | 简单 | 二分部查找    | 数学、二分查找             |
| 372  | 超级次方                                                                | [SuperPow](src/com/leetcode/L301_400/L0372/SuperPow.java)                                                           | 中等 | 数学       | 数学、分治算法             |
| 390  | 消除游戏                                                                | [EliminationGame](src/com/leetcode/L301_400/L0390/EliminationGame.java)                                             | 中等 | 数学       | 数学                  |
| 391  | 完美矩形                                                                | [PerfectRectangle](src/com/leetcode/L301_400/L0391/PerfectRectangle.java)                                           | 困难 | 数学       | 数组、扫描线              |
| 396  | 旋转函数                                                                | [RotateFunction](src/com/leetcode/L301_400/L0396/RotateFunction.java)                                               | 中等 | 数学       | 数组、数学、动态规划          |
| 400  | 第 N 位数字                                                             | [DigitSequenceNumbers](src/com/leetcode/L301_400/L0400/DigitSequenceNumbers.java)                                   | 中等 | 数学       | 数学、二分查找             |
| 401  | 二进制手表                                                               | [BinaryWatch](src/com/leetcode/L401_500/L0401/BinaryWatch.java)                                                     | 简单 | 数学       | 位运算、回溯算法            |
| 405  | 数字转换为十六进制数                                                          | [ConvertNumberHexadecimal](src/com/leetcode/L401_500/L0405/ConvertNumberHexadecimal.java)                           | 简单 | 数学       | 数学、位运算              |
| 447  | 回旋镖的数量                                                              | [NumberBoomerangs](src/com/leetcode/L401_500/L0447/NumberBoomerangs.java)                                           | 中等 | 数学       | 数组、哈希表、数学           |
| 453  | 最小操作次数使数组元素相等                                                       | [MinimumMovesEqualElements](src/com/leetcode/L401_500/L0453/MinimumMovesEqualElements.java)                         | 简单 | 数学       | 数组、数学               |
| 458  | 可怜的小猪                                                               | [PoorPigs](src/com/leetcode/L401_500/L0458/PoorPigs.java)                                                           | 困难 | 数学       | 数学、动态规划、组合数学        |
| 461  | 汉明距离                                                                | [HammingDistance](src/com/leetcode/L401_500/L0461/HammingDistance.java)                                             | 简单 | 数学       | 位运算                 |
| 462  | 最少移动次数使数组元素相等 II                                                    | [MinMovesElementsII](src/com/leetcode/L401_500/L0462/MinMovesElementsII.java)                                       | 中等 | 数学       | 数组、数学、排序            |
| 470  | 用 Rand7() 实现 Rand10()                                               | [ImplementRand10UsingRand7](src/com/leetcode/L401_500/L0470/ImplementRand10UsingRand7.java)                         | 中等 | 数学       | 数学、拒绝采样、概率与统计、随机化   |
| 475  | 供暖器                                                                 | [Heaters](src/com/leetcode/L401_500/L0475/Heaters.java)                                                             | 中等 | 二分查找     | 数组、双指针、二分查找、排序      |
| 479  | 最大回文数乘积                                                             | [LargestPalindromeProduct](src/com/leetcode/L401_500/L0479/LargestPalindromeProduct.java)                           | 困难 | 数学       | 数学                  |
| 492  | 构造矩形                                                                | [ConstructRectangle](src/com/leetcode/L401_500/L0492/ConstructRectangle.java)                                       | 简单 | 数学       | 数学                  |
| 504  | 七进制数                                                                | [Base7](src/com/leetcode/L501_600/L0504/Base7.java)                                                                 | 简单 | 数学       | 数学                  |
| 507  | 完美数                                                                 | [PerfectNumber](src/com/leetcode/L501_600/L0507/PerfectNumber.java)                                                 | 简单 | 数学       | 数学                  |
| 509  | 斐波那契数                                                               | [FibonacciNumber](src/com/leetcode/L501_600/L0509/FibonacciNumber.java)                                             | 简单 | 递归，迭代    | 数学                  |
| 537  | 复数乘法                                                                | [ComplexNumberMul](src/com/leetcode/L501_600/L0537/ComplexNumberMul.java)                                           | 简单 | 数学       | 字符串、数学、模拟           |
| 553  | 最优除法                                                                | [OptimalDivision](src/com/leetcode/L501_600/L0553/OptimalDivision.java)                                             | 中等 | 数学       | 数组、数学、动态规划          |
| 566  | 重塑矩阵                                                                | [ReshapeMatrix](src/com/leetcode/L501_600/L0566/ReshapeMatrix.java)                                                 | 简单 | 数学       | 数组                  |
| 587  | 安装栅栏                                                                | [ErectFence](src/com/leetcode/L501_600/L0587/ErectFence.java)                                                       | 困难 | 数学       | 数组、数学、几何            |
| 592  | 分数加减运算                                                              | [FractionAdditionSub](src/com/leetcode/L501_600/L0592/FractionAdditionSub.java)                                     | 中等 | 数学       | 字符串、数学、模拟           |
| 593  | 有效的正方形                                                              | [ValidSquare](src/com/leetcode/L501_600/L0593/ValidSquare.java)                                                     | 中等 | 数学       | 数学、几何               |
| 598  | 范围求和 II                                                             | [RangeAdditionII](src/com/leetcode/L501_600/L0598/RangeAdditionII.java)                                             | 简单 | 数学       | 数组、数学               |
| 633  | 平方数之和                                                               | [SumSquareNumbers](src/com/leetcode/L601_700/L0633/SumSquareNumbers.java)                                           | 中等 | 双指针、数学   | 数学                  |
| 667  | 优美的排列 II                                                            | [BeautifulArrangementII](src/com/leetcode/L601_700/L0667/BeautifulArrangementII.java)                               | 中等 | 数学       | 数组 、数学              |
| 670  | 最大交换                                                                | [MaxSwap](src/com/leetcode/L601_700/L0670/MaxSwap.java)                                                             | 中等 | 数学       | 算法 、数学              |
| 724  | 寻找数组的中心索引                                                           | [FindPivotIndex](src/com/leetcode/L701_800/L0724/FindPivotIndex.java)                                               | 简单 | 数学       | 数学                  |
| 728  | 自除数                                                                 | [SelfDividingNumbers](src/com/leetcode/L701_800/L0728/SelfDividingNumbers.java)                                     | 简单 | 数学       | 数学                  |
| 754  | 到达终点数字                                                              | [ReachNumber](src/com/leetcode/L701_800/L0754/ReachNumber.java)                                                     | 中等 | 数学       | 数学、二分查找             |
| 775  | 全局倒置与局部倒置                                                           | [GlobalLocalInversions](src/com/leetcode/L701_800/L0775/GlobalLocalInversions.java)                                 | 中等 | 数学       | 数组、数学               |
| 779  | 第K个语法符号                                                             | [KSymbolGrammar](src/com/leetcode/L701_800/L0779/KSymbolGrammar.java)                                               | 中等 | 数学       | 数学、递归、位运算           |
| 780  | 到达终点                                                                | [ReachingPoints](src/com/leetcode/L701_800/L0780/ReachingPoints.java)                                               | 困难 | 数学       | 数学                  |
| 788  | 旋转数字                                                                | [RotatedDigits](src/com/leetcode/L701_800/L0788/RotatedDigits.java)                                                 | 中等 | 数学       | 数学、动态规划             |
| 789  | 逃脱阻碍者                                                               | [EscapeTheGhosts](src/com/leetcode/L701_800/L0789/EscapeTheGhosts.java)                                             | 中等 | 数学       | 数组、数学               |
| 793  | 阶乘函数后 K 个零                                                          | [PreimageFactorialZeroesSize](src/com/leetcode/L701_800/L0793/PreimageFactorialZeroesSize.java)                     | 困难 | 数学       | 数组、二分查找             |
| 810  | 黑板异或游戏                                                              | [ChalkboardXORGame](src/com/leetcode/L801_900/L0810/ChalkboardXORGame.java)                                         | 困难 | 数学       | 数学                  |
| 812  | 最大三角形面积                                                             | [LargestTriangleArea](src/com/leetcode/L801_900/L0812/LargestTriangleArea.java)                                     | 简单 | 数学       | 数组、数学、几何            |
| 829  | 连续整数求和                                                              | [ConsecutiveNumbersSum](src/com/leetcode/L801_900/L0829/ConsecutiveNumbersSum.java)                                 | 困难 | 数学       | 数学、枚举               |
| 832  | 翻转图像                                                                | [FlippingImage](src/com/leetcode/L801_900/L0832/FlippingImage.java)                                                 | 简单 | 数学       | 数组                  |
| 883  | 三维形体投影面积                                                            | [Area3DShapes](src/com/leetcode/L801_900/L0883/Area3DShapes.java)                                                   | 简单 | 数学       | 数组、矩阵、数学、几何         |
| 891  | 子序列宽度之和                                                             | [SumSubWidths](src/com/leetcode/L801_900/L0891/SumSubWidths.java)                                                   | 困难 | 数学       | 数组、数学、排序            |
| 902  | 最大为 N 的数字组合                                                         | [MostNSet](src/com/leetcode/L901_1000/L0902/MostNSet.java)                                                          | 困难 | 数学       | 数组、字符串、数学、动态规划、二分查找 |
| 908  | 最小差值 I                                                              | [SmallestRangeI](src/com/leetcode/L901_1000/L0908/SmallestRangeI.java)                                              | 简单 | 数学       | 数组、数学               |
| 976  | 三角形的最大周长                                                            | [LargestPerimeterTriangle](src/com/leetcode/L901_1000/L0976/LargestPerimeterTriangle.java)                          | 简单 | 数学       | 排序、数学               |
| 989  | 数组形式的整数加法                                                           | [AddArrayFormInteger](src/com/leetcode/L901_1000/L0989/AddArrayFormInteger.java)                                    | 简单 | 数学       | 数组                  |
| 1006 | 笨阶乘                                                                 | [ClumsyFactorial](src/com/leetcode/L1001_1100/L1006/ClumsyFactorial.java)                                           | 中等 | 栈        | 数学                  |
| 1037 | 有效的回旋镖                                                              | [ValidBoomerang](src/com/leetcode/L1001_1100/L1037/ValidBoomerang.java)                                             | 简单 | 数学       | 数组、数学、几何            |
| 1128 | 等价多米诺骨牌对的数量                                                         | [NumberEquivalentDominoPairs](src/com/leetcode/L1101_1200/L1128/NumberEquivalentDominoPairs.java)                   | 简单 | 数学       | 数组                  |
| 1154 | 一年中的第几天                                                             | [DayOfYear](src/com/leetcode/L1101_1200/L1154/DayOfYear.java)                                                       | 简单 | 数学       | 字符串、数学              |
| 1175 | 质数排列                                                                | [PrimeArrangements](src/com/leetcode/L1101_1200/L1175/PrimeArrangements.java)                                       | 简单 | 数学       | 数学                  |
| 1185 | 一周中的第几天                                                             | [DayWeek](src/com/leetcode/L1101_1200/L1185/DayWeek.java)                                                           | 简单 | 数学       | 数学                  |
| 1217 | 玩筹码                                                                 | [MinCostMove](src/com/leetcode/L1201_1300/L1217/MinCostMove.java)                                                   | 简单 | 数学       | 数组、数学、贪心算法          |
| 1260 | 二维网格迁移                                                              | [Shift2DGrid](src/com/leetcode/L1201_1300/L1260/Shift2DGrid.java)                                                   | 简单 | 数学       | 数组、矩阵、贪心算法          |
| 1281 | 整数的各位积和之差                                                           | [SubProAndSum](src/com/leetcode/L1201_1300/L1281/SubProAndSum.java)                                                 | 简单 | 数学       | 数学                  |
| 1342 | 将数字变成 0 的操作次数                                                       | [StepsReduceZero](src/com/leetcode/L1301_1400/L1342/StepsReduceZero.java)                                           | 简单 | 数学       | 数学、位运算              |
| 1447 | 最简分数                                                                | [SimplifiedFractions](src/com/leetcode/L1401_1500/L1447/SimplifiedFractions.java)                                   | 中等 | 数学       | 字符串、数学、数论           |
| 1518 | 换酒问题                                                                | [WaterBottles](src/com/leetcode/L1501_1600/L1518/WaterBottles.java)                                                 | 简单 | 数学       | 数学、模拟               |
| 1572 | [矩阵对角线元素的和](src/com/leetcode/L1501_1600/L1572/MatrixDiagonalSum.md) | [MatrixDiagonalSum](src/com/leetcode/L1501_1600/L1572/MatrixDiagonalSum.java)                                       | 简单 | 数学       | 数组                  |
| 1573 | 分割字符串的方案数                                                           | [SplitStringNum](src/com/leetcode/L1501_1600/L1573/SplitStringNum.java)                                             | 中等 | 数学       | 字符串                 |
| 1688 | 比赛中的配对次数                                                            | [CountMatchesTournament](src/com/leetcode/L1601_1700/L1688/CountMatchesTournament.java)                             | 简单 | 数学       | 数学、模拟               |
| 1716 | 计算力扣银行的钱                                                            | [CalculateMoney](src/com/leetcode/L1701_1800/L1716/CalculateMoney.java)                                             | 简单 | 数学       | 数学                  |
| 1744 | 你能在你最喜欢的那天吃到你最喜欢的糖果吗？                                               | [EatFavoriteCandyOnFavoriteDay](src/com/leetcode/L1701_1800/L1744/EatFavoriteCandyOnFavoriteDay.java)               | 中等 | 数学       | 数学                  |
| 1780 | 判断一个数字是否可以表示成三的幂的和                                                  | [CheckSumThree](src/com/leetcode/L1701_1800/L1780/CheckSumThree.java)                                               | 中等 | 数学       | 数学                  |
| 1812 | 判断国际象棋棋盘中一个格子的颜色                                                    | [DetermineColor](src/com/leetcode/L1801_1900/L1812/DetermineColor.java)                                             | 简单 | 数学       | 字符串、数学              |
| 1822 | 数组元素积的符号                                                            | [SignProductArray](src/com/leetcode/L1801_1900/L1822/SignProductArray.java)                                         | 简单 | 数学       | 数学                  |
| 1837 | K 进制表示下的各位数字总和                                                      | [SumDigitsBaseK](src/com/leetcode/L1801_1900/L1837/SumDigitsBaseK.java)                                             | 简单 | 数学       | 数学、位运算              |
| 1860 | 增长的内存泄露                                                             | [IncrementalMemoryLeak](src/com/leetcode/L1801_1900/L1860/IncrementalMemoryLeak.java)                               | 中等 | 数学       | 数学                  |
| 1880 | 检查某单词是否等于两单词之和                                                      | [CheckWordEqualsSummationTwoWords](src/com/leetcode/L1801_1900/L1880/CheckWordEqualsSummationTwoWords.java)         | 简单 | 数学       | 字符串                 |
| 1893 | 检查是否区域内所有整数都被覆盖                                                     | [CheckAllIntegersRangeAreCovered](src/com/leetcode/L1801_1900/L1893/CheckAllIntegersRangeAreCovered.java)           | 简单 | set集合、映射 | 数组、哈希表、前缀和          |
| 2001 | 可互换矩形的组数                                                            | [NumberPairsInterchangeableRectangles](src/com/leetcode/L2001_2100/L2001/NumberPairsInterchangeableRectangles.java) | 中等 | 数学       | 数组、哈希表、数学、计数、数论     |
| 2028 | 找出缺失的观测数据                                                           | [FindMissingObservations](src/com/leetcode/L2001_2100/L2028/FindMissingObservations.java)                           | 中等 | 数学       | 数组、数学、模拟            |
| 2169 | 得到 0 的操作数                                                           | [CountOperationsZero](src/com/leetcode/L2101_2200/L2169/CountOperationsZero.java)                                   | 简单 | 数学       | 数学、模拟               |
| 2457 | 美丽整数的最小增量                                                           | [MinIntegerBeautiful](src/com/leetcode/L2401_2500/L2457/MinIntegerBeautiful.java)                                   | 中等 | 数学       | 数学、贪心算法             |
| 2717 | 半有序排列                                                               | [HalfOrderSeq](src/com/leetcode/L2701_2800/L2717/HalfOrderSeq.java)                                                 | 简单 | 数学       | 数学、模拟               |

## 13. **_位运算方法系列_**

| #    | 题目            | 类名                                                                                      | 难度 | 方法            | 标签                  |
|------|---------------|-----------------------------------------------------------------------------------------|----|---------------|---------------------|
| 89   | 格雷编码          | [GrayCode](src/com/leetcode/L1_100/L0089/GrayCode.java)                                 | 中等 | 位运算           | 位运算、数学、回溯算法         |
| 136  | 只出现一次的数字      | [SingleNumber](src/com/leetcode/L101_200/L0136/SingleNumber.java)                       | 简单 | Map映射、位运算     | 位运算、哈希表             |
| 137  | 只出现一次的数字II    | [SingleNumberII](src/com/leetcode/L101_200/L0137/SingleNumberII.java)                   | 中等 | Map映射、位运算     | 数组、位运算              |
| 190  | 颠倒二进制位        | [ReverseBits](src/com/leetcode/L101_200/L0190/ReverseBits.java)                         | 简单 | 位运算           | 位运算、分治算法            |
| 191  | 位1的个数         | [NumberOneBits](src/com/leetcode/L101_200/L0191/NumberOneBits.java)                     | 简单 | 位运算           | 数学                  |
| 260  | 只出现一次的数字 III  | [SingleNumberIII](src/com/leetcode/L201_300/L0260/SingleNumberIII.java)                 | 中等 | 位运算           | 数组、位运算              |
| 342  | 4的幂           | [PowerFour](src/com/leetcode/L301_400/L0342/PowerFour.java)                             | 简单 | 数学、位运算        | 位运算                 |
| 389  | 找不同           | [FindTheDifference](src/com/leetcode/L301_400/L0389/FindTheDifference.java)             | 简单 | 哈希表、求和、位运算    | 位运算、哈希表             |
| 393  | UTF-8 编码验证    | [UTF8Validation](src/com/leetcode/L301_400/L0393/UTF8Validation.java)                   | 中等 | 位运算           | 数组、位运算              |
| 397  | 整数替换          | [IntegerReplacement](src/com/leetcode/L301_400/L0397/IntegerReplacement.java)           | 中等 | 暴力法、map映射、位运算 | 贪心算法、位运算、记忆化搜索、动态规划 |
| 371  | 两整数之和         | [SumTwoIntegers](src/com/leetcode/L301_400/L0371/SumTwoIntegers.java)                   | 中等 | 位运算           | 数学、位运算              |
| 476  | 数字的补数         | [NumberComplement](src/com/leetcode/L401_500/L0476/NumberComplement.java)               | 简单 | 位运算           | 位运算                 |
| 477  | 汉明距离总和        | [TotalHammingDistance](src/com/leetcode/L401_500/L0477/TotalHammingDistance.java)       | 中等 | 双指针、位运算       | 位运算                 |
| 693  | 交替位二进制数       | [BinaryNumberAlternating](src/com/leetcode/L601_700/L0693/BinaryNumberAlternating.java) | 简单 | 位运算           | 位运算                 |
| 762  | 二进制表示中质数个计算置位 | [PrimeNumberBits](src/com/leetcode/L701_800/L0762/PrimeNumberBits.java)                 | 简单 | 位运算           | 位运算、数学              |
| 868  | 二进制间距         | [BinaryGap](src/com/leetcode/L801_900/L0868/BinaryGap.java)                             | 简单 | 位运算           | 位运算、数学              |
| 1009 | 十进制整数的反码      | [NumberComplement](src/com/leetcode/L1001_1100/L1009/NumberComplement.java)             | 简单 | 位运算           | 位运算                 |
| 1486 | 数组异或操作        | [XOROperationArray](src/com/leetcode/L1401_1500/L1486/XOROperationArray.java)           | 简单 | 位运算           | 数组、位运算              |
| 1601 | 最多可达成的换楼请求数目  | [MaxAchievableRequests](src/com/leetcode/L1601_1700/L1601/MaxAchievableRequests.java)   | 困难 | 位运算           | 数组、位运算、回溯算法、枚举      |
| 1720 | 解码异或后的数组      | [DecodeXORedArray](src/com/leetcode/L1701_1800/L1720/DecodeXORedArray.java)             | 简单 | 位运算           | 位运算                 |
| 1734 | 解码异或后的排列      | [DecodeXORedPermutation](src/com/leetcode/L1701_1800/L1734/DecodeXORedPermutation.java) | 简单 | 位运算           | 位运算                 |

## 14. **_滑动窗口系列_**

| #    | 题目               | 类名                                                                                                                                                        | 难度 | 方法               | 标签                |
|------|------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|----|------------------|-------------------|
| 3    | 无重复字符的最长子串       | [NoRepeatLongestStr](src/com/leetcode/L1_100/L0003/NoRepeatLongestStr.java)                                                                               | 中等 | set集合、Map映射、滑动窗口 | 字符串、哈希表、双指针、滑动窗口  |
| 30   | 串联所有单词的子串        | [SubstringAllWords](src/com/leetcode/L1_100/L0030/SubstringAllWords.java)                                                                                 | 困难 | 滑动窗口             | 字符串、哈希表、滑动窗口      |
| 76   | 最小覆盖子串           | [MinimumWindowSubstring](src/com/leetcode/L1_100/L0076/MinimumWindowSubstring.java)                                                                       | 困难 | 滑动窗口             | 哈希表、双指针、字符串、滑动窗口  |
| 209  | 长度最小的子数组         | [MinimumSizeSubarraySum](src/com/leetcode/L201_300/L0209/MinimumSizeSubarraySum.java)                                                                     | 中等 | 滑动窗口             | 数组、二分查找、前缀和、滑动窗口  |
| 239  | 滑动窗口最大值          | [SlidingWindowMax](src/com/leetcode/L201_300/L0239/SlidingWindowMax.java)                                                                                 | 困难 | 滑动窗口             | 堆、滑动窗口            |
| 424  | 替换后的最长重复字符       | [LongestRepeatingCharacter](src/com/leetcode/L401_500/L0424/LongestRepeatingCharacter.java)                                                               | 中等 | 滑动窗口             | 字符串、哈希表、滑动窗口      |
| 438  | 找到字符串中所有字母异位词    | [FindAllAnagramsString](src/com/leetcode/L401_500/L0438/FindAllAnagramsString.java)                                                                       | 中等 | 滑动窗口             | 哈希表、滑动窗口          |
| 567  | 字符串的排列           | [PermutationInString](src/com/leetcode/L501_600/L0567/PermutationInString.java)                                                                           | 中等 | 滑动窗口             | 双指针、滑动窗口          |
| 689  | 三个无重叠子数组的最大和     | [MaxSum3NonOverSub](src/com/leetcode/L601_700/L0689/MaxSum3NonOverSub.java)                                                                               | 困难 | 滑动窗口             | 数组、动态规划           |
| 713  | 乘积小于K的子数组        | [SubarrayProductLessThanK](src/com/leetcode/L701_800/L0713/SubarrayProductLessThanK.java)                                                                 | 中等 | 滑动窗口             | 数组、滑动窗口           |
| 904  | 水果成篮             | [FruitIntoBaskets](src/com/leetcode/L901_1000/L0904/FruitIntoBaskets.java)                                                                                | 中等 | 滑动窗口             | 数组、哈希表、滑动窗口       |
| 930  | 和相同的二元子数组        | [BinarySubarraysWithSum](src/com/leetcode/L901_1000/L0930/BinarySubarraysWithSum.java)                                                                    | 中等 | 滑动窗口、Map映射       | 数组、哈希表、前缀和、滑动窗口   |
| 1052 | 爱生气的书店老板         | [GrumpyBookstoreOwner](src/com/leetcode/L1001_1100/L1052/GrumpyBookstoreOwner.java)                                                                       | 中等 | 滑动窗口             | 数组、滑动窗口           |
| 1438 | 绝对差不超过限制的最长连续子数组 | [LongestContinuousSubarrayWithAbsoluteDiffLessEqualLimit](src/com/leetcode/L1401_1500/L1438/LongestContinuousSubarrayWithAbsoluteDiffLessEqualLimit.java) | 中等 | 滑动窗口             | 数组、滑动窗口           |
| 1610 | 可见点的最大数目         | [MaxVisiblePoint](src/com/leetcode/L1601_1700/L1610/MaxVisiblePoint.java)                                                                                 | 困难 | 数学+滑动窗口          | 数组、数学、几何、排序、滑动窗口  |
| 1838 | 最高频元素的频数         | [FrequencyMostFrequentElement](src/com/leetcode/L1801_1900/L1838/FrequencyMostFrequentElement.java)                                                       | 中等 | 滑动窗口             | 滑动窗口              |
| 2024 | 考试的最大困扰度         | [MaximizeConfusionExam](src/com/leetcode/L2001_2100/L2024/MaximizeConfusionExam.java)                                                                     | 中等 | 滑动窗口             | 字符串、滑动窗口、前缀和、二分查找 |

## 15. **_设计系列_**

| #    | 题目                  | 类名                                                                            | 难度 | 方法             | 标签                               |
|------|---------------------|-------------------------------------------------------------------------------|----|----------------|----------------------------------|
| 146  | LRU 缓存机制            | [LRUCache](src/com/leetcode/L101_200/L0146/LRUCache.java)                     | 中等 | 双向链表+哈希表       | 链表、双向链表、哈希表、设计                   |
| 155  | 最小栈                 | [MinStack](src/com/leetcode/L101_200/L0155/MinStack.java)                     | 简单 | 栈              | 栈、设计                             |
| 173  | 二叉搜索树迭代器            | [BSTIterator](src/com/leetcode/L101_200/L0173/BSTIterator.java)               | 中等 | 递归             | 栈、树、二叉树、二叉搜索树、迭代器、设计             |
| 208  | 实现 Trie (前缀树)       | [Trie](src/com/leetcode/L201_300/L0208/Trie.java)                             | 中等 | 前缀树            | 字典树、设计                           |
| 211  | 添加与搜索单词 - 数据结构设计    | [WordDictionary](src/com/leetcode/L201_300/L0211/WordDictionary.java)         | 中等 | 前缀树            | 字典树、设计、回溯算法                      |
| 232  | 用栈实现队列              | [MyQueue](src/com/leetcode/L201_300/L0232/MyQueue.java)                       | 简单 | 栈              | 栈、设计                             |
| 284  | 窥探迭代器               | [PeekingIterator](src/com/leetcode/L201_300/L0284/PeekingIterator.java)       | 中等 | 迭代器            | 数组、迭代器、设计                        |
| 295  | 数据流的中位数             | [MedianFinder](src/com/leetcode/L201_300/L0295/MedianFinder.java)             | 困难 | 堆              | 设计、双指针、数据流、排序、堆                  |
| 297  | 二叉树的序列化与反序列化        | [Codec](src/com/leetcode/L201_300/L0297/Codec.java)                           | 困难 | 前序遍历、后序遍历、层序遍历 | 树、深度优先搜索、广度优先搜索、设计、字符串、二叉树       |
| 303  | 区域和检索 - 数组不可变       | [NumArray](src/com/leetcode/L301_400/L0303/NumArray.java)                     | 简单 | 前缀和            | 数组、前缀和、设计                        |
| 304  | 二维区域和检索 - 矩阵不可变     | [NumMatrix](src/com/leetcode/L301_400/L0304/NumMatrix.java)                   | 中等 | 前缀和            | 数组、矩阵、前缀和、设计                     |
| 307  | 区域和检索 - 数组可修改       | [NumArray](src/com/leetcode/L301_400/L0307/NumArray.java)                     | 中等 | 线段树            | 数组、线段树、树状数组、设计                   |
| 341  | 扁平化嵌套列表迭代器          | [NestedIterator](src/com/leetcode/L301_400/L0341/NestedIterator.java)         | 中等 | 递归             | 树、栈、队列、设计、深度优先搜索、迭代器             |
| 352  | 将数据流变为多个不相交区间       | [SummaryRanges](src/com/leetcode/L301_400/L0352/SummaryRanges.java)           | 困难 | 并查集            | 有序集合、二分查找、设计                     |
| 380  | O(1) 时间插入、删除和获取随机元素 | [RandomizedSet](src/com/leetcode/L301_400/L0380/RandomizedSet.java)           | 中等 | list集合         | 数组、哈希表、数学、设计、随机化                 |
| 382  | 链表随机节点              | [Solution](src/com/leetcode/L301_400/L0382/Solution.java)                     | 中等 | 设计             | 链表、数学、水塘抽样、随机化                   |
| 398  | 随机数索引               | [Solution](src/com/leetcode/L301_400/L0398/Solution.java)                     | 中等 | 设计             | 哈希表、数学、水塘抽样、随机化                  |
| 432  | 全 O(1) 的数据结构        | [AllOne](src/com/leetcode/L401_500/L0432/AllOne.java)                         | 困难 | 双向链表           | 链表、双向链表、哈希表、设计                   |
| 449  | 序列化和反序列化二叉搜索树       | [Codec](src/com/leetcode/L401_500/L0449/Codec.java)                           | 中等 | 后序遍历           | 字符串、树、二叉树、二叉搜索树、深度优先搜索、广度优先搜索、设计 |
| 460  | LFU 缓存              | [LFUCache](src/com/leetcode/L401_500/L0460/LFUCache.java)                     | 困难 | 哈希表            | 链表、双向链表、哈希表、设计                   |
| 478  | 在圆内随机生成点            | [Solution](src/com/leetcode/L401_500/L0478/Solution.java)                     | 中等 | 数学             | 数学、几何、拒绝采样、随进化                   |
| 519  | 随机翻转矩阵              | [Solution](src/com/leetcode/L501_600/L0519/Solution.java)                     | 中等 | map映射          | 哈希表、数学、随机化、水塘抽样                  |
| 535  | TinyURL 的加密与解密      | [Codec](src/com/leetcode/L501_600/L0535/Codec.java)                           | 中等 | 模拟             | 字符串、哈希表、哈希函数、设计                  |
| 622  | 设计循环队列              | [MyCircularQueue](src/com/leetcode/L601_700/L0622/MyCircularQueue.java)       | 中等 | 数组             | 数组、链表、队列、设计                      |
| 641  | 设计循环双端队列            | [MyCircularDeque](src/com/leetcode/L601_700/L0641/MyCircularDeque.java)       | 中等 | 数组             | 数组、链表、队列、设计                      |
| 676  | 实现一个魔法字典            | [MagicDictionary](src/com/leetcode/L601_700/L0676/MagicDictionary.java)       | 中等 | map映射          | 字符串、哈希表、字典树、设计                   |
| 677  | 键值映射                | [MapSum](src/com/leetcode/L601_700/L0677/MapSum.java)                         | 中等 | 前缀树            | 字典树、设计                           |
| 703  | 数据流中的第 K 大元素        | [KthLargest](src/com/leetcode/L701_800/L0703/KthLargest.java)                 | 简单 | 堆              | 树、二叉树、二叉搜索树、堆、数据流、设计             |
| 707  | 设计链表                | [MyLinkedList](src/com/leetcode/L701_800/L0707/MyLinkedList.java)             | 中等 | 链表             | 链表、设计                            |
| 710  | 黑名单中的随机数            | [Solution](src/com/leetcode/L701_800/L0710/Solution.java)                     | 困难 | map映射          | 哈希表、数学、随机化、二分查找、排序               |
| 729  | 我的日程安排表 I           | [MyCalendar](src/com/leetcode/L701_800/L0729/MyCalendar.java)                 | 中等 | 线段树            | 线段树、有序集合、设计                      |
| 731  | 我的日程安排表 II          | [MyCalendarTwo](src/com/leetcode/L701_800/L0731/MyCalendarTwo.java)           | 中等 | 差分数组           | 线段树、有序集合、二分查找、设计                 |
| 732  | 我的日程安排表 III         | [MyCalendarThree](src/com/leetcode/L701_800/L0732/MyCalendarThree.java)       | 困难 | 差分数组           | 线段树、有序集合、设计                      |
| 855  | 考场就座                | [ExamRoom](src/com/leetcode/L801_900/L0855/ExamRoom.java)                     | 中等 | 线段树            | 堆、有序集合、设计                        |
| 895  | 最大频率栈               | [FreqStack](src/com/leetcode/L801_900/L0895/FreqStack.java)                   | 困难 | map映射          | 哈希表、栈、有序集合、设计                    |
| 901  | 股票价格跨度              | [StockSpanner](src/com/leetcode/L901_1000/L0901/StockSpanner.java)            | 中等 | 栈              | 栈、单调栈、数据流、设计                     |
| 911  | 在线选举                | [TopVotedCandidate](src/com/leetcode/L901_1000/L0911/TopVotedCandidate.java)  | 中等 | map映射+二分查找     | 数组、哈希表、二分查找、设计                   |
| 919  | 完全二叉树插入器            | [CBTInserter](src/com/leetcode/L901_1000/L0919/CBTInserter.java)              | 中等 | 队列             | 树、二叉树、广度优先搜索、设计                  |
| 933  | 最近的请求次数             | [RecentCounter](src/com/leetcode/L901_1000/L0933/RecentCounter.java)          | 简单 | 队列             | 队列、数据流、设计                        |
| 981  | 基于时间的键值存储           | [TimeMap](src/com/leetcode/L901_1000/L0981/TimeMap.java)                      | 中等 | Map映射+二分查找     | 字符串、哈希表、二分查找、设计                  |
| 1600 | 皇位继承顺序              | [ThroneInheritance](src/com/leetcode/L1501_1600/L1600/ThroneInheritance.java) | 中等 | 树              | 树、设计                             |
| 1603 | 设计停车系统              | [ParkingSystem](src/com/leetcode/L1601_1700/L1603/ParkingSystem.java)         | 简单 | 数组             | 设计                               |
| 1656 | 设计有序流               | [OrderedStream](src/com/leetcode/L1601_1700/L1656/OrderedStream.java)         | 简单 | 数组             | 数组、哈希表、数据流、设计                    |
| 1865 | 找出和为指定值的下标对         | [FindSumPairs](src/com/leetcode/L1801_1900/L1865/FindSumPairs.java)           | 中等 | 哈希表            | 设计、哈希表                           |
| 2013 | 检测正方形               | [DetectSquares](src/com/leetcode/L2001_2100/L2013/DetectSquares.java)         | 中等 | 哈希表            | 设计、哈希表、数组、计数                     |
| 2034 | 股票价格波动              | [StockPrice](src/com/leetcode/L2001_2100/L2034/StockPrice.java)               | 中等 | 哈希表            | 设计、哈希表、堆、有序集合、数据流                |
| 2043 | 简易银行系统              | [Bank](src/com/leetcode/L2001_2100/L2043/Bank.java)                           | 中等 | 哈希表            | 设计、数组、哈希表、模拟                     |

## 16. **_前缀和系列_**

| #    | 题目            | 类名                                                                                                          | 难度 | 方法          | 标签                         |
|------|---------------|-------------------------------------------------------------------------------------------------------------|----|-------------|----------------------------|
| 528  | 按权重随机选择       | [RandomPickWithWeight](src/com/leetcode/L501_600/L0528/RandomPickWithWeight.java)                           | 中等 | 前缀和+二分查找    | 数学、前缀和、二分查找、随机化            |
| 560  | 和为 K 的子数组     | [SubarraySumEqualsK](src/com/leetcode/L501_600/L0560/SubarraySumEqualsK.java)                               | 中等 | 前缀和         | 数组、哈希表、前缀和                 |
| 798  | 得分最高的最小轮调     | [SmallestRotationScore](src/com/leetcode/L701_800/L0798/SmallestRotationScore.java)                         | 困难 | 前缀和         | 数组、前缀和                     |
| 862  | 和至少为 K 的最短子数组 | [ShortSubSumK](src/com/leetcode/L801_900/L0862/ShortSubSumK.java)                                           | 困难 | 前缀和+单调队列    | 数组、队列、单调队列、堆、前缀和、滑动窗口、二分查找 |
| 1109 | 航班预订统计        | [CorporateFlightBookings](src/com/leetcode/L1101_1200/L1109/CorporateFlightBookings.java)                   | 中等 | 模拟、前缀和      | 数组、前缀和                     |
| 1184 | 公交站间的距离       | [DistanceBusStops](src/com/leetcode/L1101_1200/L1184/DistanceBusStops.java)                                 | 简单 | 前缀和         | 数组                         |
| 1310 | 子数组异或查询       | [XORQueriesSubarray](src/com/leetcode/L1301_1400/L1310/XORQueriesSubarray.java)                             | 中等 | 暴力法、前缀和     | 位运算                        |
| 1413 | 逐步求和得到正数的最小值  | [MinValuePositiveSum](src/com/leetcode/L1401_1500/L1413/MinValuePositiveSum.java)                           | 简单 | 前缀和         | 数组、前缀和                     |
| 1588 | 所有奇数长度子数组的和   | [SumAllOddLengthSubarrays](src/com/leetcode/L1501_1600/L1588/SumAllOddLengthSubarrays.java)                 | 简单 | 数学、前缀和      | 数组、前缀和                     |
| 1738 | 找出第 K 大的异或坐标值 | [FindKthLargestXORCoordinateValue](src/com/leetcode/L1701_1800/L1738/FindKthLargestXORCoordinateValue.java) | 中等 | 前缀和         | 数组                         |
| 1894 | 找到需要补充粉笔的学生编号 | [FindStudentWillReplaceChalk](src/com/leetcode/L1801_1900/L1894/FindStudentWillReplaceChalk.java)           | 中等 | 模拟、前缀和+二分查找 | 数组、前缀和、二分查找、模拟             |
| 2055 | 蜡烛之间的盘子       | [PlatesBetweenCandles](src/com/leetcode/L2001_2100/L2055/PlatesBetweenCandles.java)                         | 中等 | 前缀和         | 数组、字符串、前缀和、二分查找            |
| 2155 | 分组得分最高的所有下标   | [HighScoreArrIndex](src/com/leetcode/L2101_2200/L2155/HighScoreArrIndex.java)                               | 中等 | 前缀和         | 数组                         |

## 17. **_力扣杯竞赛题列表_**

| #     | 题目    | 类名                                                                      | 难度 | 方法       | 备注                   |
|-------|-------|-------------------------------------------------------------------------|----|----------|----------------------|
| LCP01 | 猜数字   | [GuessNumber](src/com/LCP/L0001/GuessNumber.java)                       | 简单 | 模拟       | 数组                   |
| LCP02 | 分式化简  | [DeepDarkFraction](src/com/LCP/L0002/DeepDarkFraction.java)             | 简单 | 模拟       | 数组、数学、数论、模拟          |
| LCP07 | 传递信息  | [SendMessage](src/com/LCP/L0007/SendMessage.java)                       | 简单 | 广度优先搜索   | 图、深度优先搜索、广度优先搜索、动态规划 |
| LCP17 | 速算机器人 | [QuickCalculationRobot](src/com/LCP/L0017/QuickCalculationRobot.java)   | 简单 | 数学       | --                   |
| LCP18 | 早餐组合  | [BreakfastCombo](src/com/LCP/L0018/BreakfastCombo.java)                 | 简单 | 双指针、二分查找 | --                   |
| LCP19 | 秋叶收藏集 | [AutumnLeavesCollection](src/com/LCP/L0019/AutumnLeavesCollection.java) | 中等 | 动态规划     | --                   |
| LCP28 | 采购方案  | [ProcurementPlan](src/com/LCP/L0028/ProcurementPlan.java)               | 简单 | 双指针      | 数学、双指针、排序、二分查找       |
| LCP29 | 乐团站位  | [OrchestraPosition](src/com/LCP/L0029/OrchestraPosition.java)           | 简单 | 数学       | 数学                   |
| LCP30 | 魔塔游戏  | [MagicTowerGame](src/com/LCP/L0030/MagicTowerGame.java)                 | 中等 | 小根堆      | --                   |
| LCP39 | 无人机方阵 | [UAVPhalanx](src/com/LCP/L0039/UAVPhalanx.java)                         | 简单 | map映射    | --                   |
| LCP50 | 宝石补给  | [GemSupply](src/com/LCP/L0050/GemSupply.java)                           | 简单 | 模拟       | --                   |
| LCP51 | 烹饪料理  | [Cooking](src/com/LCP/L0051/Cooking.java)                               | 简单 | 回溯算法     | --                   |

## [18. **_程序员面试金典_**（共计80/109题）](src/com/interview/interview.md)

## [19. **_剑指offer_**（共计75/75题）](src/com/offer/Offer.md)

## [20. **_剑指offerII_**（共计119/119题）](src/com/offerII/OfferII.md)

## [21. **_微软题_**（共计2/3题）](src/com/LCS/LCS.md)

## [22. **_美团题_**（未计总数）](src/com/meituan/meituan.md)

## 23. **_数据库_**

| #     | 题目            | 类名                                                                               | 难度 | 方法 | 备注 |
|-------|---------------|----------------------------------------------------------------------------------|----|----|----|
| L0175 | 组合两个表         | [CombineTwoTables](src/com/sql/L0175/CombineTwoTables.sql)                       | 简单 | -- | -- |
| L0176 | 第二高的薪水        | [SecondHighestSalary](src/com/sql/L0176/SecondHighestSalary.sql)                 | 中等 | -- | -- |
| L0182 | 查找重复的电子邮箱     | [DuplicateEmails](src/com/sql/L0182/DuplicateEmails.sql)                         | 简单 | -- | -- |
| L0183 | 从不订购的客户       | [CustomersNeverOrder](src/com/sql/L0183/CustomersNeverOrder.sql)                 | 简单 | -- | -- |
| L0196 | 删除重复的电子邮箱     | [DeleteDuplicateEmails](src/com/sql/L0196/DeleteDuplicateEmails.sql)             | 简单 | -- | -- |
| L0197 | 上升的温度         | [RisingTemperature](src/com/sql/L0197/RisingTemperature.sql)                     | 简单 | -- | -- |
| L0511 | 游戏玩法分析 I      | [GamePlayAnalysisI](src/com/sql/L0511/GamePlayAnalysisI.sql)                     | 简单 | -- | -- |
| L0584 | 寻找用户推荐人       | [FindCustomerReferee](src/com/sql/L0584/FindCustomerReferee.sql)                 | 简单 | -- | -- |
| L0586 | 订单最多的客户       | [CustomerLargestOrders](src/com/sql/L0586/CustomerLargestOrders.sql)             | 简单 | -- | -- |
| L0595 | 大的国家          | [BigCountries](src/com/sql/L0595/BigCountries.sql)                               | 简单 | -- | -- |
| L0596 | 超过5名学生的课      | [ClassesMoreThan5Students](src/com/sql/L0596/ClassesMoreThan5Students.sql)       | 简单 | -- | -- |
| L0607 | 销售员           | [SalesPerson](src/com/sql/L0607/SalesPerson.sql)                                 | 简单 | -- | -- |
| L0608 | 树节点           | [TreeNode](src/com/sql/L0608/TreeNode.sql)                                       | 中等 | -- | -- |
| L0620 | 有趣的电影         | [NotBoringMovies](src/com/sql/L0620/NotBoringMovies.sql)                         | 简单 | -- | -- |
| L0627 | 变更性别          | [SwapSalary](src/com/sql/L0627/SwapSalary.sql)                                   | 简单 | -- | -- |
| L1050 | 合作过至少三次的演员和导演 | [CooperatedThreeTimes](src/com/sql/L1050/CooperatedThreeTimes.sql)               | 简单 | -- | -- |
| L1084 | 销售分析III       | [SalesAnalysisIII](src/com/sql/L1084/SalesAnalysisIII.sql)                       | 简单 | -- | -- |
| L1141 | 查询近30天活跃用户数   | [UserActivityPastDaysI](src/com/sql/L1141/UserActivityPastDaysI.sql)             | 简单 | -- | -- |
| L1148 | 文章浏览 I        | [ArticleViewsI](src/com/sql/L1148/ArticleViewsI.sql)                             | 简单 | -- | -- |
| L1158 | 市场分析 I        | [MarketAnalysisI](src/com/sql/L1158/MarketAnalysisI.sql)                         | 中等 | -- | -- |
| L1393 | 股票的资本损益       | [CapitalGainLoss](src/com/sql/L1393/CapitalGainLoss.sql)                         | 中等 | -- | -- |
| L1407 | 排名靠前的旅行者      | [TopTravellers](src/com/sql/L1407/TopTravellers.sql)                             | 简单 | -- | -- |
| L1484 | 按日期分组销售产品     | [GroupProduct](src/com/sql/L1484/GroupProduct.sql)                               | 简单 | -- | -- |
| L1527 | 患某种疾病的患者      | [PatientsCondition](src/com/sql/L1527/PatientsCondition.sql)                     | 简单 | -- | -- |
| L1581 | 进店却未进行过交易的顾客  | [CustomerVisitedTransactions](src/com/sql/L1581/CustomerVisitedTransactions.sql) | 简单 | -- | -- |
| L1587 | 银行账户概要 II     | [BankAccountSumII](src/com/sql/L1587/BankAccountSumII.sql)                       | 简单 | -- | -- |
| L1667 | 修复表中的名字       | [FixNamesTable](src/com/sql/L1667/FixNamesTable.sql)                             | 简单 | -- | -- |
| L1693 | 每天的领导和合伙人     | [DailyLeadsPartners](src/com/sql/L1693/DailyLeadsPartners.sql)                   | 简单 | -- | -- |
| L1729 | 求关注者的数量       | [FindFollowersCount](src/com/sql/L1729/FindFollowersCount.sql)                   | 简单 | -- | -- |
| L1741 | 查找每个员工花费的总时间  | [FindTotalTimeEmployee](src/com/sql/L1741/FindTotalTimeEmployee.sql)             | 简单 | -- | -- |
| L1757 | 可回收且低脂的产品     | [RecyclableAndLowFat](src/com/sql/L1757/RecyclableAndLowFat.sql)                 | 简单 | -- | -- |
| L1795 | 每个产品在不同商店的价格  | [RearrangeProducts](src/com/sql/L1795/RearrangeProducts.sql)                     | 简单 | -- | -- |
| L1873 | 计算特殊奖金        | [CalculateSpecialBonus](src/com/sql/L1873/CalculateSpecialBonus.sql)             | 简单 | -- | -- |
| L1890 | 2020年最后一次登录   | [LatestLogin](src/com/sql/L1890/LatestLogin.sql)                                 | 简单 | -- | -- |
| L1965 | 丢失信息的雇员       | [EmployeesMissingInfo](src/com/sql/L1965/EmployeesMissingInfo.sql)               | 简单 | -- | -- |