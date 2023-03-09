package cliente;

//Crie a classe cliente com os seus respectivos Métodos e Atributos;
//Crie uma Classe chamada TestaCliente;
//Instancie dois objetos da Classe Cliente e apresente as informações destes 2 Objetos no console.



public class Cliente {
	
	  private String nome;
	  private String cpf;
	  private String endereco;
	  private String telefone;
	  private String email;
	  	  
		public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
			this.nome = nome;
			this.cpf = cpf;
			this.endereco = endereco;
			this.telefone = telefone;
			this.email = email;	
		}	



	public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getNome() {
	    return this.nome;
	  }
	  

	  public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

	  public void setEndereco(String endereco) {
	    this.endereco = endereco;
	  }

	  public String getEndereco() {
	    return this.endereco;
	  }

	  public void setTelefone(String telefone) {
	    this.telefone = telefone;
	  }

	  public String getTelefone() {
	    return this.telefone;
	  }
	  
	  public void setEmail(String email) {
			this.email = email;
		}

	  public String getEmail() {
			return email;
		}


		


	}