package Modulo03.Aula28_Java_io.P3.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/Modulo03/Aula28_Java_io/P3/dados/molho.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
