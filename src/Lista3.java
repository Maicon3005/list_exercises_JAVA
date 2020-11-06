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
public class Lista3 {

    private Scanner sc = new Scanner(System.in);

    public void ex1() {
        System.out.println("ex1");
        System.out.println("Digite o salário atual: ");
        double salarioAtual = sc.nextDouble();

        System.out.println("Salário com aumento: " + (salarioAtual * 1.25));
    }

    public void ex2() {
        System.out.println("ex2");
        System.out.println("Digite o salário atual: ");
        double salarioAtual = sc.nextDouble();
        System.out.println("Digite a porcentagem de reajuste: ");
        double porc = sc.nextInt();
        double porcA = (porc / 100) + 1;

        System.out.println("Salário com aumento: " + (porcA * salarioAtual));
    }

    public void ex3() {
        System.out.println("ex3");
        System.out.println("Digite seu ano de nascimento: ");
        int anaN = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int ano = anoAtual - anaN;
        int meses = ano * 12;
        int dias = ano * 365;
        int semana = ano * 52;

        System.out.println("Anos : " + ano);
        System.out.println("Meses : " + meses);
        System.out.println("Dias : " + dias);
        System.out.println("Semanas : " + semana);

    }

    public void ex4() {
        System.out.println("ex4");
        System.out.println("Digite o peso do saco de ração: ");
        double pesoSaco = sc.nextDouble();

        System.out.println("Digite a qtd de ração para o gato 1 :");
        double g1 = sc.nextDouble();

        System.out.println("Digite a qtd de ração para o gato 2:");
        double g2 = sc.nextDouble();

        double consumoDias = (g1 + g2) * 5;
        double restante = pesoSaco - consumoDias;

        System.out.println("Sobra no saco de ração após cinco dias: " + restante);

    }

    public void ex5() {
        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();

        double aux = b;
        b = a;
        a = aux;

        System.out.println("Variaval A:" + a);
        System.out.println("Variaval B:" + b);
    }

    public void ex6() {
        System.out.println("Digite a largura da caixa: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimentp da caixa: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite a altura da caixa: ");
        double altura = sc.nextDouble();

        System.out.println("O volume da caixa é: " + (comprimento * largura * altura));
    }

    public void ex7() {
        System.out.println("Digite o valor A");
        int a = sc.nextInt();
        System.out.println("Digite o valor B");
        int b = sc.nextInt();

        int dif = a - b;

        System.out.println("O quadrado da diferença é " + (Math.pow(dif, 2)));
    }

    public void ex8() {
        System.out.println("Digite o valor em Dolar: ");
        double dolar = sc.nextDouble();

        System.out.println("Digite a cotação do Dolar: ");
        double cotacao = sc.nextDouble();

        System.out.println("O valor convertido em reais é " + (dolar * cotacao));
    }

    public void ex9() {
        System.out.println("Digite o valor A:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor B:");
        double b = sc.nextDouble();
        System.out.println("Digite o valor C:");
        double c = sc.nextDouble();

        double resultado = Math.pow((a + b + c), 2);

        System.out.println("Resultado " + resultado);
    }

    public void ex10() {
        System.out.println("Digite o valor A:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor B:");
        double b = sc.nextDouble();

        System.out.println("Soma" + (a + b));
        System.out.println("Subtação" + (a - b));
        System.out.println("Multiplicação" + (a * b));
        System.out.println("Divisão" + (a / b));
    }
    /*
     VOLUME <- (4 / 3) * 3.14159 * (RAIO3).
     */

    public void ex11() {
        System.out.println("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4 / 3) * Math.PI * raio;

        System.out.println("O volume de esfera é " + volume);
    }

    public void ex12() {
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));
    }

}
