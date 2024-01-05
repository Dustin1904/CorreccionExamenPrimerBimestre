import sun.security.jgss.wrapper.GSSNameElement;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Ingrese xd: ");
            String info = sc.nextLine();

            Videojuegos gen = new Videojuegos(info);

            System.out.println("Ingrese una descpricion: ");
            String dato1=sc.nextLine();
            Genero gen1=new Genero(dato1);

            System.out.println("Ingrese una descripcion al genero Aventura: ");
            String dato2= sc.nextLine();
            System.out.println("Igrese un ejemplo del genero aventura: ");
            String dato3= sc.nextLine();
            tipos tip=new tipos(dato2,dato3);

            gen1.imprimir();
            gen.imprimir();
            tip.imprimir();
        }
        catch (Exception e){
            System.out.println("Los valores ingresados no pueden ser Numeros");
        }



    }
}