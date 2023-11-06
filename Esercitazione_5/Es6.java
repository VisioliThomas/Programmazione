import java.util.Scanner;
public class Es6{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Solo lettere A C G T");
		System.out.println("Genoma");
		String s1 = scan.nextLine();
		System.out.println("Proteina");
		String s2 = scan.nextLine();
		int i = 0;
		while(i<s1.length()){
			if(s1.charAt(i)!='A' && s1.charAt(i)!='C' && s1.charAt(i)!='G' && s1.charAt(i)!='T' )
				System.exit(-1);
			i++;
		}
		i = 0;
		while(i<s2.length()){
			if( s2.charAt(i)!='A' && s2.charAt(i)!='C' && s2.charAt(i)!='G' && s2.charAt(i)!='T' )
				System.exit(-2);
			i++;
		}
		System.out.println("La sequenza "+s2+" compare in "+s1+" nelle seguenti posizioni:\n ");
		for(i = 0; i < s1.length()-2; i++){
			if(s1.charAt(i) == s2.charAt(0) & s1.charAt(i+1) == s2.charAt(1) & s1.charAt(i+2) == s2.charAt(2))
				System.out.print((i+1)+" ");
		}
	}
}