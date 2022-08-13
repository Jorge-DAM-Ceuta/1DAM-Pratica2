package Practica2_Jorge;

import java.util.Scanner;

public class MiVector {
    
    private Scanner scan=new Scanner(System.in);
    int tam=0;
    int v[];
    
    MiVector(int x){
        tam=x;
        v=new int[tam];
    }
    
    public boolean checkArray(){
    return (tam==0);
    }
    
    public void leerArray(){
    System.out.println("Introduce un valor para el vector 0: ");
        v[0]=scan.nextInt();
    System.out.println("Introduce un valor para el vector 1: ");
        v[1]=scan.nextInt();
    System.out.println("Introduce un valor para el vector 2: ");
        v[2]=scan.nextInt();
    }
    
    public void setArray(int a, int b, int c){
        v[0]=a;
        v[1]=b;
        v[2]=c;
    }
    
    public void deletelastArray(){
    tam--;
    }
    
    public int gettamañoArray(){
    return tam;
    }
    
    public void vaciarArray(){
    tam=0;
    }
    
    public void printArray(){
        System.out.println("Vector 0 :" + v[0]);
        System.out.println("Vector 1 :" + v[1]);
        System.out.println("Vector 2 :" + v[2]);
    }
}

