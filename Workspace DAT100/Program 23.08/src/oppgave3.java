import java.util.Scanner;

import javax.swing.JOptionPane;


public class oppgave3{

	public static void main(String[] args) {
        
        int dag, mnd, år;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn dag: ");
        dag = sc.nextInt();
        
        if(dag > 31) {
        	sc.close();
            System.out.println("Dagen din er ikke gyldig!");
            return;
        }
        
        System.out.println("Skriv tall på måneden din: ");
        mnd = sc.nextInt();
        if(mnd>12) {
        	sc.close();
            System.out.println("Måneden din er ikke gyldig");
            return;
        }
        if(mnd == 2 & dag > 28) {
        	sc.close();
            System.out.println("Datoen din er ikke gyldig");
            return;
        }
        
        System.out.println("Skriv årstall: ");
        år = sc.nextInt();
        
        sc.close();
        System.out.println("Datoen din er: " + dag + "." + mnd + "." + år);		
		
		
	}

}
