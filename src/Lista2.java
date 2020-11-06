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
public class Lista2 {

    private Scanner sc = new Scanner(System.in);
    /*
     A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
     dimensões de um terreno e depois exibir a área do terreno.
     */

    public void ex1() {
        System.out.println("ex1");
        System.out.println("Digite a largura do terreno");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno");
        double comprimento = sc.nextDouble();

        System.out.println("A área do terreno é: " + (largura * comprimento));
    }
    /*
     Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os
     cavalos comprados para um haras.
     */

    public void ex2() {
        System.out.println("ex2");
        System.out.println("Digite a quantidade de cavalos: ");
        int qtd = sc.nextInt();

        System.out.println("A quantidade de ferraduras necessárias é:" + (qtd * 4));
    }

    /*
     A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a
     cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber
     quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de
     poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com
     base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular
     os dados solicitados.
     */
    public void ex3() {
        System.out.println("ex3");
        double precoPao = 0.12;
        double precoBroa = 1.50;
        System.out.println("Digite a quantidade de pães vendidas:");
        int qtdPao = sc.nextInt();
        System.out.println("Digite a quantidade de Broas vendidas:");
        int qtdBroa = sc.nextInt();
        double total = (qtdBroa * precoBroa) + (qtdPao * precoPao);
        System.out.println("O valor total arrecado foi: " + total);
        double guardar = total * 0.1;
        System.out.println("Você deve guardar " + guardar);
    }
    /*
     Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
     ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
     com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
     DIAS    
     */

    public void ex4() {
        System.out.println("ex4");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println(nome + " você já viveu " + (idade * 365));
    }

    /*
     Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
     preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
     tanque.
     */
    public void ex5() {
        System.out.println("ex5");
        System.out.println("Digite o preco do litro da gasolina: ");
        double precoLitro = sc.nextDouble();
        System.out.println("Digite o valor do pagamento: ");
        double valorPgt = sc.nextDouble();

        System.out.println("A quantidade de litros é: " + (valorPgt / precoLitro));
    }
    /*
     O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
     que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
     balança já desconte o peso do prato.
     */

    public void ex6() {
        System.out.println("ex6");
        double precoKilo = 12.00;
        System.out.println("Digite o peso da refeição: ");
        double peso = sc.nextDouble();

        System.out.println("O valor total a pagar é :" + (precoKilo * peso));
    }

    /*
     Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do
     ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.
     */
    public void ex7() {
        System.out.println("ex7");
        System.out.println("Digite a qtd de dias: ");
        int qtdDias = sc.nextInt();
        System.out.println("Digite o mes:");
        int mes = sc.nextInt();

        System.out.println("A quantidade de dias que se passaram é :" + ((mes * 30) + qtdDias));
    }

    /*
     Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média
     ponderada (as notas tem pesos respectivos de 1, 2 e 3).
     */
    public void ex8() {
        System.out.println("ex8");
        System.out.println("Digite a nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3");
        double nota3 = sc.nextDouble();
        int peso1 = 1, peso2 = 2, peso3 = 3;

        double media = (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3));

        System.out.println("A média ponderada das notas é: " + media);
    }
    /*
     Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
     vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
     quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
     informe quanto será o valor arrecadado.
     */

    public void ex9() {
        System.out.println("ex9");
        double camisetaP = 10.00;
        double camisetaM = 12.00;
        double camisetaG = 15.00;

        System.out.println("Digite a quantidade de camisetas pequenas vendidas: ");
        int qtdP = sc.nextInt();
        System.out.println("Digite a quantidade de camisetas médias vendidas: ");
        int qtdM = sc.nextInt();
        System.out.println("Digite a quantidade de camisetas grandes vendidas: ");
        int qtdG = sc.nextInt();

        double total = (camisetaP * qtdP) + (camisetaM * qtdM) + (camisetaG * qtdG);
        System.out.println("O valor total arrecadado é " + total);
    }

    /*
     Construa um algoritmo para calcular a distância entre dois pontos do plano cartesiano. Cada
     ponto é um par ordenado (x,y).
     */
    public void ex10() {
        System.out.println("ex10");
        System.out.println("Digite o valor de Xa: ");
        double xa = sc.nextDouble();
        System.out.println("Digite o valor de Xb: ");
        double xb = sc.nextDouble();
        System.out.println("Digite o valor de Ya: ");
        double ya = sc.nextDouble();
        System.out.println("Digite o valor de Yb: ");
        double yb = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));

        System.out.println("A distância é " + distancia);
    }

    /*
     Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias. Faça um
     algoritmo para converter este tempo em anos, meses e dias. Assuma que cada mês possui sempre
     30 dias.
     */
    public void ex11() {
        System.out.println("ex11");
        System.out.println("Digite a quantidade de dias sem acidentes: ");
        int qtdDias = sc.nextInt();

        int anos = (int) qtdDias / 360;
        int meses = (int) (qtdDias - (anos * 360)) / 30;
        int dias = (int) (qtdDias - ((anos * 360) + (meses * 30)));

        System.out.println("Estamos a " + anos + " anos, " + meses + " meses, " + dias + " dias sem acidentes.");
    }
    /*
     Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
     desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
     */

    public void ex12() {
        System.out.println("ex12");
        System.out.println("Digite um salário: ");
        double salarioinicial = sc.nextDouble();
        System.out.println("Salário inicial: " + salarioinicial);
        double salarioAumento = salarioinicial * 1.15;
        System.out.println("Salário com aumento: " + salarioAumento);
        double salarioFinal = salarioAumento * 0.92;
        System.out.println("Salário final: " + salarioFinal);
    }

    /*
     Ler um número inteiro (assuma até três dígitos) e imprimir a saída da seguinte forma:
     CENTENA = x
     DEZENA = x
     UNIDADE = x
     */
    public void ex13() {
        System.out.println("ex13");
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        int centena = (int) num / 100;
        int dezena = (int) (num - (centena * 100)) / 10;
        int unidade = num - ((centena * 100) + (dezena * 10));

        System.out.println("CENTENA = " + centena);
        System.out.println("DEZENA = " + dezena);
        System.out.println("UNIDADE = " + unidade);
    }

    /*
     Calcule a área de uma pizza que possui um raio R (pi=3.14).
     */
    public void ex14() {
        System.out.println("ex14");
        System.out.println("Digite o raio da pizza: ");
        double raio = sc.nextInt();
        double area = Math.pow(raio, 2) * Math.PI;

        System.out.println("A área da pizza é: " + area);
    }
    /*
     Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
     algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
     Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
     Carlos, R$33,00 para André e R$35,53 para Felipe.
     */

    public void ex15() {
        System.out.println("ex15");
        double valorConta = sc.nextDouble();
        int carlos = (int) 101.53 / 3;
        int andre = (int) 101.53 / 3;
        double excedente = valorConta % 3;
        double felipe = ((int) 101.53 / 3) + excedente;

        System.out.println("Carlos: " + carlos + ", André: " + andre + ", Felipe: " + felipe);
    }

    /*
     A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
     queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
     presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
     que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
     quilos) de queijo, presunto e carne necessários para compra.
     */
    public void ex16() {
        System.out.println("ex16");
        int presunto = 50;
        int queijo = 50;
        int hamburguer = 100;

        System.out.println("Digite a quantidade de hamburguers a serem feitos: ");
        int qtd = sc.nextInt();

        System.out.println("Peso de presunto: " + (presunto * qtd));
        System.out.println("Peso de queijo: " + (queijo * qtd));
        System.out.println("Peso de hamburguer: " + (hamburguer * qtd));
    }
    /*
     Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um
     algoritmo para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este
     tipo de conversão). (0 °C × 9/5) + 32 = 32 °F
     */

    public void ex17() {
        System.out.println("ex17");
        System.out.println("Digite a temperatura em ºC: ");
        double tempCelsius = sc.nextDouble();

        double fehrenheit = tempCelsius * (9.0 / 5.0) + 32;

        System.out.println("Temperatura em ºF: " + fehrenheit);
    }

    /*
     A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
     Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado
     funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de
     impostos.
     */
    public void ex18() {
        System.out.println("ex18");
        double vHora = 10.00;
        double vHoraExtra = 15.00;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double hrTrabalhadas = sc.nextDouble();
        System.out.println("Digite a quantidade de horas extras: ");
        double hrExtras = sc.nextDouble();

        double salBruto = (hrTrabalhadas * vHora) + (hrExtras * vHoraExtra);
        double salLiquido = salBruto * 0.9;

        System.out.println("Salário Bruto: " + salBruto);
        System.out.println("Salário Liquido: " + salLiquido);
    }

    /*
     A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé
     direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para
     indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o
     anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar
     todos os seus frangos.
     */
    public void ex19() {
        System.out.println("ex19");
        double aneis = (2 * 3.5) + 4;

        System.out.println("Digite a quantidade de frangos: ");
        int qtd = sc.nextInt();
        System.out.println("O valor total a ser gasto é: " + (aneis * qtd));

    }

    /*
     Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos. Faça
     um algoritmo para calcular quantos novelos de lã ela gasta por blusa.
     */
    public void ex20() {
        System.out.println("ex11");
        System.out.println("Digite a quantidade de blusas: ");
        double qtd = sc.nextInt();
        System.out.println("Digite a quantidade de novelos usados: ");
        double novelos = sc.nextInt();

        System.out.println("O total de novelos utilizados por blusa é: " + (novelos / qtd));
    }
    /*
     A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml,
     garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade
     de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
     */

    public void ex21() {
        System.out.println("ex21");
        double lata = 0.35;
        double garrafa600ml = 0.6;
        double garrafa2l = 2.0;

        System.out.println("Qtd de latas 350ml: ");
        int qtdLatas = sc.nextInt();
        System.out.println("Qtd de garrafas 600ml: ");
        int qtdGarrafas600ml = sc.nextInt();
        System.out.println("Qtd de garrafas 2 l");
        int qtdGarrafas2l = sc.nextInt();

        double qtdTotal = (lata * qtdLatas) + (garrafa600ml * qtdGarrafas600ml) + (garrafa2l * qtdGarrafas2l);

        System.out.println("A quantidade de litros comprados foi: " + qtdTotal + " Litros");
    }
    /*
     Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu
     poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total
     economizado, em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda
     moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.
     */

    public void ex22() {
        System.out.println("ex22");
        boolean continuar = true;
        int opcao;

        double um = 0.01;
        double cinco = 0.05;
        double dez = 0.10;
        double vintecinco = 0.25;
        double cinquenta = 0.50;
        double umReal = 1.00;

        int opcaoMoeda;
        int qtdMoeda;
        double poupanca = 0;

        while (continuar) {
            System.out.println("1 - Depositar");
            System.out.println("2 - Saldo");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite qual moedas deseja depositar:");
                System.out.println(" 1 - Um Centavo");
                System.out.println(" 2 - Cincos Centavos");
                System.out.println(" 3 - Dez Centavos");
                System.out.println(" 4 - Vinte e Cinco Centavos");
                System.out.println(" 5 - Cinquenta Centavos");
                System.out.println(" 6 - Um Real");
                opcaoMoeda = sc.nextInt();

                System.out.println("Digite a quantidade de moedas: ");
                qtdMoeda = sc.nextInt();

                switch (opcaoMoeda) {
                    case 1:
                        poupanca += um * qtdMoeda;
                        break;
                    case 2:
                        poupanca += cinco * qtdMoeda;
                        break;
                    case 3:
                        poupanca += dez * qtdMoeda;
                        break;
                    case 4:
                        poupanca += vintecinco * qtdMoeda;
                        break;
                    case 5:
                        poupanca += cinquenta * qtdMoeda;
                        break;
                    case 6:
                        poupanca += umReal * qtdMoeda;
                        break;
                }

                System.out.println("Suas moedas foram depositadas com Sucesso !");

            } else if (opcao == 2) {
                System.out.println("Seu saldo é de: " + poupanca);
            } else {
                System.out.println("Digite uma opção válida !");
            }

            System.out.println("Deseja realizar outra operação? s/n");
            sc.nextLine();
            String verificar = sc.nextLine();
            if (verificar.equals("s")) {
                continuar = true;
            } else if (verificar.equals("n")) {
                continuar = false;
            }
        }
    }
    /*
     Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente
     longa. Assumindo que seja possível medir sua sombra e a do prédio no chão, e que você lembre
     da sua altura, faça um algoritmo para ler os dados necessários e calcular a altura do prédio.
     */

    public void ex23() {
        System.out.println("ex23");
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Quantidade de reposicionamentos: ");
        int qtd = sc.nextInt();

        System.out.println("A altura estimada do prédio é " + (altura * qtd));

    }

    /*
     Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
     Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X
     litros de refresco (informados pelo usuário).
     */
    public void ex24() {
        System.out.println("ex24");
        System.out.println("Informe a quantidade de suco pretendida: ");
        double qtd = sc.nextInt();

        System.out.println("Quantidade de água necessária: " + (qtd * 0.80));
        System.out.println("Quantidade de Suco necessária: " + (qtd * 0.20));
    }

    /*
     Calcule o volume de uma caixa d'água cilíndrica.
     */
    public void ex25() {
        System.out.println("ex25");
        System.out.println("Digite o raio da caixa: ");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura da caixa: ");
        double altura = sc.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da caixa é " + volume);
    }

    /*
     Faça um algoritmo que receba três números, calcule e mostre a multiplicação desses números.
     */
    public void ex26() {
        System.out.println("ex26");
        System.out.println("Digite o valor A:");
        double a = sc.nextInt();
        System.out.println("Digite o valor B:");
        double b = sc.nextInt();
        System.out.println("Digite o valor C:");
        double c = sc.nextInt();

        System.out.println("O resultado da multiplição dos números é " + (a * b * c));
    }
    /*
     Faça um algoritmo que receba dois números, calcule e mostre a divisão do primeiro número
     pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto não é necessário se
     preocupar com validações.
     */

    public void ex27() {
        System.out.println("ex27");
        System.out.println("Digite um número: ");
        double a = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double b = sc.nextDouble();

        System.out.println("O resultado da divisão é " + (a / b));
    }
    /*
     Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada dessas notas,
     considerando peso 2 para a primeira nota e peso 3 para a segunda nota.
     */

    public void ex28() {
        double peso1 = 2;
        double peso2 = 3;

        System.out.println("ex28");
        System.out.println("Digite uma nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite uma nota: ");
        double n2 = sc.nextDouble();

        double resposta = ((peso1 * n1) + (peso2 * n2)) / (peso1 + peso2);

        System.out.println("A média ponderada é " + resposta);
    }

    /*
     Faça um algoritmo que receba o preço de um produto, calcule e mostre o novo preço,
     sabendo-se que este sofreu um desconto de 10%.
     */
    public void ex29() {
        System.out.println("ex29");
        System.out.println("Digite o preço de um produto: ");
        double pProduto = sc.nextDouble();

        System.out.println("O preço do produto com desconto é " + (pProduto * 0.9));
    }
    /*
     Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um
     algoritmo que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a
     comissão e o salário final do funcionário
     */

    public void ex30() {
        System.out.println("ex30");
        System.out.println("Digite o salário fixo: ");
        double salario = sc.nextDouble();
        boolean addVenda = true;
        double valorVendas = 0;

        while (addVenda) {
            System.out.println("Valor da venda: ");
            valorVendas += sc.nextDouble();

            System.out.println("Adicionar mais vendas: ");
            sc.nextLine();
            String continuar = sc.nextLine();
            if (continuar.equals("s")) {
                addVenda = true;
            } else if (continuar.equals("n")) {
                addVenda = false;
            }
        }

        double comissao = valorVendas * 0.04;

        System.out.println("Valor da comissão: " + comissao);
        System.out.println("Salário total: " + (salario + comissao));
    }
    /*
     Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
     a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
     b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
     */

    public void ex31() {
        System.out.println("ex31");
        System.out.println("Digite o peso de uma pessoa: ");
        double peso = sc.nextDouble();

        System.out.println("15% + = " + (peso * 1.15));
        System.out.println("20% + = " + (peso * 0.80));
    }
    /*
     Faça um algoritmo que receba o peso de uma pessoa em quilos, calcule e mostre esse peso
     em gramas.
     */

    public void ex32() {
        System.out.println("ex32");
        System.out.println("Digite o peso em quilos: ");
        double quilos = sc.nextDouble();

        System.out.println("Peso em gramas = " + (quilos * 1000) + " g");
    }
    /*
     Faça um algoritmo que calcule e mostre a área de um trapézio. Sabe-se que: A = (base maior +
     base menor)* altura)/2 ;
     */

    public void ex33() {
        System.out.println("ex33");
        System.out.println("Digite o valor da base maior: ");
        double baseMaior = sc.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        double baseMenor = sc.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é " + areaTrapezio);
    }
    /*
     Faça um algoritmo que calcule e mostre a área de um quadrado.
     Sabe-se que: A = lado * lado;
     */

    public void ex34() {
        System.out.println("ex34");
        System.out.println("Digite o comprimento do lado do quadrado: ");
        double comprimento = sc.nextDouble();

        System.out.println("A área do quadrado é " + (Math.pow(comprimento, 2)));
    }

    /*
     Faça um algoritmo que calcule e mostre a área de um losango. Sabe-se que: A =
     (diagonal_maior * diagonal_menor)/2;
     */
    public void ex35() {
        System.out.println("ex35");
        System.out.println("Digite o valor da diagonal maior: ");
        double dMaior = sc.nextDouble();
        System.out.println("Digite o valor da diagonal menor: ");
        double dMenor = sc.nextDouble();

        double areaLosango = (dMaior * dMenor) / 2;

        System.out.println("A área do losango é " + areaLosango);
    }
    /*
     Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário,
     calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
     */

    public void ex36() {
        System.out.println("ex36");
        System.out.println("Digite o valor do salário minímo: ");
        double salarioMinimo = sc.nextDouble();
        System.out.println("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = sc.nextDouble();

        System.out.println("A quantidade de salários minímo que esse funcionário recebe é " + (salarioFuncionario / salarioMinimo));
    }

    /*
     Faça um algoritmo que calcule e mostre a tabuada de um número digitado pelo usuário.
     */
    public void ex37() {
        System.out.println("ex37");
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    /*
     Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e
     mostre:
     a) a idade dessa pessoa em anos;
     b) a idade dessa pessoa em meses;
     c) a idade dessa pessoa em dias;
     d) a idade dessa pessoa em semanas.
     */

    public void ex38() {
        System.out.println("ex39");
        System.out.println("Digite seu ano de nascimento: ");
        int anoNasc = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int anos = anoAtual - anoNasc;
        int meses = anos * 12;
        int dias = anos * 365;
        int semanas = anos * 52;

        System.out.println("Sua idade em anos é: " + anos);
        System.out.println("Sua idade em meses é: " + meses);
        System.out.println("Sua idade em dias é: " + dias);
        System.out.println("Sua idade em semanas é: " + semanas);
    }
    /*
     João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas (C1=R$ 200,00 e
     C2=R$120,00) que estão atrasadas. Como as contas estão atrasadas, João terá de pagar multa de
     2% sobre cada conta. Faça um algoritmo que calcule e mostre quanto restará do salário do João
     */

    public void ex39() {
        System.out.println("ex39");
        double salario = 1200.0;
        double c1 = 200.00;
        double c2 = 120.00;

        double c1A = c1 * 1.02;
        double c2A = c2 * 1.02;

        System.out.println("Restou do salário do joão: " + (salario - c1A - c2A));
    }

    /*
     Faça um algoritmo que receba o valor dos catetos de um triângulo, calcule e mostre o valor da
     hipotenusa.
     */
    public void ex40() {
        System.out.println("ex40");
        System.out.println("Digite o valor do cateto 1:");
        double c1 = sc.nextDouble();
        System.out.println("Digite o valor do cateto 2:");
        double c2 = sc.nextDouble();
        
        double h = Math.pow(c1, 2) + Math.pow(c2, 2);
        
        System.out.println("O valor da hipotenusa é " + h);
    }
}
