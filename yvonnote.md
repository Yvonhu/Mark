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
![HelloWorld](https://raw.githubusercontent.com/Yvonhu/Mark/master/HelloWorld.jpg)

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

 >   -    其实到这一步已经意识到自己在很多情况会选择暂时性的逃避问题。 
然后给自己设置了一个期限，自己心里提醒自己，在这截止时间到来之前必须完成这个问题。可事实上有时候在期限到来之时也并没有能够完成，甚至在问题初期遇到一点困难便停止了继续前进的步伐。
之前我一直把这个当成我有拖延至，其实压根不是。 我也是在选择逃避自己不熟悉的问题，这种逃避确实是一种对自己的短期的保护机制，让自己重新专注于其他不那么困难的事情，来代替继续直面这种困难，能让自己不那么压抑难受。 但是随着时间的增加， 我专注的不那么困难的事情并没有给我带来能力上的提升，而那我本应直面的问题，却随着时间的拖延，在造成很多现在看来是不那么好的结果。

>    *    而现在的在做的实习又何尝不是另一种在逃避问题的自我保护机制开启呢。实习至少能帮我再拖上两个月。  最初和杨老师商量讨论的目标，到现在还差着一篇sci，我在选题上迟迟没有进展，搜集到了数据，却也没有下定决心去落实下去。 反而是现在跑出来实习，想换个环境，也许会有新的思路。 但事实上自己却是又跳入了一个新的环境，重新干起了自己不擅长的事，重头开始学习起java，每天也至少学了六个小时，很认真，也有收获，学到新知识确实令自己欣喜，但整体来说，这种动力却很畸形。从大方面来说，自己却并不是很愉快。
-    java重要么？重要。程序员确实需要至少在一门编程语言上有所突破。但对于我来说，现阶段去花上半年钻研java，真的是好的么。自己是愿意写底层代码，还是继续做图像研究。 自己内心早就有答案了。
但为什么我还是来做了实习这件事儿呢-----------因为这样，我就暂时不用去面对卡在瓶颈却毫无解决思路的实验问题了，当然，还有自己所不确定的未来方向。      
-   意识到了问题，那么当前最优解------- 既然投入了时间来学了一部分java，怎样将这部分java知识与自己的图像处理联系起来呢？    那么毕业设计就按照这个思路重新规划吧。 完成实习后就回学校和杨老师重新谈谈。距离明年八月份，还有八个月时间，我现在首要的事情是，将想法思路落实到具体时间点上来。规划好每个月要完成什么，达成什么目标。 有了具体可执行的方案，自己或许才不会像之前一样迷失了吧。
-   12月5日至12月7日三天时间，晚上停止java学习，重新整理资料，做出时间轴规划。但是，白天时间，得把这个记账本软件做出来。 
加油。*

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
 
ADHero（物理攻击英雄） APHero（魔法攻击英雄）都是Hero的子类
ArrayList 默认接受Object类型的对象，所以所有对象都可以放进ArrayList中
所以get(0) 返回的类型是Object
接着，需要进行强制转换才可以得到APHero类型或者ADHero类型。
如果软件开发人员记忆比较好，能记得哪个是哪个，还是可以的。 但是开发人员会犯错误，比如第20行，会记错，把第0个对象转换为ADHero,这样就会出现类型转换异常


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
     throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象。*


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
>  *ArrayList是非线程安全的，换句话说，多个线程可以同时进入一个ArrayList对象的add方法
  借助Collections.synchronizedList，可以把ArrayList转换为线程安全的List。
  与此类似的，还有HashSet,LinkedList,HashMap等等非线程安全的类，都  通过工具类Collections转换为线程安全的*



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
一.算法/图像处理相关经历
      这些年弯路走的太多了，多到一旦遇到直路（顺境）就会警惕起来。但是从我记事起到现在我慢慢开始相信的是：做事情，心底要充满敬意，只有如此才能招福。学习也好，工作也好，还是应该认真点，虔诚点，用心做。对我来说，曾经的生活是反面例子，如今是在过去教训下的修正。

 

 - **人体下颌骨张口大小与口腔咀嚼肌之间的生物力学关系分析的实现**               **已发表EI检索论文**        2016.10--2017.06     
 
 - 利用ITK-SNAP图像处理软件强大的区域生长算法特性，独立完成144组人体头部MRI图像的分割，得到的口腔咀嚼肌分割图像可使用率96%。
 - 利用MATLAB对分割图像进行三维模型重建，调用K-means算法对三维模型进行量化，成功将模型量化为点阵，为模型配准提供了基础元素。
 - 利用3D Shape-context算法完成模型配准，并成功计算出口腔咀嚼肌的形变受力大小和方向。 
 - 通过MATLAB建立了GUI仿真界面，实现了咀嚼肌三维模型的功能可视化，为医学上咀嚼肌相关治疗提供了新的诊断方法。




 - **基于非刚性点集配准的咀嚼肌形变测量的实现   已发表SCI期刊论文**    2015.04--2016.08 

 - 利用MATLAB对 GLMDTPS, GLMDGRBF, CPD, TPS-RPM等点阵配准算法进行了测试，并对形变前后咀嚼肌图像进行24组配准实验，分别完成了肌肉的可视化，同时得到了不同算法的配准误差数据。
 - 根据误差的范围和种类，提出了一种新的测量和显示人体咀嚼肌变形的新方法，能够有效测量出肌肉的形变程度和健康状态。

本文针对困扰大家已久的拉屎压水花问题进行了内容翔实的研究，以影响水花溅起的三个因素为框架设计了系列实验，最后总结出了拉屎压水花的最优办法：当马桶中的水粘性大、表面张力小时，我们以动态相切的姿势拉出一根锥形尖头的细短屎时，溅起的水花最小。
  
>  笛子Ocarina//blog

----------


  

 - **.
   >  尽量使用定量，或者至少是定性的要素来界定，比如「主导过什么性质什么级别的项目」，「在算法建模或算法优化中的具体表现和指标」，「处理的数据量级和复杂非标程度」，「为实际的业务带来怎样的增长和价值提升」等等；
   
   >  3. 从我接触的为数不算多的算法领域人才的经验，能够解决什么样的问题可能是一个甄别的要点，这里最好能够详细阐述能够解决的问题的性质、范围、落地模式、复杂程度等等维度；**



----------
这周内就以上的知识进行逐一自查，打补丁QUQ。
11.20 --还需要巩固的点：单例  异常分析  IO 。  内部类举例晚上完成。static代码块优化。

----------
11.28 代码： 多线程：
>*      3个同步对象a, b, c
3个线程 t1,t2,t3
故意设计场景，使这3个线程彼此死锁*

>

>*  1. 使用栈来存放数据
1.1 把栈改造为支持线程安全
1.2 把栈的边界操作进行处理，当栈里的数据是0的时候，访问pull的线程就会等待。 当栈里的数据时200的时候，访问push的线程就会等待
2. 提供一个生产者（Producer）线程类，生产随机大写字符压入到堆栈
3. 提供一个消费者（Consumer）线程类，从堆栈中弹出字符并打印到控制台
4. 提供一个测试类，使两个生产者和三个消费者线程同时运行*

>

>  在 练习-同步查找文件内容 ，如果文件特别多，就会创建很多的线程。 改写这个练习，使用线程池的方式来完成。
初始化一个大小是10的线程池
遍历所有文件，当遍历到文件是.java的时候，创建一个查找文件的任务，把这个任务扔进线程池去执行，继续遍历下一个文件*


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







-  图像配准软件。

  -     j2SE桌面应用。
      - 功能：1.     




----------
三张表：

1.  消费金额记录表
2.  消费类型分类表
3.   预算金额总表


----------
5天前端仿出天猫计划。


----------


----------


一周SSM仿B出B站计划。

----------
每家IT公司招收特别是应届毕业生的时候，心里都清楚应试者目前的实力，他们要看的，是在面试过程中你展现给他们的诚恳的态度，不懈的决心，以及你未来对这家公司能做出的贡献的多少（也就是你的潜力）


----------
这里想提醒一点，在IT这个主要靠技术吃饭的行业里，对于应届毕业生来说，一个有用的程序（或者设计）是你最重的砝码，比那些拿着一对“没用”的证书（单指IT行业）来面试的人，更让面试官刮目相看。


----------
邮件主题和简历文件名叫“姓名-求职意向.pdf”，或者“姓名-城市-求职意向(-学校).pdf”，如果不在意工作地点就不用写地点，绝对避免“个人简历.pdf”


----------
一个好的简历包含以下几个部分：

联系信息
教育信息
项目经验
技术能力
其它加分项
根据你个人的强项和弱项，以上各部分的顺序可以调整（除了联系信息），调整顺序的时候参考第3条。


----------
2-3句话描述你做了哪些工作（不是你的职位描述，而是你做了哪些内容。比如不要写“负责xx网首页的前端开发”，而要写“对xx网首页进行了前端改版，达到了xx效果，包括产品销售的提升、质量提升”）


----------

让我们直面这个问题，如果你的学历是短板，那么你可以从两方面来解决它。第一种方法是补上短板，你可以去上一些培训课程（我强烈建议你上国外的一手技术课程，而不要上国内的二手培训班）。第二种方法是在其它方面来提升你的竞争力，比如全绿的github提交项、开源文档的翻译、图书出版，甚至雅思高分等。如果一直觉得自己学历是短板，又不提升其它方面，那其实学历并不是短板，而是你的学习能力的真实体现。




----------
1、尽量避免主观表述，少一点语义模糊的形容词，除非是大公司大牛，已经有成果撑腰，否则慎用「熟悉… …」、「使用过… …」


----------
2、多一点表意清楚，语气肯定的数量词、名词、成果描述。一定要将自己的优势和期望明晰地表达出来，便于招聘方能对候选人有更准确的定位：介绍技术：最近几份工作经历中所参与过的产品、项目、角色 在工作中做的项目的技术细节克服过的技术难点与细节感兴趣的技术在程序马拉松上参加的项目或者是业余的个人项目（+link）如果领导过技术团队，写下带的团队的规模与管理风格


------
讲过程。


----------
项目经历：删掉个人体会，浓缩责任描述和项目简介，你的重点应该放在你在这个项目中运用了哪些技术，是怎么运用的。你大段大段的文字表述中，没几句是跟所用的开发技术相呼应的。

算法的核心原理
强调算法的话如何去写。？
项目论文中 算法起到的作用，（自己在这里面体现能力的地方），达到了什么样的效果。 
避免空洞的话，得用实例去支撑，那么问题来了，如何描述。 在人体最大张口和口腔咀嚼肌生物力学关系分析过程中，哪些部分用到了算法，（反过来写，在用到算法的这些部分里，突出我的作用，起到的结果就是论文实验具体的应用点，【能够将咀嚼肌功能可视化啊，以前计算不出来力的大小和方向，现在能够计算了。 】）

----------
数据结构--基础算法---刷题。