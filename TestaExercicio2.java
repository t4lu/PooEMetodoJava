package ExerciciosPooEMetodo;
/*Função: Exercício 2 Anexo Unico
 * Autora: Talu - Turma 25
 * Data: 08.06.2021
*/
import java.util.Scanner;

//Testa classe "Avião"

public class TestaExercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Exercicio2 aviao = new Exercicio2();

		System.out.println("Avião: ");
		aviao.setAviao(entrada.nextLine());
		
		System.out.println("Companhia Aérea: ");
		aviao.setCiaAerea(entrada.nextLine());
		
		System.out.println("Fabricante: ");
		aviao.setFabricante(entrada.nextLine());
		
	entrada.close();
	//imprime:
	System.out.println("=== Resumo de Dados do Avião ===");
	System.out.println("Tipo do Avião inserido: " + aviao.getAviao());
	System.out.println("Companhia Aérea inserida: " + aviao.getCiaAerea());
	System.out.println("Fabricante Inserido: " + aviao.getFabricante());
	}
}