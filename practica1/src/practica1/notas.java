package practica1;

import java.util.Scanner;

// Gestiona el ingreso, cálculo y evaluación de las notas de un estudiante
public class notas {

    //nota de la primera unidad
    double notasUf1;
    //nota de la segunda unidad
    double uf2;
    //nota de la tercera unidad
    double uf3;
    
    double acu1;

    double acu2;

    double acu3;
    //nota final calculada
    double def;
    
    //scanner para leer datos del teclado
    Scanner entrada = new Scanner(System.in);
    
    //pide al usuario que ingrese las tres notas
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante:");
        System.out.print("Nota 1: ");
        notasUf1 = entrada.nextDouble();
        
        System.out.print("Nota 2: ");
        uf2 = entrada.nextDouble();
        
        System.out.print("Nota 3: ");
        uf3 = entrada.nextDouble();
    }
   
    //verifica que cada nota no supere el valor 10
    public void comprobarcion() {
        if (notasUf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }
        
        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }
        
        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }
    
    //Calcula la nota final 
    public void Calculonotas() {
        acu1 = notasUf1* 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }
    
    //muestra en consola las notas ingresadas, los acumulados y la nota final
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + notasUf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }
    
    //metodo para comprobar si ha aprobado o ha suspendido
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendió");
        } else if (def >= 5 && def <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Error en las notas");
        }
    }
    
    //metodo principal que ejecuta el programa 
    public static void main(String[] args) {
        notas fc = new notas();
        fc.IngresaNotas();
        fc.comprobarcion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}
