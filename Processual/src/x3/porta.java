package x3;


public class porta {
	public boolean aberta;
	public int pAberta;
	public int pFechada;
	public boolean fechada;
	public String cor;
	public int dimensaoX = 80;
	public int dimensaoY = 210;
	public int dimensaoZ = 3;
	
	public String abre() {
		if (this.fechada = false) {
		//this.fechada = false;
		this.aberta = true;
		this.pAberta++;
		}
		return "aberta";
	}
	
	public String fecha() {
		if (this.aberta = false) {
		//this.aberta= false;
		this.fechada = true;
		this.pFechada++;
		}
		return "fechada";
	}
		
	public void pinta (String s) {
		this.cor= s;		
		s = "azul";
		s = "verde";
		s = "vermelho";
	}
	public boolean estaAberta() {
		if (this.aberta = false) {
			return true;
		}else {
			return false;
}}}
	public class casa{
		 public String cor;
		 public boolean porta1;
		 public boolean porta2;
		 public boolean porta3;
		 public int portasAbertas = 0;
		 public int portassss;
		 
		 public void pinta (String s) {
			 s = "branca";
			 this.cor = s;			 
			 
		 }
		  public int totalDePortas (){
			  if (this.porta1 = true){
				  portasAbertas++;
			  }
			  if (this.porta2 = true){
				  portasAbertas++;
			  }
			  if (this.porta3 = true){
				  portasAbertas++;
			  }
			  return 1;
		  }
		  
		  public int quantasPortasEstaoAbertas() {
			  System.out.println(this.portasAbertas+"Portas abertas");
			  return 1;
			  
		  }}
	 }
