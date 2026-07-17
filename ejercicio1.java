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
public class ejercicio1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, carrera;
        int edad;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        sc.nextLine();

        System.out.print("Ingrese su carrera: ");
        carrera = sc.nextLine();

        System.out.print("Ingrese su estatura: ");
        estatura = sc.nextDouble();

        System.out.println(" Datos ingresado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura );   

}
}