package com.leetcode.L901_1000.L0911;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 911. 在线选举
 * 给你两个整数数组 persons 和 times 。在选举中，第 i 张票是在时刻为 times[i] 时投给候选人 persons[i] 的。
 * 对于发生在时刻 t 的每个查询，需要找出在 t 时刻在选举中领先的候选人的编号。
 * 在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。
 *
 * 实现 TopVotedCandidate 类：
 * (1)TopVotedCandidate(int[] persons, int[] times) 使用 persons 和 times 数组初始化对象。
 * (2)int q(int t) 根据前面描述的规则，返回在时刻 t 在选举中领先的候选人的编号。
 *
 * 示例：
 * 输入：
 * ["TopVotedCandidate", "q", "q", "q", "q", "q", "q"]
 * [[[0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]], [3], [12], [25], [15], [24], [8]]
 * 输出：
 * [null, 0, 1, 1, 0, 0, 1]
 * 解释：
 * TopVotedCandidate topVotedCandidate = new TopVotedCandidate([0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]);
 * topVotedCandidate.q(3); // 返回 0 ，在时刻 3 ，票数分布为 [0] ，编号为 0 的候选人领先。
 * topVotedCandidate.q(12); // 返回 1 ，在时刻 12 ，票数分布为 [0,1,1] ，编号为 1 的候选人领先。
 * topVotedCandidate.q(25); // 返回 1 ，在时刻 25 ，票数分布为 [0,1,1,0,0,1] ，编号为 1 的候选人领先。（在平局的情况下，1 是最近获得投票的候选人）。
 * topVotedCandidate.q(15); // 返回 0
 * topVotedCandidate.q(24); // 返回 0
 * topVotedCandidate.q(8); // 返回 1
 *
 * 提示：
 * 1 <= persons.length <= 5000
 * times.length == persons.length
 * 0 <= persons[i] < persons.length
 * 0 <= times[i] <= 109
 * times 是一个严格递增的有序数组
 * times[0] <= t <= 109
 * 每个测试用例最多调用 104 次 q
 */
public class TopVotedCandidate {
    //记录各时段的领先者
    private final List<Integer> tops;
    //记录每个人的票数
    private final Map<Integer, Integer> voteCounts;
    //时间段
    private final int[] times;

    public TopVotedCandidate(int[] persons, int[] times) {
        //初始化
        tops = new ArrayList<>();
        voteCounts = new HashMap<>();
        voteCounts.put(-1,-1);
        //默认情况，存储最多票数的人的编号
        int top = -1;
        //遍历
        for (int i = 0; i < persons.length; i++) {
            //被投票人编号
            int cur = persons[i];
            //票数+1
            voteCounts.put(cur,voteCounts.getOrDefault(cur,0)+1);
            //当前人的票数比最多人还多
            if (voteCounts.get(cur) >= voteCounts.get(top))
                //当前人做作为票数最多的人
                top = cur;
            //加入领先者队列
            tops.add(top);
        }
        this.times = times;
    }

    /**
     * 二分查找
     * @param t
     * @return
     */
    public int q(int t) {
        int left = 0;
        int right = times.length - 1;
        //找到满足times[left] <= t 的最大left
        while (left <= right){
            int mid = (right - left)/2 + left;
            if (times[mid] <= t)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return tops.get(right);
    }
}
