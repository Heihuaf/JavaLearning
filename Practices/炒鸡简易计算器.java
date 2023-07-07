package com.ember.method;

import java.util.Scanner;

public class Work01 {
    // 加 减 乘 除 计算器
    public static void main(String[] args) {
        //创建记录器
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
      
        System.out.println("输入第一个数字：");
        //等待输入
        if (scanner.hasNextInt()){
            num1 = scanner.nextInt();
        }else {
            System.out.println("不是数字");
            return;
        }
      
        System.out.println("输入第二个数字：");
        //等待输入
        if (scanner.hasNextInt()){
            num2 = scanner.nextInt();
        }else {
            System.out.println("不是数字");
            return;
        }
      
        int a =0;
        int i =0;
        System.out.println("请选择运算方式：\n1=加 \n2=减 \n3=乘 \n4=除");
        //等待输入
        if (scanner.hasNextInt()) {
            //定义 a 为输入值
            a = scanner.nextInt();
        }
        //判断 a 的值
        switch (a){
            //为 1 时执行
            case 1:
                i = add(num1,num2);
                System.out.println("结果为："+num1+"+"+num2+"="+i);
                break;
            //为 2 时执行
            case 2:
                i = less(num1,num2);
                System.out.println("结果为："+num1+"-"+num2+"="+i);
                break;
            //为 3 时执行
            case 3:
                i = mult(num1,num2);
                System.out.println("结果为："+num1+"*"+num2+"="+i);
                break;
            //为 3 时执行
            case 4:
                i = divi(num1,num2);
                System.out.println("结果为："+num1+"/"+num2+"="+i);
                break;
            //都不是则执行
            default :
                System.out.println("啥也不是");
        }
        scanner.close();
    }
    //加法
    public static int add(int a,int b){
        return a+b;
    }
    //减法
    public static int less(int a,int b){
        return a-b;
    }
    //乘法
    public static int mult(int a,int b){
        return a*b;
    }
    //除法
    public static int divi(int a,int b){
        return a/b;
    }
}
