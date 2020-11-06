import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maico
 */
public class Lista4 {

    private Scanner sc = new Scanner(System.in);
    /*
     Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
     três e que se encontram no conjunto dos números de 1 até 500.
     */

    public void ex1() {
        System.out.println("ex1");
        boolean continuar = true;
        int num;
        int soma = 0;

        while (continuar) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num % 2 != 0 && num % 3 == 0 && num >= 1 && num <= 500) {
                soma += num;
            }

            System.out.println("Soma: " + soma);

            System.out.println("Adicionar número: ");
            sc.nextLine();
            String opcao = sc.nextLine();
            if (opcao.equals("s")) {
                continuar = true;
            } else {
                continuar = false;
            }
        }

    }

    /*
     Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
     mostrar :
     a. A menor altura do grupo;
     b. A maior altura do grupo;
     */
    public void ex2() {
        System.out.println("ex2");
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        double altura;

        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + " - Digite uma altura:");
            altura = sc.nextDouble();

            if (altura > maior) {
                maior = altura;
            }

            if (altura < menor) {
                menor = altura;
            }
        }
        System.out.println("A maior altura do grupo é: " + maior);
        System.out.println("A menor altura do grupo é: " + menor);
    }
    /*
     Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
     média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
     negativos e o percentual de valores negativos e positivos.
     */

    public void ex3() {
        System.out.println("ex3");
        int numero;
        boolean continuar = true;
        int cont = 0;
        double media = 0;
        int qtdPositivo = 0;
        int qtdNegativo = 0;
        double percentualP = 0;
        double percentualN = 0;
        int soma = 0;

        while (continuar) {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            cont++;
            soma += numero;

            media = soma / cont;

            if (numero >= 0) {
                qtdPositivo++;
            } else {
                qtdNegativo++;
            }

            percentualP = (qtdPositivo * 100) / cont;
            percentualN = 100 - percentualP;

            System.out.println("Média = " + media);
            System.out.println("Qtd Positivos = " + qtdPositivo);
            System.out.println("Qtd Negativos = " + qtdNegativo);
            System.out.println("% Positivos = " + percentualP);
            System.out.println("% Negativos = " + percentualN);

            System.out.println("Deseja adicionar um número: ");
            sc.nextLine();
            String opcao = sc.nextLine();

            if (opcao.equals("s")) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
    }
    /*
     Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
     estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
     terminar quando for lido um número negativo.
     */

    public void ex4() {
        System.out.println("ex4");
        int num = 0;
        int interUm = 0;
        int interDois = 0;
        int interTres = 0;
        int interQuatro = 0;

        while (num >= 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num >= 0 && num <= 25) {
                interUm++;
            } else if (num >= 26 && num <= 50) {
                interDois++;
            } else if (num >= 51 && num <= 75) {
                interTres++;
            } else if (num >= 76 && num <= 100) {
                interQuatro++;
            }
        }

        System.out.println("Qtd de números entre 0 - 25: " + interUm);
        System.out.println("Qtd de números entre 26 - 50: " + interDois);
        System.out.println("Qtd de números entre 51 - 75: " + interTres);
        System.out.println("Qtd de números entre 76 - 100: " + interQuatro);
    }
    /*
     Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
     Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
     números lidos. O número que encerrará a leitura será zero.
     */

    public void ex5() {
        System.out.println("ex5");
        boolean continuar = true;
        double num, somaPar = 0, mediaPar = 0, somaGeral = 0, mediaGeral = 0;
        int qtdPar = 0, qtdImpar = 0, cont = 1;

        while (continuar) {
            System.out.println("Digite um número positivo");
            num = sc.nextInt();

            if (num > 0) {
                somaGeral += num;

                if (num % 2 == 0) {
                    System.out.println("Entrou par");
                    somaPar += num;
                    qtdPar++;
                    mediaPar = somaPar / qtdPar;
                } else {
                    qtdImpar++;
                }

                mediaGeral = somaGeral / cont;

                cont++;
            } else {
                continuar = false;
            }
        }
        System.out.println("Leituras encerradas:");
        System.out.println("*****************************************");
        System.out.println("Qtd números Pares: " + qtdPar);
        System.out.println("Qtd números Impares: " + qtdImpar);
        System.out.println("Média Pares: " + mediaPar);
        System.out.println("Média geral: " + mediaGeral);
    }
    /* 
     Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200.
     */

    public void ex6() {
        System.out.println("ex6");
        int min = 100;
        int max = 200;
        Random a = new Random();
        int numero;

        boolean continuar = true;

        while (continuar) {
            numero = a.nextInt((max - min) + 1) + min;

            if (numero % 2 != 0) {
                System.out.println(numero);

                System.out.println("Quer Continuar? s/n");
                String opcao = sc.nextLine();
                if (opcao.equals("s")) {
                    continuar = true;
                } else {
                    continuar = false;
                }
            }
        }
    }
    /*
     Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
     N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.
     */

    public void ex7() {
        System.out.println("ex7");
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (numero * i));

        }
    }
    /*
     Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
     P.A. contendo 10 valores.
     an = a1 + (n – 1) . r

     an = n-ésimo termo da sequência
     a1 = primeiro termo
     n = posição do termo na sequência
     r= razão
     */

    public void ex8() {
        System.out.println("ex8");
        System.out.println("Digite o valor Inicial: ");
        int a1 = sc.nextInt();
        System.out.println("Digite a razão: ");
        int r = sc.nextInt();
        int an = 0;

        System.out.print("(");
        for (int n = 1; n < 11; n++) {
            an = a1 + (n - 1) * r;
            System.out.print(an);
            System.out.print(n != 10 ? ", " : ")");
        }
    }
    /*
     Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
     P.G. contendo 10 valores.
     an = a1 . qn – 1

     an = n-ésimo termo da sequência
     a1 = primeiro termo da sequência
     q = razão
     n = posição do termo da sequência
     */

    public void ex9() {
        System.out.println("ex9");
        System.out.println("Digite o valor inicial: ");
        int a1 = sc.nextInt();
        System.out.println("Digite a razão: ");
        int q = sc.nextInt();
        double an = 0;

        System.out.print("(");
        for (int n = 1; n < 11; n++) {
            an = a1 * Math.pow(q, (n - 1));
            System.out.print(an);
            System.out.print(n != 10 ? ", " : ")");
        }
    }
    /*
     Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
     A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
     */

    public void ex10() {
        System.out.println("ex10");
        System.out.println("Digite um valor: ");
        int a = sc.nextInt();
        int fator = 1;

        System.out.print(a + "! = ");
        for (int i = a; i >= 1; i--) {
            fator *= i;
            System.out.print(i);
            System.out.print(i != 1 ? " X " : " = ");
        }
        System.out.println(fator);
    }

}
