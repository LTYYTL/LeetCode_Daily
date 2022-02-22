package com.leetcode.L801_900.L0838;

/**
 * 838. 推多米诺
 * n 张多米诺骨牌排成一行，将每张多米诺骨牌垂直竖立。在开始时，同时把一些多米诺骨牌向左或向右推。
 * 每过一秒，倒向左边的多米诺骨牌会推动其左侧相邻的多米诺骨牌。同样地，倒向右边的多米诺骨牌也会推动竖立在其右侧的相邻多米诺骨牌。
 * 如果一张垂直竖立的多米诺骨牌的两侧同时有多米诺骨牌倒下时，由于受力平衡， 该骨牌仍然保持不变。
 * 就这个问题而言，我们会认为一张正在倒下的多米诺骨牌不会对其它正在倒下或已经倒下的多米诺骨牌施加额外的力。
 * 给你一个字符串 dominoes 表示这一行多米诺骨牌的初始状态，其中：
 * dominoes[i] = 'L'，表示第 i 张多米诺骨牌被推向左侧，
 * dominoes[i] = 'R'，表示第 i 张多米诺骨牌被推向右侧，
 * dominoes[i] = '.'，表示没有推动第 i 张多米诺骨牌。
 * 返回表示最终状态的字符串。
 *
 * 示例 1：
 * 输入：dominoes = "RR.L"
 * 输出："RR.L"
 * 解释：第一张多米诺骨牌没有给第二张施加额外的力。
 *
 * 示例 2：
 * 输入：dominoes = ".L.R...LR..L.."
 * 输出："LL.RR.LLRRLL.."
 *
 * 提示：
 * n == dominoes.length
 * 1 <= n <= 105
 * dominoes[i] 为 'L'、'R' 或 '.'
 */
public class PushDominoes {
    /**
     * 方法：双指针
     * 作者：tong-zhu
     * 链接：https://leetcode-cn.com/problems/push-dominoes/solution/tong-ge-lai-shua-ti-la-yi-ti-liang-jie-s-xlda/
     * @param dominoes
     * @return
     */
    public String pushDominoes(String dominoes) {
        //转换成字符数组
        char[] arr = dominoes.toCharArray();
        //记录连续'.'的开始
        int i = 0;
        //遍历
        while (i < arr.length){
            //寻找连续'.'的开始
            while (i < arr.length && arr[i] != '.')
                i++;
            //寻找连续'.'的结尾
            int j = i;
            while (j < arr.length && arr[j]== '.')
                j++;
            //进行替换
            replace(arr,i,j-1);
            //继续下一轮，寻找连续‘.’
            i = j;
        }

        return new String(arr);
    }

    /**
     * 替换函数
     * @param arr
     * @param start
     * @param end
     */
    private void replace(char[] arr, int start, int end) {
        // 如果两头都是R，全部替换成R
        // 如果左边是R，右边是边界，全部替换成R
        // 如果两头都是L，全部替换成L
        // 如果左边是边界，右边是L，全部替换成L
        // 如果左边是R，右边是L，除了最中间那个.，其他的都需要替换
        // 其他情况保持不变

        // 如果两头都是R，全部替换成R
        // 如果左边是R，右边是边界，全部替换成R
        if (start - 1 >= 0 && arr[start-1] == 'R' && (end + 1 >= arr.length || arr[end+1] =='R')){
            while (start <= end){
                arr[start++] = 'R';
                arr[end--] = 'R';
            }
        }else if (end + 1 < arr.length && arr[end+1] == 'L' && (start - 1 < 0 || arr[start-1]=='L')){
            // 如果两头都是L，全部替换成L
            // 如果左边是边界，右边是L，全部替换成L
            while (start <= end){
                arr[start++] = 'L';
                arr[end--] = 'L';
            }
        }else if (end + 1 < arr.length && start - 1 >= 0 && arr[start-1] =='R' && arr[end+1] == 'L'){
            // 如果左边是R，右边是L，除了最中间那个.，其他的都需要替换
            while (start < end){
                arr[start++] = 'R';
                arr[end--] = 'L';
            }
        }
    }
}
