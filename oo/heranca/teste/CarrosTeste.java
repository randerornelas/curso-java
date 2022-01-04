package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarrosTeste {
    public static void main(String[] args) {
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.frear();

        System.out.printf("Vel. Civic: %dKm/h.", civic.velocidadeAtual);

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.desligarTurbo();
        ferrari.acelerar();
        ferrari.frear();

        System.out.printf("\nVel. Ferrari: %dKm/h.", ferrari.velocidadeAtual);
    }
}
