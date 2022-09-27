package entiers;

public class TestEntier {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entier x1 = new Entier(79);
		Entier x2 = new Entier(80);
		EntierFou x3 = new EntierFou(3, 79);
		System.out.println(x1);
		x1.incr();
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x1.equals(x2));
		x3.incr();
		System.out.println(x3);
	}
}

