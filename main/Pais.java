package Practica2_Jorge;

public class Pais {
    
    private static int numPaises=0;
    private String nombre;
    private int numerodehabitantes;
    private String idiomaoficial;
    private String extensiongeografica;
    private String continente;
    private boolean democratico;
    
    Pais(){
    nombre="España";
    numerodehabitantes=200000000;
    idiomaoficial="Español";
    extensiongeografica="505990 KM";
    continente="Europa";
    democratico=true;
    numPaises++;
    }
    
    Pais(String a){
    nombre=a;
    numPaises++;
    }
    
    Pais(String a, String b, String c){
    nombre=a;
    idiomaoficial=b;
    continente=c;
    numPaises++;
    }
    
    Pais(String a, int b, String c, String d, String e, boolean f){
    nombre=a;
    numerodehabitantes=b;
    idiomaoficial=c;
    extensiongeografica=d;
    continente=e;
    democratico=f;
    numPaises++;
    }
    
    public int getnumPaises(){
    return numPaises;
    }
    
    public boolean nHabitantes(){
    return (numerodehabitantes>100000);
    }
    
    public void printContinente(){
    System.out.println("Continente: " + continente);
        System.out.println("Extension: " + extensiongeografica);
    }
    
    public String getNombre(){
    return nombre;
    }
    public int getNumerodehabitantes(){
    return numerodehabitantes;
    }
    public String getIdiomaoficial(){
    return idiomaoficial;
    }
    public String getExtensiongeografica(){
    return extensiongeografica;
    }
    public String getContinente(){
    return continente;
    }
    public boolean getDemocratico(){
    return democratico;
    }
    
    public void setNombre(String a){
    nombre=a;
    }
    public void setNumerodehabitantes(int a){
    numerodehabitantes=a;
    }
    public void setIdiomaoficial(String a){
    idiomaoficial=a;
    }
    public void setExtensiongeografica(String a){
    extensiongeografica=a;
    }
    public void setContinente(String a){
    continente=a;
    }
    public void setDemocratico(boolean a){
    democratico=a;
    }
    
}
