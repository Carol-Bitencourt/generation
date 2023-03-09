/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package ContaBancaria;

//nome do objeto
public class ContaBancaria {

    // atributos-caracteristicas do objeto
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;

    //metodos construtores da classe Conta Bancaria

    public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {}


    // metodos acessores da classe Conta Bancaria - precisa ter em todos os objetos criados, pois sem eles n�o conseguimos nem visualizar as informa��es, nem inserir novas informa��es aos novos objetos criados a partir dessa classe.
    //getters and setters são ENCAPSULAMENTOS e facilitam a manutenção da aplicação
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //metodos espec�ficos de conta bancaria - depende de objeto para objeto, e temos que levar em considera��o sempre qual � o objeto a ser criado, e criar m�todos espec�ficos de acordo com a funcionalidade de cada objeto
    //aqui criamos o metodo sacar, que recebe como parametro um valor a ser sacado. ele precisa ter obrigat�riamente o mesmo tipo de dado do saldo, que � o valor que vai ser modificado a partir do saque, no caso os dois precisam ser float
    public boolean sacar(float valorSacado) {
        // antes de tudo eu fa�o uma verifica��o,pegando o saldo da minha conta a partir do getSaldo, e comparando se o valor do saldo � maior que o valor a ser sacado. se n�o for eu j� barro o usuario na hora, indicando que o saldo � insuficiente e retornando um false na fun��o, mostrando que o saque n�o foi realizado
        if(this.getSaldo() < valorSacado) {
            System.out.println("Saldo insuficiente, tente quando estiver rico");
            return false;
        }

        // caso o valor sacado for menor que o do saldo, eu fa�o ent�o a opera��o de saque, pegando novamente o valor do saldo, e subtraindo o valor do saque

        this.setSaldo(this.getSaldo() - valorSacado);
        // por ultimo eu mostro ao meu usu�rio o valor sacado, e quando sobrou na conta, retornando true, o saque foi feito
        System.out.println("Valor de" + valorSacado + " sacado com sucesso! O seu valor de saldo agora � "+ this.getSaldo());
        return true;
    }
}