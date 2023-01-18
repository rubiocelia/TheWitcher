package witcher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Witcher brujo = new Witcher();
		brujo.setName("Celia");
		brujo.setHealth(13);
		brujo.setHasSoul(true);
		if (brujo.isDeath()) {
			System.out.println(brujo.getName() + " esta viva");
		} else {
			System.out.println(brujo.getName() + " esta muerta");
		}
	}
}
