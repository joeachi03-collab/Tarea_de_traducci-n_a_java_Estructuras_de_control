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
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena;
        final String clave_correcta = "java2026";

        do {
            System.out.print("Ingrese la contrasena: ");
            contrasena = sc.nextLine();
        } while (!contrasena.equals(clave_correcta));

        System.out.println("Acceso concedido.");
    }
}
