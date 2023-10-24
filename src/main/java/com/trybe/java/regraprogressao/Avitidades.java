package com.trybe.java.regraprogressao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Avitidades {
  public void cadastroDeAtividades() {
    Scanner scanner = new Scanner(System.in);
    ArrayList arrayPesos = new ArrayList<>();
    ArrayList arrayNotas = new ArrayList<>();
    ArrayList arrayPesoXnota = new ArrayList<>();

    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int numeroAtividades = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < numeroAtividades; i ++) {
      System.out.print("Digite o nome da atividade " + (i + 1) + ": ");
      String atividade = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + (i + 1) + ": ");
      int peso = scanner.nextInt();
      arrayPesos.add(peso);

      System.out.print("Digite a nota obtida para " + atividade + ": ");
      int nota = scanner.nextInt();
      arrayNotas.add(nota);
      scanner.nextLine();

      arrayPesoXnota.add(peso * nota);
    }
    scanner.close();

    int somaPesos = 0;
    for (int i = 0; i < arrayPesos.size(); i++) {
      int peso = (int) arrayPesos.get(i);
      somaPesos += peso;
    }
    if (somaPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }
}
