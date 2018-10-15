
public class TestaGetESet {
public static void main(String[] args) {
	Conta conta= new Conta(1337,24226);
	
	conta.setAgencia(9630);
	System.out.println(conta.getAgencia());
	
	Cliente paulo = new Cliente();
	conta.setTitular(paulo);
	
	paulo.setNome("paulo silveira");
	conta.setTitular(paulo);
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programador");
	System.out.println(conta.getTitular());
}
}
