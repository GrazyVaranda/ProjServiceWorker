package AULA1;

import java.util.Scanner;

public class COD {

	public static void main(String[] args) {
		// GRAZIELLY VIEIRA VARANDA
		

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o primeiro valor");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        c = sc.nextInt();
        
        if (a <= b && b <= c) {
            System.out.println("A sequ�ncia fica: " + a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
        	
            System.out.println("A sequ�ncia fica: " + a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {

        	System.out.println("A sequ�ncia fica: " + b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {

        	System.out.println("A sequ�ncia fica: " + b + ", " + c + ", " + a);
        } else if (c <= a && a <= b) {

        	System.out.println("A sequ�ncia fica: " + c + ", " + a + ", " + b);
        } else {

        	System.out.println("A sequ�ncia fica: " + c + ", " + b + ", " + a);
        }
    

	}

}
