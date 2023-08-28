/*
Ejercicio A:
Cree un algoritmo el cual permita ingresar un vector de n posiciones,
por medio de funciones hacer lo siguiente:
1) identificar si el número es divisible por dos, lo almacene en una pila
2) sacar el promedio de los números ingresados y mostrarlo
3) eliminar los números primos mostrar los números eliminados y los números no eliminados en pilas

Tener en cuenta que se deben crear funciones a parte para cada funcionalidad
y que se debe mostrar cada resultado por consola
*/

package com.mycompany.reto1estructuradatos;
import static com.mycompany.reto1estructuradatos.EliminarPrimos.eliminarPrimos;
import static com.mycompany.reto1estructuradatos.MostrarPila.mostrarPila;
import static com.mycompany.reto1estructuradatos.NumerosDivisibles.obtenerNumerosDivisibles;
import static com.mycompany.reto1estructuradatos.ObtenerPromedio.obtenerPromedio;
import java.util.Scanner;
import java.util.Stack;

public class Reto1EstructuraDatos {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingese la cantidad de números que va a evaluar: ");
        int n = lector.nextInt();

        Stack<Integer> vector = new Stack<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número en la posición "+(i+1)+" :");
            int numero = lector.nextInt();
            vector.push(numero);
        }

        Stack<Integer> pilaDivisibles = obtenerNumerosDivisibles(vector);
        double promedio = obtenerPromedio(vector);
        Stack<Integer> pilaNoPrimos = eliminarPrimos(vector);

        System.out.println("Números divisibles por dos:");
        mostrarPila(pilaDivisibles);

        System.out.println("Promedio de los números ingresados: " + promedio);

        System.out.println("Números primos eliminados:");
        mostrarPila(pilaNoPrimos);

        System.out.println("Números no primos:");
        mostrarPila(vector);
    }  
}
