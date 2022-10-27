package org.pedro.exercicios.loops;

public class Comparador {
  public void calcularCrescimentoPopulacional() {
    long habitantesPais1 = 80000;
    long habitantesPais2 = 200000;
    double taxaDecrescimentoPais1 = 0;
    double taxaDecrescimentoPais2 = 0; 
    int count = 0;
    while(taxaDecrescimentoPais1 <= taxaDecrescimentoPais2) {
      taxaDecrescimentoPais1 = habitantesPais1 += (habitantesPais1 * 0.03); 
      System.out.println(taxaDecrescimentoPais1);
      taxaDecrescimentoPais2 = habitantesPais2 += (habitantesPais2 * 0.015); 
      System.out.println(taxaDecrescimentoPais2);
      count++;
    };
    System.out.println(count);
  }
}
