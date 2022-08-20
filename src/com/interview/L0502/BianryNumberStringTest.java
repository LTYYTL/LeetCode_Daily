package com.interview.L0502;

public class BianryNumberStringTest {
    public static void main(String[] args) {
        BianryNumberString bianryNumberString = new BianryNumberString();
        /*
          示例1:
           输入：0.625
           输出："0.101"
         */
        System.out.println(bianryNumberString.printBin(0.625));
        /*
          示例2:
           输入：0.1
           输出："ERROR"
           提示：0.1无法被二进制准确表示
         */
        System.out.println(bianryNumberString.printBin(0.1));
    }
}
