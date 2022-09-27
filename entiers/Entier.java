package entiers;



public class Entier {
	private static final int MIN_BORNE = 0;
	private static final int MAX_BORNE = 100;
	private int champValeur;
	
	public Entier (int champValeur){
		setchampValeur(champValeur);
	}
	
	public Entier (){
		this.champValeur = 0;
	}

	public void setchampValeur (int champValeur) {
		if (MIN_BORNE <= champValeur && champValeur <= MAX_BORNE) {
			System.out.println("le nb est compris entre "+MIN_BORNE+" et "+MAX_BORNE);
			this.champValeur = champValeur;
			}
	
		else {
			System.err.println("valeur hors des bornes");
			this.champValeur = 0;
		}
	}
	
	public int getChampValeur() {
		return champValeur;
	}

	public int incr(int n) {
		if (champValeur < MAX_BORNE) {
			champValeur = champValeur + n;
			return champValeur;
		}
		else return champValeur;
	}
	
	public void incr() {
		this.incr(1);
	}
	
	@Override
	public String toString() {
		return "Entier [champ_valeur=" + champValeur + "]";
	}
	public boolean equals (Entier a) {
		return this.champValeur == a.champValeur;
	}
}
