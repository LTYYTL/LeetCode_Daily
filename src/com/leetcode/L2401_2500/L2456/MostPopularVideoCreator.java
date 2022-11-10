package com.leetcode.L2401_2500.L2456;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2456. 最流行的视频创作者
 * 给你两个字符串数组 creators 和 ids ，和一个整数数组 views ，所有数组的长度都是 n 。
 * 平台上第 i 个视频者是 creator[i] ，视频分配的 id 是 ids[i] ，且播放量为 views[i] 。
 * 视频创作者的 流行度 是该创作者的 所有 视频的播放量的 总和 。请找出流行度 最高 创作者以及该创作者播放量 最大 的视频的 id 。
 * (1)如果存在多个创作者流行度都最高，则需要找出所有符合条件的创作者。
 * (2)如果某个创作者存在多个播放量最高的视频，则只需要找出字典序最小的 id 。
 * 返回一个二维字符串数组 answer ，其中 answer[i] = [creatori, idi] 表示 creatori 的流行度 最高 且其最流行的视频 id 是 idi ，可以按任何顺序返回该结果。
 * <p>
 * 示例 1：
 * 输入：creators = ["alice","bob","alice","chris"], ids = ["one","two","three","four"], views = [5,10,5,4]
 * 输出：[["alice","one"],["bob","two"]]
 * 解释：
 * alice 的流行度是 5 + 5 = 10 。
 * bob 的流行度是 10 。
 * chris 的流行度是 4 。
 * alice 和 bob 是流行度最高的创作者。
 * bob 播放量最高的视频 id 为 "two" 。
 * alice 播放量最高的视频 id 是 "one" 和 "three" 。由于 "one" 的字典序比 "three" 更小，所以结果中返回的 id 是 "one" 。
 * <p>
 * 示例 2：
 * 输入：creators = ["alice","alice","alice"], ids = ["a","b","c"], views = [1,2,2]
 * 输出：[["alice","b"]]
 * 解释：
 * id 为 "b" 和 "c" 的视频都满足播放量最高的条件。
 * 由于 "b" 的字典序比 "c" 更小，所以结果中返回的 id 是 "b" 。
 * <p>
 * 提示：
 * n == creators.length == ids.length == views.length
 * 1 <= n <= 105
 * 1 <= creators[i].length, ids[i].length <= 5
 * creators[i] 和 ids[i] 仅由小写英文字母组成
 * 0 <= views[i] <= 105
 */
public class MostPopularVideoCreator {
    /**
     * 方法：map集合
     */
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        // 存储每个人的流行度和播放量最大的视频
        Map<String, Popular> map = new HashMap<>();

        // 遍历
        for (int i = 0; i < creators.length; i++) {
            // 作者
            String creator = creators[i];
            // 视频
            String id = ids[i];
            // 播放量
            int view = views[i];
            // 获取记录的信息
            Popular popular = map.getOrDefault(creator, new Popular(creator, 0, id, view));
            // 当前播放量比记录的大，更新最大播放量的视频信息
            if (view > popular.topValue || (view == popular.topValue && id.compareTo(popular.ids) < 0)) {
                popular.ids = id;
                popular.topValue = view;
            }
            // 个人累计播放量
            popular.count += view;
            // 计入map
            map.put(creator, popular);
        }

        // 最大播放量
        int max = 0;
        // 结果
        List<List<String>> res = new ArrayList<>();
        // 遍历
        for (Map.Entry<String, Popular> entry : map.entrySet()) {
            // 个人
            Popular popular = entry.getValue();
            // 当前的累计播放量比记录的更大，更新最大累计播放量
            if (popular.count > max) {
                max = popular.count;
                // 清空记录
                res.clear();
            }
            // 记录条件的个人
            if (popular.count == max) {
                res.add(new ArrayList<>() {{
                    add(popular.name);
                    add(popular.ids);
                }});
            }
        }

        return res;
    }

    static class Popular {
        // 人名
        String name;
        // 累计播放量
        int count;
        // 最大播放量的视频
        String ids;
        // 播放量
        int topValue;

        public Popular(String name, int count, String ids, int topValue) {
            this.name = name;
            this.count = count;
            this.ids = ids;
            this.topValue = topValue;
        }
    }
}
