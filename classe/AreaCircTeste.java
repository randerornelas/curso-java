package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5.6);
//        a1.pi = 5;

        AreaCirc a2 = new AreaCirc(10);
//        a2.pi = 10;

        System.out.println(a1.area());
        System.out.println(a2.area());
    }
}
