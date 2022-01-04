package oo.heranca;

public class Heroi extends Jogador{
    public void atacar(Jogador oponente) {
        // Math.abs -> não me importa se o valor é negativo ou positivo,
        // só quero o valor
        int difX = Math.abs(x - oponente.x);
        int difY = Math.abs(y - oponente.y);

        if(difX == 0 && difY == 1) {
            oponente.vida -= 20;
        } else if(difX == 1 && difY == 0) {
            oponente.vida -= 20;
        }
    }
}
