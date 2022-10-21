package org.pedro.exercicios.loops;

import java.util.Scanner;

public class Login {
  public void verificarLogin() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu username:");
    String username = scanner.nextLine();
    System.out.println("Digite sua senha:");
    String senha = scanner.nextLine();

    while(username.equals(senha)) {
      System.out.println("Username deve ser diferente da senha");
      System.out.println("Digite seu username:");
      username = scanner.nextLine();
      System.out.println("Digite sua senha:");
      senha = scanner.nextLine();
    }
    scanner.close();
  }
}
