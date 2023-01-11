package witcher;

public class Witcher {

	private String name;
	private int health;
	private boolean hasSoul;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isHasSoul() {
		return hasSoul;
	}

	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}
	
	public boolean isDeath() {
		if(health==0) {
			return true;
		}else if(hasSoul==false){
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Witcher brujo = new Witcher();
		brujo.setName("Celia");
		brujo.setHealth(13);
		brujo.setHasSoul(true);
		if(brujo.isDeath()) {
			System.out.println(brujo.getName()+" esta viva");
		}else {
			System.out.println(brujo.getName()+" esta muerta");
		}
	}

}
