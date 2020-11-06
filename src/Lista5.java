import java.util.ArrayList;
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
public class Lista5 {

    private Scanner sc = new Scanner(System.in);

    public void ex1() {
        System.out.println("ex1");
        int a = 0;
        int qtdNegativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor");
            a = sc.nextInt();
            if (a <= 0) {
                qtdNegativos++;
            }
        }
        System.out.println("Qtd de negativos: " + qtdNegativos);
    }

    public void ex2() {
        System.out.println("ex2");
        System.out.println("Digite um valor para N: ");
        int n = sc.nextInt();
        double e = 0;

        for (int i = 0; i <= n; i++) {
            double fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= (i == 0) ? 1 : j;
            }
            e += 1 / fatorial;
        }
        System.out.println(e);
    }
    /*
     a) média do salário da população;
     b) média do número de filhos;
     c) maior salário;
     d) percentual de pessoas com salário até R$100,00.
     O final da leitura de dados se dará com a entrada de um salário negativo. (Use o comando ENQUANTO-FAÇA)
     */

    public void ex3() {
        System.out.println("ex3");
        int qtdFamilia = 0, qtdFilhos = 0, qtdBaixaRenda = 0;
        double salario = 0, somaSalario = 0, mediaSalario, mediaFilhos, maiorSalario = 0, pctBaixaRenda = 0;

        while (salario >= 0) {
            System.out.println("Digite um salário: ");
            salario = sc.nextDouble();
            if (salario >= 0) {
                somaSalario += salario;
                System.out.println("Digite o número de filhos: ");
                qtdFilhos += sc.nextInt();
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }
                if (salario <= 100) {
                    qtdBaixaRenda++;
                }
                qtdFamilia++;
            } else {
                break;
            }
        }
        mediaSalario = somaSalario / qtdFamilia;
        mediaFilhos = qtdFilhos / qtdFamilia;
        pctBaixaRenda = (qtdBaixaRenda * 100) / qtdFamilia;

        System.out.println("Média salário: " + mediaSalario);
        System.out.println("Média Filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Porcentagem de salários de até R$ 100,00: " + pctBaixaRenda + "%");
    }

    /*
     Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. 
     Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
     */
    public void ex4() {
        System.out.println("ex4");
        double chicoInicial = 1.5, crescimentoChico = 0.02;
        double zeInicial = 1.10, crescimentoZe = 0.03;
        int cont = 0;

        while (zeInicial < chicoInicial) {
            chicoInicial += crescimentoChico;
            zeInicial += crescimentoZe;
            cont++;
        }
        System.out.println("A quantidade de anos necessários é: " + cont);
    }

    public void ex5() {
        System.out.println("ex5");
        int num = 0;
        int soma = 0;
        int cont = 0;

        while (num >= 0) {
            System.out.println("Digite um número");
            num = sc.nextInt();

            if (num >= 0) {
                soma += num;
                cont++;
            }
        }
        System.out.println("A média dos números é: " + (soma / cont));
    }

    /*
     6. Em uma eleição presidencial existem quatro candidatos. Os votos são informados
     através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte 
     codificação:
     - 1,2,3,4 = voto para os respectivos candidatos;
     - 5 = voto nulo;
     - 6 = voto em branco;
     Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:
     - total de votos para cada candidato;
     - total de votos nulos;
     - total de votos em branco;
     Como finalizador do conjunto de votos, tem-se o valor 0.
     7.
     */
    public void ex6() {
        System.out.println("ex6");
        int opcao = 1, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0;
        System.out.println("1 para o candidato 1");
        System.out.println("2 para o candidato 2");
        System.out.println("3 para o candidato 3");
        System.out.println("4 para o candidato 4");
        System.out.println("5 para nul");
        System.out.println("6 para branco");

        while (opcao != 0) {
            System.out.println("Digite a sua opção: ");
            opcao = sc.nextInt();
            if (opcao != 0 && opcao > 0 && opcao <= 6) {
                switch (opcao) {
                    case 1:
                        candidato1++;
                        break;
                    case 2:
                        candidato2++;
                        break;
                    case 3:
                        candidato3++;
                        break;
                    case 4:
                        candidato4++;
                        break;
                    case 5:
                        nulo++;
                        break;
                    case 6:
                        branco++;
                        break;
                }
            } else {
                System.out.println("Digite uma opção válida: ");
            }
        }
        System.out.println("*** Qtd Votos ***");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Nulo: " + nulo);
        System.out.println("Branco: " + branco);
    }

    public void ex7() {
        System.out.println("ex7");
        int codigo = 1;

        while (codigo != 0) {
            System.out.println("Digite o codigo do aluno: ");
            codigo = sc.nextInt();

            if (codigo != 0) {
                System.out.println("Digite a nota 1: ");
                int nota1 = sc.nextInt();
                System.out.println("Digite a nota 2: ");
                int nota2 = sc.nextInt();
                System.out.println("Digite a nota 3: ");
                int nota3 = sc.nextInt();

                System.out.println("Aluno: " + codigo);
                System.out.println("Média: " + ((nota1 + nota2 + nota3) / 3));
            }
        }
        System.out.println("*** Cálculos concluídos ***");
    }

    /*
     Escreva um algoritmo que calcule a média dos números digitados pelo
     usuário, se eles forem pares. Termine a leitura se o usuário digitar zero (0).
     */
    public void ex8() {
        System.out.println("ex8");
        int num = 1, cont = 0;
        double somaMedia = 0;

        while (num != 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num != 0 && num % 2 == 0) {
                somaMedia += num;
                cont++;
            }
        }
        System.out.println("A média de números pares digitados é: " + (somaMedia / cont));
    }

    /*
     Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.
     */
    public void ex9() {
        System.out.println("ex9");
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int num;

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "Digite um número: ");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }

    /*
     Escreva um algoritmo que leia o código de um aluno e suas três notas.
     Calcule a média ponderada do aluno, considerando que o peso para a
     maior nota seja 4 e para as duas restantes, 3. Mostre o código do aluno,
     suas três notas, a média calculada e uma mensagem "APROVADO" se a média 
     for maior ou igual a 5 e "REPROVADO" se a média for menor que 5. Repita 
     a operação até que o código lido seja negativo.
     */
    public void ex10() {
        System.out.println("ex10");
        int codigo = 1;
        double pesoMaior = 4, pesoMenor = 3;
        double media = 0;

        while (codigo >= 0) {
            System.out.println("Digite o codigo do aluno: ");
            codigo = sc.nextInt();

            if (codigo >= 0) {
                System.out.println("Digite a nota 1: ");
                int nota1 = sc.nextInt();
                System.out.println("Digite a nota 2: ");
                int nota2 = sc.nextInt();
                System.out.println("Digite a nota 3: ");
                int nota3 = sc.nextInt();

                if (nota1 > nota2 && nota1 > nota3) {
                    media = ((nota1 * pesoMaior) + (nota2 * pesoMenor) + (nota3 * pesoMenor)) / (pesoMaior + pesoMenor + pesoMenor);
                } else if (nota2 > nota1 && nota2 > nota3) {
                    media = ((nota2 * pesoMaior) + (nota1 * pesoMenor) + (nota3 * pesoMenor)) / (pesoMaior + pesoMenor + pesoMenor);
                } else if (nota3 > nota1 && nota3 > nota2) {
                    media = ((nota3 * pesoMaior) + (nota1 * pesoMenor) + (nota2 * pesoMenor)) / (pesoMaior + pesoMenor + pesoMenor);
                }

                System.out.println("Aluno: " + codigo);
                System.out.println("Nota 1: " + nota1);
                System.out.println("Nota 2: " + nota2);
                System.out.println("Nota 3: " + nota3);
                System.out.println("Média Ponderada: " + media);
                System.out.println(media < 5 ? "O aluno foi Reprovado" : "O aluno foi Aprovado");
            }
        }
        System.out.println("*** Cálculos concluídos ***");
    }
    /*
     Escreva um algoritmo que leia um número n (número de termos de uma progressão 
     aritmética), a1 ( o primeiro termo da progressão) e r (a razão da progressão)
     e escreva os n termos desta progressão, bem como a soma dos elementos.
     an = a1 + (n – 1) . r

     an = n-ésimo termo da sequência
     a1 = primeiro termo
     n = posição do termo na sequência
     r= razão
    
     Sn= n . (a1 + an)
     2
     */

    public void ex11() {
        System.out.println("ex11");
        System.out.println("Digite o número de termos da P.A.:");
        int qtdTermos = sc.nextInt();
        System.out.println("Digite o primeiro termo: ");
        double a1 = sc.nextInt();
        System.out.println("Digite a razão: ");
        double r = sc.nextInt();
        double an = 0, somaTermos = 0;

        System.out.print("(");
        for (int n = 1; n <= qtdTermos; n++) {
            an = a1 + (n - 1) * r;
            somaTermos += an;
            System.out.print(n >= qtdTermos ? an + ")" : an + " ,");
        }
        System.out.println("\nA soma de todos os termos é = " + ((qtdTermos * (a1 + an)) / 2));
    }

    /*
     Escrever um algoritmo que leia 20 valores para uma variável n e, para cada um deles, calcule a tabuada de 1 até n. Mostre a tabuada na forma:
     1 x n = n
     2 x n = 2n
     3 x n = 3n
     */
    public void ex12() {
        System.out.println("ex12");
        int n;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            for (int j = 0; j <= 10; j++) {
                System.out.println(j + " x " + n + " = " + (j * n));
                System.out.println("*************");
            }
        }
    }

    /*
     Escrever um algoritmo que leia um número n que 
     indica quantos valores devem ser lidos a seguir. 
     Para cada número lido, mostre uma tabela contendo
     o valor lido e o fatorial deste valor.
     */
    public void ex13() {
        System.out.println("ex13");
        System.out.println("Digite a quantidade de valores que devem ser lidos: ");
        int qtd = sc.nextInt();
        int num, fatorial = 1;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            System.out.println("---------------------------------");
            System.out.print("Valor lido = " + num);
            System.out.print(" Fatorial de !" + num + " = ");
            for (int j = 1; j <= num; j++) {
                fatorial *= j;

            }
            System.out.println(fatorial);
            System.out.println("---------------------------------");
            fatorial = 1;
        }
    }
    /*
     Escrever um algoritmo que leia um número não determinado de 
     valores e calcule a média aritmética dos valores lidos, a 
     quantidade de valores positivos, a quantidade de valores negativos e
     o percentual de valores negativos e positivos. Mostre os resultados.
     15.
     */

    public void ex14() {
        System.out.println("ex14");
        boolean continuar = true;
        int num, qtdP = 0, qtdN = 0, pctP = 0, pctN = 0, cont = 0;

        while (continuar) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num >= 0) {
                qtdP++;
            } else {
                qtdN++;
            }
            cont++;
            System.out.println("Deseja Continuar? (s/n)");
            sc.nextLine();
            String opcao = sc.nextLine();
            if (opcao.equals("s")) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
        pctP = (qtdP * 100) / cont;
        pctN = 100 - pctP;
        System.out.println("A quantidade de positivos é = " + qtdP);
        System.out.println("A quantidade de negativos é = " + qtdN);
        System.out.println("A porcentagem de positivos é = " + pctP);
        System.out.println("A porcentagem de negativos é = " + pctN);

    }

    /*
     Escrever um algoritmo que leia uma quantidade desconhecida de números e conte
     quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100].
     A entrada de dados deve terminar quando for lido um número negativo.
     */
    public void ex15() {
        System.out.println("ex15");
        int num = 1;
        int int1 = 0, int2 = 0, int3 = 0, int4 = 0;

        while (num >= 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num >= 0) {
                if (num <= 25) {
                    int1++;
                } else if (num > 25 && num <= 50) {
                    int2++;
                } else if (num > 50 && num <= 75) {
                    int3++;
                } else if (num > 75 && num <= 100) {
                    int4++;
                }
            }

        }

        System.out.println("Intervalor [0 - 25] = " + int1);
        System.out.println("Intervalor [26 - 50] = " + int1);
        System.out.println("Intervalor [51 - 75] = " + int1);
        System.out.println("Intervalor [76 - 100] = " + int1);
    }
    /*
     Escrever um algoritmo que lê um conjunto não determinado de valores, um de 
     cada vez, e escreve uma tabela com cabeçalho, que deve ser repetido a cada 
     20 linhas. A tabela conterá o valor lido, seu quadrado, seu cubo e sua raiz
     quadrada.
     */

    public void ex16() {
        System.out.println("ex16");
        int cont = 0;
        System.out.println("Digite a quantidade de números a serem lidos: ");
        int qtd = sc.nextInt();
        int[] numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println(i + "Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("*** Leitura concluída ***");

        for (int i = 0; i < qtd; i++) {
            if (i == 0 || i % 20 == 0) {
                System.out.println("| VALOR | QUADRADO | CUBO | RAIZ QUADRADA |");
            }
            System.out.println("|  " + numeros[i] + "  |   " + (Math.pow(numeros[i], 2)) + "  |   " + (Math.pow(numeros[i], 3)) + "  |   " + (Math.sqrt(numeros[i])));
        }
    }

    /*
     Escrever um algoritmo que lê um número não determinado de pares de valores m,n,
     todos inteiros e positivos, um par de cada vez, e calcula e escreve a soma dos n 
     inteiros consecutivos a partir de m inclusive.
     */
    public void ex17() {
        System.out.println("ex17");
        boolean continuar = true;
        int m, n, soma = 0;

        while (continuar) {
            System.out.println("Digite o valor de m: ");
            m = sc.nextInt();
            System.out.println("Digite o valor de n: ");
            n = sc.nextInt();

            for (int i = m; i <= n; i++) {
                soma += i;
            }
            System.out.println("A soma dos valores consecutivos é = " + soma);
            System.out.println("Deseja continuar: ");
            sc.nextLine();
            String opcao = sc.nextLine();
            if (opcao.equals("s")) {
                continuar = true;
                soma = 0;
            } else {
                continuar = false;
            }
        }
    }

    /*
     Escrever um algoritmo que lê um número não determinado de valores para m,
     todos inteiros e positivos, um de cada vez. Se m for par, verificar quantos 
     divisores possui e escrever esta informação. Se m for ímpar e menor do que
     10 calcular e escrever o fatorial de m. Se m for ímpar e maior ou igual a
     10 calcular e escrever a soma dos inteiros de 1 até m.
     */
    public void ex18() {
        System.out.println("ex18");
        int m = 1;
        while (m >= 1) {
            System.out.println("Digite um número inteiro e positivo: ");
            m = sc.nextInt();

            if (m >= 1) {
                if (m % 2 == 0) {
                    int qtdDivisores = 0;
                    for (int i = 1; i <= m; i++) {
                        if (m % i == 0) {
                            qtdDivisores++;
                        }
                    }
                    System.out.println("A quantidade de divisores de " + m + " é = " + qtdDivisores);
                } else if (m % 2 != 0 && m < 10) {
                    int fatorialM = 1;
                    for (int i = 1; i <= m; i++) {
                        fatorialM *= i;
                    }
                    System.out.println("O fatorial de !" + m + " é = " + fatorialM);
                } else if (m % 2 != 0 && m >= 10) {
                    int somaInteiros = 0;
                    for (int i = 1; i <= m; i++) {
                        somaInteiros += i;
                    }
                    System.out.println("A soma de todos os inteiros de 1 até " + m + " é = " + somaInteiros);
                }

            } else {
                System.out.println("Execuçao do exercício encerrada.");
            }
        }
    }
    /*
     Faça um algoritmo que leia uma quantidade não determinada de números positivos.
     Calcule a quantidade de números pares e ímpares, a média de valores pares e a 
     média geral dos números lidos. O número que encerrará a leitura será zero.
     */

    public void ex19() {
        System.out.println("ex19");
        double num = 1, somaPar = 0, somaImpar = 0, mediaPar = 0, mediaImpar = 0;
        int qtdPar = 0, qtdImpar = 0;

        while (num > 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    somaPar += num;
                    qtdPar++;
                } else {
                    somaImpar += num;
                    qtdImpar++;
                }
            }
        }
        mediaImpar = somaImpar / qtdImpar;
        mediaPar = somaPar / qtdPar;

        System.out.println("A qtd de números pares é = " + qtdPar);
        System.out.println("A qtd de números impares é = " + qtdImpar);
        System.out.println("A média de números pares é = " + mediaPar);
        System.out.println("A média de números impares é = " + mediaImpar);
        System.out.println("A média geral de todos os números lidos é = " + ((mediaImpar + mediaPar) / 2));
    }

    /*
     Faça um algoritmo que leia vários números inteiros e calcule o somatório dos números negativos. O fim da leitura será indicado pelo número 0.    
     */
    public void ex20() {
        System.out.println("ex20");
        int num = 1, totalNegativo = 0;

        while (num != 0) {
            System.out.println("Digite um número");
            num = sc.nextInt();

            if (num != 0) {
                if (num < 0) {
                    totalNegativo += num;
                }
            }
        }
        System.out.println("A soma de todos os valores negativos digitado é = " + totalNegativo);
    }

    /*
     Faça um algoritmo que leia vários números inteiros e positivos e calcule o 
     produtório dos números pares. O fim da leitura será indicado pelo número 0.
     */
    public void ex21() {
        System.out.println("ex21");
        int num = 1, produtorio = 1;

        while (num > 0) {
            System.out.println("Digite um número inteiro positivo: ");
            num = sc.nextInt();

            if (num > 0) {
                produtorio *= num;
            }
        }

        System.out.println("O produtorio dos números digitados é = " + produtorio);
    }

    /*
     Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados
     os dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe:
     a) a média de salário do grupo;
     b) maior e menor idade do grupo;
     c) quantidade de mulheres com salário até R$100,00.
     Encerre a entrada de dados quando for digitada uma idade negativa. (Use o comando 
     enquanto-faça e não use vetores ou matrizes)
     */
    public void ex22() {
        System.out.println("ex22");
        int idade = 1, maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE, qtdMulheres = 0, qtdPessoas = 0;
        double salario = 0, mediaSalario = 0;
        char sexo;

        while (idade > 0) {
            System.out.println("Digite um idade: ");
            idade = sc.nextInt();

            if (idade > 0) {
                qtdPessoas++;

                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                System.out.println("Digite um salário: ");
                salario = sc.nextDouble();
                mediaSalario += salario;

                System.out.println("Digite o sexo da pessoa: (m/f)");
                sexo = sc.next().charAt(0);

                if (sexo == 'f' && salario <= 100) {
                    qtdMulheres++;
                }
            }
        }

        System.out.println("A média de salário do grupo é = " + (mediaSalario / qtdPessoas));
        System.out.println("A maior idade do grupo é = " + maiorIdade);
        System.out.println("A menor idade do grupo é = " + menorIdade);
        System.out.println("A quantidade de Mulheres com salário de até R$ 100,00 é = " + qtdMulheres);
    }
    /*
     Faça um algoritmo que determine e escreva:
     - a maior idade dos habitantes
     - a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos louros.
     O final do conjunto de habitantes é reconhecido pelo valor -1 entrada como idade.
     */

    public void ex23() {
        System.out.println("ex23");
        int idade = 0, qtdMulhers = 0;
        char sexo = 'f';
        String olhos = "verdes", cabelos = "louros";

        while (idade != -1) {
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            if (idade != -1) {
                System.out.println("Digite o sexo: (m/f)");
                sexo = sc.next().charAt(0);
                System.out.println("Digite a cor dos olhos: (verdes, azuis, castanhos)");
                sc.nextLine();
                olhos = sc.nextLine();
                System.out.println("Digite a cor dos cabelos: (louros, pretos)");
                cabelos = sc.nextLine();
                if (idade >= 18 && idade <= 35 && olhos.equals("verdes") && cabelos.equals("louros") && sexo == 'f') {
                    qtdMulhers++;
                }
            }
        }

        System.out.println("A quantidade de mulheres com idade entre 18 e 35, louras e olhos verdes é = " + qtdMulhers);
    }

    /*
     Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o
     código e o preço de custo de cada produto e calcule o preço novo. Calcule
     também, a média dos preços com e sem aumento. Mostre o código e o preço novo
     de cada produto e, no final, as médias. A entrada de dados deve terminar quando 
     for lido um código de produto negativo. (Use o comando enquanto-faça)
     */
    public void ex24() {
        System.out.println("ex24");
        double preco = 0, precoNovo = 0, somaAntes = 0, somaDepois = 0;
        int qtdProdutos = 0, codigo = 0;

        while (preco >= 0) {
            System.out.println("Digite o código do produto: ");
            codigo = sc.nextInt();
            System.out.println("Digite o preco do produto: ");
            preco = sc.nextDouble();
            if (preco >= 0) {
                qtdProdutos++;
                somaAntes += preco;
                precoNovo = preco * 1.2;
                somaDepois += precoNovo;

                System.out.println("Código do produto: " + codigo);
                System.out.println("Preço atualizado: " + precoNovo);
                System.out.println("---------------------");
            }
        }
        System.out.println("*********************");
        System.out.println("Média de preço antes do aumento: " + (somaAntes / qtdProdutos));
        System.out.println("Média de preço depoiss do aumento: " + (somaDepois / qtdProdutos));
    }

    /*
     Escreva um algoritmo que gere o números de 1000 a 1999 e escreva aqueles que dividido por 11 dão resto igual a 5.
     */
    public void ex25() {
        Random aleatorio = new Random();
        System.out.println("ex25");
        int num = 0;
        for (int i = 0; i < 1000; i++) {
            num = aleatorio.nextInt((1999 - 1000) + 1) + 1000;

            if (num % 11 == 5) {
                System.out.println(num);
            }
        }
    }

    /*
     Escreva um algoritmo que leia 500 valores inteiros e positivos e:
     a) encontre o maior valor;
     b) encontre o menor valor;
     c) calcule a média dos números lidos.
     */
    public void ex26() {
        System.out.println("ex26");
        Random aleatorio = new Random();
        int num = 0, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, somaNumeros = 0, qtdNumeros = 0;
        for (int i = 0; i < 500; i++) {
            num = aleatorio.nextInt((500 - 0) + 1) + 500;
            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
            somaNumeros += num;
            qtdNumeros++;
        }
        System.out.println("O menor número lido é " + menor);
        System.out.println("O maior número lido é " + maior);
        System.out.println("A média dos números digitados é " + (somaNumeros / qtdNumeros));
    }

    public void ex27() {
        System.out.println("ex27");
    }

    public void ex28() {
        System.out.println("ex28");
    }

    public void ex29() {
        System.out.println("ex29");
    }

    public void ex30() {
        System.out.println("ex30");
    }

    public void ex31() {
        System.out.println("ex31");
    }

    public void ex32() {
        System.out.println("ex32");
    }

    public void ex33() {
        System.out.println("ex33");
    }

    public void ex34() {
        System.out.println("ex34");
    }

    public void ex35() {
        System.out.println("ex35");
    }

    public void ex36() {
        System.out.println("ex36");
    }

    public void ex37() {
        System.out.println("ex37");
    }

    public void ex38() {
        System.out.println("ex38");
    }

    public void ex39() {
        System.out.println("ex39");
    }

    public void ex40() {
        System.out.println("ex40");
    }

    public void ex41() {
        System.out.println("ex41");
    }

    public void ex42() {
        System.out.println("ex42");
    }

    public void ex43() {
        System.out.println("ex43");
    }

    public void ex44() {
        System.out.println("ex44");
    }

    public void ex45() {
        System.out.println("ex45");
    }

    public void ex46() {
        System.out.println("ex46");
    }

    public void ex47() {
        System.out.println("ex47");
    }

    public void ex48() {
        System.out.println("ex48");
    }

    public void ex49() {
        System.out.println("ex49");
    }

    public void ex50() {
        System.out.println("ex50");
    }

    public void ex51() {
        System.out.println("ex51");
    }

    public void ex52() {
        System.out.println("ex52");
    }

    public void ex53() {
        System.out.println("ex53");
    }

    public void ex54() {
        System.out.println("ex54");
    }

    public void ex55() {
        System.out.println("ex55");
    }

}
