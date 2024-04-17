package ViniciusLicaoQuarta;

public class Secretario extends Pessoa {
	public double salario;
	public boolean trabSabado;
	
	void exibirDados() {super.exibirDados();
	System.out.println("Salário: " + this.salario);
	System.out.println("Trabalha aos sabados? " + this.trabSabado);
	}

}
