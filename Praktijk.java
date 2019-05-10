package dierenarts;

import java.util.ArrayList;

public class Praktijk {
	
	Praktijk() {
		openen();
	}
	
	Assistent assistent1 = new Assistent();
	Dierenarts arts = new Dierenarts();
	ArrayList<Dier> dieren = new ArrayList<>();
	
	void openen() {
		
		System.out.println("Welkom bij de praktijk");
		dieren.add(assistent1.aanmelden("Pietje", true, 500));
		dieren.add(assistent1.aanmelden("Ham", false, 78));
		dieren.add(assistent1.aanmelden("IJs", true, 8));
		dieren.add(assistent1.aanmelden("Beer", true, 52));
			
	}
	
	void consultatie() {
		
		for (Dier dier : dieren) {
			if (dier.mank) {
				arts.opereren(assistent1, dier);
			}
		}
			
	}
	
	

}
