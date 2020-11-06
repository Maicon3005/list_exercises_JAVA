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
public class Lista1 {

    private Scanner sc = new Scanner(System.in);

    public void ex1() {
        System.out.println("ex1");
        int num = 0;
        int cont = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " - Digite um número");
            num = new Random().nextInt(1000) + 1;
            System.out.println(num);
            if (num >= 10 && num <= 100) {
                cont++;
            }
        }

        System.out.println("A quantidade de números no intervalo de 10 a  100 é " + cont);
    }

    public void ex2() {
        System.out.println("ex2");
        System.out.println("Digite o valor de x1:");
        double x1 = sc.nextDouble();
        System.out.println("Digite o valor de x2:");
        double x2 = sc.nextDouble();
        System.out.println("Digite o valor de y1:");
        double y1 = sc.nextDouble();
        System.out.println("Digite o valor de y2:");
        double y2 = sc.nextDouble();

        double resultado = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(resultado);
    }

    public void ex3() {
        System.out.println("ex3");
        int valor = 0;
        int maiorPar = 0;
        for (int i = 0; i < 50; i++) {
            valor = new Random().nextInt(10000);
            System.out.println("Digite um número: ");
            System.out.println(valor);
            if (valor % 2 == 0) {
                if (maiorPar < valor) {
                    maiorPar = valor;
                }
            }
        }
        System.out.println("O maior número par digitado é " + maiorPar);
    }

    public void ex4() {
        System.out.println("ex4");
        System.out.println("Digite o valor de Equivalência do resistor: ");
        double valEq = sc.nextDouble();
        int cont = 0;
        double soma = 0;

        while (soma < valEq) {
            System.out.println("Digite o valor do resistor");
            soma += sc.nextDouble();
            cont++;
        }

        System.out.println("Foram necessários " + cont + " resistores em série para atingir " + valEq + " ohms.");
    }

    public void ex5() {
        System.out.println("ex5");

        System.out.println("Digite o sexo da pessoa: m/f");
        String sexo = sc.nextLine();
        System.out.println("Digite a altura da pessoa: ");
        double altura = sc.nextDouble();

        if (sexo.equals("m")) {
            System.out.println("O peso ideal é: " + ((72.7 * altura) - 58));
        } else if (sexo.equals("f")) {
            System.out.println("O peso ideal é: " + ((62.1 * altura) - 44.7));
        }
    }
    /*
     Crie um algoritmo que leia quatro valores digitados pelo usuário: n, a, b, c.
     a) Se n = 1 imprimir os três valores a, b, c em ordem crescente.
     b) Se n = 2 escrever os três valores a, b, c em ordem decrescente.
     c) Se n = 3 escrever os três valores a, b, c de forma que o maior fique no meio
     */

    public void ex6() {
        System.out.println("ex6");
        System.out.println("Digite o valor N: ");
        int n = sc.nextInt();
        System.out.println("Digite o valor A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor C: ");
        int c = sc.nextInt();

        int menor = 0;
        int medio = 0;
        int maior = 0;

        if (a < b && b < c) {
            menor = a;
            medio = b;
            maior = c;
        } else if (a < c && c < b) {
            menor = a;
            medio = c;
            maior = b;
        } else if (b < a && a < c) {
            menor = b;
            medio = a;
            maior = c;
        } else if (b < c && c < a) {
            menor = b;
            medio = c;
            maior = a;
        } else if (c < a && a < b) {
            menor = c;
            medio = a;
            maior = b;
        } else if (c < b && b < a) {
            menor = c;
            medio = b;
            maior = a;
        }
        if (n == 1) {
            System.out.println(menor + " " + medio + " " + maior);
        } else if (n == 2) {
            System.out.println(maior + " " + medio + " " + menor);
        } else if (n == 3) {
            System.out.println(menor + " " + maior + " " + medio);
        }

    }
    /*
     Escreva um programa que converta um intervalo de tempo dado em minutos, em
     horas, minutos e segundos. Por exemplo, se o tempo dado for 145,87 minutos, o
     programa deve fornecer 2 h 25 min 52,2 s.
     */

    public void ex7() {
        System.out.println("ex7");
        System.out.println("Digite um tempo em minutos: ");
        double minutos = sc.nextDouble();

        int horas = (int) minutos / 60;
        int min = (int) minutos - (horas * 60);
        double seg = ((minutos - (horas * 60) - min) * 600) / 10;
        System.out.println(horas + " h " + min + " min " + seg + " s");
    }
    /*
     Desenvolva um algoritmo que leia um número inteiro positivo n e imprima a
     tabuada de multiplicar correspondente. Por exemplo, para n = 6, devemos obter:
     1 X 6 = 6, 2 X 6 = 12,..., 10 X 6 = 60.
     */

    public void ex8() {
        System.out.println("ex8");
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    /*
     Um posto está vendendo combustíveis com a seguinte tabela de descontos:
     Álcool: até 20 litros, desconto de 3% por litro e acima de 20 litros, desconto de
     5% por litro;
     Gasolina: até 20 litros, desconto de 4% por litro e acima de 20 litros, desconto
     de 6% por litro.
     Escreva um algoritmo que leia o número de litros vendidos, o tipo de
     combustível (A-álcool, G-gasolina) e imprima o valor a ser pago pelo cliente.
     Considere que o preço do litro da gasolina é R$ 2,99 e o preço do litro do álcool
     é R$ 2,19.
     */

    public void ex9() {
        System.out.println("ex9");
        double precoAlcool = 2.19;
        double precoGasolina = 2.99;
        double total = 0;

        System.out.println("Digite o combustível: g/a");
        String tipo = sc.nextLine();
        System.out.println("Digite a quantidade de litros:");
        double litros = sc.nextDouble();

        if (tipo.equals("g")) {
            if (litros <= 20) {
                total = (litros * precoGasolina) * (0.96);
            } else {
                total = (litros * precoGasolina) * (0.94);
            }
        } else if (tipo.equals("a")) {
            if (litros <= 20) {
                total = (litros * precoGasolina) * (0.97);
            } else {
                total = (litros * precoGasolina) * (0.95);
            }
        }
        System.out.println("Preço a pagar: " + total);
    }

}
