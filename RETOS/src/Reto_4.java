import java.util.Random;
import java.util.Scanner;

public class Reto_4 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);       
        Random Juego =new Random();
        int VApu=0,Jue,elect;
        String Nom;
 
        System.out.println("Por favor ingrese el valor que quiere apostar");
        VApu= lect.nextInt();
        if (VApu>10000) {
            System.out.println("Por favor ingrese su nombre");
            Nom=lect.next();
            Jue=Juego.nextInt(3)+1;
            System.out.println("Por favor elija entre \n1.Piedra\n2.Papel\n3.Tijera");
            elect=lect.nextInt();
            if (Jue==elect) {
                System.out.println("Fue empate");
            } else {
                if(Jue==1 && elect==2){
                    System.out.println("La maquina saco piedra");
                    System.out.println(Nom+" Has ganado");
                    VApu=VApu*2;
                    System.out.println("Ganaste "+VApu+" pesos");
                }
                else{
                    if(Jue==1 && elect==3){
                        System.out.println("La maquina saco piedra");
                        System.out.println(Nom+" Has Perdido");
                        VApu=VApu*0;
                        System.out.println(Nom+"perdiste toda la apuesta y quedaste con "+VApu+" pesos" );
                    }
                    else{
                        if(Jue==2 && elect==1){
                            System.out.println("La maquina saco Papel");
                            System.out.println(Nom+" Has perdido");
                            VApu=VApu*0;
                            System.out.println(Nom+"perdiste toda la apuesta y quedaste con "+VApu+" pesos" );
                        }
                        else{
                            if(Jue==2 && elect==3){
                                System.out.println("La maquina saco papel");
                                System.out.println(Nom+" Has ganado");
                                VApu=VApu*2;
                                System.out.println("Ganaste "+VApu+" pesos");
                            }
                            else{
                                if(Jue==3 && elect==1){
                                    System.out.println("La maquina saco tijeras");
                                    System.out.println(Nom+" Has ganado");
                                    VApu=VApu*2;
                                    System.out.println("Ganaste "+VApu+" pesos");
                                }
                                else{
                                    if(Jue==3 && elect==2){
                                        System.out.println("La maquina saco tijeras");
                                        System.out.println(Nom+" Has perdido");
                                        VApu=VApu*0;
                                        System.out.println(Nom+"perdiste toda la apuesta y quedaste con "+VApu+" pesos" );
                                    }
                                }
                            }
                        }
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