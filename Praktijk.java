package dierenarts;

import java.util.ArrayList;

public class Praktijk {
	
	Assistent assistent1 = new Assistent();
	ArrayList<Dier> dieren = new ArrayList<>();
	
	void openen() {
		
		System.out.println("Welkom bij het praktijk");
		dieren.add(Assistent.aanmelden("Pietje", true, 500));
		dieren.add(Assistent.aanmelden("Ham", false, 78));
		dieren.add(Assistent.aanmelden("IJs", true, 8));
		dieren.add(Assistent.aanmelden("Beer", true, 52));
			
	}
	
	void consultatie() {
			
	}

}
