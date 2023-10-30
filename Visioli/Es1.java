import java.util.Scanner;
public class Es1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire un numero n");
		int n = scan.nextInt();
		int x;
		do{
			System.out.println("Inserire un numero. Finchè è diverso da n il ciclo continua");
			x = scan.nextInt();
		}while(x!=n);
	}
}