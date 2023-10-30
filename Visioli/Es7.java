import java.util.Scanner;
public class Es7{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		do{
			System.out.println("Inserire un numero non negativo");
			n = scan.nextInt();
		}while(n<0);
		if(n==0 || n ==1)
			System.out.println(n);
		else{
			int prima = 0, dopo = 1;
			long fib = 0;
			for(int i = 0; i<n; i++){
				fib = prima + dopo;
				prima = dopo;
				dopo = fib;
				System.out.print(fib +" ");
			}
		}
	}
}