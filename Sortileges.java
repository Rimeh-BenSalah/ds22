package ds22;

public class Sortileges extends Carte{
	private String nom;
	private String exp;
	public Sortileges(int cout,String nom,String exp) {
		super(cout);
		this.nom=nom;
		this.exp=exp;
	}
	@Override
    public String toString() {
        return "Un sortilege"+" "+super.cout+" "+nom+" "+exp ;
    }
}
