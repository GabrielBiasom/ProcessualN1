package ex6;

public class Empregado {
	public String primeiroNome;
	public String sobreNome;
	public double salarioMensal;
	
	public Empregado(String primeiroNome, String SobreNome, Double SalarioMensal) {
		this.primeiroNome = primeiroNome;
		this.sobreNome = SobreNome;
		this.salarioMensal = SalarioMensal;
	}
	public String getprimeiroNome() {
		return primeiroNome;
	}
	public void setprimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String SobreNome) {
		this.sobreNome = SobreNome;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(Double Salario) {
		this.salarioMensal = Salario;
	}

		
	
	public double salarioAnual;
	
	salarioAnual = salarioAnual +(salarioAnual* 0.10);
	
	
}}
