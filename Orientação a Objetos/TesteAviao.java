package exerciciosPOO;
public class TesteAviao {
    public static void main(String[] args) {
        Aviao comercial = new Aviao("Gol", 2, 150, "branca", 500, "F420", 500);

        System.out.println("A compania desse avião é: " + comercial.getCompanhia());
        System.out.println("O peso desse avião é de: " + comercial.getPeso() + " toneladas");
        System.out.println("A velocidade desse avião é de: " + comercial.getVelocidade() + " km/h");
        System.out.println("A cor desse avião é: " + comercial.getCor());
        System.out.println("A lotação desse avião é de: " + comercial.getLotacao() + " passageiros");
        System.out.println("A nome desse avião é: " + comercial.getNome());
        System.out.println("O preço desse avião é de: " + comercial.getPreco() + " R$");
    }
    
}