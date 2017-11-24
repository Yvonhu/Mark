package generic;

import java.util.List;
import java.util.ArrayList;

import character.ADhero;
import character.Hero;
import character.Save;
import others.TimeClock;
import tool.Item;

public class TestGeneric {

	public static void main(String[] args){
		//List<Save>generichero=new ArrayList<Save>();
		List generichero=new ArrayList();
		
		
		generichero.add(new Hero("金克斯", 200, 300));
	    generichero.add(new Item("强袭",7000));
		generichero.add(new ADhero("赵信", 500, 7000));
		generichero.add(new TimeClock(300));
		
		
	}
	
}
