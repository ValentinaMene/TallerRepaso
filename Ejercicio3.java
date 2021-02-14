/*

Realizado por: Valentina Meneses Tangarife

Construya una funcion que multiplique dos numeros usando sumas

 */
package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num1, num2;
        int suma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        suma = 0;

        if (num1 < num2) {
            for (int i = 1; i <= num1; i++) {
                suma = suma + num2;
            }
        } else {
            for (int i = 1; i <= num2; i++) {
                suma = suma + num1;
            }
        }
        System.out.println("el resultado de la multiplicacion " + num1 + " * " + num2 + " es igual a " + suma);
    }
}
