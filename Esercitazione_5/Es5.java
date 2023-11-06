import java.util.Scanner;
public class Es5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("Inserire n positivo:");
			n = scan.nextInt();
		}while(n<0);
		if(n==1)
			System.out.println("1");
		do{
			if(n%2==0)	
				n = n/2;
			else if(n%2==1 && n>1)
				n = (3*n)+1; 
			System.out.print(" "+n);
		}while(n!=1);
	}
}