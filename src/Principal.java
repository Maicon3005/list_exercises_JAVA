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
public class Principal {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean verificar = true;
        int opcaoEx = 0;

        while (verificar) {
            System.out.println("Escolha a lista de Exercícios: ");
            int opcaoLista = sc.nextInt();
            sc.nextLine();

            switch (opcaoLista) {
                case 1:
                    Lista1 l1 = new Lista1();
                    System.out.println("Escolha o exercício: ");
                    opcaoEx = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoEx) {
                        case 1:
                            l1.ex1();
                            verificar = continuarExecucao();
                            break;
                        case 2:
                            l1.ex2();
                            verificar = continuarExecucao();
                            break;
                        case 3:
                            l1.ex3();
                            verificar = continuarExecucao();
                            break;
                        case 4:
                            l1.ex4();
                            verificar = continuarExecucao();
                            break;
                        case 5:
                            l1.ex5();
                            verificar = continuarExecucao();
                            break;
                        case 6:
                            l1.ex6();
                            verificar = continuarExecucao();
                            break;
                        case 7:
                            l1.ex7();
                            verificar = continuarExecucao();
                            break;
                        case 8:
                            l1.ex8();
                            verificar = continuarExecucao();
                            break;
                        case 9:
                            l1.ex9();
                            verificar = continuarExecucao();
                            break;
                    }

                case 2:
                    Lista2 l2 = new Lista2();
                    System.out.println("Escolha o exercício: ");
                    opcaoEx = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoEx) {
                        case 1:
                            l2.ex1();
                            verificar = continuarExecucao();
                            break;
                        case 2:
                            l2.ex2();
                            verificar = continuarExecucao();
                            break;
                        case 3:
                            l2.ex3();
                            verificar = continuarExecucao();
                            break;
                        case 4:
                            l2.ex4();
                            verificar = continuarExecucao();
                            break;
                        case 5:
                            l2.ex5();
                            verificar = continuarExecucao();
                            break;
                        case 6:
                            l2.ex6();
                            verificar = continuarExecucao();
                            break;
                        case 7:
                            l2.ex7();
                            verificar = continuarExecucao();
                            break;
                        case 8:
                            l2.ex8();
                            verificar = continuarExecucao();
                            break;
                        case 9:
                            l2.ex9();
                            verificar = continuarExecucao();
                            break;
                        case 10:
                            l2.ex10();
                            verificar = continuarExecucao();
                            break;
                        case 11:
                            l2.ex11();
                            verificar = continuarExecucao();
                            break;
                        case 12:
                            l2.ex12();
                            verificar = continuarExecucao();
                            break;
                        case 13:
                            l2.ex13();
                            verificar = continuarExecucao();
                            break;
                        case 14:
                            l2.ex14();
                            verificar = continuarExecucao();
                            break;
                        case 15:
                            l2.ex15();
                            verificar = continuarExecucao();
                            break;
                        case 16:
                            l2.ex16();
                            verificar = continuarExecucao();
                            break;
                        case 17:
                            l2.ex17();
                            verificar = continuarExecucao();
                            break;
                        case 18:
                            l2.ex18();
                            verificar = continuarExecucao();
                            break;
                        case 19:
                            l2.ex19();
                            verificar = continuarExecucao();
                            break;
                        case 20:
                            l2.ex20();
                            verificar = continuarExecucao();
                            break;
                        case 21:
                            l2.ex21();
                            verificar = continuarExecucao();
                            break;
                        case 22:
                            l2.ex22();
                            verificar = continuarExecucao();
                            break;
                        case 23:
                            l2.ex23();
                            verificar = continuarExecucao();
                            break;
                        case 24:
                            l2.ex24();
                            verificar = continuarExecucao();
                            break;
                        case 25:
                            l2.ex25();
                            verificar = continuarExecucao();
                            break;
                        case 26:
                            l2.ex26();
                            verificar = continuarExecucao();
                            break;
                        case 27:
                            l2.ex27();
                            verificar = continuarExecucao();
                            break;
                        case 28:
                            l2.ex28();
                            verificar = continuarExecucao();
                            break;
                        case 29:
                            l2.ex29();
                            verificar = continuarExecucao();
                            break;
                        case 30:
                            l2.ex30();
                            verificar = continuarExecucao();
                            break;
                        case 31:
                            l2.ex31();
                            verificar = continuarExecucao();
                            break;
                        case 32:
                            l2.ex32();
                            verificar = continuarExecucao();
                            break;
                        case 33:
                            l2.ex33();
                            verificar = continuarExecucao();
                            break;
                        case 34:
                            l2.ex34();
                            verificar = continuarExecucao();
                            break;
                        case 35:
                            l2.ex35();
                            verificar = continuarExecucao();
                            break;
                        case 36:
                            l2.ex36();
                            verificar = continuarExecucao();
                            break;
                        case 37:
                            l2.ex37();
                            verificar = continuarExecucao();
                            break;
                        case 38:
                            l2.ex38();
                            verificar = continuarExecucao();
                            break;
                        case 39:
                            l2.ex39();
                            verificar = continuarExecucao();
                            break;
                        case 40:
                            l2.ex40();
                            verificar = continuarExecucao();
                            break;
                    }
                case 3:
                    Lista3 l3 = new Lista3();
                    System.out.println("Escolha o exercício: ");
                    opcaoEx = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoEx) {
                        case 1:
                            l3.ex1();
                            verificar = continuarExecucao();
                            break;
                        case 2:
                            l3.ex2();
                            verificar = continuarExecucao();
                            break;
                        case 3:
                            l3.ex3();
                            verificar = continuarExecucao();
                            break;
                        case 4:
                            l3.ex4();
                            verificar = continuarExecucao();
                            break;
                        case 5:
                            l3.ex5();
                            verificar = continuarExecucao();
                            break;
                        case 6:
                            l3.ex6();
                            verificar = continuarExecucao();
                            break;
                        case 7:
                            l3.ex7();
                            verificar = continuarExecucao();
                            break;
                        case 8:
                            l3.ex8();
                            verificar = continuarExecucao();
                            break;
                        case 9:
                            l3.ex9();
                            verificar = continuarExecucao();
                            break;
                        case 10:
                            l3.ex10();
                            verificar = continuarExecucao();
                            break;
                        case 11:
                            l3.ex11();
                            verificar = continuarExecucao();
                            break;
                        case 12:
                            l3.ex12();
                            verificar = continuarExecucao();
                            break;
                    }
                case 4:
                    Lista4 l4 = new Lista4();
                    System.out.println("Escolha o exercício: ");
                    opcaoEx = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoEx) {
                        case 1:
                            l4.ex1();
                            verificar = continuarExecucao();
                            break;
                        case 2:
                            l4.ex2();
                            verificar = continuarExecucao();
                            break;
                        case 3:
                            l4.ex3();
                            verificar = continuarExecucao();
                            break;
                        case 4:
                            l4.ex4();
                            verificar = continuarExecucao();
                            break;
                        case 5:
                            l4.ex5();
                            verificar = continuarExecucao();
                            break;
                        case 6:
                            l4.ex6();
                            verificar = continuarExecucao();
                            break;
                        case 7:
                            l4.ex7();
                            verificar = continuarExecucao();
                            break;
                        case 8:
                            l4.ex8();
                            verificar = continuarExecucao();
                            break;
                        case 9:
                            l4.ex9();
                            verificar = continuarExecucao();
                            break;
                        case 10:
                            l4.ex10();
                            verificar = continuarExecucao();
                            break;
                    }
                case 5:
                    Lista5 l5 = new Lista5();
                    System.out.println("Escolha o exercício: ");
                    opcaoEx = sc.nextInt();
                    sc.nextLine();

                    switch (opcaoEx) {
                        case 1:
                            l5.ex1();
                            verificar = continuarExecucao();
                            break;
                        case 2:
                            l5.ex2();
                            verificar = continuarExecucao();
                            break;
                        case 3:
                            l5.ex3();
                            verificar = continuarExecucao();
                            break;
                        case 4:
                            l5.ex4();
                            verificar = continuarExecucao();
                            break;
                        case 5:
                            l5.ex5();
                            verificar = continuarExecucao();
                            break;
                        case 6:
                            l5.ex6();
                            verificar = continuarExecucao();
                            break;
                        case 7:
                            l5.ex7();
                            verificar = continuarExecucao();
                            break;
                        case 8:
                            l5.ex8();
                            verificar = continuarExecucao();
                            break;
                        case 9:
                            l5.ex9();
                            verificar = continuarExecucao();
                            break;
                        case 10:
                            l5.ex10();
                            verificar = continuarExecucao();
                            break;
                        case 11:
                            l5.ex11();
                            verificar = continuarExecucao();
                            break;
                        case 12:
                            l5.ex12();
                            verificar = continuarExecucao();
                            break;
                        case 13:
                            l5.ex13();
                            verificar = continuarExecucao();
                            break;
                        case 14:
                            l5.ex14();
                            verificar = continuarExecucao();
                            break;
                        case 15:
                            l5.ex15();
                            verificar = continuarExecucao();
                            break;
                        case 16:
                            l5.ex16();
                            verificar = continuarExecucao();
                            break;
                        case 17:
                            l5.ex17();
                            verificar = continuarExecucao();
                            break;
                        case 18:
                            l5.ex18();
                            verificar = continuarExecucao();
                            break;
                        case 19:
                            l5.ex19();
                            verificar = continuarExecucao();
                            break;
                        case 20:
                            l5.ex20();
                            verificar = continuarExecucao();
                            break;
                        case 21:
                            l5.ex21();
                            verificar = continuarExecucao();
                            break;
                        case 22:
                            l5.ex22();
                            verificar = continuarExecucao();
                            break;
                        case 23:
                            l5.ex23();
                            verificar = continuarExecucao();
                            break;
                        case 24:
                            l5.ex24();
                            verificar = continuarExecucao();
                            break;
                        case 25:
                            l5.ex25();
                            verificar = continuarExecucao();
                            break;
                        case 26:
                            l5.ex26();
                            verificar = continuarExecucao();
                            break;
                        case 27:
                            l5.ex27();
                            verificar = continuarExecucao();
                            break;
                        case 28:
                            l5.ex28();
                            verificar = continuarExecucao();
                            break;
                        case 29:
                            l5.ex29();
                            verificar = continuarExecucao();
                            break;
                        case 30:
                            l5.ex30();
                            verificar = continuarExecucao();
                            break;
                        case 31:
                            l5.ex31();
                            verificar = continuarExecucao();
                            break;
                        case 32:
                            l5.ex32();
                            verificar = continuarExecucao();
                            break;
                        case 33:
                            l5.ex33();
                            verificar = continuarExecucao();
                            break;
                        case 34:
                            l5.ex34();
                            verificar = continuarExecucao();
                            break;
                        case 35:
                            l5.ex35();
                            verificar = continuarExecucao();
                            break;
                        case 36:
                            l5.ex36();
                            verificar = continuarExecucao();
                            break;
                        case 37:
                            l5.ex37();
                            verificar = continuarExecucao();
                            break;
                        case 38:
                            l5.ex38();
                            verificar = continuarExecucao();
                            break;
                        case 39:
                            l5.ex39();
                            verificar = continuarExecucao();
                            break;
                        case 40:
                            l5.ex40();
                            verificar = continuarExecucao();
                            break;
                        case 41:
                            l5.ex41();
                            verificar = continuarExecucao();
                            break;
                        case 42:
                            l5.ex42();
                            verificar = continuarExecucao();
                            break;
                        case 43:
                            l5.ex43();
                            verificar = continuarExecucao();
                            break;
                        case 44:
                            l5.ex44();
                            verificar = continuarExecucao();
                            break;
                        case 45:
                            l5.ex45();
                            verificar = continuarExecucao();
                            break;
                        case 46:
                            l5.ex46();
                            verificar = continuarExecucao();
                            break;
                        case 47:
                            l5.ex47();
                            verificar = continuarExecucao();
                            break;
                        case 48:
                            l5.ex48();
                            verificar = continuarExecucao();
                            break;
                        case 49:
                            l5.ex49();
                            verificar = continuarExecucao();
                            break;
                        case 50:
                            l5.ex50();
                            verificar = continuarExecucao();
                            break;
                        case 51:
                            l5.ex51();
                            verificar = continuarExecucao();
                            break;
                        case 52:
                            l5.ex52();
                            verificar = continuarExecucao();
                            break;
                        case 53:
                            l5.ex53();
                            verificar = continuarExecucao();
                            break;
                        case 54:
                            l5.ex54();
                            verificar = continuarExecucao();
                            break;
                        case 55:
                            l5.ex55();
                            verificar = continuarExecucao();
                            break;
                    }
            }

        }
    }

    static boolean continuarExecucao() {
        System.out.println("Deseja continuar: s/n");
        String continuar = sc.nextLine();
        if (continuar.equals("s")) {
            return true;
        } else if (continuar.equals("n")) {
            System.out.println("Falouuu !!!");
            return false;
        } else {
            System.out.println("Digite uma opção válida: ");
            return false;
        }
    }
}
