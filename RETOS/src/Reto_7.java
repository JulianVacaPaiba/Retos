import java.util.Random;
import java.util.Scanner;
public class Reto_7 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        Random Juego = new Random();       
        int Rep,tot=0,i=0,elect,Jue,per=0,VApu,tot1=0,totF=0;

        System.out.println("Por favor ingrese la cantidad que quiere apostar");
        VApu=lect.nextInt();
if (VApu>=10000) {
    do {
        Jue=Juego.nextInt(3)+1;
        System.out.println("Por favor elija entre \n1.Piedra\n2.Papel\n3.Tijera");
        elect=lect.nextInt();
        if (Jue==elect) {
            System.out.println("Fue empate");
        } else {
            if(Jue==1 && elect==2){
                System.out.println("La maquina saco piedra");
                System.out.println("Has ganado");
                tot=VApu+tot;
            }
            else{
                if(Jue==1 && elect==3){
                    System.out.println("La maquina saco piedra");
                    System.out.println("Has Perdido");
                    per++;
                    tot1=tot1-VApu;
                    
                }
                else{
                    if(Jue==2 && elect==1){
                        System.out.println("La maquina saco Papel");
                        System.out.println("Has perdido");
                        per++;
                        tot1=tot1-VApu;
                    }
                    else{
                        if(Jue==2 && elect==3){
                            System.out.println("La maquina saco papel");
                            System.out.println("Has ganado");
                            tot=VApu+tot;
                        }
                        else{
                            if(Jue==3 && elect==1){
                                System.out.println("La maquina saco tijeras");
                                System.out.println("Has ganado");
                                tot=VApu+tot;
                            }
                            else{
                                if(Jue==3 && elect==2){
                                    System.out.println("La maquina saco tijeras");
                                    System.out.println("Has perdido");
                                    per++;
                                    tot1=tot1-VApu;
                                }
                            }
                        }
                    }
                }
            }

        }  
        i++;    
        totF=tot+tot1;     
    System.out.println("quiere volver a jugar \n1.Si\n2.No");
    Rep=lect.nextInt();
}while (Rep==1 && per<3);
System.out.println("Usted jugo "+i+" veces");
System.out.println("Gano un total de "+totF+ " pesos");
} 
else {
    System.out.println("Su apuesta es menor a 10.000 pesos");
}
lect.close();
    }
    
}
