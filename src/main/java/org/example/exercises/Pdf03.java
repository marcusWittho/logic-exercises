package org.example.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pdf03 {

  /**
   * Problema "Terreno"
   * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
   * casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
   * o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
   * duas casas decimais, conforme exemplo.
   */
  public void terreno() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a largura do terreno: ");
    double largura = scan.nextDouble();
    System.out.print("Digite o comprimento do terreno: ");
    double comprimento = scan.nextDouble();
    System.out.print("Digite o valor do metro quadrado do terreno: ");
    double valorDoMetroQuadrado = scan.nextDouble();

    double areaDoTerreno = largura * comprimento;
    double valorDoTerreno = areaDoTerreno * valorDoMetroQuadrado;

    DecimalFormat df = new DecimalFormat("#,##0.00");

    System.out.println("Área do terreno: " + df.format(areaDoTerreno));
    System.out.println("Preço do terreno: " + df.format(valorDoTerreno));

    scan.close();
  }

  /**
   * Problema "Retangulo"
   * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
   * da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
   */
  public void retangulo() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Base do retangulo: ");
    double base = scan.nextDouble();
    System.out.print("Altura do retangulo: ");
    double altura = scan.nextDouble();

     DecimalFormat df = new DecimalFormat("#.0000");

     double area = base * altura;
     double perimetro = (base * 2) + (altura * 2);
     double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

    System.out.println("Área: " + df.format(area));
    System.out.println("Perĩmetro: " + df.format(perimetro));
    System.out.println("Diagonal: " + df.format(diagonal));

    scan.close();
  }

  /**
   * Problema "Idades"
   * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
   * nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
   */
  public void idades() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Dados da primeira pessoa.");
    System.out.print("Nome: ");
    String nomePrimeiraPessoa = scan.next();
    System.out.print("Idade: ");
    double idadePrimeiraPessoa = scan.nextDouble();

    System.out.println("Dados da segunda pessoa.");
    System.out.print("Nome: ");
    String nomeSegundaPessoa = scan.next();
    System.out.print("Idade: ");
    double idadeSegundaPessoa = scan.nextDouble();

    DecimalFormat df = new DecimalFormat("###.0");

    double media = (idadePrimeiraPessoa + idadeSegundaPessoa) / 2;

    System.out.printf("A idade média de %s e %s é de %s anos.%n",
        nomePrimeiraPessoa, nomeSegundaPessoa, df.format(media));

    scan.close();
  }

  /**
   * Problema "Soma"
   * Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
   * números.
   */
  public void soma() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor de x: ");
    int x = scan.nextInt();
    System.out.print("Digite o valor de y: ");
    int y = scan.nextInt();

    System.out.printf("Soma: %s", (x + y));

    scan.close();
  }

  /**
   * Problema "Troco"
   * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
   * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
   * e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
   * mostrar o valor do troco a ser devolvido ao cliente.
   */
  public void troco() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Preço unitário do produto: ");
    double preco = scan.nextDouble();
    System.out.print("Quantidade comprada: ");
    double qtde = scan.nextDouble();
    System.out.print("Dinheiro recebido: ");
    double dinheiroRecebido = scan.nextDouble();

    DecimalFormat df = new DecimalFormat("#,##0.00");

    double troco = dinheiroRecebido - (preco * qtde);
    System.out.printf("Troco: %s", df.format(troco));

    scan.close();
  }

  /**
   * Problema "Circulo"
   * Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
   * círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟ଶ. Você pode
   * usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
   * diretamente o valor 3.14159.
   */
  public void circulo() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o valor do raio do círculo: ");
    double raio = scan.nextDouble();

    DecimalFormat df = new DecimalFormat("#0.0##");

    double area = 3.14159 * Math.pow(raio, 2);

    System.out.printf("Área: %s", df.format(area));

    scan.close();
  }

  /**
   * Problema "Pagamento"
   * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
   * quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
   * uma mensagem explicativa, conforme exemplo.
   */
  public void pagamento() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = scan.next();

    System.out.print("Valor por hora: ");
    double valorPorHora = scan.nextDouble();

    System.out.printf("Horas trabalhadas: ");
    int horasTrabalhadas = scan.nextInt();

    DecimalFormat df = new DecimalFormat("#0.00");

    double resultado = valorPorHora * horasTrabalhadas;

    System.out.println("O pagamento para " + nome + " deve ser " + df.format(resultado));

    scan.close();
  }

  /**
   * Problema "Consumo"
   * Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
   * combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
   * médio do carro, com três casas decimais.
   */
  public void consumo() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Distância percorrida: ");
    int distanciaPercorrida = scan.nextInt();

    System.out.print("Combustível gasto: ");
    double combustivelGasto = scan.nextDouble();

    double consumoMedio =  distanciaPercorrida / combustivelGasto;

    DecimalFormat df = new DecimalFormat("#0.000");

    System.out.println("Consumo médio: " + df.format(consumoMedio));

    scan.close();
  }

  /**
   * Problema "Medidas"
   * Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
   * com quatro casas decimais):
   * a) a área do quadrado que tem lado A
   * b) a área do triângulo retângulo que base A e altura B
   * c) a área do trapézio que tem bases A e B, e altura C
   */
  public void medidas() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a medida A: ");
    double a = scan.nextDouble();

    System.out.print("Digite a medida B: ");
    double b = scan.nextDouble();

    System.out.print("Digite a medida C: ");
    double c = scan.nextDouble();

    double areaQuadrado = Math.pow(a, 2);
    double areaTriangulo = (a * b) / 2;
    double areaTrapezio = ((a + b) / 2) * c;

    DecimalFormat df = new DecimalFormat("0.0000");

    System.out.println("Área do quadrado: " + df.format(areaQuadrado));
    System.out.println("Área do triângulo: " + df.format(areaTriangulo));
    System.out.println("Área do trapézio: " + df.format(areaTrapezio));

    scan.close();
  }

  /**
   * Problema "Duracao"
   * Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
   * formato horas:minutos:segundos.
   */
  public void duracao() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a duração em segundos: ");
    int segundos = scan.nextInt();

    int hr = segundos / 3600;
    int min = (segundos - hr * 3600) / 60;
    int seg = segundos % 60;

    System.out.println(hr + ":" + min + ":" + seg);

    scan.close();
  }
}
