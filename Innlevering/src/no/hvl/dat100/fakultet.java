package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class fakultet {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skriv et tall: "));
		int tall = n;
		
		for(int i = n ;i > 1; i--) {
			tall = tall*(i-1);
		}
		
		showMessageDialog(null, n + " Fakultet er: " + tall);
		
	}

}
