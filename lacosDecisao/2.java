package lacoDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class 2 {
  //Faça um programa que entre com três número e coloque em ordem crescente.
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro valor:");
    int n1 = entrada.nextInt();
    System.out.println("Digite o segundo valor:");
    int n2 = entrada.nextInt();
    System.out.println("Digite o terceiro valor:");
    int n3 = entrada.nextInt();

    int[] arrayNum = {n1, n2, n3};
    Arrays.sort(arrayNum);

    for (int i = 0 < arrayNum.length; i++) {
      System.out.println("Na ordem crescente, fica: " + arrayNum[i]);
    }
  }
}