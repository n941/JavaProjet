import java.util.Scanner;

public class Player {
	//attribut
	private String nom;
	private int score;
	private int pdv;
	private int nb_clef;
	protected int choix_usr[]; //Table des quantite d'Element Choix par l'utilisateur
	
	enum element{
		herbe, fleur, arbre, rocher, clef, piece,
		cadenas, piege , monstre
	}
	
	
	//protected int id;
	//constructeur
	Player(){
		int i=0;
		this.choix_usr=new int[9];
		this.score=0;
		this.pdv=10;
		this.nb_clef=0;
		
		System.out.println("Quel est votre nom ?");
		this.nom=new Scanner(System.in).nextLine();
		
		
		
		Scanner saisi= new Scanner(System.in);
		
		/*
		for(element Element: element.values())
		{
			do {
				System.out.println("Saisir la quantité de "+Element);
				choiseQtElement[i]=saisi.nextInt();
			}while(choiseQtElement[i]<5 || choiseQtElement[i]>199);
			i++;
		}
		for(int x : choiseQtElement)
		{
			System.out.println("x:"+x);
		}
		//this.id=ID;//a generer a la creation du joueur*/
	}
	//Affichage generique
	public String toString() {
		return "Score:"+score+"\tVie:"+pdv+"\tClef:"+nb_clef;
	}
	//methodes
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPdv() {
		return pdv;
	}
	public void setPdv(int pdv) {
		this.pdv = pdv;
	}
	public int getNb_clef() {
		return nb_clef;
	}
	public void setNb_clef(int nb_clef) {
		this.nb_clef = nb_clef;
	}

	public int[] choixQtElementConsole() {
		
		return this.choix_usr;
	}
	
}
