package com.mycompany.reto1estructuradatos;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class ObtenerPromedio {
 
        public static double obtenerPromedio(Stack<Integer> vector) {
        int sumaTotal = 0;
        for (int numero : vector) {
            sumaTotal += numero;
        }
        return (double) sumaTotal / vector.size();
    }
}
