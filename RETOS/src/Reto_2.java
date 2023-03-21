import java.util.Scanner;
public class Reto_2{

    public static void main(String[] args) { 
        String Nom_M,Nom_B,Vac;
        float Peso=0,edad=0,dosis=0;
        int meses=0;
        Scanner lectura= new Scanner (System.in);
       
        System.out.println("Ingrese el nombre de la madre del bebe");
        Nom_M = lectura.nextLine();
        System.out.println("Ingrese el nombre del bebe");
        Nom_B = lectura.nextLine();
        System.out.println("Ingrese el nombre de su vacuna");
        Vac = lectura.nextLine();
        System.out.println("Ingrese el peso del bebe");
        Peso = lectura.nextFloat();
        System.out.println("Ingrese los meses de nacido del bebe");
        meses = lectura.nextInt();
        edad = meses/12;
        dosis = ((Peso + 10) / (meses * 10))*8;
        System.out.println("El nombre de la madre es:" + Nom_M);
        System.out.println("El nombre del bebe es:" + Nom_B);
        System.out.println("La vacuna es:" + Vac);
        System.out.println("El peso de"+ Nom_B +"es de:" + Peso +"Kg");
        System.out.println(Nom_B + "tiene:" + edad +"años");
        System.out.println(Nom_B + "tiene:" + meses + "meses");
        System.out.println("La dosis de la vacuna es de:" + dosis);        
        lectura.close();
    }
}


