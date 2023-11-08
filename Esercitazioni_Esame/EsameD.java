import java.util.Scanner;
public class EsameD{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Stringa caratteri maiuscoli:");
		String stringa = scan.nextLine();
		if(stringa.equals(stringa.toUpperCase())){
			int i = 0, j=0;
			while(i<stringa.length()){
				if( (stringa.charAt(i) < 65 || stringa.charAt(i) > 90) & stringa.charAt(i) != ' ' )
					System.exit(-1);
				
				i++;
			}
			i = 0;
			int lung = stringa.length();
			String copia = "";
			while(i<lung){
				j = 0;
				if(i!=0){
					stringa = copia;
					copia = "";
				}
				while(j<lung-1){
					copia += stringa.charAt(j+1);
					j++;
				}
				copia += stringa.charAt(0);
				System.out.println(copia);
				i++;
			}
		}else{
			System.out.println("Contiene minuscole!");
		}
	}
}