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
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i;

        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextInt();

        for (i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }  
    }
}
