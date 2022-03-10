public class Conta {

    private double limite;
    private double saldo;

    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
    public Conta(){

    }

    void sacar(double quantia){
        saldo -= quantia;

    }

    void depositar(double quantia){
        saldo += quantia;
    }

    public double getSaldo(){
        return saldo;
    }

}