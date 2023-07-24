# 简单Java类

在项目的开发与设计的过程之中，简单Java类都将作为一个重要的组成部分，简单Java类无处不在，并且有可能会产生一系列的变化

简单Java类指的是可以描述某一类信息的程序类，例如：描述一个人、描述一本书、描述一个部门、描述一个雇员，并且在这个类之中并没有特别复杂的逻辑操作，只作为一种信息存储的媒介存在

对于简单Java类而言，其核心的开发结构如下：

- 类名称一定要有意义，可以明确的描述某一类事物
- 类之中的所有属性都必须使用private就行封装，同时封装后的属性必须要提供有setter、getter存在
- 类之中可以提供有无数多个构造方法，但是必须要保留有无参构造方法
- 类之中不允许出现任何的输出语句，所有内容的获取必须返回
- **[可选]**可以提供有一个获取对象详细信息的方法，暂时将此方法名称定义为getInfo``

```java
public class Dept {  //类名称可以明确描述出某类事物
    private long deptno;
    private String dname;
    private String loc;
    public Dept(){}
    public Dept(long deptno,String dname,String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
    public String getInfo(){
        return "[部门编号]："+this.deptno+"\n[部门名称]："+this.dname+"\n[部门位置]："+this.loc;
    }
    public void setDeptno(long deptno){
        this.deptno = deptno;
    }
    public void setDname(String dname){
        this.dname = dname;
    }
    public void setLoc(String loc){
        this.loc = loc;
    }
    public long getDepono(){
        return this.deptno;
    }
    public String getDname(){
        return this.dname;
    }
    public String getLoc(){
        return this.loc;
    }
}
```

