package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem("Notebook", 2000, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Impressora", 1000, 1);
        compra2.adicionarItem("Caderno", 10, 10);

        Cliente cliente1 = new Cliente("João");
        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println("Valor total da compra: " + cliente1.getValorTotal());
    }
}
