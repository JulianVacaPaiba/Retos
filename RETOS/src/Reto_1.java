import java.util.Scanner;
public class Reto_1 {
    public static void main(String[] args) { 
        double Kel=0, Cel=0;
        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese los grados Kelvin a los que le quiere hacer conversion");
        Kel = lectura.nextDouble();
        Cel = Kel-273.15;
        System.out.println("El resultado de la conversion de kelvin a celsiurs es de:" + Cel);

        lectura.close();
    }
}
