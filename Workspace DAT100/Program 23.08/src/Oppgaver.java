import java.util.Scanner;


public class Oppgaver {

	public static void main(String[] args) {
        
        int num1, num2, num3, num4;
        int minst = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv ditt første tal: ");
        num1 = sc.nextInt();
        
        System.out.println("Skriv ditt andre tal: ");
        num2 = sc.nextInt();
        
        if(num1<num2) {
        	minst = num1;
        } else {
        	minst = num2;
        }
        
        System.out.println("Skriv ditt tredje tal: ");
        num3 = sc.nextInt();
        
        if(num3<minst) {
        	minst = num3;
        }
        
        System.out.println("Skriv ditt fjerde tal: ");
        num4 = sc.nextInt();
        
        if(num4<minst) {
        	minst = num4;
        }
        
        sc.close();
        System.out.println("Det minste talet er: "+minst);		
		
		
	}

}
