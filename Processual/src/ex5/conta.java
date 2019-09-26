package ex5;

public class conta {

	public static void main(String[] args) {
		Invoice c1 = new Invoice();
		
		c1.quantidadeCompradaDoItem = 78;
		c1.numeroDoItemFaturado = "12543";
		c1.precoUnitarioDoItem = 6.5;
		
		System.out.println("o Preco final é"+c1.precoFinal);
		
	}

}
