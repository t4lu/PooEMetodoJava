package ExerciciosPooEMetodo;
/*Fun��o: Exerc�cio 2 Anexo Unico
 * Autora: Talu - Turma 25
 * Data: 08.06.2021
*/
import java.util.Scanner;

//Testa classe "Avi�o"

public class TestaExercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Exercicio2 aviao = new Exercicio2();

		System.out.println("Avi�o: ");
		aviao.setAviao(entrada.nextLine());
		
		System.out.println("Companhia A�rea: ");
		aviao.setCiaAerea(entrada.nextLine());
		
		System.out.println("Fabricante: ");
		aviao.setFabricante(entrada.nextLine());
		
	entrada.close();
	//imprime:
	System.out.println("=== Resumo de Dados do Avi�o ===");
	System.out.println("Tipo do Avi�o inserido: " + aviao.getAviao());
	System.out.println("Companhia A�rea inserida: " + aviao.getCiaAerea());
	System.out.println("Fabricante Inserido: " + aviao.getFabricante());
	}
}