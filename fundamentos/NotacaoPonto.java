package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";

        s = s.toUpperCase();
        System.out.println(s);

        s = s.replace("X", "Senhor");
        System.out.println(s);

        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("Rander".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "Rander")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);
    }
}
