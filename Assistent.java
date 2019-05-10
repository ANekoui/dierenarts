package dierenarts;

public class Assistent {
		
	void assisteren() {
		System.out.println("Ik assisteer de dierenarts wel even met het zieke dier, hij/zij kan het niet alleen");
	}
	Dier aanmelden(String naam, boolean mank, int geld) {
		Dier tijdelijkDier = new Dier();
		tijdelijkDier.naam = naam;
		tijdelijkDier.mank = mank;
		tijdelijkDier.geld = geld;

		System.out.println("Oh je, " + tijdelijkDier.naam + " is mank. Gelukkig heeft het dier " + tijdelijkDier.geld + " bij zich en kan de rekening misschien betalen."));
		
		return new Dier();
	}
}
