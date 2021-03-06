package Modulo02.Aula17;

public abstract class Conta {
    private double saldo;
    private String codigoCliente;

    public Conta(double saldoInicial, String cliente){
        this.saldo = saldoInicial;
        this.codigoCliente = cliente;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
    
    public void saque(double valor){
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
