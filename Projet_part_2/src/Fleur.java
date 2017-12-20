
public class Fleur extends AbstraitDecor{
	static int fleurInstance=0;
	
	Fleur(Point p){
		super(p);
		super.symbID='1';
		super.position=p;
		fleurInstance++;
	}
	
}
