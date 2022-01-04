package arraysCollections.arrays;

import java.util.Arrays;

public class DecimalBinario {
    public static void main(String[] args) {
        int[] valor = {128, 64, 32, 16, 8, 4, 2, 1};
        int[] binario = new int[8];
        int num = 3;

        for (int i = 0; i < valor.length; i++) {
            if (num >= valor[i]) {
                num -= valor[i];
                binario[i] = 1;
            } else {
                binario[i] = 0;
            }
        }

        System.out.println(Arrays.toString(binario));
    }
}
