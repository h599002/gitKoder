import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;



public class Oppgave2_8_4_laereboka {
	public static void main(String[] args) {
		String usd = showInputDialog("Destte er eit program for å regne om Amerikanske dollar til Norske kroner! " + "\n" + "Vennligst skriv inn ønsket beløp i USD: ");
		int usdbeløp = parseInt(usd);
		
		double nok = usdbeløp * 9.7;
		
		String utTekst = "I Norske kroner blir dette: " + nok + "kr";
		showMessageDialog(null,utTekst);
	}
}
