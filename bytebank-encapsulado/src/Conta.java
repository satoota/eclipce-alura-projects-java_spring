
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
//static aqui significa que o total pertence a classe
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
		
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor igual a zero");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {

		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é "+ total);
		this.agencia = agencia;
		this.numero = numero;
//		Construtor padrão(quase faz nada)
// 		Poderia conectar-se com o banco de dados
		System.out.println("estou criando uma conta " + this.numero);
	}
	public int getTotal() {
		return Conta.total;
	}
}
