
package com.mycompany.reto1estructuradatos;

import static com.mycompany.reto1estructuradatos.DivisibelPorDos.esDivisiblePorDos;
import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class NumerosDivisibles {
    
    public static Stack<Integer> obtenerNumerosDivisibles(Stack<Integer> vector) {
        Stack<Integer> pilaDivisibles = new Stack<>();
        for (int numero : vector) {
            if (esDivisiblePorDos(numero)) {
                pilaDivisibles.push(numero);
            }
        }
        return pilaDivisibles;
    }
}
