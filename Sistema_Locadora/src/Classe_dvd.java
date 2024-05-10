import java.util.Scanner;

public class Classe_dvd extends Classe_midia {
	private int faixas;

	 public Classe_dvd()
	 { this(0,0.0,"Nenhum",0); }

	 public Classe_dvd(int codigo, double preco, String name, int nFaixas)
	 { super(codigo, preco, name); 

	 setFaixas(nFaixas); }
	 
	 	 public String getTipo()
	 { return "Classe_dvd: "; }
	 
	 
	 public String getDetalhes()
	 { return super.getDetalhes() + "\n" +
	 "Numero de faixas: " + faixas + "\n"; }

	 public void setFaixas(int nfaix)
	 { faixas = (nfaix > 0) ? nfaix:0; }

	 
	 public void inserirDados()
	 {
	
		 
	 super.inserirDados();

	 Scanner inserir = new Scanner(System.in);


	 System.out.printf("\n Entre com o numero de faixas: ");
	 int vfaixas = inserir.nextInt();


	 setFaixas(vfaixas);
	 }

}
