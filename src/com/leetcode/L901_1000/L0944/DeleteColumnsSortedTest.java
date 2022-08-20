package com.leetcode.L901_1000.L0944;

public class DeleteColumnsSortedTest {
    public static void main(String[] args) {
        DeleteColumnsSorted deleteColumnsSorted = new DeleteColumnsSorted();
        /*
          示例 1：
          输入：strs = ["cba","daf","ghi"]
          输出：1
          解释：网格示意如下：
            cba
            daf
            ghi
          列 0 和列 2 按升序排列，但列 1 不是，所以只需要删除列 1 。
         */
        System.out.println(deleteColumnsSorted.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        /*
          示例 2：
          输入：strs = ["a","b"]
          输出：0
          解释：网格示意如下：
            a
            b
          只有列 0 这一列，且已经按升序排列，所以不用删除任何列。
         */
        System.out.println(deleteColumnsSorted.minDeletionSize(new String[]{"a", "b"}));
        /*
          示例 3：
          输入：strs = ["zyx","wvu","tsr"]
          输出：3
          解释：网格示意如下：
            zyx
            wvu
            tsr
          所有 3 列都是非升序排列的，所以都要删除。
         */
        System.out.println(deleteColumnsSorted.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }
}
