package com.mycompany.reto1estructuradatos;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class MostrarPila {
   
        public static void mostrarPila(Stack<Integer> pila) {
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
