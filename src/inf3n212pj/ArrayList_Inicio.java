/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 631510300
 */
public class ArrayList_Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros?" + nomes.size());
        nomes.add("Lorenzzo");
        System.out.println("DEPOIS DE ADD VALOR");
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros?" + nomes.size());
        System.out.println("Digite um nome:");
        nomes.add(leia.next());
        System.out.println("Quantos registros?" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        nomes.add(0, "Flispino");
        System.out.println("Quantos registros?" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        nomes.add(3, "Gustavo");
        System.out.println("Quantos registros?" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        nomes.add(4, "jabuti");
        System.out.println("Quantos registros?" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        System.out.println("index de Lorenzzo: "+nomes.indexOf("Lorenzzo"));
        nomes.remove("Lorenzzo");
        System.out.println("RESULTADO DE REMOVER LORENZZO");
        System.out.println("Quantos registros?" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        nomes.add("Godzilla");
        nomes.add("Megazord");
        nomes.add("Ronaldo");
        nomes.add("Narutinho");
        nomes.add("Nikki");
        Collections.sort(nomes);
        System.out.println(nomes.toString());
        

    }

}
