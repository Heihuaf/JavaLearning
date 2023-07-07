package com.ember.Scanner;

import java.util.Scanner;

public class Work01 {
    //输入多个数字，并求其总和与平均数，每输入一个数字用回车确定，通过输入非数字来结束输入并输出执行结果
    public static void main(String[] args){
        //创建一个记录器，记录一个新的数据输入
        Scanner scanner = new Scanner(System.in);

        //设置变量数字数 n 为 0
        int n = 0;
        //设置变量数字总数 sum 为 0
        double sum = 0;

        //提示语
        System.out.println("请输入数字：");

        //创建循环命令，判断输入的数据是否为double，如果不是则结束循环
        while(scanner.hasNextDouble()){
            //记录输入的数字 = 原本值 + 新输入值
            sum = sum + scanner.nextDouble();
            //记录输入数字次数 = 原本值 + 输入1次
            n = ++n; //n = n + 1;

            //输出提醒
            System.out.println("当前数字总和为："+sum+"，输入数字次数为："+n);
        }

        //结束循环输出总和和平均数
        System.out.println("输入数字总和为："+sum+"，平均值为："+(sum/n));
    }

}
