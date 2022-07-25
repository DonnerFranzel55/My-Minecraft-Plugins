package de.zygann.addierer;

import java.util.Scanner;

public class Addierer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ausgabe Terminaltext
		System.out.println("Herzlich Willkommen zum Rechner von DZ Cloud.");
		System.out.println("Viel Spaß beim Rechnen");
		System.out.println("Bitte geben Sie eine Zahl ein: ");

		// Eingabe Benutzer
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
        
		// Konvertierung
		
		
		//Integer valueOf = null;
		Double valueOn = null;
		try {
		//valueOf = Integer.valueOf(s);  //Integer Eingabe des Users
		valueOn = Double.valueOf(s);  //Double Eingabe des Users

		
		}catch( NumberFormatException error) {
			System.out.println("Das Programm kann Keine Buchstaben/Zeichen verarbeiten(Fehler-Code:00001)");

		}
		
		if (valueOn==null) {
			System.exit(0);
		}
		
		// Rechnung
		double ergebnis;// +1
		double ergebniss;// -1
		double ergebnisss;// *2
		double ergebnissss;// /2
		double auf = Math.ceil(valueOn);
		double ab = Math.floor(valueOn);
		double fair = Math.rint(valueOn);
		
		ergebnis = valueOn + 1;
		ergebniss = valueOn - 1;
		ergebnisss = valueOn * 2;
		ergebnissss = valueOn / 2;
		
		
		// Ausgabe Terminal
		System.out.println("Eingegebende Zahl: " + s);
		System.out.println("Ergebnis(+1): "+ ergebnis);
		System.out.println("Ergebnis(-1): "+ ergebniss);
		System.out.println("Ergebnis(*2): "+ ergebnisss);
		System.out.println("Ergebnis(/2): "+ ergebnissss);
		System.out.println("Aufrunden: "+ auf);
		System.out.println("Abrunden: "+ab);
		System.out.println("Faires runden: "+ fair);
		System.out.println("Double Konvertierte Zahl: "+ valueOn);
		System.out.println("Wenn Sie noch einmal Rechnen wollen dann Drücken Sie auf den RUN Button ");
		System.out.println("Version 0.1.0 alpha D Cloud Company");
		

	}
}