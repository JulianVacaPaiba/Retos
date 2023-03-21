import java.util.Random;
import java.util.Scanner;
public class Reto_3 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        int VApu=0,Jue;
        String Nom, Apu;
        Random Cara_Sello =new Random();
        System.out.println("Por favor ingrese el valor que quiere apostar");
        VApu= lect.nextInt();
        Jue=Cara_Sello.nextInt(2)+1;
        if (VApu>=10000) {
            System.out.println("Por favor ingrese su nombre");
            Nom=lect.next();
            System.out.println("Por favor ingrese su eleccion entre cara o sello");
            Apu=lect.next();
            switch ( Apu) {
                case "cara" :
                if (Jue==1) {
                    VApu=VApu*2;
                    System.out.println(Nom+" has ganado eligiendo "+Apu+" y ganaste "+VApu+" pesos");
                } else {
                    if (Jue==2) {
                        VApu=VApu*0;
                        System.out.println(Nom+" has perdido, salio sello y tu elegiste "+Apu+" y quedaste con "+VApu+" pesos");
                    }
                } 
                    break;
                case "sello":
                if (Jue==1) {
                    VApu=VApu*0;
                    System.out.println(Nom+" has perdido, salio sello y tu elegiste "+Apu+" y quedaste con "+VApu+" pesos");
                } else {
                    if (Jue==2) {
                    VApu=VApu*2;
                    System.out.println(Nom+" has ganado eligiendo "+Apu+" y ganaste "+VApu+" pesos");    
                    }
                }
            }
        }
        else{
            System.out.println("Su apuesta es menor a 10.000 pesos");
        }
        lect.close();
    }
    
}