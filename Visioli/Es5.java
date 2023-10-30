import java.util.Scanner;
public class Es5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n,m;
		do{
			System.out.println("n:");
			n = scan.nextInt();
			System.out.println("m:");
			m = scan.nextInt();
		}while(n<0 & m<0);
		int i = n, quoziente = 0;
		do{
			i-=m;
			quoziente++;
		}while(i>0);
		if(i<0)
			quoziente--;
		System.out.println("quoziente: "+quoziente+" resto: "+(i*-1));
	}
}