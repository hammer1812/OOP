package wuerfeln;
/**
 * 
 * @author Philip Förster
 *
 */
public class Haeufigkeiten {
	/**
	 * Maximale Augenzahl eines Wuerfels
	 */
	private int maxAugen;
	/**
	 * Anzahl der Wuerfe eines Wuerfels
	 */
	private int anzahlVersuche;
	/**
	 * Relative Haeufigkeiten fuer die jeweiligen Augenzahlen
	 */
	private double[] relH;
	/**
	 * Absolute Haeufigkeiten fuer die jeweiligen Augenzahlen
	 */
	private int[] absH;
	
	/**
	 * Konstruktor, erzeugt Haeufigkeiten
	 * @param maxAugen Maximale Augenzahl des Wuerfels
	 * @param anzahlVersuche Anzahl der Wuerfe eines Wuerfels
	 */
	public Haeufigkeiten(int maxAugen, int anzahlVersuche){
		this.maxAugen = maxAugen;
		this.anzahlVersuche = anzahlVersuche;
		
		relH = new double[maxAugen];
		absH = new int[maxAugen];
		for(int i = 0; i<absH.length; i++){
			absH[i] = 0;
		}
		for(int i = 0; i<relH.length; i++){
			relH[i] = 0;
		}
	}

	/**
	 * Inkrementiert die Absolute Haeufigkeit für die angegebene Augenzahl um 1 und legt die Relative Haeufigkeit fest
	 * @param augenzahl Gewuerfelte Augenzahl die verwendet werden soll
	 */
	public void addAugenzahl(int augenzahl){
		
		absH[augenzahl -1] += 1;
		relH[augenzahl -1] = (double)absH[augenzahl -1]/anzahlVersuche;
		
	}
	
	/**
	 * @return String zur Darstellung aller relativer Haeufigkeiten
	 */
	public String toString(){
		String s = "";
		for(int i=1; i<=maxAugen; i++){
			s = s + "Relative Häufigkeit für die Augenzahl " + i + " : " + relH[i-1] + "\n";
		}
		return s;
	}
	
	/**
	 * @param augenzahl Gewuerfelte Augenzahl die verwendet werden soll
	 * @return Relative Haeufigkeit der angegebenen Augenzahl
	 */
	public double getRelHaeufigkeit(int augenzahl){
		return relH[augenzahl -1];
	}
	/**
	 * @param augenzahl Gewuerfelte Augenzahl die verwendet werden soll
	 * @return Absolute Haeufigkeit der angegebenen Augenzahl
	 */
	public int getAbsHaeufigkeit(int augenzahl){
		return absH[augenzahl -1];
	}
	/**
	 * @return Maximale Augenzahl
	 */
	public int getMaxAugen(){
		return maxAugen;
	}
	/**
	 * @return Anzahl der Wuerfe eines Wuerfels
	 */
	public int getAnzahlVersuche(){
		return anzahlVersuche;
	}
	
}
