/*

Realizado por: Valentina Meneses Tangarife

Construya una funcion que eleve el numero N a la potencia M solo usando sumas

 */
package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int base, expo, resul;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        expo = sc.nextInt();
        resul = potencia(base, expo);
        System.out.println("El resultado de la potencia es: " + resul);
    }

    public static int potencia(int base, int expo) {
        int resul = 1;
        for (int i = 0; i < expo; i++) {
            resul = multiplicar(resul, base);
        }
        return resul;
    }

    public static int multiplicar(int resul, int base) {
        int suma = 0;
        for (int i = 0; i < resul; i++) {
            suma = suma + base;
        }
        return suma;
    }
}
