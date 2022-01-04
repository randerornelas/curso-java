package oo.heranca;

public class Jogador {
    public int vida = 100;
    public int x;
    public int y;

    protected void atacar(Jogador oponente) {
        // Math.abs -> não me importa se o valor é negativo ou positivo,
        // só quero o valor
        int difX = Math.abs(x - oponente.x);
        int difY = Math.abs(y - oponente.y);

        if(difX == 0 && difY == 1) {
            oponente.vida -= 10;
        } else if(difX == 1 && difY == 0) {
            oponente.vida -= 10;
        }
    }

    protected void andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> y--;
            case LESTE -> x++;
            case SUL -> y++;
            case OESTE -> x--;
        }
    }
}
