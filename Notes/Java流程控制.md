# 流程控制

## 顺序结构

- Java的基本结构
- 从上到下顺序进行
- 任何一个算法都离不开的一种基本算法结构

## 选择(分支)结构

### if 循环

- if单选择结构

  ```java
  if(布尔表达式){
      //如果布尔表达式为true将执行的语句
  }
  ```

  ```java
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
  
          System.out.println("请输入内容：");
          String s = scanner.nextLine();
  
          //equals：判断字符串是否相等
          if (s.equals("Hello")){
              System.out.println(s);
          }
  
          System.out.println("END");
  
          scanner.close();
      }
  
  ```

  

- if双选择结构

  ```java
  if(布尔表达式){
      //如果布尔表达式为true
  }else{
      //如果布尔表达式为false
  }
  ```

  ```java
      public static void main(String[] args) {
          //考试分数大于60就是及格，小于60就是不及格
          Scanner scanner = new Scanner(System.in);
  
          System.out.println("请输入成绩：");
          int score = scanner.nextInt();
  
          if (score>60){
              System.out.println("及格");
          }else{
              System.out.println("不及格");
          }
  
  
          scanner.close();
      }
  ```

  

- if多选择结构

  ```java
  if(布尔表达式 1){
      //如果布尔表达式 1的值为true执行代码
  }else if(布尔表达式 2){
      //如果布尔表达式 2的值为true执行代码
  }else if(布尔表达式 3){
      //如果布尔表达式 3的值为true执行代码
  }else{
      //如果以上布尔表达式都不为true执行代码
  }
  ```

  ```java
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
  
          /*
          if 语句至多有 1 个else 语句，else 语在所有的 else if 语句之后
          if 语句可以有若干个 else if 语句，它们必须在 else 语句之前。
          一旦其中一个 else if 语句测为 true，其他的 else if 以 else 语句都将跳过执行
           */
  
          System.out.println("请输入成绩：");
          int score = scanner.nextInt();
          if (score == 100) {
              System.out.println("恭喜满分");
          } else if (score < 100 && score >= 90) {
              System.out.println("A级");
          } else if (score < 90 && score >= 80) {
              System.out.println("B级");
          } else if (score < 80 && score >= 70) {
              System.out.println("C级");
          }else if (score < 70 && score >= 60) {
              System.out.println("D级");
          }else if (score<60 && score>=0){
              System.out.println("您的成绩为：不合格");
          } else{
              System.out.println("成绩不合法");
          }
  
          scanner.close();
  
      }
  ```

  

- 嵌套的if结构

  ```java
  if(布尔表达式 1){
      //如果布尔表达式 1的值为true执行代码
      if(布尔表达式 2){
          //如果布尔表达式2 的值为true执行代码
      }
  }
  ```


在使用if的时候最主要的特点是它可以进行若干个条件判断(if..else)

好的习惯一定要写上else语句



---



### switch 循环

- switch多选择结构
  - switch是一个开关语句，它主要是工具内容来进行判断，switch中可以判断的只能是数据(int、char、枚举、String)而不能使用逻辑判断

```java
switch(数据){
    case 数值 : {
        数值满足时执行;
        [break;] //可选
    }
    case 数值 : {
        数值满足时执行;
        [break;] //可选
    }
    //你可以有任意数量的case语句
    [default: //可选
        所有判断不满足时执行;
        [break;] //可选
    ]
}
```

如果在每个case后面没有追加break语句，那么会在第一个匹配的case之后继续执行，到全部的switch中后续代码执行完毕或者遇见break

```java
    public static void main(String[] args) {
        //case 穿透
        //switch 匹配一个值
        char grade = 'F';

        switch(grade){
            case 'A':
                System.out.println("优秀");
                break; //可选
            case 'B':
                System.out.println("良好");
                break; //可选
            case 'C':
                System.out.println("中等");
                break; //可选
            case 'D':
                System.out.println("一般");
                break; //可选
            case 'E':
                System.out.println("二逼");
                break; //可选
            default:
                System.out.println("未知");

        }
    }
```

```java
    public static void main(String[] args) {
        String name = "恩波";
        //JDK7的新特性，表达式结果可以是字符串
        //字符的本质还是数字

        //反编译  java---class(字节码文件)---反编译(IDEA)

        switch(name){
            case "恩波":
                System.out.println("恩波");
                break;
            case "Ember":
                System.out.println("Ember");
                break;
            default:
                System.out.println("搞几把毛");

        }
    }
```



## 循环结构

### while 循环

```java
while(布尔表达式){
    条件满足时执行;
    修改循环条件;
}
```

- 只要布尔表达式为true，循环就会一直执行
- 多达数情况会让循环停下
- 少部分情况下需要一直循环，如服务器
- 尽量避免死循环

```java
    public static void main(String[] args) {

        //输出1~100

        int i =0;

        while (i<100){
            i++;
            System.out.println(i);
        }

    }
```

```java
    public static void main(String[] args) {
        //死循环
        while(true){
            //等待客户端连接
            //定时检查
            //......
        }
    }
```

```java
    public static void main(String[] args) {
        //计算1+2+3+...+100=?

        //高斯

        int i =0;
        int sum = 0;

        while(i<=100){
            sum = sum +i;
            i++;
        }

        System.out.println(sum);
    }
```



### do...while 循环

- 即使不满足条件，也至少执行一次

  ```java
  do {
      条件满足时执行;
      修改循环条件;
  }while(布尔表达式);
  ```

- 先执行后判断

```java
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            sum = sum + i;
            i++;
        }while(i<=100);

        System.out.println(sum);

    }
```

```java
    public static void main(String[] args) {
        int a = 0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("==================");
        do {
            System.out.println(a);
            a++;
        }while (a<0);
    }
```

开发中遇到do...while的几率几乎为1%



### for 循环

```java
for(初始化；布尔表达式；更新){
    //代码语句
}
```

- 支持迭代的一种通用结构
- 最有效、最灵活的循环结构
- 执行次数在执行前就确定了

```java
    public static void main(String[] args) {
        int a = 1; //初始化条件

        while(a<=100){ //条件判断
            System.out.println(a); //循环体
            a += 2; //迭代
        }

        System.out.println("while循环结束");

        //初始化值 条件判断 迭代
        for (int i =1;i<=100;i++){
            System.out.println(i);
        }

        System.out.println("for循环结束");

        /*
        关于 for 循环有以下几点说明:
        最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
        然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为faLse，循环终止，开始执行循环体后面的语句。
        执行一次循环后，更新循环控制变量(送代因子控制循环变量的增减)。
        再次检测布尔表达式。循环执行上面的过程。
         */

        //死循环
        for ( ; ;) {

        }
    }
```

```java
    public static void main(String[] args) {
        //计算0到100之间的基数和偶数的和

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i%2!=0){ //奇数
                oddSum += i; //oddSum = oddSum + i
            }else { //偶数
                evenSum += i;
            }
        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);
    }
```

```java
    public static void main(String[] args) {
        //用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){ //每行
                System.out.println();
                //System.out.print("\n");
            }
        }
        //println 输出完会换行
        //print 输出玩不会换行
    }
```

```java
    public static void main(String[] args) {
        //九九乘法表
        //1.先打印第一列
        //2.把固定的1再用一个循环抱起来
        //3.去掉重复项，i <= j
        //4.调整样式

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
```



- 增强 for 循环

  ```java
  for(声明语句：表达式)
  {
      //代码句子
  }
  ```

  ```java
      public static void main(String[] args) {
          //定义一个数组
          int[] numbers = {10,20,30,40,50};
  
          for (int i = 0;i<5;i++){
              System.out.println(numbers[i]);
          }
  
          System.out.println("===============================");
  
          //遍历数组的元素
          for (int x:numbers){
              System.out.println(x);
          }
      }
  ```




- 在明确确定循环次数的情况下优先循环for循环
- 在不知道循环次数但是知道循环结束条件的情况下使用while循环



### 循环控制

- break

  - 在任何循环语句的主体部分，均可用break控制循环流程


  - 用于强制退出循环

    ```java
        public static void main(String[] args) {
            int i = 0;
            while (i<100){
                i++;
                System.out.println(i);
                if (i==30){
                    break; //终止循环
                }
            }
    
            System.out.println("只是跳出循环");
        }
    ```

    

- continue

  - 当执行到了continue的时候，表示当前语句之中后续代码不再执行，而直接进行后续判断处理

  - 用于循环语句中，用于终止某次循环过程

  - 跳过循环中尚未执行的语句，接着进行下一次是否执行循环的判定

    ```java
        public static void main(String[] args) {
             int i =0;
             while (i<100){
                 i++;
                 if (i%10==0){
                     System.out.println("\ncontinue成立");
                     continue;
                 }
                 System.out.print(i);
             }
        }
    ```

  - goto

    ```java
    point: for(int x = 0 ; x > 10 ; x++){
        for(int y = 0 ; y > 3 ; y++){
            if(x == y){
            continue point;
            }
            System.out.print(x+"、");
        }
    }
    ```

    

## 循环嵌套

程序逻辑训练

```java
//九九乘法表
public class demo01 {
    public static void main(String[] args){
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }
```

```java
//打印三角形
public class demo01 {
    public static void main(String[] args){
        int line = 5;
        for (int x = 0; x < line; x++) {
            for (int y = 0; y < line - x; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

