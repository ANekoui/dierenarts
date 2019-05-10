package dierenarts;

public class Dier {
	String naam;
	boolean mank;
	int geld;
	
	Dier(String naam, boolean mank, int geld){
		this.naam = naam;
		this.mank = mank;
		this.geld = geld;
		
	}
	
	void lopen() {
		System.out.println("Het dier loopt mank");
	}
	
	void vertellen() {
		System.out.println("Hallo ik ben dier " + this.naam + ", loop ik nog mank?" + "Mank-status: " + this.mank + " In mijn portemonnee heb ik nog " + this.geld + " euro.");
	}
}
