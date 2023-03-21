import java.util.Scanner;

public class Reto_5 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        String NomEmp,NomCli;
        int can,Reg;
        float pre,tot=0,totp=0;
do {
        System.out.println("Por favor ingrese su nombre");
        NomCli=lect.next();
        System.out.println("Por favor ingrese el nombre del empleado que lo atiende");
        NomEmp=lect.next();
        System.out.println("Confirmar finalizacion de proceso de registro \n1.Si\n2.No");
        Reg=lect.nextInt();
} while (Reg==2);
System.out.println("Ingrese la cantidad de productos que va a llavar");
can=lect.nextInt();
for (int i=0; i<can ;i++) {
    System.out.println("Por favor ingrese el precio del "+i+" producto");
    pre= lect.nextFloat();
}
System.out.println("El total es de: "+tot);
System.out.println("Ingrese su pago");
totp=lect.nextInt();
if (tot>totp) {
    tot=tot-totp;
    System.out.println("La compra aun no esta pagada totalmente le faltan "+tot+" pesos");
} else {
    tot=totp-tot;
    System.out.println("sus vueltas son de: "+tot+" pesos");
    
}
lect.close();
    }
    
}
