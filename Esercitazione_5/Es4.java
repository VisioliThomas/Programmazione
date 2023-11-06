import java.util.Scanner;
public class Es4{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n, k;
		do{
			System.out.println("Inserire n positivo:");
			n = scan.nextInt();
			System.out.println("Inserire k positivo:");
			k = scan.nextInt();
		}while(n<0 && k<0);
		int somma = k, max = n;
		if(n<=k){
			somma = n;
			max = k;
		}
		for(int i = 0; i<max; i++){
			somma++;
		}
		System.out.println("somma= "+somma);
	}
}