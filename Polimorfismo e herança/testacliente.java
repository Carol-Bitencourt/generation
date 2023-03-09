package estabelecimento;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa Física:
		PessoaFisica cliente1 = new PessoaFisica("Matheus", 27, 23584525);
		PessoaFisica cliente2 = new PessoaFisica("Luiza", 26, 84512561);
		
		cliente1.visualizar();
		cliente2.visualizar();
		
		System.out.println("\n");
		//Pessoa Juridica:
		PessoaFisica pessoaJuridica1 = new PessoaFisica("Determinação", 10, 1258471);
		PessoaFisica pessoaJuridica2 = new PessoaFisica("Esperança", 6, 152288744);
		
		pessoaJuridica1.visualizar();
		pessoaJuridica2.visualizar();
	}

}