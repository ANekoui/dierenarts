package dierenarts;

import java.util.Scanner;

public class Assistent {
	Scanner sc = new Scanner(System.in);
	void assisteren() {
		System.out.println("Welkom dier. Om u aan te melden bij deze kundige prakrijk, heb ik nog wat gegevens nodig. \nWat is uw naam? ");
		String naamDier = sc.nextLine();
		System.out.println("Loopt u mank? ja/nee");
		String inputDier = sc.nextLine();
		boolean mankDier = inputDier.equals("ja") ? true:false;
		System.out.println("Hoeveel geld heeft u beschikbaar voor de behandeling?");
		int geldDier = sc.nextInt();
		aanmelden(naamDier, mankDier, geldDier);
			}
	
	Dier aanmelden(String naam, boolean mank, int geld) {
		Dier tijdelijkDier = new Dier();
		tijdelijkDier.naam = naam;
		tijdelijkDier.mank = mank;
		tijdelijkDier.geld = geld;
		
		
		if (mank == true) {
			System.out.println("Hallo " + tijdelijkDier.naam + ". Het is goed dat je bent gekomen, je bent ziek. Ik stuur je naar de dierenarts.");
			
		}else {
		System.out.println("Oh je bent niet mank, " + tijdelijkDier.naam + ". Wat doe je hier? Je kan de helft van je " + tijdelijkDier.geld + " euro's beter aan een lekker ijsje besteden. \nDe dierenarts gaat je vertellen wat je met de rest van het geld moet doen.");
		}
		
		return tijdelijkDier;
	}
}
