package com.ember.array;

public class Test03 {
    /*
  //
    1  0  0  0  0  0  0  0  0  0  12
    0  2  0  0  0  0  0  0  0  13 0
    0  0  3  0  0  0  0  0  14 0  0
    0  0  0  4  0  0  0  15 0  0  0
    0  0  0  0  5  0  16 0  0  0  0
    0  0  0  0  0  6  0  0  0  0  0
    0  0  0  0  17 0  7  0  0  0  0
    0  0  0  18 0  0  0  8  0  0  0
    0  0  19 0  0  0  0  0  9  0  0
    0  20 0  0  0  0  0  0  0  10 0
    21 0  0  0  0  0  0  0  0  0  11
     */
    //转换为数组、稀疏数组，再转换为数组
    public static void main(String[] args) {
        //1.创建数组 array1
        int[][] array1 = new int[11][11];
        //给数组赋值
        array1[0][0] = 1;
        array1[1][1] = 2;
        array1[2][2] = 3;
        array1[3][3] = 4;
        array1[4][4] = 5;
        array1[5][5] = 6;
        array1[6][6] = 7;
        array1[7][7] = 8;
        array1[8][8] = 9;
        array1[9][9] = 10;
        array1[10][10] = 11;
        array1[0][10] = 12;
        array1[1][9] = 13;
        array1[2][8] = 14;
        array1[3][7] = 15;
        array1[4][6] = 16;
        array1[6][4] = 17;
        array1[7][3] = 18;
        array1[8][2] = 19;
        array1[9][1] = 20;
        array1[10][0] = 21;
        //输出语句
        System.out.println("数组");
        //创建增强for循环，循环 数组1 中所有对象
        for (int[] ints : array1) {
            //创建增强for循环，循环 数组1对象 中所有对象
            for (int ints1 : ints) {
                //输出数组值
                System.out.print(ints1+"\t");
            }
            //输出换行
            System.out.println();
        }
        //2.创建稀疏数组
        //初始化 sum
        int sum = 0;
        //定义变量 x 为array1的 长度
        int x = array1.length;
        //初始化 y
        int y = 0;
        //i 等于 0，小于array1的长度时循环，循环后自增
        for (int i = 0; i < array1.length; i++) {
            //j 等于 0，小于array1的长度时循环，循环后自增
            for (int j = 0; j < array1.length; j++) {
                //如果 array1的 行[i] 列[j] 不等于 0
                if (array1[i][j] != 0){
                    //sum 自增
                    sum++;
                }
            }
            //y 自增
            y++;
        }
        //输出语句
        System.out.println("\n稀疏数组");
        //创建稀疏数组 array2
        int[][] array2 = new int[sum+1][3];
        //定义 array2 行[0] 宽[0] 为 x
        array2 [0][0] = x;
        //定义 array2 行[0] 宽[1] 为 y
        array2 [0][1] = y;
        //定义 array2 行[0] 宽[3] 为 sum
        array2 [0][2] = sum;
        //初始化 count
        int count = 0;
        //i = 0，小于 array1的长度时循环，循环结束自增
        for (int i = 0; i < array1.length; i++) {
            //j = 0，小于 array1的长度时循环，循环结束自增
            for (int j = 0; j < array1.length; j++) {
                //如果 array1 行[i] 宽[j] 不等于 0
                if (array1[i][j] != 0){
                    //count 自增
                    count++;
                    //定义 array2 行[count] 宽[0] 为 i
                    array2[count][0] = i;
                    //定义 array2 行[count] 宽[1] 为 j
                    array2[count][1] = j;
                    //定义 array2 行[count] 宽[2] 为 array1 行[i] 宽[j]
                    array2[count][2] = array1[i][j];
                }
            }
        }
        //遍历 array2 中的 对象
        for (int[] ints : array2) {
            //遍历 ints[array2] 中的对象
            for (int ints1 : ints) {
                //输出数值
                System.out.print(ints1+"\t");
            }
            //输出回车
            System.out.println();
        }
        System.out.println();
        //3.将稀疏数值转换为数组
        System.out.println("稀疏数组 转 数组");
        //新建数组 array3
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        //i = 1，小于 array2的长度时循环，循环结束自增
        for (int i = 1; i < array2.length; i++) {
            //定义 array3 行[array2[i][0]] 列[array2[i][1]] 为 array2 行[i] 列[2]
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        //遍历 array3 中的所有对象
        for (int[] ints : array3) {
            //遍历 ints[array3] 中的所有对象
            for (int anInt : ints) {
                //输出数值
                System.out.print(anInt+"\t");
            }
            //输出换行
            System.out.println();
        }

    }
}
