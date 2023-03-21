import java.util.Random;
import java.util.Scanner;

public class Reto_8 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        int Jue,elec,i=0 ;
        Random Juego = new Random();
        Jue=Juego.nextInt(100)+1;
        do {
            i++;
            System.out.println("Selecione el numero que cree que es");
            elec=lect.nextInt();
            if (elec<Jue) {
                System.out.println("El numero que elegiste es menor");
                
            }
            else{
                if(elec>Jue){
                System.out.println("El numero que elegiste es mayor");
                }
            }
            
        } while (elec!=Jue && i<=10  );
        if (elec==Jue) {
            System.out.println("Felicitaciones adivinaste el numero en: "+i+" intentos");
        }
        else{
            System.out.println("Lo siento no lograste adivinarlo, el numero era: "+Jue+" ");  
        }

        lect.close();
    }
    
}
