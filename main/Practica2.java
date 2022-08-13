package Practica2_Jorge;


public class Practica2 {
    
    /*Los atributos son nota_diaria, nota_practica y nota_examen*/
    
    /*Los metodos son public void printNotas, public double calcularMedia y
    public boolean aprobarExamen*/
    
    /*El metodo public void printNotas sirve para devolver por pantalla el 
    texto y el atributo senalados*/
    
    /*El metodo public double calcularMedia actuaa mediante una operacion que
    calcula la media sumando los atributos multiplicados por un numero*/
    
    /*El metodo public boolean aprobarExamen establece una serie de normas que
    se declaran con los atributos para determinar si el aprobado final es true o 
    false dependiendo de cuales se cumplan*/
    
    private double nota_diaria; 
    private double nota_practica;
    private double nota_examen;
    
    Practica2(){
    nota_diaria=7.25;
    nota_practica=6.5;
    nota_examen=8.95;
    }
    
    public void printNotas(){
         System.out.println("La nota de clase es la siguiente: ");
         System.out.println("Nota de clase: " + nota_diaria);
         System.out.println("Nota de practicas: " + nota_practica);
         System.out.println("Nota de examen: " + nota_examen);
    }

    public double calcularMedia(){
         double media;
         media = ((nota_diaria*0.1)+(nota_practica*0.5)+(nota_examen*0.4));
         return media;
    }

    public boolean aprobarExamen(){
         boolean nota_minima = ((nota_practica>=5) && (nota_examen>=5));
         boolean media_aprobada = (calcularMedia()>=5);
         boolean aprobado_final = (nota_minima && media_aprobada);
         return aprobado_final;
    }
}


