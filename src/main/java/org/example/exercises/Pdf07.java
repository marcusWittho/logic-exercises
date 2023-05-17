package org.example.exercises;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.*;

public class Pdf07 {

  /**
   * Problema "diagonal_negativos"
   * Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
   * contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
   * negativos da matriz.
   */
  public void diagonalNegativos() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int qtt = scan.nextInt();

    int totalNeg = 0;
    List<List<Integer>> matrix = new ArrayList<>();
    for(short i = 0; i < qtt; i++) {
      List<Integer> list = new ArrayList<>();
      for(short j = 0; j < qtt; j++) {
        System.out.print("Elemento [" + i + ", " + j + "]: ");
        int num = scan.nextInt();
        list.add(num);

        if (num < 0) {
          totalNeg++;
        }
      }

      matrix.add(list);
    }

    System.out.print("Diagonal principal: ");
    for(short i = 0; i < qtt; i++) {
      System.out.print(matrix.get(i).get(i) + " ");
    }

    System.out.println("\nQuantidade de negativos: " + totalNeg);

    scan.close();
  }

  /**
   * Problema "soma_linhas"
   * Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
   * de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
   * seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
   */
  public void somaLinhas() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a quantidade de linhas da matriz? ");
    int rowSize = scan.nextInt();

    System.out.print("Qual a quantidade de colunas da matriz? ");
    int columnSize = scan.nextInt();

    List<List<Double>> matrix = new ArrayList<>();
    for(short i = 1; i <= rowSize; i++) {
      List<Double> list = new ArrayList<>();
      System.out.println("Digite os elementos da " + i + "a. linha:");
      for(short j = 0; j < columnSize; j++) {
        double num = scan.nextDouble();
        list.add(num);
      }

      matrix.add(list);
    }

    System.out.print("Vetor gerado: ");
    for(short i = 0; i < rowSize; i++) {
      double total = matrix.get(i).stream().reduce((acc, elem) -> acc + elem).get();
      System.out.print(total + " ");
    }

    scan.close();
  }

  /**
   * Problema "negativos_matriz"
   * Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
   * exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.
   */
  public void negativosMatriz() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a quantidade de linhas da matriz? ");
    int rowSize = scan.nextInt();

    System.out.print("Qual a quantidade de colunas da matriz? ");
    int columnSize = scan.nextInt();

    List<List<Integer>> matrix = new ArrayList<>();
    for(short i = 0; i < rowSize; i++) {
      List<Integer> list = new ArrayList<>();
      for(short j = 0; j < columnSize; j++) {
        System.out.print("Elemento [" + i + ", " + j + "]: ");
        int num = scan.nextInt();
        list.add(num);
      }

      matrix.add(list);
    }

    System.out.print("Valores negativos: ");
    for(short i = 0; i < matrix.size(); i++) {
      matrix.get(i).forEach(num -> {
        if (num < 0) {
          System.out.print(num + " ");
        }
      });
    }

    scan.close();
  }

  /**
   * Problema "cada_linha"
   * Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
   * de cada linha. Suponha não haver empates.
   */
  public void cadaLinha() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int ordem = scan.nextInt();

    List<List<Integer>> matrix = new ArrayList<>();
    for(short i = 0; i < ordem; i++) {
      List<Integer> list = new ArrayList<>();
      for(short j = 0; j < ordem; j++) {
        System.out.print("Elemento [" + i + "," + j + "]: ");
        int num = scan.nextInt();

        list.add(num);
      }

      matrix.add(list);
    }

    System.out.print("Maior elemento de cada linha: ");
    for(short i = 0; i < ordem; i++) {
      int test = 0;
      for(short j = 0; j < ordem; j++) {
        if(matrix.get(i).get(j) > test) {
          test = matrix.get(i).get(j);
        }
      }

      System.out.print(test + " ");
    }

    scan.close();
  }

  /**
   * Problema "soma_matrizes"
   * Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
   * cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
   * dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
   */
  public void somaMatrizes() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a quantidade de linhas da matriz? ");
    int rowSize = scan.nextInt();

    System.out.print("Qual a quantidade de colunas da matriz? ");
    int columnSize = scan.nextInt();

    List<String> matrixNames = Arrays.asList("A", "B");
    List<List<Integer>> matrixA = new ArrayList<>();
    List<List<Integer>> matrixB = new ArrayList<>();
    String matrixName;
    for (String name : matrixNames) {
      matrixName = name;
      System.out.println("Digite os valores da matriz " + matrixName + ":");

      for (short j = 0; j < rowSize; j++) {
        List<Integer> list = new ArrayList<>();
        for (short k = 0; k < columnSize; k++) {
          System.out.print("Elemento [" + j + "," + k + "]: ");

          int el = scan.nextInt();
          list.add(el);
        }

        if (name.equals("A")) {
          matrixA.add(list);
        } else {
          matrixB.add(list);
        }
      }
    }

    List<List<Integer>> matrixC = new ArrayList<>();
    for (short i = 0; i < rowSize; i++) {
      List<Integer> list = new ArrayList<>();
      for (short j = 0; j < columnSize; j++) {
        list.add(matrixA.get(i).get(j) + matrixB.get(i).get(j));
      }

      matrixC.add(list);
    }

    System.out.println("Matriz soma:");
    for (List<Integer> integers : matrixC) {
      integers.forEach(num -> System.out.print(num + " "));
      System.out.println();
    }

    scan.close();
  }

  /**
   * Problema "acima_diagonal"
   * Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N
   * contendo números inteiros. Mostrar a soma dos elementos acima da
   * diagonal principal. Um exemplo de números acima da diagonal
   * principal é mostrado ao lado (no caso as células com fundo cinza).
   */
  public void acimaDiagonal() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int order = scan.nextInt();

    List<List<Integer>> matrix = new ArrayList<>();
    for (short i = 0; i < order; i++) {
      List<Integer> list = new ArrayList<>();
      for (short j = 0; j < order; j++) {
        System.out.print("Elemento [" + i + "," + j + "]: ");
        int num = scan.nextInt();
        list.add(num);
      }

      matrix.add(list);
    }

    int sum = 0;
    for (short i = 0; i < order; i++) {
      for (int j = i + 1; j < order; j++) {
        sum += matrix.get(i).get(j);
      }
    }

    System.out.println("Soma dos elementos acima da diagonal principal: " + sum);

    scan.close();
  }

  /**
   * Problema "matriz_geral"
   * Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
   * seguintes ações:
   * a) calcular e imprimir a soma de todos os elementos positivos da matriz.
   * b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
   * c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
   * d) imprimir os elementos da diagonal principal da matriz.
   * e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
   * a matriz alterada.
   */
  public void matrizGeral() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Qual a ordem da matriz? ");
    int order = scan.nextInt();

    List<List<Double>> matrix = new ArrayList<>();
    for (short i = 0; i < order; i++) {
      List<Double> list = new ArrayList<>();
      for (short j = 0; j < order; j++) {
        System.out.print("Elemento [" + i + "," + j + "]: ");
        double num = scan.nextDouble();
        list.add(num);
      }

      matrix.add(list);
    }

    double evenSum = 0;
    for (short i = 0; i < order; i++) {
      for (short j = 0; j < order; j++) {
        if (matrix.get(i).get(j) > 0) {
          evenSum += matrix.get(i).get(j);
        }
      }
    }
    System.out.printf("Soma dos positivos: %s", evenSum);

    System.out.print("\nEscolha uma linha: ");
    int findRow = scan.nextInt();
    System.out.print("Linha escolhida: ");
    for (short i = 0; i < matrix.get(findRow).size(); i++) {
      System.out.print(matrix.get(findRow).get(i) + " ");
    }

    System.out.print("\nEscolha uma coluna: ");
    int findColumn = scan.nextInt();
    System.out.print("Coluna escolhida: ");
    for (short i = 0; i < order; i++) {
      System.out.print(matrix.get(i).get(findColumn) + " ");
    }

    System.out.print("\nDiagonal principal: ");
    for (short i = 0; i < order; i++) {
      System.out.print(matrix.get(i).get(i) + " ");
    }

    for (short i = 0; i < order; i++) {
      for (short j = 0; j < order; j++) {
        if (matrix.get(i).get(j) < 0) {
          matrix.get(i).set(j, Math.pow(matrix.get(i).get(j), 2));
        }
      }
    }

    System.out.println("\nMatriz alterada:");
    for (short i = 0; i < order; i++) {
      for (short j = 0; j < order; j++) {
        System.out.print(matrix.get(i).get(j) + " ");
      }

      System.out.println();
    }

    scan.close();
  }
}
