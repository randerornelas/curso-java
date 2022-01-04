package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
