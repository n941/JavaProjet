
public final class Monstre extends AbstraitMalus {
	static int monstreInstance=0; //nombre d'instance creer 
	
	public Monstre(Point point) {
		// TODO Auto-generated constructor stub
		super(point);
		super.malus=-2;
		super.position=point;
		super.symbID='8';
		monstreInstance++;
		
		}

}
