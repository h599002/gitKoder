package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class karakterskala {
	
	public static void main(String[] args) {
		
		//Henter inn karakteren
		int karakter = parseInt(showInputDialog("Hor mange poeng fikk du? "));
		
		//Definerer skattprosent som desimal som er enkel å gange med
		final char charA = 'A', charB = 'B', charC = 'C', charD = 'D', charE = 'E', charF = 'F';
		
		//Definerer bunnen på de ulike karakterstrinnene
		final int karakterF = 39, karakterE = 49, karakterD = 59, karakterC = 79, karakterB = 89;
		String karakterUt = "Du fikk karakteren: ";
		 
		if(karakter < 0 || karakter > 100) {
			karakterUt = "Tallet du har skrevet er ugyldig";
		} else if(karakter <= karakterF) {
			karakterUt += charF;
		} else if (karakter <= karakterE) {
			karakterUt += charE;
		} else if (karakter <= karakterD) {
			karakterUt += charD;
		} else if (karakter <= karakterC) {
			karakterUt += charC;
		} else if (karakter <= karakterB) {
			karakterUt += charB;
		} else {
			karakterUt += charA;
		}
		
		//Skriver ut skattebeløpet til brukeren
		showMessageDialog(null, karakterUt);
	}
	
}

