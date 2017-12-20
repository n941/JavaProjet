
public class Cadenas extends Element{
	//Attribut
	private int bonus;
	static int cadenasInstance=0;
	
	Cadenas(Point p){
		super.position=p;
		this.bonus=2;
		super.symbID='6';
		cadenasInstance++;
	}
	/*@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}
	@Override
	public void setPosition(Point p) {
		// TODO Auto-generated method stub
		this.position=p;
	}

	@Override
	public char getSymb() {
		// TODO Auto-generated method stub
		return this.symbID;
	}*/

	public int gain() {
		// TODO Auto-generated method stub
		return  this.bonus ;
	}

}
