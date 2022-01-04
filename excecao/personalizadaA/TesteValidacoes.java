package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("", 7);

		try {
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.err.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Fim...");
	}
}
