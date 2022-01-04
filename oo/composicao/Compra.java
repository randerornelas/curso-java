package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double valor) {
        this.itens.add(new Item(nome, quantidade, valor));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
