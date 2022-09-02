package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
		
	}
	public void run() {
		makeWindow("Grafikk", 700, 200);
		drawCircle(150, 50, 50);
		drawCircle(150,150,50);
	}

}
