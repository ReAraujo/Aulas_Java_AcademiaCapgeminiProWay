package Modulo02.Aula16.P3;

import java.util.Scanner;

public class Tela3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa[] lista = new Pessoa[3];
        Pessoa p1;

        for (int i = 0; i < lista.length; i++) {
            String nome = sc.nextLine();
            String sobrenome = sc.nextLine();
            p1 = new Pessoa(nome, sobrenome);
            lista[i] = p1;
        }

        for(Pessoa p: lista){
            System.out.println(p);
        }


    }

    
}
