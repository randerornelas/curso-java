package arraysCollections.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        // com HashSet<> o conjunto é mostrado aleatoriamente
        // Set<String> listaAprovados = new HashSet<>();

        // com TreeSet<> o conjunto é mostrado na ordem em que foram inseridos
        TreeSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        System.out.println();

        HashSet<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int num: nums) {
            System.out.println(num);
        }
    }
}
