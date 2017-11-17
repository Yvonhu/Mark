***# Java基础学习笔记
Note1
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
 
 >* 重载特点：同一个方法，参数类型和个数不同。需要哪个调用哪个。
 >* 重写特点：子类继承父类类方法的时候,可以不同个子类对同一个父类方法进行不同的改写，从而达到不同的作用。



----------


----------

 -    写个例子演示一下，什么是多态，多态的作业。
 
 -  解释一下static关键字，并举例.
 
 
 -  解释内部类。
 
 -    集合和泛型。
-  List及其实现类
 
 
 
- Set及其实现类
- Map及其实现类
 -  举例告诉我们，为什么要用泛型.
 
 -  异常/捕捉。举个例子来演示一下try...catch...finally的流程。
 -  IO编程。写个读写，复制文本文件，图片的程序。知道什么是序列化。
 -  网络编程。能写个简单的socket发送/接收程序。
 -  多线程。这个你能写个程序证明一下ArrayList类是线程不安全的就行。
 -  能不能写个程序，读取Mysql数据库里的随便什么表，并显示出来。**


----------
这周内就以上的知识进行逐一自查，打补丁QUQ。


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






