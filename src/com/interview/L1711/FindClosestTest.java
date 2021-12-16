package com.interview.L1711;

public class FindClosestTest {
    public static void main(String[] args) {
        FindClosest findClosest = new FindClosest();
        /**
         * 示例：
         * 输入：words = ["I","am","a","student","from","a","university","in","a","city"], word1 = "a", word2 = "student"
         * 输出：1
         */
        System.out.println(findClosest.findClosest(new String[]{"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"}, "a", "student"));
    }
}
