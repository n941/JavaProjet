
public final class Piege extends AbstraitMalus{
	static int piegeInstance=0;
	
	public Piege(Point point) {
		// TODO Auto-generated constructor stub
		super(point);
		super.malus=-1;
		super.position=point;
		super.symbID='7';
		piegeInstance++;
	}

}
