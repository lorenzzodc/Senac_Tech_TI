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
public class NotasEscolaresVetores {

    public static void main(String[] args) {
        int contadorAlunos, contadorNotas;
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.print("Digite o Total de Notas de cada aluno: ");
        contadorNotas = leia.nextInt();
        float notas[] = new float[contadorNotas + 1];
        for (int i = 1; i < (contadorNotas + 1); i++) {
            do {
                System.out.print("Digite a " + i + "ª nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida.");
                }
            } while (validaNota(notas[i]));
            notas[0] += notas[i];
        }
        notas[0] = notas[0] / contadorNotas;
        System.out.printf("Sua média é: %.2f ", notas[0]);
        if (notas[0] >= 7) {
            System.out.println(", parabéns,você aprovou");
        } else {
            System.out.println(",infelizmente você reprovou");
        }

    }

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
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
    }

}
