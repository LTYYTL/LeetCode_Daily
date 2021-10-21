package com.offerII.L057;

public class ContainsDuplicateIIITest {
    public static void main(String[] args) {
        ContainsDuplicateIII containsDuplicateIII = new ContainsDuplicateIII();
        /**
         * 示例 1：
         * 输入：nums = [1,2,3,1], k = 3, t = 0
         * 输出：true
         */
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate_bucket(new int[]{1, 2, 3, 1}, 3, 0));
        /**
         * 示例 2：
         * 输入：nums = [1,0,1,1], k = 1, t = 2
         * 输出：true
         */
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1, 0, 1, 1}, 1, 2));
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate_bucket(new int[]{1, 0, 1, 1}, 1, 2));
        /**
         * 示例 3：
         * 输入：nums = [1,5,9,1,5,9], k = 2, t = 3
         * 输出：false
         */
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
        System.out.println(containsDuplicateIII.containsNearbyAlmostDuplicate_bucket(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}
