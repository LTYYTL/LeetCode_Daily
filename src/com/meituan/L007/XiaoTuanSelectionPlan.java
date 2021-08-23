package com.meituan.L007;

import java.io.*;

/**
 * meituan-007. 小团的选调计划
 * 美团打算选调 n 名业务骨干到 n 个不同的业务区域，本着能者优先的原则，公司将这 n 个人按照业务能力从高到底编号为 1~n 。
 * 编号靠前的人具有优先选择的权力，每一个人都会填写一个意向，这个意向是一个 1~n 的排列，表示一个人希望的去的业务区域顺序，
 * 如果有两个人同时希望去某一个业务区域则优先满足编号小的人，每个人最终只能去一个业务区域。
 * 例如 3 个人的意向顺序都是 1 2 3 ，则第一个人去 1 号区域，第二个人由于 1 号区域被选择了，所以只能选择 2 号区域，同理第三个人只能选择 3 号区域。
 * 最终请你输出每个人最终去的区域。
 *
 * 格式：
 * 输入：
 * - 输入第一行是一个正整数 n ，表示业务骨干和业务区域数量。
 * - 接下来有 n 行，每行 n 个整数，即一个 1~n 的排列，第 i 行表示 i-1 号业务骨干的意向顺序。
 * 输出：
 * - 输出包含 n 个正整数，第 i 个正整数表示第 i 号业务骨干最终去的业务区域编号。
 *
 * 示例：
 * 输入：
 *      5
 *      1 5 3 4 2
 *      2 3 5 4 1
 *      5 4 1 2 3
 *      1 2 5 4 3
 *      1 4 5 2 3
 * 输出：1 2 5 4 3
 *
 * 提示：
 * n ≤ 300
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaoTuanSelectionPlan {
    /**
     * 方法：模拟
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        //获取长度
        int n = Integer.parseInt(reader.readLine());
        //标记是否被选中
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            //输入意向岗位
            String[] data = reader.readLine().split(" ");
            for (int j = 0; j < data.length; j++) {
                //当前的意向岗位
                int cur = Integer.parseInt(data[j]);
                //标号从0开始，没有被选
                if (!vis[cur-1]){
                    writer.write(cur+" ");
                    vis[cur-1] = true;//修改为选中状态
                    break;
                }
            }
        }

        //关闭流
        reader.close();
        writer.close();
    }
}
