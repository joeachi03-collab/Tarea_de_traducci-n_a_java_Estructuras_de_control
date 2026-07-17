/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_traducion_a_java;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i, suma;
        double promedio;

        suma = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = sc.nextInt();
            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
