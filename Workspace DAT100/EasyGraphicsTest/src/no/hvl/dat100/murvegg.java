package no.hvl.dat100;

import easygraphics.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class murvegg extends EasyGraphics{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Rektangel", 1200, 1000);
		int x = 50, y = 50;
		int bredde = 80, høyde = 40, rad = 1;
		int radmaks = parseInt(showInputDialog("Hvor mange rader vil du ha på veggen? "));
		
		for(int i = 1; i <= 10; i++) {
			drawRectangle(x, y, bredde , høyde);
			x += bredde;
			if(i == 10 && (rad % 2 != 0)) {
				drawRectangle(x, y, bredde/2, høyde);
				y += høyde;
				x = 50;
				rad++;
				if(rad == radmaks+1) {
					return;
				}
				drawRectangle(x, y, bredde/2, høyde);
				x += bredde/2;
				i = 0;	
			} 
			
			if(i == 10 && (rad % 2 == 0)) {
				i=0;
				rad++;
				y += høyde;
				x = 50;
				if(rad == radmaks+1) {
					return;
				}
			}
			
		}
	}
}
