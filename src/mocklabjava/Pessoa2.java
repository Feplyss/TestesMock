package mocklabjava;

public class Pessoa2 implements IPessoa{
	private int idade;

	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void falar() {
		System.out.println("Catapimbas manito!");
		
	}

}
