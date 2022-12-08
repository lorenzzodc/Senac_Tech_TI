
import java.util.Scanner;


/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
 */
public class Main {

    private static void ImprimirAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Scanner leia = new Scanner(System.in);
    int numeroAlunos, numeroNotas;
    float arrayAlunos[] = new String[numeroAlunos];
    float arrayNotas[][] = new flaot[numeroNotas];
    int opcao_Menu, contadorAlunos;

    public static void main(String[] args) {
        System.out.println("Notas Escolares");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.print("Digite o Número Total de Alunos: ");
        numeroAlunos = new leia.nextint();
        System.out.print("Digite o Total de Notas de cada aluno: ");
        numeroNotas = new leia.nextint();
        do {
            menu();
            opcao_Menu = new leia.nextint();
            switch (opcao_Menu) {
                case 0:
                    break;
                case 1:
                    System.out.println("Insira alunos e notas");
                    inserirNotas();
                    break;
                case 2:
                    System.out.println("Imprimir alunos e notas");
                    ImprimirAlunos();
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente:");
                    break;
            }
        } while (opcao_Menu != 0);
    }

    public static void menu(String[] args) {
        System.out.println("1 - Inserir Aluno e Notas");
        System.out.println("2 - Imprimir Aluno e Notas");
        System.out.println("0 - Sair do Programa");
    }

    public static void inserirNotas(String[] args) {
        String nome;
        int contadorNomes = 0;
        System.out.print("Digite o nome do aluno: ");
        do {
            nome = leia.nextLine();
            if (nome == arrayAlunos[contadorNomes]) {
                System.out.println("Nome já existente, digite outro aluno");
            } else {
                contadorNomes++;
            }
        } while (nome == arrayAlunos[contadorAlunos]);
        arrayAlunos[contadorAlunos] = nome;
        for (int i = 0; i < (contadorAlunos - 1); i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            do {
                float nota;
                arrayNotas[i] = leia.nextfloat();
            }
            
        }

    }

}

