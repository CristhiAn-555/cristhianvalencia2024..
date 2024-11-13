/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.cristhian_valencia2024;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Cristhian_Valencia2024 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int[] dias = new int[7];
        double  promedio = 0, puntuacionAlto = 0, puntuacionBajo = 0;
        int diasEncimaPromedio = 0;
        
        
        //p2
        
        System.out.println("Ingresar la putuacion diarias");
        for(int i = 0; i < 7; i++){
            
            System.out.print("puntuacion diarias " + (i + 1) + ": ");
           dias[i] = scanner.nextDouble();
        }
        
        int opcion;
        do {
            
            System.out.println("Mostrar los 5 menu");
            System.out.println("1.calcular el total de puntuaciones de la semana");
            System.out.println("2.calcular el promedio de puntuaciones y mostrar los dias por encima y por debajo del promedio");
            System.out.println("3.mostrar el dia con la puntuciones mas alta y el dia con la puntuacion mas baja");
            System.out.println("4.calcular el total de puntuciones acumuladas durante los primeros cuatro dias y los ultimos cuatro dias");
            System.out.println("5.salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            
            switch (opcion){
                case 1:
                    promedio = 0;
                    for(int dias : promedio){
                        promedio += dias;
                    }
                    promedio = dias.length;
                    System.out.println("las suma de los dias :" + dias );
                    
            }
                
        
            
            
    }
        
}
