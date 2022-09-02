import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class fibonacci {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Kor mange av fibonacci-tala vil du ha?"));
		int x = 1, y = 1, z;
		String melding = "Dine tall er:\n ";
		
		
		switch(n) {
		case 1: showMessageDialog(null,x);
		case 2: showMessageDialog(null,melding + x + " " + y);
		case 3: showMessageDialog(null,melding + x + " " + y + (x+y));
		default: z = x+y; melding += x +"\n " + y + "\n " + z + "\n ";
			for(int i=4; i<=n; i++){
				x = y; 
				y = z;
				z = x+y;
				melding += z + "\n ";
			}
		}
		
		showMessageDialog(null,melding);

	}

}
