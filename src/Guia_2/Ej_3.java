/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Ej_3 {

 

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra con mayusculas y minusculas");
        frase = leer.next();
        //frase = toUpperCase();
        System.out.println("En Mayusculas: " + frase.toUpperCase());
        System.out.println("En Minusculas: " + frase.toLowerCase());
        

    }
}
