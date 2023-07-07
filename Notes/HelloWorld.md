# HelloWorld

1. 新建文件夹
2. 于文件夹中新建 **Hello.java**
   - 文件后缀为**.java**
   - 文件类型为**JAVA文件**

3. 编写代码

   ```java
   //注意 public class 颜色高光。Hello 需要与文件名相同，注意大小写。添加中括号
   public class Hello{
       //public static和void有颜色高光。String注意大写
   	public static void main(String[] args){
           //System注意大写
   		System.out.print("Hello,World!");
   	}
   }
   ```

4. 保存后于 **Hellw.java** 所在文件夹运行CMD

   - Shift 右击文件夹
   - 地址栏最前加入cmd+空格

5. 编译java文件

   - ```bash
     javac Hello.java
     ```

   - 没有任何输出提示
   - 文件夹内多出 **Hello.class** 文件

6. 运行编译文件

   - ```bash
     java Hello
     ```

   - ```bash
     Hello,World!
     ```

## 可能遇到的问题

1. 单词大小写不能出错
2. 文件夹及文件名使用英文
3. 符号只能使用英文符号

# JAVA 运行机制

- 编译型
  - 操作快 效率高 c / c++
- 解释型
  - 对速度要求不高 网页 java