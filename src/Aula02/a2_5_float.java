package Modulo01.Aula02;

public class a2_5_float {

    public static void main(String args[]) {
        float menor_valor = Float.MIN_VALUE; // 1.4E-45
        float maior_valor = Float.MAX_VALUE; // 3.4028235E38
        System.out.println(menor_valor);
        System.out.println(maior_valor);
        float salario = 800.00f;
        // para atribuir um valor para uma varivel float
        // é necessário utilizar o 'f' no final do valor
        System.out.println(salario);
        float massa = 5.972E24f; // massa da terra - elevado a 24
        System.out.println(massa);
    }
}
