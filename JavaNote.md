***# Java基础学习笔记
Yvon很挣扎地记下了些许笔记。
--------
 
 >* 写个Hello World程序，放到package com.yourname.package-name里，用命令行来运行.

```
 package com.hyf.hello;

  class HelloWorld {

	public static void main(String[] args){
		System.out.println("Hello World !");
	}
}
```
![HelloWorld](https://raw.githubusercontent.com/Yvonhu/registration/master/HelloWorld.jpg)

----------


 

 >* 九九乘法表。
```
public class Multiplication {
	public static void main (String[] args){	
		int ans=0;
		for(int i=1;i<10;i++){
			System.out.println( );
			for(int j=1;j<=i;j++){
				ans=i*j;
				System.out.print(i+"x"+j + "="+ ans +"  " );
			}
		}
	}
}
```


----------


   >*       找出10000以内的所有质数，并打印

```
public class PrimeNumber {
	public static void main(String[] args){
	outer:	for(float a=2;a<=10000;a++){
			for(float i=2;i<a;i++){	
			if(a%i==0){
				continue outer;}
			//System.out.println(a);  
		 }
		System.out.println(a);
	   }
    }
}
```


----------


 >*         写个阶乘函数。
    -   递归、非递归。 小数值、大数值。
   
        


 - -- 非递归小数值。    
  

```
public class Factorial2 {
	public static int Fac2 (int a){
		int ans=1;
		int total=0;
		if(a==0||a==1){
			System.out.println("1");
		}
		for(int i=2;i<a;i++){
			ans*=i;
			total+=ans;
			System.out.println("ans结果："+ ans);

		}
		//System.out.println("ans结果："+ ans);

		return total;
	}


  	public static void main(String[] args){
		System.out.println(Fac2(12));
	}
}
```


----------


 >*       面对对象编程：写个例子，告诉我们什么是重写，什么是重载。
 
 >* 重载特点：同一个方法名，参数类型和个数不同。需要哪个调用哪个。
 >* 重写特点：子类继承父类的对象方法的时候,可以不同个子类对同一个父类方法进行不同的改写，重复提供该方法。 
 降低开发时间和维护成本。
 
  >* 写个例子演示一下，什么是多态，多态的作业。
  -     操作符的多态 
      可以作为算数运算，也可以作为字符串连接 
 +     类的多态 
父类引用指向子类对象
 
``` 
People.java
---
package overload;
//例子：不同性别的人在购买商品时对商品的关注点不同。
public class People {

	public void Gender(){                            
		System.out.println("性别不同关注点不同。"); 
	}
	//此例对无参方法进行重写。

	public void Gender(String Male,float Price){
		System.out.println("性别 ：  "+ Male+"关注点：  金钱--"+Price);
	}

	public void Gender(String Female, int Usedate,String color  ){
		System.out.println("性别 ：  "+ Female+"关注点：  使用期限--"+Usedate+"    商品颜色：  "+color);
	}
	//进行重载。 


	public static void main (String[] args){
		People zero=new People();
		zero.Gender();
		People a=new People();
		a.Gender("Male",100000);
		People b=new People();
		b.Gender("Female",365,"bright");
		Man c=new Man();  
		c.Gender("realMale",24);//重写Gender(String,float);
		Woman d=new Woman();
		d.Gender();               //重写Gender();
		Bisexual e=new Bisexual();
		e.Gender();              //重写Gender();
		
		People f=new Man();     //多态的使用 ，f和g同一类型，调用同一Gender方法，呈现不同效果。
		f.Gender("多态多态",66666);
		People g =new Woman();
		g.Gender();

	}
}
```
```
Man.java  //重写Gender(String , float );方法
---
package overload;

public class Man extends People {
  public void Gender(String Male,float Price){
	  System.out.println(Male+" 去逛商城真正关注的是时间，时间即为money:" +Price);
  }
}

```
```
Woman.java //重写Gender();方法
---
package overload;

public class Woman extends People {
	public void Gender(){
		System.out.println("女生逛商城岂不是开心就好？");
	}
}
```
```
package overload;
Bisexual.java //重写Gender();方法
---
public class Bisexual extends People {
  public void Gender(){ 
	  System.out.println("此类型超纲。。。");
  }
}
``` 
 


----------


-  什么是单例模式？
 

  
>- 三元素
1. 构造方法私有化
2. 静态属性指向实例
3. public static的 getInstance方法，返回第二步的静态属性

----------








----------

 
 -  解释一下static关键字，并举例.
  -   方便在没有创建对象的情况下来进行调用（方法/变量）。
     -   在static中不能访问非静态成员方法和非静态成员变量，但是在非静态成员方法中是可以访问static成员方法/变量的。
     
```
//不可执行部分已用注释。
public class Static {
	private static String str1 ="staticExample";
	private String str2="examle";


	public void Object(){

	}

	public void print1(){
		System.out.print(str1); //非静态中可以访问静态成员及变量。
		System.out.print(str2);
		print2();
	}
	public static void print2(){
		System.out.print(str1);
		//System.out.print(str2);   静态中不可访问非静态成员和变量。
		//print1();
	}

	public static void main(String[] args){
		//print1();
		print2();
	}

}

```

    
  -   static关键字可用来形成静态代码块以优化程序性能。特性:只会在类加载的时候执行一次


eg.

    -   static是不允许用来修饰局部变量。
 
 


----------


 -  解释内部类。
   -  内部类分为四种： 
     -     非静态内部类 
     >非静态内部类可以直接在一个类里面定义,new 外部类().new 内部类().
     非静态内部类对象只有在一个外部类对象存在的时候才有意义， 所以其实例化必须建立在一个外部类对象的基础之上。
     -      静态内部类
>>与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
语法：new 外部类.静态内部类();
因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
     -   匿名类 
     >>>匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
通常情况下，要使用一个接口或者抽象类，都必须创建一个子类。
有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
这样的类，叫做匿名类
     -     本地类
    >>>>  本地类可以理解为有名字的匿名类 
与内部类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。 
本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方




----------


  
 -    集合和泛型。
-  List及其实现类
 
 
 
- Set及其实现类
- Map及其实现类
 -  举例告诉我们，为什么要用泛型.
 


----------


 -  异常/捕捉。举个例子来演示一下try...catch...finally的流程。


-   运行时异常： 至少五个：
      -       NoSuchElementException
      -       NullPointerException
      -       ConcurrentModificationException
      -       ClassCastException
      -       IndexOutofBoundsException
   

```
package exception;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
public class TestException {
 
    public static void main(String[] args) {
         
        File f= new File("d:/yvon.exe");
         
        try{
            System.out.println("试图打开 d:/yvon.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/yvon.exe不存在");
            e.printStackTrace();
        }
        finally{
            System.out.println("无论文件是否存在， 都会执行的代码");
        }
    }
}
```



-  throw和throws的区别
   > throws 出现在方法声明上，而throw通常都出现在方法体内。
   >  throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象。


----------


 >*   
 IO编程。写个读写，复制文本文件，图片的程序。知道什么是序列化。
 4种：
 -  method1.逐个字节拷贝；
 -   method2.定义一个大数组（和文件大小相同），进行一次性拷贝。缺点：内存溢出；
 -    method3.定义一个小数组，进行多次拷贝；
 -   method4.BufferedInputStream&BufferedOutputStream。
 
``` 

//1.逐个字节进行拷贝；

package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import javax.tools.FileObject;

public class NewTest1 {
	public static void main(String[] args) throws IOException{
		//method2();
		//method1();
		//method3();
		method4();
		
	}

 //method4.BufferedInputStream&BufferedOutputStream。
	private static void method4() throws FileNotFoundException, IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("IOFile.avi"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("JTFile.avi"));
		int b;
		while ((b=bis.read())!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
// -   method2.定义一个大数组（和文件大小相同），进行一次性拷贝。缺点：内存溢出；
	private static void method2() throws FileNotFoundException, IOException {
		FileInputStream fis=new  FileInputStream("IOFile.avi");
		FileOutputStream fos=new FileOutputStream("newFile.avi");
		byte []arr=new byte[fis.available()];
		fis.read(arr);
		fos.write(arr);


		fis.close();
		fos.close();
	}



// -    method3.定义一个小数组，进行多次拷贝；

	private static void method3() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("JT.jpg");
		FileOutputStream fos=new FileOutputStream("timberlake.jpg");
		int b;
		byte arr[]=new byte[1024] ;
		while ((b=fis.read(arr))!=-1) {
			fos.write(arr, 0, b);

		}
		fis.close();
		fos.close();
	}
// -  method1.逐个字节拷贝；
	private static void method1() throws FileNotFoundException, IOException {
		FileInputStream fis=new  FileInputStream("aaa.txt");
		FileOutputStream fos=new FileOutputStream("bbb.txt");
		int b ;
		while ((b=fis.read())!=-1) {
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}

```


-  网络编程。能写个简单的socket发送/接收程序。


-  多线程。这个你能写个程序证明一下ArrayList类是线程不安全的就行。


-  能不能写个程序，读取Mysql数据库里的随便什么表，并显示出来。**

```
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Select {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8",
                "root", "admin"); java.sql.Statement s = c.createStatement();) {
 
            String sql = "select * from hero";
 
            // 执行查询语句，并把结果集返回给ResultSet
            java.sql.ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");// 可以使用字段名
                String name = rs.getString(2);// 也可以使用字段的顺序
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
            }
            // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
```
----------
这周内就以上的知识进行逐一自查，打补丁QUQ。
11.20 --还需要巩固的点：单例  异常分析  IO 。  内部类举例晚上完成。static代码块优化。

----------


Git 使用到的基本命令
---

描述分别都是怎么使用，表达什么意思。 

 - cat      //**
 - rm
 - add
 - status
 - diff
 - log
 - commit -m " "
 - reset --hard HEAD^^^ 
 - reset --hard <ID>
 - reflog
 - ssh-keygen -t rsa -C "youremail@example.com"
 - remote add origin git@github.com:Yvon/learn.git
 -   git remote rm origin
 -   git push origin master
 -   git clone git@github.com:Yvon/skills.git
 -   git checkout
 -   git checkout -b xxx
    -  git branch xxx
    -  git checkout xxx
 -  git branch -d 
 -  git merge 
 -  git merge --no-ff -m" " xxx
 -  git log --graph --pretty=oneline -abbrev-commit
 -  git stash
 -  git stash apply 
 -  git stash apply stash@{}
 -  git stash pop

----------






