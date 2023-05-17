package org.example.exercises;

import java.text.DecimalFormat;
import java.util.*;

public class Pdf04 {

  /**
   * Problema "Notas"
   * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
   * uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
   * ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
   * mensagem "REPROVADO", conforme exemplos.
   */
  public void notas() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = scan.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = scan.nextDouble();

    double notaFinal = nota1 + nota2;

    DecimalFormat df = new DecimalFormat("#0.0");
    System.out.println("Nota final: " + df.format(notaFinal));

    if (notaFinal < 60.00) {
      System.out.println("Reprovado.");
    }

    scan.close();
  }

  /**
   * Problema "Baskara"
   * Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
   * de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
   * conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
   */
  public void baskara() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Coeficiente a: ");
    double a = scan.nextDouble();

    System.out.print("Coeficiente b: ");
    double b = scan.nextDouble();

    System.out.print("Coeficiente c: ");
    double c = scan.nextDouble();

    double x1, x2;

    double delta = Math.pow(b, 2) - (4 * a * c);

    if (delta < 0) {
      System.out.println("Esta equação não possui raízes reais.");
      return;
    }

    x1 = (-b + Math.sqrt(delta)) / (2 * a);
    x2 = (-b - Math.sqrt(delta)) / (2 * a);

    DecimalFormat df = new DecimalFormat("0.0000");

    System.out.println("x1: " + df.format(x1) + "\nx2: " + df.format(x2));

    scan.close();
  }

  /**
   * Problema "Menor de tres"
   * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
   * números lidos. Em caso de empate, mostrar apenas uma vez.
   */
  public void menorDeTres() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Primeiro Valor: ");
    int primeiroValor = scan.nextInt();

    System.out.print("Segundo Valor: ");
    int segundoValor = scan.nextInt();

    System.out.print("Terceiro Valor: ");
    int terceiroValor = scan.nextInt();

    List<Integer> valores = List.of(primeiroValor, segundoValor, terceiroValor);

    int menor = valores.get(0);
    for (Integer valor : valores) {
      if (valor <= menor) {
        menor = valor;
      }
    }

    System.out.println("Menor: " + menor);

    scan.close();
  }

  /**
   * Problema "Operadora"
   * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
   * telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
   * ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
   */
  public void operadora() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a quantidade de minutos: ");
    int minutosTotais = scan.nextInt();

    DecimalFormat df = new DecimalFormat("0.00");
    double plano = 50.00;
    double aPagar;
    if (minutosTotais > 100) {
      aPagar = ((minutosTotais - 100) * 2.00) + plano;

      System.out.println("Valor a pagar: R$" + df.format(aPagar));
      return;
    }

    System.out.println("Valor a pagar: R$" + df.format(plano));

    scan.close();
  }

  /**
   * Problema "Troco verificado"
   * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
   * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
   * e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
   * ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
   * valor restante conforme exemplo.
   */
  public void trocoVerificado() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Preço unitário do produto: ");
    double preco = scan.nextDouble();

    System.out.print("Quantidade comprada: ");
    double qtde = scan.nextDouble();

    System.out.print("Dinheiro recebido: ");
    double pgto = scan.nextDouble();

    double resultado = pgto - (preco * qtde);

    DecimalFormat df = new DecimalFormat("0.00");
    if (resultado < 0) {
      System.out.println("Dinheiro insuficiente, faltam R$ " + df.format(resultado * -1));
    } else {
      System.out.println("Troco: " + df.format(resultado));
    }

    scan.close();
  }

  /**
   * Problema "glicose"
   * Fazer um programa para ler a quantidade de glicose
   * no sangue de uma pessoa e depois mostrar na tela a
   * classificação desta glicose de acordo com a tabela de
   * referência ao lado.
   *
   * Classificação  |  Glicose
   * Normal         |  Até 100 mg/dl
   * Elevado        |  Maior que 100 até 140 mg/dl
   * Diabetes       |  Maior de 140 mg/dl
   */
  public void glicose() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a medida da glicose: ");
    double glicose = scan.nextDouble();

    if (glicose <= 100) {
      System.out.println("Classificação: Normal");
    } else if (glicose > 100 && glicose <= 140) {
      System.out.println("Classificação: Elevado");
    } else {
      System.out.println("Classificação: Diabetes");
    }

    scan.close();
  }

  /**
   * Problema "dardo"
   * No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
   * Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
   * foi a maior.
   */
  public void dardo() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite as três distâncias.");
    double d1 = scan.nextDouble();
    double d2 = scan.nextDouble();
    double d3 = scan.nextDouble();

    List<Double> tentativas = List.of(d1, d2, d3);

    double maiorDistancia = d1;
    for (Double tentativa : tentativas) {
      if (tentativa > maiorDistancia) {
        maiorDistancia = tentativa;
      }
    }

    System.out.println("Maior distância: " + maiorDistancia);

    scan.close();
  }

  /**
   * Problema "temperatura"
   * Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
   * isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
   * informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
   * duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
   * deduzir a fórmula de Celsius para Fahrenheit):
   * C = 5/9(F - 32)
   */
  public void temperatura() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
    String scala = scan.next();

    double converted = 0;
    DecimalFormat df = new DecimalFormat("00.00");
    if (scala.equals("f") || scala.equals("F")) {
      System.out.print("Digite a temperatura em Fahrenheit: ");
      double f = scan.nextDouble();
      converted = (f - 32) * 5 / 9;
      System.out.println("Temperatura equivalente em Celsius: " + df.format(converted));
    } else if (scala.equals("c") || scala.equals("C")) {
      System.out.print("Digite a temperatura em Celsius: ");
      double c = scan.nextDouble();
      converted = (c * 9 / 5) + 32;
      System.out.println("Temperatura equivalente em Fahrenheit: " + df.format(converted));
    }

    scan.close();
  }

  /**
   * Problema "lanchonete" (adaptado de URI 1038)
   * Uma lanchonete possui vários produtos. Cada produto possui um código
   * e um preço. Você deve fazer um programa para ler o código e a
   * quantidade comprada de um produto (suponha um código válido), e daí
   * informar qual o valor a ser pago, com duas casas decimais, conforme
   * tabela de produtos ao lado.
   *
   * Código  |   Preço
   *   1     |  R$ 5.00
   *   2     |  R$ 3.50
   *   3     |  R$ 4.80
   *   4     |  R$ 8.90
   *   5     |  R$ 7.32
   */
  public void lanchonete() {
    Map<Integer, Double> tabela = Map.of(
        1, 5.00, 2, 3.50, 3, 4.80, 4, 8.90, 5, 7.32);

    Scanner scan = new Scanner(System.in);

    System.out.print("Código do produto comprado: ");
    int prodCod = scan.nextInt();

    System.out.print("Quantidade comprada: ");
    int qtde = scan.nextInt();

    double total = qtde * tabela.get(prodCod);

    DecimalFormat df = new DecimalFormat("#00.00");

    System.out.println("Valor a pagar: " + df.format(total));

    scan.close();
  }

  /**
   * Problema "multiplos" (adaptado de URI 1044)
   * Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
   * números podem ser digitados em qualquer ordem.
   */
  public void multiplos() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite dois números inteiros:");
    System.out.print("Primeiro número: ");
    int a = scan.nextInt();

    System.out.print("Segundo número: ");
    int b = scan.nextInt();

    List<Integer> numbers = List.of(a, b);

    int maiorNum = Collections.max(numbers);
    int menorNum = Collections.min(numbers);

    if (maiorNum % menorNum == 0) {
      System.out.println("São múltiplos.");
    } else {
      System.out.println("Não são múltiplos.");
    }

    scan.close();
  }

  /**
   * Problema "aumento" (adaptado de URI 1048)
   * Uma empresa vai conceder um aumento percentual de
   * salário aos seus funcionários dependendo de quanto
   * cada pessoa ganha, conforme tabela ao lado. Fazer um
   * programa para ler o salário de uma pessoa, daí mostrar
   * qual o novo salário desta pessoa depois do aumento,
   * quanto foi o aumento e qual foi a porcentagem de
   * aumento.
   *
   * Até R$ 1000.00 - 20%
   * Entre R$ 1000.01 e R$ 3000.00 - 15%
   * Entre R$ 3000.01 e R$ 8000.00 - 10%
   * Acima de R$ 8000.00 - 5%
   */
  public void aumento() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o salário da pessoa: ");
    double salario = scan.nextDouble();

    double novoSalario = 0;
    int percentual = 0;
    if (salario <= 1000) {
      novoSalario = salario * 1.20;
      percentual = 20;
    } else if (salario > 1000 && salario <= 3000) {
      novoSalario = salario * 1.15;
      percentual = 15;
    } else if (salario > 3000 && salario <= 8000) {
      novoSalario = salario * 1.10;
      percentual = 10;
    } else {
      novoSalario = salario * 1.05;
      percentual = 5;
    }

    DecimalFormat df = new DecimalFormat("#00.00");

    System.out.println("Novo salário: R$" + df.format(novoSalario));
    System.out.println("Aumento: R$ " + df.format(novoSalario - salario));
    System.out.println("Porcentagem: " + percentual + "%");

    scan.close();
  }

  /**
   * Problema "tempo_de_jogo" (adaptado de URI 1046)
   * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
   * pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
   * horas.
   */
  public void tempoDeJogo() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Hora inicial: ");
    int horaInicial = scan.nextInt();

    System.out.print("Hora final: ");
    int horaFinal = scan.nextInt();

    int duracao = 0;
    if (horaFinal > horaInicial) {
      duracao = horaFinal - horaInicial;
    } else if (horaFinal < horaInicial) {
      duracao = (horaFinal + 24) - horaInicial;
    } else {
      duracao = 24;
    }

    System.out.println("O jogo durou " + duracao + " horas(s)");

    scan.close();
  }

  /**
   * Problema "coordenadas" (adaptado de URI 1041)
   * Leia os valores das coordenadas X e Y de um ponto no plano
   * cartesiano. A seguir, determine qual o quadrante ao qual pertence o
   * ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
   * mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
   * “Eixo X” ou “Eixo Y”, conforme for a situação.
   *       y
   *    Q2 | Q1
   *    ------- x
   *    Q3 | Q4
   */
  public void coordenadas() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Valor de x: ");
    double x = scan.nextDouble();

    System.out.print("Valor de y: ");
    double y = scan.nextDouble();

    String quadrante = null;
    if (x > 0 && y > 0) {
      quadrante = "Q1";
    } else if (x < 0 && y > 0) {
      quadrante = "Q2";
    } else if (x < 0 && y < 0) {
      quadrante = "Q3";
    } else if (x > 0 && y < 0) {
      quadrante = "Q4";
    }

    if ((x > 0 || x < 0) && y == 0) {
      quadrante = "Eixo x";
    } else if ((y > 0 || y < 0) && x == 0) {
      quadrante = "Eixo y";
    } else if (x == 0 && y == 0) {
      quadrante = "Origem";
    }

    System.out.println(quadrante);

    scan.close();
  }
}
