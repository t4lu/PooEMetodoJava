package ExerciciosPooEMetodo;
/*Função: Exercício 3 Anexo Unico
 * Autora: Talu - Turma 25
 * Data: 08.06.2021
*/
import java.util.Scanner;
//testando classe "Produtos Eletrônicos"
public class TestaExercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Exercicio3 produtos = new Exercicio3();
		
		System.out.println("Sistema do Aparelho: ");
		produtos.setCelular(entrada.nextLine());
		
		System.out.println("Entrada do Fone: ");
		produtos.setFone(entrada.nextLine());
		
		System.out.println("Entrada do Carregador: ");
		produtos.setCarregador(entrada.nextLine());
		
	entrada.close();
	//imprime:
	System.out.println("=== Resumo de Dados do Aparelho ===");
	System.out.println("Tipo de sistema: " + produtos.getCelular());
	System.out.println("Entrada do Fone: " + produtos.getFone());
	System.out.println("Entrada do Carregador: " + produtos.getCarregador());
	}
}
