/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_traducion_a_java;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaha
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificacion;

        System.out.print("Ingrese una calificacion entre 0 y 10: ");
        calificacion = sc.nextDouble();

        if (calificacion >= 9) {
            System.out.println("Excelente");
        } else if (calificacion >= 8) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7) {
            System.out.println("Bueno");
        } else if (calificacion >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
        
    }
}
