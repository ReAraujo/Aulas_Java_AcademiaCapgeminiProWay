package Modulo02.Aula18.P1;

import java.util.ArrayList;

public class TelaVetor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); 
        p1.setNomeCompleto("Inês Brasil");  
        
        Pessoa p2 = new Pessoa(); 
        p2.setNomeCompleto("Joelma Calypso");

        Pessoa p3 = new Pessoa();  
        p3.setNomeCompleto("Michael Douglas");


        Pessoa[] pessoas = new Pessoa[3];

        ArrayList<Pessoa> ap = new ArrayList<Pessoa>();
        ap.add(p1);
        ap.add(p2);
        ap.add(p3);
        ap.remove(p2);


        

        



    }
    
}
