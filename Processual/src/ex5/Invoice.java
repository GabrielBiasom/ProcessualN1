package ex5;

public class Invoice {
	  String numeroDoItemFaturado;
	  String descricaoDoItem;
	  int quantidadeCompradaDoItem;
	  double precoUnitarioDoItem;
	  public double precoFinal;
	 
	 public int compra(){
		 System.out.println("Digite quantos itens tem no carrinho");
		 return quantidadeCompradaDoItem;
		 
		 if (quantidadeCompradaDoItem<1) {
			 this.quantidadeCompradaDoItem = 0;
		 }
		 if (precoUnitarioDoItem<1) {
			 this.precoUnitarioDoItem = 0;
		 }
		 precoFinal = quantidadeCompradaDoItem*precoUnitarioDoItem;
			 
		 }
	 
	 }
