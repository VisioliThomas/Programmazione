import java.util.Scanner;
public class Es8{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n,m;
		do{
			System.out.println("n:");
			n = scan.nextInt();
			System.out.println("m:");
			m = scan.nextInt();
		}while(n<1 & m<1);
		if(n == m){
			System.out.println("MCD = " + n);
			System.exit(0);
		}else if(n>m)
			n -= m;
		else{
			m -= n;
			int x = n;
			n = m;
			m = x;
		}
		int resto;
		do{
			resto = n%m;
			n=m;
			m=resto;
		}while (resto!=0);
		System.out.println(m);
	}
}