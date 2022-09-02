package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class trinnskatt {
	
	public static void main(String[] args) {
		
		//Henter inn lønnen
		int lønn = parseInt(showInputDialog("Hor mye tjener du? (brutto) "));
		
		//Definerer skattprosent som desimal som er enkel å gange med
		final double trinn1 = 0.017, trinn2 = 0.04, trinn3 = 0.134, trinn4 = 0.164, trinn5 = 0.174;
		
		//Definerer bunnen på de ulike lønnstrinnene
		final int lønntrinn1 = 190350, lønntrinn2 = 267900, lønntrinn3 = 643800, lønntrinn4 = 969200, lønntrinn5 = 2000000;
		double skatt = 0; //Initialiserer variabelen for skatt
		 
		if(lønn < lønntrinn1) {
			 //Lønnen er så lav at det ikke er skattbart
		} else if (lønn < lønntrinn2) {
			 //Lønnen er innenfor trinn 1
			 skatt = lønn*trinn1;
		} else if (lønn < lønntrinn3) {
			 //Lønnen er innenfor trinn 2
			 skatt = lønn*trinn2;
		} else if (lønn < lønntrinn4) {
			 //Lønnen er innenfor trinn 3
			 skatt = lønn*trinn3;
		} else if (lønn < lønntrinn5) {
			 //Lønnen er innenfor trinn 4
			 skatt = lønn*trinn4;
		} else {
			 //Lønnen er innenfor trinn 5
			 skatt = lønn*trinn5;
		}
		
		int skatte = (int)skatt;
		//Skriver ut skattebeløpet til brukeren
		showMessageDialog(null, "Beløpet du må betale i skatt er: " + skatte + "kr");
	}
	
}
