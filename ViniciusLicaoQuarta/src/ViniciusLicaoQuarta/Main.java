package ViniciusLicaoQuarta;

public class Main {
	public static void main(String[] args) {
		Aluno al = new Aluno();
		
		al.cpf = "452.242.748.42";
		al.curso = "Ciencia da computação";
		al.email = "email@email.com";
		al.idade = 23;
		al.matricula = "123456m";
		al.nome = "Vinicius";
		al.sexo = 'M';
		al.telefone = "982621706";
		al.exibirDados();
		System.out.println();
		Secretario sec = new Secretario();
		sec.cpf = "152314652";
		sec.email = "secretario@secretario.com";
		sec.idade = 56;
		sec.nome = "Sr. Secretario";
		sec.salario = 9000;
		sec.sexo = 'm';
		sec.telefone = "12345678";
		sec.trabSabado = true;
		sec.exibirDados();
	}

}
