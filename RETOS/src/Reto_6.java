import java.util.Random;
import java.util.Scanner;

public class Reto_6 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        int VApu=0,Jue, Apu,Rep,tot=0,i=0,tot1=0;
        String Nom;
        Random Cara_Sello =new Random();
        System.out.println("Por favor ingrese el valor que quiere apostar");
        VApu= lect.nextInt();
        Jue=Cara_Sello.nextInt(2)+1;
         
        if (VApu>=10000) {
            System.out.println("Por favor ingrese su nombre");
            Nom=lect.next();
            do {
            System.out.println("Por favor ingrese su eleccion \n1.Cara\n2.Sello");
            Apu=lect.nextInt();
            switch ( Apu) {
                case 1:
                if (Jue==1) {
                    tot=VApu*2;
                    System.out.println(Nom+" has ganado eligiendo cara y ganaste "+VApu+" pesos");
                } else {
                    if (Jue==2) {
                        tot=VApu-VApu;
                        System.out.println(Nom+" has perdido, salio cara y tu elegiste sello y quedaste con "+VApu+" pesos");
                    }
                }
                    
                    break;
                case 2:
                if (Jue==1) {
                    tot=VApu-VApu;
                    System.out.println(Nom+" has perdido, salio sello y tu elegiste cara y quedaste con "+VApu+" pesos");
                } else {
                    if (Jue==2) {
                    tot=VApu*2;
                    System.out.println(Nom+" has ganado eligiendo sello y ganaste "+VApu+" pesos");    
                    }
                }
            } 
            i++;
            tot1=tot+tot1;
            System.out.println("quiere volver a jugar \n1.Si\n2.No");
            Rep=lect.nextInt();
        } while (Rep==1 && tot>VApu);
        }
        else{
            System.out.println("Su apuesta es menor a 10.000 pesos");
        }
        System.out.println("que daste con "+tot+ " pesos");
        System.out.println("jugo un total de "+i+" veces");
        lect.close();

    }
    
}
