package tool;

import character.Save;

public class Item implements Save{
   String name;
  
   int price;
   
   public Item(){
	  
   }
   public Item(String name,int price){
	   System.out.println("这是物品： "+name+" 价格为： "+price );
   }
   
   public static void main(String[] args){
	   Item icearmor=new Item("冰甲",5300);
   }
	
}
