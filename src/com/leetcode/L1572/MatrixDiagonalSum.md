## [矩阵对角线元素的和](https://leetcode-cn.com/problems/matrix-diagonal-sum/)

## 题目描述
```
给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。

示例 1：
输入：mat = [[1,2,3],
           [4,5,6],
           [7,8,9]]
输出：25
解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
请注意，元素 mat[1][1] = 5 只会被计算一次。

示例 2：
输入：mat = [[1,1,1,1],
           [1,1,1,1],
           [1,1,1,1],
           [1,1,1,1]]
输出：8

示例 3：
输入：mat = [[5]]
输出：5

提示：
n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
```

## 难度：简单

## 方法

#### 1.数学

- 思路
```
n*n的方阵（i为行数）
（1）主对角线的特点：行数、列数一样，即mat[i][i]
（2）副对角线的特点：行数递增，列数从最大长度递减，且行数+列数+1为方阵长度,即mat[i][n-i-1](减1是因为从0开始)
（3）当n为奇数时，主、副对角线会有一个交点，即中心点，mat[n/2][n/2],所以此时主、副对角线的和会多出一个交点，要将其减去
```
- 图示

![MatrixDiagonalSum](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L1572/MatrixDiagonalSum.png)

- 代码

```java_holder_method_tree
        /**
         * 方法：数学
         * @param mat
         * @return
         */
        public int diagonalSum(int[][] mat) {
            //方阵的大小
            int n = mat.length;
            //当是1*1方阵直接返回
            if (n == 1)
                return mat[0][0];
            //计算和
            int sum = 0;
            //遍历二维数组
            //主对角线的特点：行数、列数一样，mat[i][i]
            //副对角线的特点：行数递增，列数从最大长度递减，且行数+列数+1为方阵长度,
            for (int i = 0; i < n; i++){
                //主对角线上的数
                sum += mat[i][i];
                //副对角线上的数
                sum += mat[i][n-i-1];
            }
            //当方阵的长度为奇数，主副对角线会有一个交集，即多加的元素，要将其减去
            if (n%2!=0)
                sum -= mat[n/2][n/2];
            return sum;
        }
```

