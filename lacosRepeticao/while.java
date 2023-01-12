package lacosRepeticao;

import java.util.Scanner;

public class while {
  //Faça um sistema que receba um número do usuário e gere a tabuada daquele número
  // if, else, for (para fins de avaliação)

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, incremento = 0, repeticao;
    
    System.out.println("Envie um número:");
    numero = entrada.nextInt();
    System.out.println("Repetir quantas vezes?:");
    repeticao = entrada.nextInt();

    while(incremento < repeticao) {
      System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
      incremento++;
    }
  }
}