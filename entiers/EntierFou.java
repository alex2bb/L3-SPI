package entiers;
import java.lang.Math;

public class EntierFou extends Entier {
	
	private int niveauDeFolie=0;
	
	public EntierFou(int champValeur, int niveauDeFolie) {
		super(champValeur);
		this.niveauDeFolie = niveauDeFolie;
	
	}
	
	public void incr() {
	
		int r = (int)(Math.random() * niveauDeFolie);
		super.incr(r);
		
		
	}
}
