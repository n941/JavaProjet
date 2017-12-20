/**
 * @author SANE Lamine
 *
 */
/**
 * 
 * La class Element 
 *
 */
public abstract class Element{
	//Attribut
	protected Point position;
	protected char symbID;
	static int elementInst=0;
	
	//Constructeur avec params
	Element(Point p){
		this.position=p;
		this.symbID='Z';
		elementInst++;
	}
	//Constructeur sans params
	Element(){
		position=new Point();
		position.X=0;
		position.Y=0;
		this.symbID='Z';
		elementInst++;
	}
	//Affichage générique 
	//@SuppressWarnings("static-access")
	public String toString() {
		String s="";
		s+=this.symbID;
		return s;
	};
	// methodes

	public Point getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}

	public void setPosition(Point p) {
		// TODO Auto-generated method stub
		this.position=p;
	}

	public char getSymb() {
		// TODO Auto-generated method stub
		return this.symbID;
	}
	
		

}
