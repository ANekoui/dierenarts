package dierenarts;

import java.util.ArrayList;

public class Praktijk {
	
	Assistent assistent1 = new Assistent();
	ArrayList<Dier> dieren = new ArrayList<>();
	
	void openen() {
		
		System.out.println("Welkom bij het praktijk");
		dieren.add(assistent1.aanmelden("Pietje", true, 500));
		dieren.add(assistent1.aanmelden("Ham", false, 78));
		dieren.add(assistent1.aanmelden("IJs", true, 8));
		dieren.add(assistent1.aanmelden("Beer", true, 52));
			
	}
	
	void consultatie() {
			
	}

}
