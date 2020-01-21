package com.yamon.array;

import java.util.Scanner;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2019/12/10
 */

public class TwoIntSummaryAndDe {
    /*
     * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     *
     * 输入：n = 234
        输出：15
        解释：
        各位数之积 = 2 * 3 * 4 = 24
        各位数之和 = 2 + 3 + 4 = 9
        结果 = 24 - 9 = 15
     *
     * */

    public static void main(String[] args) {
        int pro=1;
        int sum=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0){
            int mod=n%10;
            pro=pro*mod;
            sum+=mod;
            n=n/10;
        }
        System.out.println(pro-sum);
    }
}
