
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		System.out.println("");
		int idade = 17;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo");
		} else {

			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
}
