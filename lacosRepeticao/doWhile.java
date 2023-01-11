package lacosRepeticao;

import java.util.Scanner;

public class doWhile {
  //Faça um sistema que receba um número do usuário e gere a tabuada daquele número
  // CASO (para fins de avaliação)

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, incremento = 0;
  
    System.out.println("Envie um número:");
    numero = entrada.nextInt();
  
    do {
      System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
      incremento++;
    } while (incremento == 10);
  }

}