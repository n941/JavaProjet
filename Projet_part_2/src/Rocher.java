
public class Rocher extends AbstraitObstacle{
	static int rocherInstance=0;
	
	//constructeur
	Rocher(Point p){
		super(p);
		super.symbID='3';
		super.position=p;
		rocherInstance++;
	}

}
