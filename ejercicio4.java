package tarea_de_traducion_a_java;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class ejercicio4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int nota;
   

        System.out.print("Ingrese la nota de un estudiante: ");
        nota = sc.nextInt();

       if ( nota >= 7){
       
          System.out.print("aprobado ");       
          }
       else  {
            System.out.print("reprobado "); 
      }
         
    }
}
