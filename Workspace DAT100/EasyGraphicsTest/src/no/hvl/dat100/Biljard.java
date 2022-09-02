package no.hvl.dat100;

import easygraphics.*;


public class Biljard extends EasyGraphics{

	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		
		final int ANT_ITER = 5000;
		final int BREDDE = 800;
		final int HØYDE = 600;
		
		int r = 10;
		int x = 10, y = 10;
		int dx = (int)(Math.random() *3) + 1;
		int dy = (int)(Math.random() *3) + 1;
		
		
		makeWindow("Biljard", BREDDE, HØYDE);
		setBackground(0,255,0);
		setColor(255,0,0);
		
		int id = fillCircle(x, y, r);
		setSpeed(7);
		
		for(int i=0; i<ANT_ITER; i++) {
			if( (x+dx-r) <= 0 || (x+dx+r) >= BREDDE )
				dx = -dx;
			if( (y+dy-r) <= 0 || (y+dy+r) >= HØYDE )
				dy = -dy;
			x += dx;
			y += dy;
			moveCircle(id, x, y);
			//System.out.println("x: " + x + "y: " + y);
			
			
		}
		
	}

}
