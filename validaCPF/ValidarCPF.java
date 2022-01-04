package exercicios.validaCPF;

public class ValidarCPF {
    int reverso = 10;
    int cont = 0;
    int num;
    int total = 0;
    int result;

    String digito = "";

    public String validar(String cpf) {

        StringBuilder cpfBuilder = new StringBuilder(cpf.substring(0, 9));
        for(int i = 0; i < 2; i++) {
            while(reverso >= 2) {
                num = Character.getNumericValue(cpfBuilder.charAt(cont));

                total += num * reverso;

                reverso--;
                cont++;
            }

            result = 11 - (total % 11);

            if (result > 9) {
                digito = "0";
            } else {
                digito = String.valueOf(result);
            }

            reverso = 11;
            total = 0;
            cont = 0;

            cpfBuilder.append(digito);
        }

        cpf = cpfBuilder.toString();

        return cpf;
    }
}
