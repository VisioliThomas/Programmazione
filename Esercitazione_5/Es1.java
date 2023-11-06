import java.util.Scanner;
public class Es1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("Inserire n positivo:");
			n = scan.nextInt();
		}while(n<0);
		int pot = 1, i=1;
		while(pot <= n ){
			pot *= 2;
		}
		System.out.println(pot);
	}
}