package fundamentos;

public class DesafioOperadores {
    public static void main(String[] args) {
        double a1_1 = Math.pow(6 * (3 + 2), 2);
        double a1_2 = 3 * 2;

        double a2 = (double)((1 - 5) * (2 - 7)) / 2;

        double valor1 = a1_1 / a1_2;
        double valor2 = Math.pow(a2, 2);

        double result1 = valor1 - valor2;

        double resultFinal = Math.pow(result1, 3) / Math.pow(10, 3);

        System.out.println(resultFinal);
    }
}
