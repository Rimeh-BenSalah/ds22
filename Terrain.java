package ds22;

public class Terrain extends Carte{
	private String couleur;
	public Terrain (String couleur) {
		super(0);
		this.couleur=couleur;
	}
	@Override
    public String toString() {
        return "Un terrain "+" "+couleur;
    }
}
