package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(14, 6, 2021);

        Data data2 = new Data();

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }
}
