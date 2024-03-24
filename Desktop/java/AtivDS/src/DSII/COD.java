package DSII;

	
	import java.util.Scanner;

	public class COD {
	
	    private int a;
	    private int b;
	    private int c;
	    
	    private static int contInstancia = 0;

	    public COD(int a, int b, int c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        contInstancia++;
	    }
	    
	    public void exibir() {
	        int temp;
	        if (a > b) { temp = a; a = b; b = temp; }
	        if (b > c) { temp = b; b = c; c = temp; }
	        if (a > b) { temp = a; a = b; b = temp; }
	        
	        System.out.println("A sequência fica: " + a + ", " + b + ", " + c);
	    }
	    
	    public static int getContInstancia() {
	        return contInstancia;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro valor");
	        int n1 = sc.nextInt();
	        System.out.println("Digite o segundo valor");
	        int n2 = sc.nextInt();
	        System.out.println("Digite o terceiro valor");
	        int n3 = sc.nextInt();
	        
	        COD seq = new COD (n1, n2, n3);
	        seq.exibir();
	        
	        System.out.println("Total de sequências criadas: " + COD.getContInstancia());
	        
	        sc.close();
}

}