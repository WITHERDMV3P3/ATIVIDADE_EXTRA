import java.util.Scanner;

public class Testar_midia {
	 public static void main(String args[])
	 {
		 
	 Classe_midia[] listadedados = new Classe_midia[10];

	 int escolha;

	
	 for (int i=0; i < 2; i++)
	 {
	 
	 System.out.printf("Digite por favor 1 para CD e 2 para DVD");
	 Scanner in = new Scanner(System.in);
	 escolha = in.nextInt();
	 if (1 == escolha) 
	 listadedados[i] = new Classe_cd();
	 else 
	 listadedados[i] = new Classe_dvd();
	 listadedados[i].inserirDados(); 
	
	 }
	 
	 for (int i=0; i < 2; i++)
	 listadedados[i].printDados();
	 }
}
