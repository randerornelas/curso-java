package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
