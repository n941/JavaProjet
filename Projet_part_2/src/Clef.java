
public class Clef extends AbstraitBonus{
	static int clefInstance=0;//nombre d'instance de clef créé
	
	
	public Clef(Point p) {
		// TODO Auto-generated constructor stub
			super(p);
			super.bonus=1;
			super.symbID='4';
			super.position=p;
			clefInstance++;
			}


	@Override
	public int gain() {
		// TODO Auto-generated method stub
		return this.bonus;
	}

}
