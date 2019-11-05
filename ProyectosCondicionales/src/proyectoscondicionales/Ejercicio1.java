/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscondicionales;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia a pagado tres cuotas de navidad de sus hijos.
 * La cuota uno fue de 15 dolares, la cuota dos fue de 10 dolares 
 * y la cuota tres  de 16 dolares.
 * Generar un programa en lenguaje java que permita 
 * ingresar por teclado los valores de las cuotas luego precentar el promedio de
 * dolares pagados entre las cuotas, ademas precentar un mensaje en pantalla(truo o false)
 * dependiendo del promedio, si el promedio es mayor o igual a 11 deberia salir truo.
 * si el primedio es menor a 11 deberia salir false.
 */
public class Ejercicio1 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         
         double uno;
         double dos;
         double tres;
         double suma;
         double promedio;
         
         
         System.out.println("Ingrese el valor de las cuotas(si desea ponga los centavos)"
                 + ":\nIngrese el valor de lacuota uno:");
         uno = entrada.nextDouble();
        
         System.out.println("Ingrese el valor de la cuota dos:");
         dos = entrada.nextDouble();
            System.out.println("Ingrese el valor de la cuota tres:");
         tres = entrada.nextDouble();
         suma = uno + dos + tres;
         promedio = suma / 3;
         System.out.printf("Promedio: %.2f\n", promedio); 
       
         System.out.printf("Mayor Igual: %.2f >= 11 = %s\n", promedio, promedio >= 11); 
         System.out.printf("Menor: %.2f < 11 = %s\n",  promedio, promedio < 11);
         
         
         
         
         
         
         
         
         
         
    
        
    }
    
}
