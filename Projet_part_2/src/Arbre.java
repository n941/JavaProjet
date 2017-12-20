
public class Arbre extends AbstraitObstacle {
static int arbreInstance=0;
	
	//constructeur
	Arbre(Point p){
		super(p);
		super.symbID='2';
		super.position=p;
		arbreInstance++;
	}

}
