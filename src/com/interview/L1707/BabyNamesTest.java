package com.interview.L1707;

import java.util.Arrays;

public class BabyNamesTest {
    public static void main(String[] args) {
        BabyNames babyNames = new BabyNames();
        /**
         * 示例：
         * 输入：names = ["John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"],
         * synonyms = ["(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"]
         * 输出：["John(27)","Chris(36)"]
         */
        System.out.println(Arrays.toString(babyNames.trulyMostPopular(new String[]{"John(15)", "Jon(12)", "Chris(13)", "Kris(4)", "Christopher(19)"}, new String[]{"(Jon,John)", "(John,Johnny)", "(Chris,Kris)", "(Chris,Christopher)"})));
    }
}
