import java.util.Scanner;

public class Classe_midia {
	private int codigo;
	 private double preco;
	 private String nome;

	 // Métodos para inserir valores nos campos.
	 
	 public void setCodigo(int codigo)
	 { this.codigo = codigo; }

	 public void setPreco(double preco)
	 { this.preco = preco; }

	 public void setName(String nome)
	 { this.nome = nome; }

	 // Métodos para retornar os valores contidos nos campos.
	 public int getCodigo()
	 { return codigo; }

	 public double getPreco()
	 { return preco; }

	 public String getName()
	 { return nome; }

	 // Construtor sem parâmetros.
	 public Classe_midia()
	 {
	 this(0,0.0,"Nenhum"); // Chamada ao construtor com param.
	 }

	 // Construtor com parâmetros.
	 
	 public Classe_midia(int codigo, double preco, String nome)
	 {
	 setCodigo(codigo);
	 setPreco(preco);
	 setName(nome);
	 }
	

	 // Função para impressao dos dados do tipo.
	 public String getTipo()
	 {
	return "Midia: ";
	 }


	 // Função que retorna o conteúdo do campos em forma de String.
	 public String getDetalhes()
	 {
	 return "Codigo: " + getCodigo() + "\n" +
	 "Preco: " + getPreco() + "\n" +
	 "Nome: " + getName() + "\n";
	 }

	 // Função para impressao dos dados via getDetalhes().
	 public void printDados()
	 {
	String s = getTipo() + "\n" + getDetalhes() + "\n";
	 System.out.println(s);
	 }

	 // Função para leitura dos dados via teclado.
	 public void inserirDados()
	 {
	 Scanner in = new Scanner(System.in);

	 // Leitura dos dados do teclado.
	 System.out.printf("\n Entre com o codigo: ");
	 int cod = in.nextInt();
	 System.out.printf("\n Entre com o preco: ");
	 double pre = in.nextDouble();
	 in.nextLine(); // Leitura do enter.
	 System.out.printf("\n Entre com o nome: ");
	 String nam = in.nextLine();

	 // Enviando os dados lidos para as funcoes set.
	 setCodigo(cod);
	 setPreco(pre);
	 setName(nam);
	 }


	} // Fim Classe Mídia.


