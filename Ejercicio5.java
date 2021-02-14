/*

Realizado por: Valentina Meneses Tangarife

Construya una funcion que reciba un numero entero y devuelva su factorial

 */
package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular el factorial: ");
        num = sc.nextInt();

        System.out.println("El factorial del numero " + num + " es igual a: " + factorial(num));
    }

    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
