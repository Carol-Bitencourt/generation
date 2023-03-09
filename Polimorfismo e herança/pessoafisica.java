package estabelecimento;

public class PessoaFisica extends Cliente {
	private int cpf;
	
	public PessoaFisica(String nome, int idade, int cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}
	
	public PessoaFisica() {}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("Seu nome: " + getNome() + 
				" Sua idade: " + getIdade() +
				" Seu cpf: " + getCpf());
	}
	
}