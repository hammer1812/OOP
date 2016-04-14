package wuerfeln;
/**
*
*	@author Adrian Fietta
*
*/
public class Fehler {
	/**
	*	Absoluter Fehler fuer die jeweiligen Augenzahlen
	*/
	private double[] absFehler;
	/**
	*	Wahrscheinlichkeit, dass eine Augenzahl gewuerfelt wird
	*/
	private double wahrscheinlichkeit;
	/**
	*	Relativer Fehler fuer die jeweiligen Augenzahlen
	*/
	private double[] relFehler;
	/**
	*	Maximale Augenzahl eines Wuerfels
	*/
	private int maxAugen;
	/**
	*	Objekt Haeufigkeiten
	*/
	private Haeufigkeiten stats;
	/**
	*	Konstruktor, legt Arrays fuer die jeweiligen Fehler an
	*	@param maxAugen Magimale Augenzahl des Wuerfels
	*/
	public Fehler (Haeufigkeiten stats){
		
		this.stats = stats;
				
		maxAugen = stats.getMaxAugen();
		
		relFehler = new double[maxAugen];
		absFehler = new double[maxAugen];
			
	}
	/**
	*	Berechnet die Wahrscheinlichkeit, 
	*	berechnet den absoluten, sowie relativen Fehler, der Haeufigkeiten und speichert diese zur jeweiligen Augenzahl im jeweiligen Array
	*/
	public void Fehlerberechnung (){
		
		wahrscheinlichkeit = 1/(double)maxAugen;
		
		for (int i =0; i<absFehler.length; i++)
			
			absFehler[i] = stats.getRelHaeufigkeit(i+1) - wahrscheinlichkeit;
			
		{
		for (int i=0; i<relFehler.length; i++)
			
			relFehler[i]= Math.abs(absFehler[i]/wahrscheinlichkeit);	
		
		}
				
	}
	/**
	*	@return String zur Ausgabe der Fehlerberechnungen
	*/
	public String toString(){
		String f = "";
			
		for (int i=1; i<=maxAugen; i++){
			f = f + "Absoluter Fehler der Haeufigkeit zur Augenzahl " + i + ": "+ absFehler[i-1] + "\nRelativer Fehler der Haeufigkeit zur Augenzahl " + i + ": " + relFehler[i-1] + "\n\n";
		}
		return f;
	}
	
}
