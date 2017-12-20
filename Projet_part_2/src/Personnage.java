
public class Personnage extends Element {
	//ATTRIBUT
	
	//Constructeur 
	Personnage(){
		
		super.position=new Point();
		super.position.X=0;
		super.position.Y=0;
		super.symbID='X';
	}
	Personnage(Point p){
		position= new Point();
		this.position=p;
		this.symbID='X';
	}
	
	//Methodes 
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	public char getSymb(){
		return this.symbID;
	}
	public void setPosition(Point p) {
		// TODO Auto-generated method stub
		this.position=p;
	}
	
	public int deplacer() {
		
		
		
		
		return 1;
	}
	
}
