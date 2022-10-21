package org.pedro.exercicios.loops;

import java.util.Scanner;

public class Forms {
  public void validarForms() {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    double payment;
    String sex;
    String estadoCivil;
    boolean hasOption;

    do {
      System.out.println("Digite seu nome (deve possuir mais de 3 caracteres): ");
      name = scanner.next();
    } while (name.length() < 3);

    do {
      System.out.println("Digite sua idade: ");
      age = scanner.nextInt();
    } while (age < 0);

    do {
      System.out.println("Digite seu salário: ");
      payment = scanner.nextDouble();
    } while (payment < 0);

    do {
      System.out.println("Digite seu gernero (f = female, m = male): ");
      sex = scanner.next();
    } while (!sex.equals("f") || !sex.equals("m"));

    do {
      System.out.println("DDigite seu estadoCivil  (deve possuir mais de 3 caracteres): ");
      estadoCivil = scanner.next();
      
      switch (estadoCivil) {
      case "s":
      case "c":
      case "v": 
      case "d": 
      hasOption = false;
      break;
      default:
      hasOption = true;
      break;
    }
    } while (hasOption);
    scanner.close();
  }

}
