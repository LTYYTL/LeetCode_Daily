package com.leetcode.L1501_1600.L1600;

public class ThroneInheritanceTest {
    public static void main(String[] args) {
        /**
         * 解释：
         * ThroneInheritance t= new ThroneInheritance("king"); // 继承顺序：king
         * t.birth("king", "andy"); // 继承顺序：king > andy
         * t.birth("king", "bob"); // 继承顺序：king > andy > bob
         * t.birth("king", "catherine"); // 继承顺序：king > andy > bob > catherine
         * t.birth("andy", "matthew"); // 继承顺序：king > andy > matthew > bob > catherine
         * t.birth("bob", "alex"); // 继承顺序：king > andy > matthew > bob > alex > catherine
         * t.birth("bob", "asha"); // 继承顺序：king > andy > matthew > bob > alex > asha > catherine
         * t.getInheritanceOrder(); // 返回 ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
         * t.death("bob"); // 继承顺序：king > andy > matthew > bob（已经去世）> alex > asha > catherine
         * t.getInheritanceOrder(); // 返回 ["king", "andy", "matthew", "alex", "asha", "catherine"]
         */
        ThroneInheritance t = new ThroneInheritance("king");
        t.birth("king", "andy"); // 继承顺序：king > andy
        t.birth("king", "bob"); // 继承顺序：king > andy > bob
        t.birth("king", "catherine"); // 继承顺序：king > andy > bob > catherine
        t.birth("andy", "matthew"); // 继承顺序：king > andy > matthew > bob > catherine
        t.birth("bob", "alex"); // 继承顺序：king > andy > matthew > bob > alex > catherine
        t.birth("bob", "asha"); // 继承顺序：king > andy > matthew > bob > alex > asha > catherine
        System.out.println(t.getInheritanceOrder().toString());
        t.death("bob"); // 继承顺序：king > andy > matthew > bob（已经去世）> alex > asha > catherine
        System.out.println(t.getInheritanceOrder().toString());

    }
}
