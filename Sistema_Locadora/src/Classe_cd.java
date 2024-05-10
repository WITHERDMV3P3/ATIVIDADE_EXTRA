import java.util.Scanner;

public class Classe_cd  extends Classe_midia {
	
	 private int vmusicas;

	 
	 public Classe_cd()
	 { this(0,0.0,"Nenhum",0); 
	}

	
	 public Classe_cd(int codigo, double preco, String nome, int nMusicas)
	 {
	 
	 super(codigo, preco, nome);
	 setMusica(nMusicas);
	 }

	 
	 public String getTipo()
	 { return "CD: "; }
	
	 public String getDetalhes()
	{ return super.getDetalhes() + "\n" +
	 "Numero de músicas: " + vmusicas + "\n";
	 }

	 public void setMusica(int nmus)
	 { vmusicas = (nmus > 0) ? nmus : 0; }

	 
	 public void inserirDados()
	 { 
	 super.inserirDados();

	 Scanner inserir = new Scanner(System.in);
	 
	 System.out.printf("\n Entre com o numero de musicas: ");
	 int dmusica = inserir.nextInt();

	 
	 
	 setMusica(dmusica); }
}
