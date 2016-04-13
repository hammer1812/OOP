package wuerfeln;

public class Fehler {
	
	//Klasseninterne Variablen
	
	private double[] absFehler;
	private double wahrscheinlichkeit;
	private double[] relFehler;
	private int maxAugen;
	private Haeufigkeiten stats;
	
	//Konstruktor
	
	public Fehler (Haeufigkeiten stats){
		
		this.stats = stats;
				
		maxAugen = stats.getMaxAugen();
		
		relFehler = new double[maxAugen];
		absFehler = new double[maxAugen];
			
	}
	public void Fehlerberechnung (){
		
		wahrscheinlichkeit = 1/(double)maxAugen;
		
		for (int i =0; i<absFehler.length; i++)
			
			absFehler[i] = stats.getRelHaeufigkeit(i+1) - wahrscheinlichkeit;
			
		{
		for (int i=0; i<relFehler.length; i++)
			
			relFehler[i]= Math.abs(absFehler[i]/wahrscheinlichkeit);	
		
		}
				
	}
	public String toString(){
		String f = "";
			
		for (int i=1; i<=maxAugen; i++){
			f = f + "Absoluter Fehler der Haeufigkeit zur Augenzahl " + i + ": "+ absFehler[i-1] + "\nRelativer Fehler der Haeufigkeit zur Augenzahl " + i + ": " + relFehler[i-1] + "\n\n";
		}
		return f;
	}
	
}
