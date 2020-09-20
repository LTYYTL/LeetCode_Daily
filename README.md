# LeetCode_Daily
记录LeetCode每日刷题之旅（持续更新中...）

##### **特别说明**：
1. 题目对应的链接为根据我自己想法所写的题解、图解（只有几道）
2. 类名对应的链接为Java文件，即题目对应的所有解法
3. 所记录的题目中的方法可能不唯一，只记录了本人觉得在解题过程中觉得好理解的解题方式
4. **本人菜鸟一只，哪里有错误的地方，请批评指正。**

## 1. **_Leetcode题目_**

|  #   |      题目      |   类名   |  难度  |  方法   |    标签   |
| ---- | ------------- | ------- | ----- | ------ | --------- |
|1| [两数之和](src/com/leetcode/L0001/TwoNumSum.md) | [TwoNumSum](src/com/leetcode/L0001/TwoNumSum.java) | 简单 | 双指针、Map映射 | 数组、哈希表 |
|14| 最长公共前缀 | [LongestCommonPrefix](src/com/leetcode/L0014/LongestCommonPrefix.java) | 简单 | 分治法 | 字符串 |
|28| 实现strStr() | [ImplementstrStr](src/com/leetcode/L0028/ImplementstrStr.java) | 简单 | Sunday算法、KMP算法 | 字符串、双指针 |
|36| 有效的数独 | [ValidSudoku](src/com/leetcode/L0036/ValidSudoku.java) | 中等 | -- | 哈希表 |
|37| 解数独 | [Sudoku](src/com/leetcode/L0037/Sudoku.java) | 困难 | 递归 | 哈希表、回溯算法 |
|58| 最后一个单词的长度 | [LastWordLength](src/com/leetcode/L0058/LastWordLength.java) | 简单 | 暴力法 | 字符串 |
|79| 单词搜索 | [WordSearch](src/com/leetcode/L0079/WordSearch.java) | 中等 | 深度优先搜索 | 数组、回溯算法 |
|122| 买卖股票的最佳时机II | [StockII](src/com/leetcode/L0122/StockII.java) | 简单  | 贪心算法 | 数组、贪心算法 |
|125| 验证回文串 | [ValidPalindrome](src/com/leetcode/L0125/ValidPalindrome.java) | 简单  | 双指针 | 字符串、双指针 |
|226| 翻转二叉树 | [InvertBinaryTree](src/com/leetcode/L0226/InvertBinaryTree.java) | 简单 | 递归 | 树 |
|344| 字符串反转 | [ReverseString](src/com/leetcode/L0344/ReverseString.java) | 简单 | 双指针 | 数组、双指针 |
|347| 前 K 个高频元素 | [KHighElement](src/com/leetcode/L0347/KHighElement.java) | 中等 | 最小根堆 | 堆、哈希表 |
|349| 两个数组的交集 | [IntersectionArray](src/com/leetcode/L0349/IntersectionArray.java) | 简单 | Set集合、双指针 | 哈希表、双指针、二分查找 |
|350| 两个数组的交集II | [IntersectionArrayII](src/com/leetcode/L0350/IntersectionArrayII.java) | 简单 | Map映射、双指针 | 哈希表、双指针、二分查找 |
|387| 字符串中的第一个唯一字符 | [FirstUniqueChar](src/com/leetcode/L0387/FirstUniqueChar.java) | 简单 | Map映射 | 字符串、哈希表 |
|796| 旋转字符串 | [RotateString](src/com/leetcode/L0796/RotateString.java) | 简单 | 暴力法、KMP算法 | 字符串 |
|804| 唯一摩尔斯密码词 | [MorseCode](src/com/leetcode/L0804/MorseCode.java) | 简单 | Set集合 | 字符串 |

## 2. **_动态规划系列_**
|  #   |      题目      |   类名   |  难度  |  方法   |    标签   |
| ---- | ------------- | ------- | ----- | ------ | --------- |
|53| 最大子序和 | [MaxSequenceSum](src/com/leetcode/L0053/MaxSequenceSum.java) | 简单 | 动态规划 | 数组、动态规划、分治算法 |
|64| 最小路径和 | [MinPathSum](src/com/leetcode/L0064/MinPathSum.java) | 中等 | 动态规划 | 数组、动态规划 |
|70| 爬楼梯 | [ClimbStairs](src/com/leetcode/L0070/ClimbStairs.java) | 简单 | 动态规划 | 动态规划 |
|120| 三角形最小路径和 | [TriangleMinPathSum](src/com/leetcode/L0120/TriangleMinPathSum.java) | 中等  | 动态规划 | 数组、动态规划 |
|198| 打家劫舍 | [HouseRobber](src/com/leetcode/L0198/HouseRobber.java) | 简单 | 动态规划 | 动态规划 |
|300| 最长上升子序列 | [LongestAscSequence](src/com/leetcode/L0300/LongestAscSequence.java) | 中等 | 动态规划 | 动态规划、二分查找 |

## 3. **_二叉树系列_**
|  #   |      题目      |   类名   |  难度  |  方法   |    标签   |
| ---- | ------------- | ------- | ----- | ------ | --------- |
|94| 二叉树的中序遍历 | [InOrder](src/com/leetcode/L0094/InOrder.java) | 中等 | 递归、非递归 | 栈、树、哈希表 |
|102| [二叉树的层序遍历](src/com/leetcode/L0102/LevelOrder.md) | [LevelOrder](src/com/leetcode/L0102/LevelOrder.java) | 中等 | 递归、广度优先搜索 | 树、广度优先搜索 |
|104| 二叉树的最大深度 | [BinaryTreeDepth](src/com/leetcode/L0104/BinaryTreeDepth.java) | 简单 | 递归、广度优先搜索、深度优先搜索 | 树、深度优先搜索 |
|107| [二叉树的层次遍历 II](src/com/leetcode/L0107/LevelOrderII.md) | [LevelOrderII](src/com/leetcode/L0107/LevelOrderII.java) | 简单 | 广度优先搜索 | 树、广度优先搜索 |
|404| [左叶子之和](src/com/leetcode/L0404/LeftLeavesSum.md) | [LeftLeavesSum](src/com/leetcode/L0404/LeftLeavesSum.java) | 简单 | 递归 | 树 |
|637| 二叉树的层平均值 | [BinaryTreeLevelAverage](src/com/leetcode/L0637/BinaryTreeLevelAverage.java) | 简单 | 广度优先搜索 | 树 |

## 4. **_回溯算法系列_**
|  #   |      题目      |   类名   |  难度  |  方法   |    标签   |
| ---- | ------------- | ------- | ----- | ------ | --------- |
|39| 组合总和 | [CombinationSum](src/com/leetcode/L0039/CombinationSum.java) | 中等 | 回溯算法 | 数组、回溯算法 |
|40| 组合总和II | [CombinationSumII](src/com/leetcode/L0040/CombinationSumII.java) | 中等 | 回溯算法 | 数组、回溯算法 |
|46| 全排列 | [Permutations](src/com/leetcode/L0046/Permutations.java) | 中等 | 回溯算法 | 回溯算法 |
|47| 全排列II | [PermutationsII](src/com/leetcode/L0047/PermutationsII.java) | 中等 | 回溯算法 | 回溯算法 |
|77| 组合 | [Combination](src/com/leetcode/L0077/Combination.java) | 中等 | 回溯算法 | 回溯算法 |
|78| 子集 | [Subsets](src/com/leetcode/L0078/Subsets.java) | 中等 | 回溯算法 | 数组、回溯算法、位运算 |
|90| 子集II | [SubsetsII](src/com/leetcode/L0090/SubsetsII.java) | 中等 | 回溯算法 | 数组、回溯算法 |
|216| 组合总和III | [CombinationSumIII](src/com/leetcode/L0216/CombinationSumIII.java) | 中等 | 回溯算法 | 数组、回溯算法 |

## 5. **_数学方法系列_**
|  #   |      题目      |   类名   |  难度  |  方法   |    标签   |
| ---- | ------------- | ------- | ----- | ------ | --------- |
|2| 两数相加 | [TwoNumAdd](src/com/leetcode/L0002/TwoNumAdd.java) | 中等 | 数学 | 链表、数学 |
|60| 第k个排序 | [KthPermutation](src/com/leetcode/L0060/KthPermutation.java) | 中等 | 数学 | 数学、回溯算法 |
|66| 加一 | [AddOne](src/com/leetcode/L0066/AddOne.java) | 简单 | 数学 | 数组 |
|1572| [矩阵对角线元素的和](src/com/leetcode/L1572/MatrixDiagonalSum.md) | [MatrixDiagonalSum](src/com/leetcode/L1572/MatrixDiagonalSum.java) | 简单 | 数学 | 数组 |
|1573| 分割字符串的方案数 | [SplitStringNum](src/com/leetcode/L1573/SplitStringNum.java) | 中等 | 数学 | 字符串 |

## 6. **_力扣杯竞赛题列表_**
|  #   |      题目      |   类名   |   难度 |  方法   |    备注   |
| ---- | ------------- | ------- | ----- | ------ | --------- |
|LCP17| 速算机器人 | [QuickCalculationRobot](src/com/LCP/L0017/QuickCalculationRobot.java) | 简单 | 数学 | -- |
|LCP18| 早餐组合 | [BreakfastCombo](src/com/LCP/L0018/BreakfastCombo.java) | 简单 | 双指针、二分查找 | -- |