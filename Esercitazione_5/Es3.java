import java.util.Scanner;
public class Es3{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("Inserire n positivo:");
			n = scan.nextInt();
		}while(n<0);
		int divisore = 2, cont = 0;
		System.out.print("\nFattori");
		while ( n != 1 ){
			cont = 0;
			while( n%divisore == 0 && n!=0){
				n = n/divisore;
				cont++;
			}
			if(cont!=0)
				System.out.print(" " +divisore+"("+cont+" volte)");
			divisore++;
		}
	}
}