package wuerfeln;

public class Fehler {
	
	//Klasseninterne Variablen
	
	private double absFehler;
	private double wahrscheinlichkeit;
	private double relFehler;
	private int relH;
	private int maxAugen;
	private Haeufigkeiten stats;
	private int Betrag;
	
	//Konstruktor
	
	public Fehler (Haeufigkeiten h){
		this.Betrag = 1;
		this.stats = stats;
		
		maxAugen = stats.getMaxAugen();
	
		
		
		
	}
	public void Fehlerberechnung (){
		
		wahrscheinlichkeit = 1/maxAugen;
		
		absFehler = relH - wahrscheinlichkeit;
		
		relFehler = Math.abs(absFehler/wahrscheinlichkeit);
		
		
		
		
		
		}
			
		
		
	}
	
}
