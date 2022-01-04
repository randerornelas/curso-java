package arraysCollections.collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.remove('x');
        conjunto.remove(1.2);

        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.contains(3));
        System.out.println(conjunto.contains("Teste"));
    }
}
