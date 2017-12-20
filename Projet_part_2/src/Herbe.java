
public class Herbe extends AbstraitDecor {
	static int herbeInstance=0;
	
	Herbe(Point p){
		super(p);
		super.symbID='0';
		super.position=p;
		herbeInstance++;
	}

}
