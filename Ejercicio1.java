/*

Realizado por: Valentina Meneses Tangarife

*Construya una funcion que lea N numeros y devuelva el numero mayor

 */
package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int n;
        int mayor, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos numeros desea ingresar?");
        n = sc.nextInt();

        mayor = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el numero en la posicion " + i + ":");
            num = sc.nextInt();

            if (num > mayor) {
                mayor = num;
            }
        }

        System.out.println("El numero mayor es " + mayor);
    }
}
