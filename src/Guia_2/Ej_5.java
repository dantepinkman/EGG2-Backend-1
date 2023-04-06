/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package Guia_2;

import java.util.Scanner;

public class Ej_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double num = 16;
        double num2 = Math.sqrt(num);
        System.out.println("La rainz cuadrada de "+ num + " es " + num2);

        // Igual pero el resulado directamente en el println
        
        System.out.println("Escriba un numero");
        num = leer.nextDouble();
        System.out.println("La raiz cuadrada de ese numero es: " + Math.sqrt(num));

    }
}
