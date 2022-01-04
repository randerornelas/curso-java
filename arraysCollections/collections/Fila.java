package arraysCollections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Add e Offer adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia.
        fila.add("Ana"); // retorna false
        fila.offer("Bia");// lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e element obtêm o proximo elemento (sem remover)
        // A diferença é o comportamento quando a fila está vazia
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek()); // lança uma exceção
        System.out.println(fila.element());
        System.out.println(fila.element());

        // Poll e remove obtêm o proximo elemento (e remove)
        // A diferença é o comportamento quando a fila está vazia
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // lança uma exceção
    }
}
