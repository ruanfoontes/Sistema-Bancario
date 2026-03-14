import java.util.ArrayList;

public class Conta {

    private String titular;
   private double saldo;
   private ArrayList<String> extrato;

       //Método Construtor
    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }
          //Método de depósito
    public void depositar(double valor) {
        saldo += valor;
        extrato.add("Depósito: +" + valor);
    }
        // Método saque
    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            extrato.add("Saque: -" + valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
        //método ver saldo
    public double getsaldo() {
        return saldo;
    }
    //Método Mostrar Extrato
    public void mostrarExtrato() {
        System.out.println("*** Extrato ***");

        for (String operacao : extrato) {
            System.out.println(operacao);
        }
    }

}

