package com.interview.L1707;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 17.07. 婴儿名字
 * 每年，政府都会公布一万个最常见的婴儿名字和它们出现的频率，也就是同名婴儿的数量。有些名字有多种拼法，
 * 例如，John 和 Jon 本质上是相同的名字，但被当成了两个名字公布出来。给定两个列表，一个是名字及对应的频率，另一个是本质相同的名字对。
 * 设计一个算法打印出每个真实名字的实际频率。注意，如果 John 和 Jon 是相同的，并且 Jon 和 Johnny 相同，则 John 与 Johnny 也相同，即它们有传递和对称性。
 *
 * 在结果列表中，选择 字典序最小 的名字作为真实名字。
 *
 * 示例：
 * 输入：names = ["John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"],
 * synonyms = ["(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"]
 * 输出：["John(27)","Chris(36)"]
 *
 * 提示：
 * names.length <= 100000
 */
public class BabyNames {
    /**
     * 方法：并查集
     * @param names
     * @param synonyms
     * @return
     */
    public String[] trulyMostPopular(String[] names, String[] synonyms) {
        // 并查集
        class UnionFind1 {
            private Map<String, String> map = new HashMap<>();

            public UnionFind1(String[] names) {
                for (String name : names) {
                    map.put(name, name);
                }
            }

            // 并
            void union(String name1, String name2) {
                String parent1 = find(name1);
                if (parent1 == null) {
                    parent1 = name1;
                }
                String parent2 = find(name2);
                if (parent2 == null) {
                    parent2 = name2;
                }
                if (!parent1.equals(parent2)) {
                    if (parent2.compareTo(parent1) > 0) {
                        map.put(parent2, parent1);
                    } else {
                        map.put(parent1, parent2);
                    }
                }
            }

            // 查
            String find(String name) {
                if (name == null) {
                    return null;
                }
                if (name.equals(map.get(name))) {
                    return name;
                }
                return find(map.get(name));
            }
        }

        // 初始化并查集
        String[] nameArray = Arrays.stream(names).map(ele -> ele.substring(0, ele.indexOf("("))).toArray(String[]::new);
        UnionFind1 uf = new UnionFind1(nameArray);

        // 合并
        for (String synonym : synonyms) {
            String[] array = synonym.replace('(', ' ').replace(')', ' ').trim().split(",");
            uf.union(array[0], array[1]);
        }

        // 计算数字
        Map<String, Integer> map = new HashMap<>();
        for (String item : names) {
            int index = item.indexOf("(");
            String name = item.substring(0, index);
            int num = Integer.parseInt(item.substring(index + 1, item.length() - 1));
            name = uf.find(name);
            map.put(name, map.getOrDefault(name, 0) + num);
        }
        return map.entrySet().stream().map(ele -> String.format("%s(%d)", ele.getKey(), ele.getValue())).toArray(String[]::new);
    }
}