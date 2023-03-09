package estabelecimento;

public class PessoaJuridica extends Cliente {
	private long cnpj;
	
	public PessoaJuridica(String nome, int idade, long cnpj) {
		super(nome, idade);
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica() {}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("Seu nome: " + getNome() + 
				" Sua idade: " + getIdade() +
				" Seu cpf: " + getCnpj());
	}
	
}