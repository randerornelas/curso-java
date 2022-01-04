package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");

        p1.preco = 4356.90;

        Produto p2 = new Produto("Caneta");

        p2.preco =  12.50;

        Produto.desconto = 0.10;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        System.out.printf("%s %.2f%n", p1.nome, precoFinal1);
        System.out.printf("%s %.2f", p2.nome, precoFinal2);
    }
}
