/* 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião,
defina as instancias deste objeto e apresente as informações deste objeto no console. */

package exerciciosPOO;
/// nome da classe/objeto sempre maiúsculo
public class Aviao {

    /// atributos-caracteristicas do objeto
    private String companhia;
    private double peso;
    private int velocidade;
    private String cor;
    private int lotacao;
    private String nome;
    private double preco;

    ///contrutores gerados automaticamente
    public Aviao (String companhia, double peso, int velocidade, String cor, int lotacao, String nome, double preco) {
        this.companhia = companhia;
        this.peso = peso;
        this.velocidade = velocidade;
        this.cor = cor;
        this.lotacao = lotacao;
        this.nome = nome;
        this.preco = preco;
    }
    /// esse construtor deve ficar assim vazio
    public Aviao () {    }

    /// getters and setters gerados automaticamente
    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

