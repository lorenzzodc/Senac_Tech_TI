/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 631510300
 */
public class NotasEscolaresMatrizMenu {

    static Scanner leia = new Scanner(System.in);
    static String alunos[]; // texto para armazenar o nome dos alunos
    static float notas[][]; //numeros reais para armazenar as notas dos alunos 
    static int nAlunos, nNotas, contAlunos; // contadores das matizes
    static String nome;
    static int contNome;

    public static void main(String[] args) {
        System.out.println(".: Sistema de Notas Escolares:.");
        System.out.print("Informe o Número de Alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.print("Digite o Total de Notas por Aluno: ");
        nNotas = (int) leiaFloat();

        //inicializar a matriz de alunos e notas
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1]; //o mais +1 é para criar o espaço para o calculo de média
        int opM;
        do {
            menu();
            switch (opM = leia.nextInt()) {
                case 1:
                    inserirAlunosNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.print("Aplicação Encerrada pelo Usuário!");
                    break;
                default:
                    System.out.print("Opção inválida, tente novamente");
                    break;

            }//sim switch;

        } while (opM != 0);

    }//fim main

    public static void menu() {
        System.out.println("1 - Inserir Alunos e Suas Notas;");
        System.out.println("2- Imprimir Alunos e Suas Notas");
        System.out.println("0 - Sair");
        System.out.print("Digite Aqui: ");
    }

    private static void inserirAlunosNotas() {

        if (contAlunos < nAlunos) {
            System.out.print("Informe o Nome do Aluno: ");

            do {
                nome = leia.next();
                validaNome();
            } while (validaNome());// XABLAU TESTE OLHA AQUI
            alunos[contNome] = nome;

            for (int i = 0; i < nNotas; i++) {
                do {
                    System.out.print("Digite a " + (i + 1) + "ª Nota: ");
                    notas[contAlunos][i] = leiaFloat();
                    if (validaNota(notas[contAlunos][i])) {
                        System.out.println("Nota inválida.");
                    }
                } while (validaMedia(notas[contAlunos][i]));
                notas[contAlunos][nNotas] += notas[contAlunos][i];
            }// fim do for
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é Possível Digitar Alunos" + "\nNúmero Máximo de Posições obtidos");
        }
    }

    private static void imprimirAlunosNotas() {
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi de %.1f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) { //if(validaNota())
                System.out.println("O Aluno Está Aprovado");
            } else {
                System.out.println("O Aluno Está Reprovado");
            }

        }

    }

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
            System.out.print("Tente novamente: ");
            return leiaFloat();
        }
    } //fim leiaFloat

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
    }

    public static boolean validaMedia(float nota) {
        return nota < 6 || nota > 10;
    }

    public static boolean validaNome() {

        for (int i = 0; i < alunos.length; i++) {
            if (nome == alunos[contNome]) {
                System.out.print("Este nome já Existe, Digite novamente: ");
                return true;
            }

        }

        return false;

    }

}
