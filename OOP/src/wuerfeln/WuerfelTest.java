package wuerfeln;

import java.util.Scanner;

import Wuerfel.Wuerfel;

public class WuerfelTest {
	/**
	 * Testprogramm mit Nutzerabfrage
	 * @param args
	 */
	public static void main(String[] args){
		boolean exec = true;
		int min = 1;
		while(exec){
			System.out.println("Legen sie die maximale Augenzahl des W�rfels fest: ");
			Scanner sc = new Scanner(System.in);
			int max = sc.nextInt();
			System.out.println("Wie oft soll gewuerfelt werden?");
			int anzahlVersuche = sc.nextInt();
			Wuerfel dice = new Wuerfel(min, max);
			Haeufigkeiten stats = new Haeufigkeiten(max, anzahlVersuche);
			
			for(int i = 0; i < anzahlVersuche; i++){
				stats.addAugenzahl(dice.wuerfeln());
			}
			
			System.out.println("Neue Berechnung durchf�hren?(y/n)");
			if(sc.next().charAt(0) == 'y')
				exec = true;
			else
				exec = false;
		}
	}
}