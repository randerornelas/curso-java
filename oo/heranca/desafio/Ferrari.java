package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        super(240);
        setDelta(15);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    public void frear() {
        if (velocidadeAtual >= 0) {
            velocidadeAtual -= 15;
        } else {
            velocidadeAtual = 0;
        }
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if(!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
