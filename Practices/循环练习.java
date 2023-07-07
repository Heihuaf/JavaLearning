package com.ember.struct;

public class Work01 {
    public static void main(String[] args) {
        //用while循环输出1-1000之间能被5整除的数，并且每行输出3个

        //定义变量 a 的值为 1
        int a = 1;
        //创建while循环，a <= 1000 时持续循环
        while (a<=1000){
            //如果 a / 5 的余数为 0
            if (a%5==0){
                //输出 a 的值 + 空格
                System.out.print(a+"\t");
            }
            //如果 a / (3*5) 的余数为 0
            if (a%(5*3)==0){
                //输出换行
                System.out.println();
            }
            //a 自增
            a++;
        }

        //计算0到100之间奇数与偶数的和

        //定义 oddSum 为 0
        int oddSum = 0;
        //定义 evenSum 为 0
        int evenSum = 0;
        //b 值从 0 开始，b < 100执行，执行后自增
        for (int b = 0; b <= 100; b++) {
            //如果 b / 2 的余数不为 0
            if (b%2!=0){
                //oddSum的值变为 oddSum + b
                oddSum += b;
                //反之执行
            }else {
                //evenSum 的值为 evenSum + b
                evenSum += b;
            }
        }
        System.out.println();
        System.out.println("奇数总和："+oddSum);
        System.out.println("偶奇总和："+evenSum);
    }
}
