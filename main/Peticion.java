package Practica2_Jorge;

import java.util.Scanner;

public class Peticion {
    
    private Scanner scan=new Scanner(System.in);
    private int numero=0;
    
    public void leerNumero(){
    System.out.println("Introduce un numero del 1 al 10: ");
        numero=scan.nextInt();
        boolean a=(numero>0)&&(numero<=10);
        System.err.println("El dato introducido no es un numero");
    }
    public void leerNumero1(){
    System.out.println("Introduce un numero del 1 al 10: ");
        numero=scan.nextInt();
        boolean a=(numero<0);
        System.err.println("El numero es negativo");
    }
    public void leerNumero2(){
    System.out.println("Introduce un numero del 1 al 10: ");
        numero=scan.nextInt();
        boolean a=(numero==0);
        System.err.println("El numero es 0");
    }
    public void leerNumero3(){
    System.out.println("Introduce un numero del 1 al 10: ");
        numero=scan.nextInt();
        boolean a=(numero>=10);
        System.err.println("El numero es igual o superior a 10");
    }
    public void leerNumero4(){
    System.out.println("Introduce un numero del 1 al 10: ");
        numero=scan.nextInt();
        boolean a=(numero<0)&&(numero>=0);
        System.out.println("¡El numero introducido es valido!");
    }
}
