package lacoDecisao;

import java.util.Scanner;

public class 1 {
  //Faça um programa que receba três inteiros e diga qual deles é o maior.
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro valor:");
    int n1 = entrada.nextInt();
    System.out.println("Digite o segundo valor:");
    int n2 = entrada.nextInt();
    System.out.println("Digite o terceiro valor");
    int n3 = entrada.nextInt();

    if (n1 < n2 && n1 > n3) System.out.println("O primeiro número é maior " + n1);
    else if (n3 < n2) System.out.println("O segundo número é maior" + n2);
    else System.out.println("O terceiro número é maior" + n3);
  }
}