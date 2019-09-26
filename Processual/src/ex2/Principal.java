package ex2;

public class Principal {

	public static void main(String[] args) {
		ContaCorrenteSimplificada c1;
		c1 = new ContaCorrenteSimplificada();
		
		
		ContaCorrenteSimplificada c2 = new ContaCorrenteSimplificada();
		
		c1.agencia = "123";
		c1.nroContaCorrente = "11115-2";
		c1.nomeDoCorrentista =  "Thiago Magno";
		c1.saldo = 50000.00;
		c1.especial = false;
		c1.sacar(52000);
		
		c2.agencia = "123";
		c2.nroContaCorrente = "22227-3";
		c2.nomeDoCorrentista = "Samuel Suassuna";
		c2.saldo = 50000.00;
		
		 c1.sacar(500);
		 c1.exibirSaldo();
		 c2.exibirSaldo();
		 
		 c1 = c2;
		 c1.exibirSaldo();
		 c1.sacar(30000);
		 c1.exibirSaldo();
		 c2.exibirSaldo();
		 
		 double x = c2.sacar(200000);
		 c2.exibirSaldo();


}
