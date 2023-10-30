import java.util.Scanner;
public class Es2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("Inserire un numero non negativo");
			n = scan.nextInt();
		}while(n<0);
		int i = 1;
		long fatt = 1;
		while(i<=n){
			fatt *=i;
			i++;
		}
		System.out.println(n+"!: " +fatt);
	}
}