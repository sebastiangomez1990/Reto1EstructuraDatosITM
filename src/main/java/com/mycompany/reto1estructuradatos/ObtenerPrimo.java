package com.mycompany.reto1estructuradatos;

/**
 *
 * @author Usuario
 */
public class ObtenerPrimo {
    
        public static boolean obtenerPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
