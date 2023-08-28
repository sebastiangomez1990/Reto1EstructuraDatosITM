package com.mycompany.reto1estructuradatos;

import static com.mycompany.reto1estructuradatos.ObtenerPrimo.obtenerPrimo;
import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class EliminarPrimos {
    
 public static Stack<Integer> eliminarPrimos(Stack<Integer> vector) {
        Stack<Integer> pilaNoPrimos = new Stack<>();
        Stack<Integer> pilaPrimos = new Stack<>();

        while (!vector.isEmpty()) {
            int numero = vector.pop();
            if (obtenerPrimo(numero)) {
                pilaPrimos.push(numero);
            } else {
                pilaNoPrimos.push(numero);
            }
        }

        // Restaurar los números no primos en el vector original
        while (!pilaNoPrimos.isEmpty()) {
            vector.push(pilaNoPrimos.pop());
        }

        return pilaPrimos;
    }
}
