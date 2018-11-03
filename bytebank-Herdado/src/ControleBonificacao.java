
public class ControleBonificacao {

	double soma;

	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;
	}

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
	
	public void registra(EditorVideo ev) {
		double boni = ev.getBonificacao();
		this.soma = this.soma + boni;
	}
	
}
