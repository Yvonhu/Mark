package tool;

import character.Save;

public class Item implements Save{
   String name;
  
   int price;
   
   public Item(){
	  
   }
   public Item(String name,int price){
	   System.out.println("������Ʒ�� "+name+" �۸�Ϊ�� "+price );
   }
   
   public static void main(String[] args){
	   Item icearmor=new Item("����",5300);
   }
	
}
