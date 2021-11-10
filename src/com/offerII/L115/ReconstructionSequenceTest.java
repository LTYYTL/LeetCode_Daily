package com.offerII.L115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructionSequenceTest {
    public static void main(String[] args) {
        ReconstructionSequence reconstructionSequence = new ReconstructionSequence();
        /**
         * 示例 1：
         * 输入: org = [1,2,3], seqs = [[1,2],[1,3]]
         * 输出: false
         * 解释：[1,2,3] 不是可以被重建的唯一的序列，因为 [1,3,2] 也是一个合法的序列。
         */
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2));
        list.add(Arrays.asList(1,3));
        System.out.println(reconstructionSequence.sequenceReconstruction(new int[]{1, 2, 3}, list));
        /**
         * 示例 2：
         * 输入: org = [1,2,3], seqs = [[1,2]]
         * 输出: false
         * 解释：可以重建的序列只有 [1,2]。
         */
        list.clear();
        list.add(Arrays.asList(1,2));
        System.out.println(reconstructionSequence.sequenceReconstruction(new int[]{1, 2, 3}, list));
        /**
         * 示例 3：
         * 输入: org = [1,2,3], seqs = [[1,2],[1,3],[2,3]]
         * 输出: true
         * 解释：序列 [1,2], [1,3] 和 [2,3] 可以被唯一地重建为原始的序列 [1,2,3]。
         */
        list.clear();
        list.add(Arrays.asList(1,2));
        list.add(Arrays.asList(1,3));
        list.add(Arrays.asList(2,3));
        System.out.println(reconstructionSequence.sequenceReconstruction(new int[]{1, 2, 3}, list));
        /**
         * 示例 4：
         * 输入: org = [4,1,5,2,6,3], seqs = [[5,2,6,3],[4,1,5,2]]
         * 输出: true
         */
        list.clear();
        list.add(Arrays.asList(5,2,6,3));
        list.add(Arrays.asList(4,1,5,2));
        System.out.println(reconstructionSequence.sequenceReconstruction(new int[]{4,1,5,2,6,3}, list));
    }
}
