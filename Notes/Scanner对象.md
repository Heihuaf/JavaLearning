# Scanner对象

- next()
  - 一定要读取到有效字符后才可以结束输入
  - 输入的字符中含有空格时，next()会自动过滤空格后的字符
  - 只有输入有效字符后才能将其后面的空白作为分隔符或者结束符
  - next()不能得到带有空格的字符串
- nextLine()
  - 以Enter为结束符，nextLine()会返回输入回车之前的所有字符
  - 可以获得空白

```java
    public static void main(String[] args) {

        //创建一个扫描器对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next(); //程序会等待用户输入完毕
            System.out.println("输入的内容为："+str);
        }

        //凡是属于IO流的类如果不关闭会一直占用资源，要养成好习惯用完就关
        scanner.close();

    }
```

```java
    public static void main(String[] args) {
        // 从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        //判断是否还有输入
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
        scanner.close();
    }
```

```java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");

        String str = scanner.nextLine();

        System.out.println("输出的内容为："+str);

        scanner.close();

    }
```

```java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //从键盘接收数据
        int i = 0;
        float f =0.0f;

        System.out.println("请输入整数：");

        //如果...那么...
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据：" + i);
        }else{
            System.out.println("你输入的不是整数数据。");
        }


        System.out.println("请输入小数");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数数据：" + f);
        }else{
            System.out.println("你输入的不是小数数据。");
        }

        scanner.close();
    }
```

```java
    public static void main(String[] args) {
        //我们要输入多个数字，并求其总和与平均数，每输入一个数字用回车确定，通过输入非数字来结束输入并输出执行结果

        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;
        System.out.println("请输入数字：");
        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m = m + 1;//m++
            sum = sum + x;

            System.out.println("你输入了第"+m+"个数据,当前结果sum="+sum);
        }
        System.out.println(m +"个数的和为：" + sum);
        System.out.println(m +"个数的平均值为：" + (sum / m));

        scanner.close();
    }
```









