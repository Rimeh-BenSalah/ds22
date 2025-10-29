package ds22;

public class Magic {

	public static void main(String[] args) {
		Jeu maMain = new Jeu(10);
		 Terrain t = new Terrain("B");
		 maMain.ajouter(t);
		 Createur c = new Createur(6, " Gobelin", 4, 6);
		 maMain.ajouter(c);
		 Sortileges s=new Sortileges(1, "Amplificatum","Il augmente la taille de l'objet oude l'animal visé");
		 maMain.ajouter(s);
		 System.out.println("Là, j'ai en stock :");
		 maMain.affiche();
		 maMain.jouer();
	}

}
