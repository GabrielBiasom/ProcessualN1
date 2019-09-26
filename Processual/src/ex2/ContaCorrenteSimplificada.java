package ex2;


public class ContaCorrenteSimplificada {
	String agencia;
	String nroContaCorrente;
	double saldo;
	String nomeDoCorrentista;
	boolean especial;
	PessoaFisica[] pessoas = new PessoaFisica[2];
	int qtdMax = 2;
	int qtdAtual = 0;
	
	double sacar(double valor) {
		if(valor > this.saldo && this.especial) {
			System.out.println("Saldo Insuficiente para saque");
		}
		else {
			if(this.saldo - valor > -5000)
				this.saldo = this.saldo - valor;			
		}
		return this.saldo;
	}
	
	double depositar(double valor) {
		this.saldo = this.saldo + valor;
		return saldo;
	}
	
	void exibirSaldo() {
		System.out.println("SALDO: "+ this.saldo);
	}
	
	void adicionarPessoa(PessoaFisica p) {
		if(qtdAtual<qtdMax) {
			this.pessoas[qtdAtual] = p;
			qtdAtual++;
		}
	}


}
