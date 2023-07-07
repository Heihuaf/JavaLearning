package com.ember.array;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        //创建数组
        int[] a = {5,66,4,88,20,15,64,27,26};
        //调用方法pi
        int[] b = pi(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] pi(int[] num){
        //初始化 temp
        int temp = 0;

        for (int i = 0; i < num.length; i++) {
            //定义 flag 为 false
            boolean flag = false;
            for (int j = 0; j < num.length-1; j++) {
                //如果数组后一位大于前一位 调换位置 再定义 flag 为true
                if (num[j+1]<num[j]){
                    temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                    flag = true;
                }

            }
            //如果 flag 为 false 终止
            if (flag == false){
                break;
            }
        }
        //返回 num 值
        return num;
    }
}
