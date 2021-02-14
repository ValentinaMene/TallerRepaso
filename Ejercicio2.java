/*

Realizado por: Valentina Meneses Tangarife

Construya una funcion que reciba como argumento una palabra y que diga si esta es 
un palíndromo o no.

 */
package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String pal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la palabra para verificar si es un palíndromo o no: ");
        pal = sc.next();

        boolean resultado = PalindromoVerificacion(pal);
        if (resultado == true) {
            System.out.println("La palabra " + pal + " es un palindromo");
        } else {
            System.out.println("La palabra " + pal + " no es un palindromo");
        }

    }

    public static boolean PalindromoVerificacion(String pal) {
        int P = pal.length();
        for (int i = 0; i < P / 2; i++) {
            if (pal.charAt(i) != pal.charAt(P - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
