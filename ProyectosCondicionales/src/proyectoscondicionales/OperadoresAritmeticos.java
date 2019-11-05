/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscondicionales;

/**
 *
 * @author reroes
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 3;
        int suma = valorA + valorB;
        int resta = valorA - valorB;
        int multiplicacion = valorA * valorB;
        double division = valorA / (double)valorB;
        int residuo = valorA % valorB; //el residuo se calcula y se signa con la variale%. 


        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB, suma);
        
        
        System.out.printf("Resta: %d - %d = %d\n", valorA, valorB, resta);
        System.out.printf("Multiplicación: %d * %d = %d\n", valorA, valorB,
                multiplicacion);
        System.out.printf("División: %d / %d = %.2f\n", valorA, valorB,
                division);
        System.out.printf("Módulo o Resto: %d %% %d = %d\n", valorA, valorB, 
                residuo); //el otro porsentaje se pone automaticamente para que se represente a si mismo.
    }

}
