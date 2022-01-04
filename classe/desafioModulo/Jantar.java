package classe.desafioModulo;

public class Jantar {
    public static void main(String[] args) {
        // criar pessoa
        Pessoa p1 = new Pessoa("João", 65);
        Pessoa p2 = new Pessoa("Pedro", 80);

        // instanciar duas comidas
        Comida arroz = new Comida("Arroz", 2);
        Comida feijao = new Comida("Feijão", 3);

        // comer a comida e mostar o peso
        System.out.println(p1.peso);
        p1.comer(arroz);
        System.out.println(p1.peso);

        System.out.println();

        System.out.println(p2.peso);
        p2.comer(feijao);
        System.out.println(p2.peso);
    }
}
