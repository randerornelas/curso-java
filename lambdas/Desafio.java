package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
1. A partir do produto calcular o preço real (com desconto)
2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
3. Frete: >= 3000 (100)/ 3000 (50)
4. Arredondar: deixar duas casas decimais
5. Formatar: R$ 1234,56
 */

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);
        String resultado;

        BinaryOperator<Double> precoReal = (p1, p2) -> (p1 * (1 - p2));
//        System.out.println(precoReal.apply(p.preco, p.desconto));

        UnaryOperator<Double> impostoMunicipal = i -> i >= 2500 ? (i *= 1.085) : i;
//        System.out.println(precoReal.andThen(impostoMunicipal).apply(p.preco, p.desconto));

        UnaryOperator<Double> frete = f -> f >= 3000 ? (f += 100) : (f += 50);

        Function<Double, String> arredondar = a -> String.format("%.2f", a);

        Function<String, String> formatar = f -> ("R$ " + f);

        resultado = (precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p.getPreco(), p.getDesconto()));

        System.out.println(resultado);
    }
}
