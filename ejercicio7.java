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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cantidad;
        int suma;

        cantidad = 0;
        suma = 0;

        do {
            System.out.print("Ingrese un numero positivo (negativo para terminar): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma = suma + numero;
                cantidad = cantidad + 1;
            }
        } while (numero >= 0);

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);   
    }
}
