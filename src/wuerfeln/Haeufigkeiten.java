package wuerfeln;

public class Haeufigkeiten {

	//Klasseninterne Variablen
	
	private int maxAugen;
	private int anzahlVersuche;
	
	private double[] relH;
	private int[] absH;
	
	//Konstruktor 
	
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
	//
	//addiert die absolute h�ufigkeit um 1 bei w�rfeln und berechnet relative h�ufigkeit 
	
	public void addAugenzahl(int augenzahl){
		
		absH[augenzahl -1] += 1;
		relH[augenzahl -1] = (double)absH[augenzahl -1]/anzahlVersuche;
		
	}
	
	//Getter um auf Variablen zugreifen zu k�nnen
	//Array-Getter: augenzahl = jeweilige H�figkeit f�r die gew�nschte augenzahl
	public double getRelHaeufigkeit(int augenzahl){
		return relH[augenzahl -1];
	}
	
	public int getAbsHaeufigkeit(int augenzahl){
		return absH[augenzahl -1];
	}
	
	public int getMaxAugen(){
		return maxAugen;
	}
	
	public int getAnzahlVersuche(){
		return anzahlVersuche;
	}
	
}
