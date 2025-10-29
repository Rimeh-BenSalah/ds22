package ds22;

public class Createur extends Carte{
	private String nom;
	private int nombredegats;
	private int nombrevie;
	public Createur(int cout,String nom,int nombredegats,int nombrevie) {
		super(cout);
		this.nom=nom;
		this.nombredegats=nombredegats;
		this.nombrevie=nombrevie;
	}
	@Override
    public String toString() {
        return "UN creature"+" "+super.cout+" "+nom+" "+nombredegats+" "+nombrevie ;
    }
	
}
