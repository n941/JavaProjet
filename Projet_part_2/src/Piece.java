
public class Piece extends AbstraitBonus{
	static int pieceInstance=0; //nombre d'instance de piece en  cours
	
	public Piece(Point point) {
		// TODO Auto-generated constructor stub
		super(point);
		super.bonus=1;
		super.position=point;
		super.symbID='5';
		pieceInstance++;
	}

	@Override
	public int gain() {
		// TODO Auto-generated method stub
		return super.bonus;
	}

	@Override
	public char getSymb() {
		// TODO Auto-generated method stub
		return this.symbID;
	}

}
