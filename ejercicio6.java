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
public class ejercicio6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero entre 1 y 7: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero fuera de rango");
        }
        
    }
}
