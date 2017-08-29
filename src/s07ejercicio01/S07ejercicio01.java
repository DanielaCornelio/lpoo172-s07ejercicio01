/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class S07ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // crear un nuevo objeto o escaner 
        Scanner input=new Scanner(System.in);
        //mostrar mensaje al usuario
        System.out.print("Ingrese temperatura en celsius:");
        double celsius= input.nextDouble();
        //convertir celsius a Fahrenheit
        double fahrenheit= 9.0 / 5 * celsius + 32;
        
        //mostrar el resultado
        System.out.println(celsius + " celsius son " + fahrenheit + "en Fahrenheit");
    }
    
}
