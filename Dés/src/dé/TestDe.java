package dé;

public class TestDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		De x1 = new De("titi",8);
		System.out.println("le dé "+x1.getnom()+" a un total de : "+x1.getNbFaces()+" faces");
		De x2 = new De("gégé", 58);
		System.out.println("le dé "+x2.getnom()+" a un total de : "+x2.getNbFaces()+" faces"); 
		De x3 = new De("toto",120);
		x3.show();
		System.out.println(x3.lancer(4));

	}

}
