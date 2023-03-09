package cliente;

import cliente.Cliente;

public class TestaCliente {
	
	public static void main(String[] args){
		
	Cliente novoCliente = new Cliente("Celina", "1234567","Avenida Regina Lacerda", "81999887", "celina.marinho@gmail.com");
	
	System.out.println("Nome: " + novoCliente.getNome());
	System.out.println("CPF: " + novoCliente.getCpf());
	System.out.println("Endereço: " + novoCliente.getEndereco());
	System.out.println("Email: " + novoCliente.getEmail());
	

   }

}
