package ViniciusLicaoQuarta;

public class Aluno extends Pessoa{
	public String matricula;
	public String curso;
	
	void exibirDados() {super.exibirDados();
	
	System.out.println("Matricula: " + this.matricula);
	System.out.println("Curso: " + this.curso);}

}
