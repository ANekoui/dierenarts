package dierenarts;

import java.util.ArrayList;

public class Dier {
	String naam;
	boolean mank;
	int geld;

	Dier() {
	}

	Dier(String naam, boolean mank, int geld) {
		this.naam = naam;
		this.mank = mank;
		this.geld = geld;

	}

	void lopen() {
		System.out.println("Het dier loopt mank");
	}

	void vertellen() {
		System.out.println("Hallo ik ben dier " + this.naam + ", loop ik nog mank?" + "Mank-status: " + this.mank
				+ " In mijn portemonnee heb ik nog " + this.geld + " euro.");
	}

	void naarHuis(ArrayList<Dier> dieren) {
		for (Dier a : dieren) {
			if (a.mank == false) {
				System.out.println("Het dier is genezen en gaat naar huis!");
				dieren.remove(a);
			} else {
				System.out.println("Het dier is nog niet genezen, roep de assistent");
			}
		}
	}

}
