package character;

public class Hero implements Save {
	 String name;
	    int hp;
	    int mp;
	    
	   
		public void Hero(){
	    	
	    }
	    
	    public Hero(String name,int hp,int mp){
	    	this.name=name;
	    	this.hp=hp;
	    	this.mp=mp;
	      System.out.println("���֣� "+name+"Ѫ���� "+hp+"ħ����  "+mp);
	    }
	    
	    
	    public static void main (String[] args){
	    	Hero riven=new Hero("����",500,0);
	    }
}
