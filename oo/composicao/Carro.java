package oo.composicao;

public class Carro {
    Motor motor = new Motor();

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    void acelerar() {
        motor.fatorInjecao += 0.4;
    }

    void frear() {
        motor.fatorInjecao -= 0.4;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
