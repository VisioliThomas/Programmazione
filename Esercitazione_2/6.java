import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stringa con 5 caratteri ( solo + e - )");
        String stringa1 = scan.nextLine();
        System.out.println("Stringa con 5 caratteri ( solo + e - )");
        String stringa2 = scan.nextLine();
        if(stringa1.length() != 5 || stringa2.length()!= 5)
            System.exit(-1);
        boolean giusto = false;
        if((stringa1.charAt(0) == '+' | stringa1.charAt(0) == '-') & ( stringa2.charAt(0) == '+' | stringa2.charAt(0) == '-') )
            if(stringa1.charAt(1) == '+' | stringa1.charAt(1) == '-' & ( stringa2.charAt(0) == '+' | stringa2.charAt(0) == '-') )
                if(stringa1.charAt(2) == '+' | stringa1.charAt(2) == '-' & ( stringa2.charAt(0) == '+' | stringa2.charAt(0) == '-') )
                    if(stringa1.charAt(3) == '+' | stringa1.charAt(3) == '-' & ( stringa2.charAt(0) == '+' | stringa2.charAt(0) == '-') )
                        if(stringa1.charAt(4) == '+' | stringa1.charAt(4) == '-' & ( stringa2.charAt(0) == '+' | stringa2.charAt(0) == '-') )
                            giusto = true;
        if(giusto){
            int a = 0, b = 4;
            if(stringa1.charAt(0) == '+')
                a++;
            else
                a--;
            if(stringa2.charAt(0) == '+')
                b++;
            else
                b--;
            System.out.println("Valore di a: "+a+" Valore di b:"+b);
            if(stringa1.charAt(1) == '+')
                a++;
            else
                a--;
            if(stringa2.charAt(1) == '+')
                b++;
            else
                b--;
            System.out.println("Valore di a: "+a+" Valore di b:"+b);
            if(stringa1.charAt(2) == '+')
                a++;
            else
                a--;
            if(stringa2.charAt(2) == '+')
                b++;
            else
                b--;
            System.out.println("Valore di a: "+a+" Valore di b:"+b);
            if(a==b){
                System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
                System.exit(-1);
            }
            if(stringa1.charAt(3) == '+')
                a++;
            else
                a--;
            if(stringa2.charAt(3) == '+')
                b++;
            else
                b--;
            System.out.println("Valore di a: "+a+" Valore di b:"+b);
            if(a==b){
                System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
                System.exit(-1);
            }
            if(stringa1.charAt(4) == '+')
                a++;
            else
                a--;
            if(stringa2.charAt(4) == '+')
                b++;
            else
                b--;
            System.out.println("Valore di a: "+a+" Valore di b:"+b);
            if(a==b){
                System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
                System.exit(-1);
            }
        }else{
            System.out.println("Errore!");
        }
    }
}