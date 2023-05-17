package org.example.exercises;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Pdf05 {

  /**
   * Problema "crescente" (adaptado de URI 1113)
   * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
   * mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
   * programa deve finalizar quando forem digitados dois valores iguais.
   */
  public void crescente() {
    Scanner scan = new Scanner(System.in);

    boolean keepRunning = true;
    while(keepRunning) {
      System.out.println("Digite dois números inteiros: ");
      int a = scan.nextInt();
      int b = scan.nextInt();

      if (a == b) {
//        keepRunning = false;
//        continue;
        return;
      }

      if (a < b) {
        System.out.println("Crescente!");
      } else {
        System.out.println("Decrescente!");
      }
    }

    scan.close();
  }

  /**
   * Problema "media_idades"
   * Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
   * indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
   * e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
   * mostrar a mensagem "IMPOSSIVEL CALCULAR".
   */
  public void mediaIdades() {
    Scanner scan = new Scanner(System.in);

    boolean isPositive = true;
    List<Integer> idades = new ArrayList<>();

    System.out.println("Digite as idades:");

    while(isPositive) {
      int idade = scan.nextInt();

      if (idade < 0 && idades.isEmpty()) {
        System.out.println("Impossível calcular");
        isPositive = false;
        continue;
      }

      if (idade < 0) {
        double total = 0;
        for (int item : idades) {
          total += item;
        }

        double media = total / idades.size();

        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("Média: " + df.format(media));

        isPositive = false;
        continue;
      }

      idades.add(idade);
    }

    scan.close();
  }

  /**
   * Problema "senha_fixa" (adaptado de URI 1114)
   * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
   * senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
   * for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
   * encerrado. Considere que a senha correta é o valor 2002.
   */
  public void senhaFixa() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a senha: ");
    int senha = scan.nextInt();

    boolean isIncorrect = true;
    while(isIncorrect) {
      if (senha == 2002) {
        System.out.println("Acesso permitido.");
        isIncorrect = false;
        continue;
      }

      System.out.print("Senha inválida, tente novamente: ");
      senha = scan.nextInt();
    }

    scan.close();
  }

  /**
   * Problema "quadrante" (adaptado de URI 1115)
   * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
   * sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
   * algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
   * escrever mensagem alguma).
   */
  public void quadrante() {
    Scanner scan = new Scanner(System.in);

    boolean isNotFinished = true;
    while(isNotFinished) {
      System.out.println("Digite os valores das coordenadas x e y:");
      double x = scan.nextDouble();
      double y = scan.nextDouble();

      if (x > 0 && y > 0) {
        System.out.println("Quadrante Q1");
      } else if (x > 0 && y < 0) {
        System.out.println("Quadrante Q4");
      } else if (x < 0 && y < 0) {
        System.out.println("Quadrante Q3");
      } else if (x < 0 && y > 0) {
        System.out.println("Quadrante Q2");
      } else {
        isNotFinished = false;
      }
    }

    scan.close();
  }

  /**
   * Problema "validacao_de_nota" (adaptado de URI 1117)
   * Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
   * média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
   * intervalo [0,10]). Cada nota deve ser validada separadamente.
   */
  public void validacaoDeNota() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double n1 = scan.nextDouble();
    while (n1 < 0 || n1 > 10) {
      System.out.print("Valor inválido, tente novamente: ");
      n1 = scan.nextDouble();
    }

    System.out.print("Digite a segunda nota: ");
    double n2 = scan.nextDouble();
    while (n2 < 0 || n2 > 10) {
      System.out.print("Valor inválido, tente novamente: ");
      n2 = scan.nextDouble();
    }

    double media = (n1 + n2) / 2;
    DecimalFormat df = new DecimalFormat("#0.00");

    System.out.println("Média: " + df.format(media));

    scan.close();
  }

  /**
   * Problema "combustivel" (adaptado de URI 1134)
   * Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
   * Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
   * 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
   * 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
   * código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
   * como as quantidades de cada combustível.
   */
  public void combustivel() {
    Scanner scan = new Scanner(System.in);

    int gasCount = 0;
    int alcCount = 0;
    int dieCount = 0;
    int code = 0;
    while(code != 4) {
      System.out.print("Informe um código (1, 2, 3) ou 4 para finalizar: ");
      code = scan.nextInt();

      if (code == 1) {
        alcCount++;
      } else if (code == 2) {
        gasCount++;
      } else if (code == 3) {
        dieCount++;
      }
    }

    System.out.println("Muito obrigado");
    System.out.println("Álcool: " + alcCount);
    System.out.println("Gasolina: " + gasCount);
    System.out.println("Diesel: " + dieCount);

    scan.close();
  }

  /**
   * Problema "pares_consecutivos" (adaptado de URI 1159)
   * O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X
   * for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X
   * , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação:
   * 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a
   * soma de 12+14+16+18+20.
   */
  public void paresConsecutivos() {
    Scanner scan = new Scanner(System.in);

    int x = 0;
    boolean isNotFinished = true;

    while(isNotFinished) {
      System.out.print("Digite um número inteiro: ");
      x = scan.nextInt();

      if (x == 0) {
        isNotFinished = false;
        continue;
      }

      if (x % 2 != 0) {
        x += 1;
      }

      int total = x;
      for (int i = 0; i < 4; i++) {
        total += (x += 2);
      }

      System.out.println("Soma: " + total);
    }

    scan.close();
  }

  /**
   * Problema "tabuada"
   * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
   */
  public void tabuada() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Deseja a tabuada para qual valor? ");
    int valor = scan.nextInt();

    for (short i = 1; i <= 10; i++) {
      System.out.println(valor + " x " + i + " = " + valor * i);
    }

    scan.close();
  }

  /**
   * Problema "soma_impares" (adaptado de URI 1071)
   * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
   * impares entre eles.
   */
  public void somaDosImpares() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite dois números inteiros: ");
    int valor1 = scan.nextInt();
    int valor2 = scan.nextInt();

    int x = 0;
    int y = 0;
    if (valor1 < valor2) {
      x = valor1;
      y = valor2;
    } else {
      x = valor2;
      y = valor1;
    }

    if (x % 2 == 0) {
      x += 1;
    } else {
      x += 2;
    }

    int total = 0;
    for (int i = x; i < y; i += 2) {
      total += i;
    }

    System.out.println("Soma dos ímpares: " + total);

    scan.close();
  }

  /**
   * Problema "dentro_fora" (adaptado de URI 1072)
   * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
   * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
   * conforme exemplo
   */
  public void dentroFora() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int qtdeInfo = scan.nextInt();
    int inCount = 0;
    int outCount = 0;

    for (int i = 0; i < qtdeInfo; i++) {
      int num = scan.nextInt();
      if (num >= 10 && num <= 20) {
        inCount++;
      } else {
        outCount++;
      }
    }

    System.out.println(inCount + " Dentro\n" + outCount + " Fora");

    scan.close();
  }

  /**
   * Problema "par_impar" (adaptado de URI 1074)
   * Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
   * Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
   * se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
   * apenas NULO.
   */
  public void parImpar() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int qtdeNum = scan.nextInt();

    for (int i = 0; i < qtdeNum; i++) {
      System.out.print("Digite um número: ");
      int num = scan.nextInt();
      boolean par = num % 2 == 0;
      boolean impar = num % 2 != 0;

      if (num > 0 && par) {
        System.out.println("Par positivo");
      } else if (num > 0 && impar) {
        System.out.println("Ímpar positivo");
      } else if (num < 0 && par) {
        System.out.println("Par negativo");
      } else if (num < 0 && impar) {
        System.out.println("Ímpar negativo");
      } else {
        System.out.println("Nulo");
      }
    }

    scan.close();
  }

  /**
   * Problema "media_ponderada" (adaptado de URI 1079)
   * Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
   * teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
   * que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
   * que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
   * pela soma dos pesos.
   */
  public void mediaPonderada() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos casos você vai digitar? ");
    int qtdeCasos = scan.nextInt();

    int aPeso = 2;
    int bPeso = 3;
    int cPeso = 5;
    for (int i = 0; i < qtdeCasos; i++) {
      System.out.println("Digite três números");
      double a = scan.nextDouble();
      double b = scan.nextDouble();
      double c = scan.nextDouble();

      double media = (a * aPeso + b * bPeso + c * cPeso) / (aPeso + bPeso + cPeso);

      DecimalFormat df = new DecimalFormat("#0.0#");

      System.out.println("Média: " + df.format(media));
    }

    scan.close();
  }

  /**
   * Problema "divisao" (adaptado de URI 1116)
   * Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
   * segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
   */
  public void divisao() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos casos você vai digitar? ");
    int qtdeCasos = scan.nextInt();

    for (int i = 0; i < qtdeCasos; i++) {
      System.out.print("Entre com o númerador: ");
      double numerador = scan.nextDouble();

      System.out.print("Entre com o denominador: ");
      double denominador = scan.nextDouble();

      if (denominador == 0) {
        System.out.println("Divisão impssível.");
        continue;
      }

      double resultado = numerador / denominador;

      DecimalFormat df = new DecimalFormat("#0.00");

      System.out.println("Divisão: " + df.format(resultado));
    }

    scan.close();
  }

  /**
   * Problema "fatorial" (adaptado de URI 1153)
   * Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
   * fatorial de N.
   */
  public void fatorial() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor de n: ");
    int n = scan.nextInt();

    if (n == 0 || n == 1) {
      System.out.println("Fatorial: 1");
      return;
    }

    int resultado = n;
    for (int i = n - 1; i > 0; i--) {
      resultado *= i;
    }

    System.out.println("Fatorial: " + resultado);

    scan.close();
  }

  /**
   * Problema "experiencias" (adaptado de URI 1094)
   * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
   * organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
   * quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
   * laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
   * informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
   * utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
   * valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
   * inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
   * de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
   * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
   * percentual deve ser apresentado com dois dígitos após o ponto.
   */
  public void experiencias() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos casos de teste serão digitados? ");
    int qtdeCasos = scan.nextInt();

    double totalCoelhos = 0;
    double totalRatos = 0;
    double totalSapos = 0;
    for (int i = 0; i < qtdeCasos; i++) {
      System.out.print("Quantidade de cobaias: ");
      int qtdCobais = scan.nextInt();

      System.out.print("Tipo de cobaias: ");
      String tipoCobaias = scan.next();

      if (Objects.equals(tipoCobaias, "C")) {
        totalCoelhos += qtdCobais;
      } else if (Objects.equals(tipoCobaias, "R")) {
        totalRatos += qtdCobais;
      } else if (Objects.equals(tipoCobaias, "S")) {
        totalSapos += qtdCobais;
      }
    }

    double totalCobaias = totalRatos + totalSapos + totalCoelhos;
    System.out.println();
    System.out.println("Relatório final.");
    System.out.println("Total: " + (int) totalCobaias + " cobaias");
    System.out.println("Total de coelhos: " + (int) totalCoelhos);
    System.out.println("Total de ratos: " + (int) totalRatos);
    System.out.println("Total de sapos: " + (int) totalSapos);

    DecimalFormat df = new DecimalFormat("#0.00");
    double percentCoelhos = (totalCoelhos / totalCobaias) * 100;
    double percentRatos = (totalRatos / totalCobaias) * 100;
    double percentSapos = (totalSapos / totalCobaias) * 100;
    System.out.println("Percentual de coelhos: " + df.format(percentCoelhos) + "%");
    System.out.println("Percentual de ratos: " + df.format(percentRatos) + "%");
    System.out.println("Percentual de sapos: " + df.format(percentSapos) + "%");

    scan.close();
  }
}
