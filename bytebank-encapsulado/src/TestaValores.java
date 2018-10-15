
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(9652, 1578);


		System.out.println(conta.getAgencia());
		conta.setAgencia(123123123);
		Conta conta2 = new Conta(9567, 5555);
		
		System.out.println(conta2.getTotal());
		
	}
	
}
