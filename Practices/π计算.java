package com.liao.demo01;

public class Test {
    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        double pi = 0;
        double sum1 = 1;
        for (double i = 3;i<=Integer.MAX_VALUE; i=i+4) {
            sum1 = sum1 - (1/i) + (1/(i+2));
        }
        pi = sum1 * 4;
        double endTime = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println("π计算时间：" + (endTime - startTime)/1000 + "s");
    }
}
