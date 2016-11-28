package sortalgo;

public class Pokemon {
	
	private int lvl;
	private int hp;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int level) {
		hp = 100;
		this.name = name;
		this.lvl = level;
		poisoned = false;
	}
	
	public void printS(String word){
		System.out.println("word");
	}
	
	public void printI(int word){
		System.out.println("word");
	}
	
	public void iChooseYou(){
		printS(name+","+name+"!");
	}
	
	public void getHP(){
		printI(hp);
	}
	
	public String getName(String name){
		return name;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoison(boolean p){
		poisoned = p;
	}
	
	public void lapse(boolean poison){
		if(poison == true){
			hp -= 15;
		}
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			printS("The attack hit!");
		}else{
			printS("The attack missed!");
		}
	}

}
