package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double getValorTotal() {
        double total = 0;

        for (Compra compra: compras) {
            total += compra.getValorTotal();
        }

        return total;
    }

    void adicionarCompra(Compra c) {
        this.compras.add(c);
    }
}
