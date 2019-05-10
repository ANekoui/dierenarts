package dierenarts;

import java.util.ArrayList;
import java.util.Random;

public class Dierenarts {
ArrayList<String> behandeldeDieren = new ArrayList <>();
	void onderzoeken() {
		System.out.println("Het dier is ziek, ik ga beoordelen wat er aan de hand is.");
	}	
	int opereren (Assistent assistent, Dier dier) {
		Random prijs = new Random();
		int operatiePrijs = prijs.nextInt(30) + 20;
		if (dier.mank == true) {
		System.out.println("Het dier is mank en moet geopereerd worden");
		System.out.println("De prijs van de operatie is € " + operatiePrijs);
		dier.mank = false;
		}
		else {
		System.out.println("Het dier is niet mank, je moet alleen het consult betalen");
		operatiePrijs = operatiePrijs /2;
		System.out.println("De kosten voor het consult bedragen € " + operatiePrijs);
		}
		behandeldeDieren.add(dier.naam);
		return operatiePrijs;	
	}
	
	void tonenBehandeldeDieren() {
		System.out.println("Ik heb de volgende dieren behandeld:");
		for (String naam: behandeldeDieren) {
		System.out.println(naam);
		}
	}
}
