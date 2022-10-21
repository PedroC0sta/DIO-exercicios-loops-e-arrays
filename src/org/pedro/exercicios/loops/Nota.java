package org.pedro.exercicios.loops;

import java.util.Scanner;

public class Nota {
  /*Faça um programa que peça uma nota, entre zero e dez. 
  Mostre uma mensagem caso o valor seja inválido e continue 
  pedindo até que o usuário informe um valor válido. */

  public void verificarNota () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma nota de 1 a 10:");
    int nota = scanner.nextInt();


    while(nota < 0 || nota > 10) {
      System.out.println("Digite uma nota de 1 a 10:");
      nota = scanner.nextInt();
    }

    scanner.close();
  }
}
