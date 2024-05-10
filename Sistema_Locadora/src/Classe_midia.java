import java.util.Scanner;

public class Classe_midia {
	private int codigo;
	 private double preco;
	 private String nome;


	 
	 public void setCodigo(int codigo)
	 { this.codigo = codigo; }

	 public void setPreco(double preco)
	 { this.preco = preco; }

	 public void setName(String nome)
	 { this.nome = nome; }


	 public int getCodigo()
	 { return codigo; }

	 public double getPreco()
	 { return preco; }

	 public String getName()
	 { return nome; }


	 public Classe_midia()
	 {
	 this(0,0.0,"Nenhum"); 
	 }


	 
	 public Classe_midia(int codigo, double preco, String nome)
	 {
	 setCodigo(codigo);
	 setPreco(preco);
	 setName(nome);
	 }
	


	 public String getTipo()
	 {
	return "Midia: ";
	 }



	 public String getDetalhes()
	 {
	 return "Codigo: " + getCodigo() + "\n" +
	 "Preco: " + getPreco() + "\n" +
	 "Nome: " + getName() + "\n";
	 }


	 public void printDados()
	 {
	String s = getTipo() + "\n" + getDetalhes() + "\n";
	 System.out.println(s);
	 }


	 public void inserirDados()
	 {
	 Scanner in = new Scanner(System.in);

	 System.out.printf("\n Entre com o codigo: ");
	 int cod = in.nextInt();
	 System.out.printf("\n Entre com o preco: ");
	 double pre = in.nextDouble();
	 in.nextLine();
	 System.out.printf("\n Entre com o nome: ");
	 String nam = in.nextLine();

	 setCodigo(cod);
	 setPreco(pre);
	 setName(nam);
	 }


	} 


