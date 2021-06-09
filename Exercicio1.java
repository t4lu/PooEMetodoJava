package ExerciciosPooEMetodo;
/*Função: Exercício 1
 * Autora: Talu - Turma 25
 * Data: 08.06.2021
*/
public class Exercicio1 { //botao direito > source pra chamar os getters e setters (métodos)
//nao precisa de main pq sera encapsuladah
		private String nome;
		private String CPF;
		private String genero;
		private String email;
		private String telefone;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void Dados () {
		System.out.println("=== Dados Cadastrados ===\n"
		+ "Nome: " + nome + "\nCPF: " + CPF + "\nGênero: " + genero 
		+ "\nTelefone: " + telefone + "\nE-mail: " + email);
	}	
}