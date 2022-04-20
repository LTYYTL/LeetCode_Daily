package com.leetcode.L301_400.L0388;

public class LongAbsoluteFilePathTest {
    public static void main(String[] args) {
        LongAbsoluteFilePath longAbsoluteFilePath = new LongAbsoluteFilePath();
        /**
         * 示例 1：
         * 输入：input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
         * 输出：20
         * 解释：只有一个文件，绝对路径为 "dir/subdir2/file.ext" ，路径长度 20
         */
        //System.out.println(longAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
        System.out.println(longAbsoluteFilePath.lengthLongestPath("dir\n        file.txt"));
        /**
         * 示例 2：
         * 输入：input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
         * 输出：32
         * 解释：存在两个文件：
         * "dir/subdir1/file1.ext" ，路径长度 21
         * "dir/subdir2/subsubdir2/file2.ext" ，路径长度 32
         * 返回 32 ，因为这是最长的路径
         */
        System.out.println(longAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
        /**
         * 示例 3：
         * 输入：input = "a"
         * 输出：0
         * 解释：不存在任何文件
         */
        System.out.println(longAbsoluteFilePath.lengthLongestPath("a"));
        /**
         * 示例 4：
         * 输入：input = "file1.txt\nfile2.txt\nlongfile.txt"
         * 输出：12
         * 解释：根目录下有 3 个文件。
         * 因为根目录中任何东西的绝对路径只是名称本身，所以答案是 "longfile.txt" ，路径长度为 12
         */
        System.out.println(longAbsoluteFilePath.lengthLongestPath("file1.txt\nfile2.txt\nlongfile.txt"));
    }
}
