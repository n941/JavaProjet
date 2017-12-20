import java.util.*; 
import java.*;

public class Carte {
	private Element tab[][];
	private int tmcj;
	private Player joueur;
	
	//Constructeur
	Carte(){
		tmcj=20;
		tab= new Element[tmcj][tmcj];
		joueur= new Player();
	}
	//Affichage Generique dans la console
	public String toString() {
		String s="";
		int i=0,j=0;
		
		for(i=0; i<tab.length;i++) {
			for(j=0;j<tab.length;j++) {
				s+=tab[i][j]+" ";
			}s+='\n';
		}
		return s;
	}
	//methodes
	
	/***
	 * 
	 *
	 * @param args
	 */
	public void InitialiserCarte() {
		
		int i,j,r,n,nb_case_init=0;
		//nt fleur=0, arbre=0, rocher=0, clef=0, piece=0, cadenas=0, piege=0, monstre=0;
		//int v=0, cpt=0;
		Point position = new Point();
	
		ArrayList<Integer> al_n;
		//Recuperation de la config de jeu choisi par le joueur
		int[] usr_qtE= joueur.choixQtElementConsole();
		

		
		
		al_n= new ArrayList<Integer>();//creation d'une liste pour case tableau tirer
		
		while(nb_case_init<400){//5

			/*1*
				1)Tire une valeur aleatoire compris entre 0 et 399
				2)Verifie que la case tire ne l'as pas deja ete
				3)sinon on tire une autre valeur tant quelle apparait dans la liste
			*1*/

			do{
				n=(int)(Math.random()*400); // Tire une case du tableau aléatoirement
			}while(al_n.contains(n));

			if (al_n.contains(n)==false){//3
				al_n.add(n);//inscription du numero de case tire dans la liste
				i=n/20; //restitution de la ligne
				j=n%20;//restitution de la colonne
				//*1**Save****memorisation de la position de la case pour l'objet Element
				position.X=i; 
				position.Y=j;

				r=(int)(Math.random()*8); //tire une valeur comprise entre 0 et 9
				

/*info debogue*/		System.out.println("r="+r+" "+"i="+i+" "+"j="+j+" "+"case initialisé:"+nb_case_init);
/*info debogue*/		System.out.println("Instance en cours:\n"+"Herbe:"+Herbe.herbeInstance+"\tFleur:"+Fleur.fleurInstance+
										"\tRocher:"+Rocher.rocherInstance+"\tClef:"+Clef.clefInstance+"\tPiece:"+Piece.pieceInstance
										+"\tCadenas:"+Cadenas.cadenasInstance+"\tPiege:"+Piege.piegeInstance+"\tMonstre:"+Monstre.monstreInstance);
				
				//if(joueur.choixQtElementConsole()==joueur.choixQtElementConsole());
System.out.println("r:"+r);
				
				if/*((r==1 && (Fleur.fleurInstance<(usr_qtE[r])))
						||(r==2 &&(Arbre.arbreInstance<usr_qtE[r])))
						||((r==3 && (Rocher.rocherInstance<(usr_qtE[r]))))
						||*/ (r==4 && (Clef.clefInstance<(usr_qtE[r]))) /*
						|| (r==5 && (Piece.pieceInstance<=(usr_qtE[r])) )
						|| (r==6 && ( (Cadenas.cadenasInstance!=Clef.clefInstance) || (Cadenas.cadenasInstance<=(usr_qtE[r])) )) 
						|| (r==7 && (Piege.piegeInstance <=(usr_qtE[r]))) 
						|| (r==8 && (Monstre.monstreInstance <=(usr_qtE[r]))) */
						{//1*/
					//Creations des Objets
					switch(r) {
					
					case 0:
						tab[i][j]= new Herbe(position);
						
						break;
					case 1:
						tab[i][j]= new Fleur(position);
						
						break;
					case 3:
						tab[i][j]= new Rocher(position);
						
						break;
					case 4:
						tab[i][j]= new Clef(position);
						
						break;
					case 5:
						tab[i][j]= new Piece(position);
						
						break;
					case 6:
						tab[i][j]= new Cadenas(position);
						
						break;
					case 7:
						tab[i][j]= new Piege(position);
						
						break;
					case 8:
						tab[i][j]= new Monstre(position);
						
						break;
					}
					

			//		if(r==1)fleur++; if(r==2)arbre++;
			//		if(r==3)rocher++; if(r==4)clef++;
			//		if(r==5)piece++; if(r==6)cadenas++;
			//		if(r==7)piege++; if(r==8)monstre++;
				}//1
				else{//2
					tab[i][j]=new Herbe(position); //met de l'herbe
				}//2*/

				nb_case_init++;

			}//3
		}//=5
		/* Verification du remplissage du tableau */
		/*A decommenter pour afficher le nombre d'elements dans le tableau*/
		System.out.println("nombre de case initialisé:"+nb_case_init++);
	/*	while(v<9){
			for(i=0;i<tab.length;i++){
				for(j=0;j<tab.length;j++){
					if(tab[i][j]==Symb[v])cpt++;
				}
			}
			System.out.print(Symb[v]+":"); System.out.println(cpt);
			v++;cpt=0;
		}
	*/
		tab[0][0]=new Personnage();//placement du personnage en position (0,0)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carte map= new Carte();
		map.InitialiserCarte();
		System.out.println(map);

	}

}
