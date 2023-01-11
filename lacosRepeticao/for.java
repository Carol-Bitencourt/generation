package lacosRepeticao;

import java.util.Scanner;

public class for {
  //Faça um sistema que receba um número do usuário e gere a tabuada daquele número
  // CASO (para fins de avaliação)
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, incremento;

    System.out.println("Envie um número:");
    numero = entrada.nextInt();

    for(incremento = 0; incremento <= 10; incremento ++) {
      System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
    }
  }
}