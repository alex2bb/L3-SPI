package dé;
import java.util.*;

public class De {
	protected String nom;
	private int nbFaces;
	private static final int MINFACES = 3;
	private static final int MAXFACES = 120;
	public static final int NBFACES_DEFAULT = 6;
	private static int iterDe;
	private static Random r = new Random();
	

	De(String nom, int nbFaces){
		iterDe++;
		setNbFaces(nbFaces);
		if ((nom != null) && (nom != ""))
			this.nom = nom;
		else 
			this.nom = "De n° : "+ iterDe;
	}
	
	De(){
		this(null, NBFACES_DEFAULT);
	}
	De(int nbFaces){
		this(null, nbFaces);
	}
	De(String nom){
		this(nom, NBFACES_DEFAULT);
	}
	
	public void setNbFaces(int nbFaces) {
		if ((nbFaces < MINFACES)||(nbFaces > MAXFACES))
			System.err.println("erreur nb de faces incorrect");
			else this.nbFaces = nbFaces;
		}
	
	public void show() {
		System.out.println("le dé "+this.getnom()+" a un total de : "+this.getNbFaces()+" faces");
	}
	
	public String getnom() {
		return nom;
	}
	
	public int getNbFaces() {
		return nbFaces;
	}
	public int lancer(){
		return r.nextInt(this.getNbFaces()+1);
	}
	
	public int lancer(int nbLancer) {
		int deMax = 0;
		int deCourant  = 0;
		for (int i=0; i < nbLancer; i++) {
			deCourant = lancer();
			if (deMax < deCourant)
				deMax = deCourant;
		}
	return deMax;
	}

	public String toString() {
		return "De [nom=" + nom + ", nbFaces=" + nbFaces + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		De other = (De) obj;
		return nbFaces == other.nbFaces && Objects.equals(nom, other.nom);
	}
	
	
}

	
