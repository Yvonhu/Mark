package generic;

import java.util.List;
import java.util.ArrayList;

import character.ADhero;
import character.Hero;
//import character.Save; Hero和Item共同的接口。  
import others.TimeClock;
import tool.Item;

public class TestGeneric {

	public static void main(String[] args){
		//List<Save>generichero=new ArrayList<Save>();//泛型，载入接口的Hero和Item对象都可以存入该arraylist。
		List generichero=new ArrayList();
		
		
		generichero.add(new Hero("金克斯", 200, 300));
	    generichero.add(new Item("强袭",7000));
		generichero.add(new ADhero("赵信", 500, 7000));//Hero的子类也可以存入。
		generichero.add(new TimeClock(300));//使用泛型后会报错。
		
		
	}
	
}
