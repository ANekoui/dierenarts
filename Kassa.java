package dierenarts;

class Kassa extends Assistent {
	int operatiePrijs;
	String dierSoort;

	void rinkelen() {
		System.out.println("Kassa rinkelt");
	}

	void afrekenen(Dier hetDier, int operatiePrijs) {
		rinkelen();
		System.out.println("Welkom bij de kassa: de operatie kost " + operatiePrijs);
		if (operatiePrijs > hetDier.geld) {
			System.out.println("Geld is niet genoeg: ga de instrumenten maar afwassen.");
		} else if (operatiePrijs >= hetDier.geld || operatiePrijs <= hetDier.geld) {
			System.out.println("Hier heb je de bon en veel beterschap gewenst.");
		}
	}
}
