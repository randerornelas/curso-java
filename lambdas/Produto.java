package lambdas;

public class Produto {
    final String nome;
    private double preco;
    private double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        setPreco(preco);
        setDesconto(desconto);
    }

    @Override
    public String toString() {
        return this.nome + " Preço: " + getPreco();
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
