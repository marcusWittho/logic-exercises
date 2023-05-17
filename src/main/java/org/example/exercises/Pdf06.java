package org.example.exercises;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.*;

public class Pdf06 {

  /**
   * Problema "negativos"
   * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
   * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
   */
  public void negativos() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int qttNumbers = scan.nextInt();

    List<Integer> negativeList = new ArrayList<>();
    for (short i = 0; i < qttNumbers; i++) {
      System.out.print("Digite um número: ");
      int num = scan.nextInt();

      if (num < 0) {
        negativeList.add(num);
      }
    }

    System.out.println("Números negativos:");
    for (int num : negativeList) {
      System.out.println(num);
    }

    scan.close();
  }

  /**
   * Problema "soma_vetor"
   * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
   * - Imprimir todos os elementos do vetor
   * - Mostrar na tela a soma e a média dos elementos do vetor
   */
  public void somaVetor() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int qttNumbers = scan.nextInt();

    List<Double> numbersList = new ArrayList<>();
    double sum = 0;
    for (short i = 0; i < qttNumbers; i++) {
      System.out.print("Digite um número: ");
      double num = scan.nextDouble();
      sum += num;
      numbersList.add(num);
    }

    System.out.print("Valores: ");
    numbersList.forEach(item -> System.out.print(item + " "));

    DecimalFormat df = new DecimalFormat("#0.00");

    System.out.println("\nSoma: " + df.format(sum));
    System.out.println("Média: " + df.format(sum / qttNumbers));

    scan.close();
  }

  /**
   * Problema "alturas"
   * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
   * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
   * bem como os nomes dessas pessoas caso houver.
   */
  public void alturas() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantas pessoas serão cadastradas? ");
    int peopleQtt = scan.nextInt();

    List<Map<String, String>> peopleList = new ArrayList<>();
    for (short i = 1; i <= peopleQtt; i++) {
      Map<String, String> person = new HashMap<>();

      System.out.println("Digite a " + i + "a pessoa:");
      System.out.print("Nome: ");
      String name = scan.next();

      System.out.print("Idade: ");
      String age = scan.next();

      System.out.print("Altura: ");
      String height = scan.next();

      person.put("name", name);
      person.put("age", age);
      person.put("height", height);

      peopleList.add(person);
    }

    double heightSum = 0;
    int lessThanSixteen = 0;
    List<String> names = new ArrayList<>();
    for (Map<String, String> p : peopleList) {
      heightSum += Double.parseDouble(p.get("height"));

      if (Integer.parseInt(p.get("age")) < 16) {
        lessThanSixteen++;
        names.add(p.get("name"));
      }
    }

    DecimalFormat df = new DecimalFormat("#0.00");
    double lessThanSixteenPercent = ((double) lessThanSixteen / peopleQtt) * 100;
    System.out.println("Altura média: " + df.format(heightSum / peopleQtt));
    System.out.println("Pessoas com menos de 16 anos: " + df.format(lessThanSixteenPercent) + "%");
    names.forEach(System.out::println);
  }

  /**
   * Problema "numeros_pares"
   * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
   * tela todos os números pares, e também a quantidade de números pares.
   */
  public void numerosPares() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int numberQtt = scan.nextInt();

    List<Integer> numList = new ArrayList<>();
    List<Integer> evenNums = new ArrayList<>();

    for (short i = 0; i < numberQtt; i++) {
      System.out.print("Digite um número: ");
      int num = scan.nextInt();

      numList.add(num);
      if (num % 2 == 0) {
        evenNums.add(num);
      }
    }

    System.out.println("Números pares:");
    evenNums.forEach(num -> System.out.print(num + " "));

    System.out.print("\nQuantidade de pares: " + evenNums.size());

    scan.close();
  }

  /**
   * Problema "maior_posicao"
   * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
   * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
   * considerando a primeira posição como 0 (zero).
   */
  public void maiorPosicao() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos números você vai digitar? ");
    int numQtt = scan.nextInt();

    List<Double> numsList = new ArrayList<>();
    double biggestNUm = 0;
    for (short i = 0; i < numQtt; i++) {
      System.out.print("Digite um número: ");
      double num = scan.nextDouble();

      numsList.add(num);
      if (num > biggestNUm) {
        biggestNUm = num;
      }
    }

    System.out.println("Maior valor: " + biggestNUm);
    System.out.println("Posição do maior valor: " + numsList.indexOf(biggestNUm));

    scan.close();
  }

  /**
   * Problema "soma_vetores"
   * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
   * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
   * o vetor C gerado.
   */
  public void somaVetores() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos valores vai ter cada vetor? ");
    int valueQtt = scan.nextInt();

    List<Integer> listA = new ArrayList<>();
    List<Integer> listB = new ArrayList<>();

    System.out.println("Digite os valores de A:");
    for (short i = 0; i < valueQtt; i++) {
      int num = scan.nextInt();
      listA.add(num);
    }

    System.out.println("Digite os valores de B:");
    for (short i = 0; i < valueQtt; i++) {
      int num = scan.nextInt();
      listB.add(num);
    }

    List<Integer> sumList = new ArrayList<>();
    for (short i = 0; i < valueQtt; i++) {
      sumList.add(listA.get(i) + listB.get(i));
    }

    System.out.println("Vetor resultante:");
    sumList.forEach(num -> System.out.println(num));

    scan.close();
  }

  /**
   * Problema "abaixo_da_media"
   * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
   * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
   * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
   */
  public void abaixoDaMedia() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int vetorQtt = scan.nextInt();

    List<Double> numsList = new ArrayList<>();
    double total = 0;
    for (short i = 0; i < vetorQtt; i++) {
      System.out.print("Digite um número: ");
      double num = scan.nextDouble();
      total += num;
      numsList.add(num);
    }

    DecimalFormat df = new DecimalFormat("#0.000");
    double media = total / vetorQtt;

    System.out.println("Média do vetor: " + df.format(media));
    System.out.println("Elementos abaixo da média:");

    for (short i = 0; i < vetorQtt; i++) {
      if (numsList.get(i) < media) {
        System.out.println(numsList.get(i));
      }
    }

    scan.close();
  }

  /**
   * Problema "media_pares"
   * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
   * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
   * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
   */
  public void mediaPares() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int elmQtt = scan.nextInt();

    List<Integer> elemList = new ArrayList<>();
    boolean onlyOdd = true;
    int evenQtt = 0;
    int elmSum = 0;
    for(short i = 0; i < elmQtt; i++) {
      System.out.print("Digite um número: ");
      int num = scan.nextInt();

      if (num % 2 == 0) {
        elmSum += num;
        evenQtt++;
        onlyOdd = false;
      }

      elemList.add(num);
    }

    if (onlyOdd) {
      System.out.println("Nenhum número par.");
    } else {
      double media = (double) elmSum / evenQtt;

      DecimalFormat df = new DecimalFormat("#0.0");

      System.out.print("Média dos pares: " + df.format(media));
    }

    scan.close();
  }

  /**
   * Problema "mais_velho"
   * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
   * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
   * da pessoa mais velha.
   */
  public void maisVelho() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantas pessoas você vai cadastrar? ");
    int peopleQtt = scan.nextInt();

    List<String> names = new ArrayList<>();
    List<Integer> ages = new ArrayList<>();
    int older = 0;
    for(short i = 1; i <= peopleQtt; i++) {
      System.out.println("Dados da " + i + "a pessoa:");
      System.out.print("Nome: ");
      String name = scan.next();
      names.add(name);

      System.out.print("Idade: ");
      int age = scan.nextInt();
      ages.add(age);

      if (older < age) {
        older = age;
      }
    }

    System.out.println("Pessoa mais velha: " + names.get(ages.indexOf(older)));

    scan.close();
  }

  /**
   * Problema "aprovados"
   * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
   * no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
   * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
   * igual a 6.0 (seis).
   */
  public void aprovados() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantos alunos serão cadastrados? ");
    int qtt = scan.nextInt();

    List<String> names = new ArrayList<>();
    List<Double> n1 = new ArrayList<>();
    List<Double> n2 = new ArrayList<>();
    List<String> aprovados = new ArrayList<>();
    for (short i = 1; i <= qtt; i++) {
      System.out.println("Digite nome, primeira e segunda nota do " + i + "º aluno:");

      String name = scan.next();
      Double nota1 = scan.nextDouble();
      Double nota2 = scan.nextDouble();

      names.add(name);
      n1.add(nota1);
      n2.add(nota2);
    }

    for (short i = 0; i < qtt; i++) {
      if ((n1.get(i) + n2.get(i)) / 2 >= 6) {
        aprovados.add(names.get(i));
      }
    }

    System.out.println("Alunos aprovados:");
    aprovados.forEach(System.out::println);

    scan.close();
  }

  /**
   * Problema "dados_pessoas"
   * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
   * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
   * de homens.
   */
  public void dadosPessoas() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quantas pessoas serão cadastradas? ");
    int qtt = scan.nextInt();

    List<String> gender = new ArrayList<>();
    List<Double> height = new ArrayList<>();
    for (short i = 1; i <= qtt; i++) {
      System.out.print("Altura da " + i + "a pessoa: ");
      double heightPerson = scan.nextDouble();
      height.add(heightPerson);

      System.out.print("Gênero da " + i + "a pessoa: ");
      String genderPerson = scan.next();
      gender.add(genderPerson);
    }

    List<Double> heightF = new ArrayList<>();
    double heighest = 0;
    double smallest = height.get(0);
    int males = 0;

    for (short i = 0; i < qtt; i++) {
      if (gender.get(i).equals("M")) {
        males++;
      } else {
        heightF.add(height.get(i));
      }

      if (height.get(i) > heighest) {
        heighest = height.get(i);
      }

      if (height.get(i) < smallest) {
        smallest = height.get(i);
      }
    }

    double total = 0;
    for (short i = 0; i < heightF.size(); i++) {
      total += heightF.get(i);
    }

    DecimalFormat df = new DecimalFormat("#0.00");

    System.out.println("Menor altura: " + smallest);
    System.out.println("Maior altura: " + heighest);
    System.out.println("Média das alturas das mulheres: " + df.format(total / heightF.size()));
    System.out.println("Número de homens: " + males);

    scan.close();
  }

  /**
   * Problema "comerciante"
   * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
   * mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
   * venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
   * proporcionaram:
   *  lucro < 10%
   *  10% ≤ lucro ≤ 20%
   *  lucro > 20%
   * Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
   * o lucro total.
   */
  public void comerciante() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Serão digitados dados de quantos produtos? ");
    int qtt = scan.nextInt();

    List<String> nomes = new ArrayList<>();
    List<Double> compra = new ArrayList<>();
    List<Double> venda = new ArrayList<>();
    for (short i = 1; i <= qtt; i++) {
      System.out.println("Produto " + i);
      System.out.print("Nome: ");
      String nome = scan.next();

      System.out.print("Preço de compra: ");
      double vlrCompra = scan.nextDouble();

      System.out.print("Preço de venda: ");
      double vlrVenda = scan.nextDouble();

      nomes.add(nome);
      compra.add(vlrCompra);
      venda.add(vlrVenda);
    }

    int abaixoDeDez = 0;
    int entreDezEVinte = 0;
    int acimaDeVinte = 0;
    double totalDeCompra = 0;
    double totalDeVenda = 0;
    for (short i = 0; i < qtt; i++) {
      double percentDeLucro = 0;

      if ((venda.get(i) - compra.get(i)) / compra.get(i) * 100 < 10) {
        abaixoDeDez++;
      } else if ((venda.get(i) - compra.get(i)) / compra.get(i) * 100 >= 10
              && (venda.get(i) - compra.get(i)) / compra.get(i) * 100 <= 20) {
        entreDezEVinte++;
      } else {
        acimaDeVinte++;
      }

      totalDeCompra += compra.get(i);
      totalDeVenda += venda.get(i);
    }

    DecimalFormat df = new DecimalFormat("#0.00");

    System.out.println("Relatório:");
    System.out.println("Lucro abaixo de 10%: " + abaixoDeDez);
    System.out.println("Lucro entre 10% e 20%: " + entreDezEVinte);
    System.out.println("Lucro acima de 20%: " + acimaDeVinte);
    System.out.println("Valor total de compra: " + df.format(totalDeCompra));
    System.out.println("Valor total de venda: " + df.format(totalDeVenda));
    System.out.println("Lucro total: " + df.format(totalDeVenda - totalDeCompra));

    scan.close();
  }
}
