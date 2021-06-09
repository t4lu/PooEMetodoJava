package ExerciciosPooEMetodo;
/*Função: Exercício 1 Anexo Unico
 * Autora: Talu - Turma 25
 * Data: 08.06.2021
*/
import java.util.Scanner;
//Testando classe "Cliente"
public class TestaExercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Exercicio1 cli1 = new Exercicio1();
		
		System.out.println("Nome: ");
		cli1.setNome(entrada.nextLine());
		
		System.out.println("E-mail: ");
		cli1.setEmail(entrada.nextLine());
		
		System.out.println("CPF: ");
		cli1.setCPF(entrada.nextLine());
		
		System.out.println("Gênero: ");
		cli1.setGenero(entrada.nextLine()); 
		
		System.out.println("Telefone: ");
		cli1.setTelefone(entrada.nextLine());
		
		cli1.Dados();
		
	entrada.close();
	}
}