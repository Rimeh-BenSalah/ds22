package ds22;

public class Jeu {
	private Carte[] TabCartes;
	private int nb=0;
	public Jeu(int taille) {
        this.TabCartes = new Carte[taille];
    }
	public void ajouter(Carte c) {
		if (this.nb>10){
            System.out.println("erreur ");
        }
        else{
            this.TabCartes[this.nb]=c;
            this.nb++;
            if (c instanceof Terrain){
				System.out.println("un nouveau terrain");
		        }
			if (c instanceof Createur){
				System.out.println("une nouvelle creature");
		        }
			if (c instanceof Sortileges){
				System.out.println("un sortilege de plus");
		        }
        }

	}
	public void jouer() {
		  int i=0;
	        while(TabCartes[i]==null){
	            i++;
	        }
	        System.out.println("la carte est jouée :"+TabCartes[i].toString());
	        TabCartes[i]=null;
	}    

	public void affiche() {
		for(int i=0;i<nb;i++){
			System.out.println(TabCartes[i].toString());
		}

	}
}
